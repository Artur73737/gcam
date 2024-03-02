import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.camera.ui.popupmenu.lol.nJwt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

public class by extends or {
   boolean a;
   boolean b;
   boolean c = true;
   final clx d = new clx(this);
   public final lmk e = new lmk(new bx(this));

   public by() {
      this.getSavedStateRegistry().b("android:support:lifecycle", new cf(this, 1));
      this.d(new bw(this, 1));
      bw var1 = new bw(this, 0);
      super.j.add(var1);
      this.k(new eg(this, 1));
   }

   private static boolean h(cp var0, clw var1) {
      Iterator var5 = var0.a.f().iterator();
      boolean var2 = false;

      while(var5.hasNext()) {
         bv var4 = (bv)var5.next();
         if (var4 != null) {
            boolean var3 = var2;
            if (var4.getHost() != null) {
               var3 = var2 | h(var4.getChildFragmentManager(), var1);
            }

            df var6 = var4.Y;
            var2 = var3;
            if (var6 != null) {
               var2 = var3;
               if (var6.getLifecycle().b.a(clw.d)) {
                  var4.Y.a.d(var1);
                  var2 = true;
               }
            }

            if (var4.ad.b.a(clw.d)) {
               var4.ad.d(var1);
               var2 = true;
            }
         }
      }

      return var2;
   }

   public final void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      super.dump(var1, var2, var3, var4);
      String var6;
      if (var4 != null && var4.length > 0) {
         byte var5;
         label40: {
            var5 = 0;
            var6 = var4[0];
            switch(var6.hashCode()) {
            case -645125871:
               if (var6.equals("--translation")) {
                  var5 = 2;
                  break label40;
               }
               break;
            case 100470631:
               if (var6.equals("--dump-dumpable")) {
                  var5 = 4;
                  break label40;
               }
               break;
            case 472614934:
               if (var6.equals("--list-dumpables")) {
                  var5 = 3;
                  break label40;
               }
               break;
            case 1159329357:
               if (var6.equals("--contentcapture")) {
                  var5 = 1;
                  break label40;
               }
               break;
            case 1455016274:
               if (var6.equals("--autofill")) {
                  break label40;
               }
            }

            var5 = -1;
         }

         switch(var5) {
         case 3:
         case 4:
            int var7 = cdz.a;
         case 0:
         case 1:
         case 2:
            return;
         }
      }

      var3.print(var1);
      var3.print("Local FragmentActivity ");
      var3.print(Integer.toHexString(System.identityHashCode(this)));
      var3.println(" State:");
      var6 = String.valueOf(var1).concat(nJwt.KLbDPMtMhPDKF);
      var3.print(var6);
      var3.print("mCreated=");
      var3.print(this.a);
      var3.print(" mResumed=");
      var3.print(this.b);
      var3.print(" mStopped=");
      var3.print(this.c);
      if (this.getApplication() != null) {
         cnt.a(this).c(var6, var3);
      }

      this.e.aT().C(var1, var2, var3, var4);
   }

   final void e() {
      while(h(this.fv(), clw.c)) {
      }

   }

   public final cp fv() {
      return this.e.aT();
   }

   final View fw(View var1, String var2, Context var3, AttributeSet var4) {
      return ((cd)this.e.a).e.c.onCreateView(var1, var2, var3, var4);
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      this.e.aU();
      super.onActivityResult(var1, var2, var3);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.d.b(clv.ON_CREATE);
      ((cd)this.e.a).e.p();
   }

   public final View onCreateView(View var1, String var2, Context var3, AttributeSet var4) {
      View var5 = this.fw(var1, var2, var3, var4);
      return var5 == null ? super.onCreateView(var1, var2, var3, var4) : var5;
   }

   public final View onCreateView(String var1, Context var2, AttributeSet var3) {
      View var4 = this.fw((View)null, var1, var2, var3);
      return var4 == null ? super.onCreateView(var1, var2, var3) : var4;
   }

   protected void onDestroy() {
      super.onDestroy();
      ((cd)this.e.a).e.q();
      this.d.b(clv.ON_DESTROY);
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         return var1 == 6 ? ((cd)this.e.a).e.O(var2) : false;
      }
   }

   protected void onPause() {
      super.onPause();
      this.b = false;
      ((cd)this.e.a).e.w();
      this.d.b(clv.ON_PAUSE);
   }

   protected void onPostResume() {
      super.onPostResume();
      this.d.b(clv.ON_RESUME);
      ((cd)this.e.a).e.y();
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      this.e.aU();
      super.onRequestPermissionsResult(var1, var2, var3);
   }

   protected void onResume() {
      this.e.aU();
      super.onResume();
      this.b = true;
      this.e.aV();
   }

   protected void onStart() {
      this.e.aU();
      super.onStart();
      this.c = false;
      if (!this.a) {
         this.a = true;
         ((cd)this.e.a).e.n();
      }

      this.e.aV();
      this.d.b(clv.ON_START);
      ((cd)this.e.a).e.z();
   }

   public final void onStateNotSaved() {
      this.e.aU();
   }

   protected void onStop() {
      super.onStop();
      this.c = true;
      this.e();
      ((cd)this.e.a).e.B();
      this.d.b(clv.ON_STOP);
   }
}
