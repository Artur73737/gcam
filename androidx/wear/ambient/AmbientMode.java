package androidx.wear.ambient;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Deprecated
public final class AmbientMode extends Fragment {
   public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
   public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
   public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
   AmbientDelegate a;
   AmbientMode$AmbientCallback b;
   private final AmbientDelegate$AmbientCallback c = new AmbientMode$1();
   private final AmbientMode$AmbientController d = new AmbientMode$AmbientController(this);

   public static AmbientMode$AmbientController attachAmbientSupport(Activity var0) {
      FragmentManager var1 = var0.getFragmentManager();
      AmbientMode var2 = (AmbientMode)var1.findFragmentByTag("android.support.wearable.ambient.AmbientMode");
      if (var2 == null) {
         var2 = new AmbientMode();
         var1.beginTransaction().add(var2, "android.support.wearable.ambient.AmbientMode").commit();
      }

      return var2.d;
   }

   public final void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      AmbientDelegate var5 = this.a;
      if (var5 != null) {
         var5.a(var1, var2, var3, var4);
      }

   }

   public final void onAttach(Context var1) {
      super.onAttach(var1);
      this.a = new AmbientDelegate(this.getActivity(), this.c);
      if (var1 instanceof AmbientMode$AmbientCallbackProvider) {
         this.b = ((AmbientMode$AmbientCallbackProvider)var1).getAmbientCallback();
      } else {
         Log.w("AmbientMode", "No callback provided - enabling only smart resume");
      }
   }

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.a.b();
      if (this.b != null) {
         this.a.g();
      }

   }

   public final void onDestroy() {
      this.a.c();
      super.onDestroy();
   }

   public final void onDetach() {
      this.a = null;
      super.onDetach();
   }

   public final void onPause() {
      this.a.d();
      super.onPause();
   }

   public final void onResume() {
      super.onResume();
      this.a.e();
   }

   public final void onStop() {
      this.a.f();
      super.onStop();
   }
}
