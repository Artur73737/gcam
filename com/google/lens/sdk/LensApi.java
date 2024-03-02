package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;
import com.google.android.apps.camera.gesturecapture.ui.UB.oBLUVToV;

public class LensApi {
   static final Uri a = Uri.parse("googleapp://lens");
   public static final int d = 0;
   public final KeyguardManager b;
   public final AmbientDelegate c;
   private final .nal e;

   public LensApi(Context var1) {
      this.b = (KeyguardManager)var1.getSystemService("keyguard");
      .nal var2 = new .nal(var1);
      this.e = var2;
      this.c = new AmbientDelegate(var1, var2);
   }

   public static final void h(Activity var0) {
      Intent var1 = new Intent();
      var1.setAction("android.intent.action.VIEW");
      var1.setData(a);
      var0.startActivityForResult(var1, 0);
   }

   private final void i(Activity var1, LensApi$LensLaunchStatusCallback var2, Runnable var3) {
      if (this.b.isKeyguardLocked()) {
         if (var1 == null) {
            int var4 = VERSION.SDK_INT;
            StringBuilder var5 = new StringBuilder();
            var5.append("Cannot start Lens when device is locked with Android ");
            var5.append(var4);
            String var6 = var5.toString();
            Log.e(DeBfHrQZSt.AUeyhXOk, var6);
            if (var2 != null) {
               var2.onLaunchStatusFetched(1);
            }

         } else {
            this.c(var1, var2, var3);
         }
      } else {
         var3.run();
         if (var2 != null) {
            var2.onLaunchStatusFetched(0);
         }

      }
   }

   private final boolean j(String var1) {
      String var6 = this.e.f.c;
      if (TextUtils.isEmpty(var6)) {
         return true;
      } else {
         String[] var8 = var6.split("\\.", -1);
         String[] var7 = var1.split("\\.", -1);
         int var3 = Math.min(var8.length, var7.length);

         for(int var2 = 0; var2 < var3; ++var2) {
            int var4 = Integer.parseInt(var8[var2]);
            int var5 = Integer.parseInt(var7[var2]);
            if (var4 < var5) {
               return true;
            }

            if (var4 > var5) {
               return false;
            }
         }

         if (var8.length < var7.length) {
            return true;
         } else {
            return false;
         }
      }
   }

   public final .lcw a() {
      AmbientDelegate var1 = this.c;
      .mzx.A();
      .mzx.B(((.nar)var1.c).k(), "getLensCapabilities() called when Lens is not ready.");
      .lcw var2;
      if (!((.nar)var1.c).k()) {
         var2 = .lcw.c;
      } else {
         Object var3 = var1.c;
         .mzx.A();
         .nar var4 = (.nar)var3;
         .mzx.B(var4.l(), "Attempted to use LensCapabilities before ready.");
         var2 = var4.f;
      }

      return var2;
   }

   public final void b(Bitmap var1, .qdj var2) {
      if (this.c.J() == 2) {
         .qnm var3 = var2.d();
         var3.g = var1;
         this.d(var3.b());
      }
   }

   public final void c(Activity var1, LensApi$LensLaunchStatusCallback var2, Runnable var3) {
      .qdh var4 = new .qdh(var3, var2);
      this.b.requestDismissKeyguard(var1, var4);
   }

   public void checkArStickersAvailability(LensApi$LensAvailabilityCallback var1) {
      this.e.a(new .qdi(var1, 1));
   }

   public void checkLensAvailability(LensApi$LensAvailabilityCallback var1) {
      this.b.isKeyguardLocked();
      if (this.j("8.3")) {
         var1.onAvailabilityStatusFetched(6);
      } else {
         this.e.a(new .qdi(var1, 0));
      }
   }

   public void checkPendingIntentAvailability(LensApi$LensAvailabilityCallback var1) {
      this.b.isKeyguardLocked();
      if (this.j("9.72")) {
         var1.onAvailabilityStatusFetched(6);
      } else {
         AmbientDelegate var2 = this.c;
         .qdg var3 = new .qdg(var1, 1);
         .mzx.A();
         var2.I(new .nam(var2, var3, 0));
      }
   }

   public void checkPostCaptureAvailability(LensApi$LensAvailabilityCallback var1) {
      this.b.isKeyguardLocked();
      if (this.j("8.19")) {
         var1.onAvailabilityStatusFetched(6);
      } else {
         AmbientDelegate var2 = this.c;
         .qdg var3 = new .qdg(var1, 0);
         .mzx.A();
         var2.I(new .nam(var2, var3, 1));
      }
   }

   public final void d(.qdj var1) {
      AmbientDelegate var2;
      if (var1.a != null || var1.b != null) {
         var2 = this.c;
         if (!var2.H(var1.a(var2.F()))) {
            return;
         }
      }

      var2 = this.c;
      var2.F();
      Bundle var3 = var1.b();
      .mzx.A();
      if (((.nar)var2.c).k()) {
         label44: {
            .qfk var4 = (.qfk).lcp.c.O();
            if (!var4.b.ad()) {
               var4.p();
            }

            .lcp var7 = (.lcp)var4.b;
            var7.b = 355;
            var7.a |= 1;
            var7 = (.lcp)var4.i();
            .lcn var10 = new .lcn(var3);

            label32: {
               Object var8;
               try {
                  Object var11 = var2.c;
                  byte[] var9 = var7.J();
                  ((.nar)var11).e(var9, var10);
                  break label32;
               } catch (RemoteException var5) {
                  var8 = var5;
               } catch (SecurityException var6) {
                  var8 = var6;
               }

               Log.e("LensServiceBridge", "Failed to start Lens", (Throwable)var8);
               break label44;
            }

            ((.nar)var2.c).f();
            return;
         }
      }

      Log.e("LensApi", "Failed to start lens.");
   }

   public final boolean e() {
      return (this.a().a & 2) != 0;
   }

   public final boolean f(Bitmap var1, .qdj var2) {
      if (var1 == null) {
         Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
      }

      if (this.b.isKeyguardLocked()) {
         Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
         return false;
      } else if (this.c.J() != 2) {
         return false;
      } else {
         .qnm var3 = var2.d();
         var3.g = var1;
         this.d(var3.b());
         return true;
      }
   }

   public final boolean g(.qdj var1, PendingIntentConsumer var2) {
      if (this.c.K() != 2) {
         return false;
      } else {
         AmbientDelegate var3 = this.c;
         var3.H(var1.a(var3.F()));
         var3 = this.c;
         var3.F();
         Bundle var7 = var1.b();
         .mzx.A();
         var3.a = var2;
         if (((.nar)var3.c).k()) {
            .qfk var10 = (.qfk).lcp.c.O();
            if (!var10.b.ad()) {
               var10.p();
            }

            .lcp var4 = (.lcp)var10.b;
            var4.b = 412;
            var4.a |= 1;
            .lcp var11 = (.lcp)var10.i();
            .lcn var8 = new .lcn(var7);

            Object var9;
            try {
               Object var13 = var3.c;
               byte[] var12 = var11.J();
               ((.nar)var13).e(var12, var8);
               return true;
            } catch (RemoteException var5) {
               var9 = var5;
            } catch (SecurityException var6) {
               var9 = var6;
            }

            Log.e("LensServiceBridge", "Failed to send Lens service client event", (Throwable)var9);
         }

         Log.e("LensApi", "Failed to request pending intent.");
         return false;
      }
   }

   @Deprecated
   public void launchLensActivity(Activity var1) {
      this.i(var1, (LensApi$LensLaunchStatusCallback)null, new .nub(var1, 12));
   }

   @Deprecated
   public void launchLensActivity(Activity var1, int var2) {
      switch(var2) {
      case 0:
         this.i(var1, (LensApi$LensLaunchStatusCallback)null, new .nub(var1, 13));
         return;
      case 1:
         var2 = .mzx.z(this.e.f.e);
         if (var2 != 0 && var2 == 2) {
            Intent var3 = new Intent();
            var3.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
            var1.startActivity(var3);
            return;
         }

         return;
      default:
         Log.w("LensApi", .c.aE(var2, "Invalid lens activity: "));
      }
   }

   public void launchLensActivity(Activity var1, LensApi$LensLaunchStatusCallback var2) {
      this.i(var1, var2, new .mni(this, var1, .qdj.c().b(), 10));
   }

   public boolean launchLensActivityWithBitmap(Bitmap var1) {
      if (this.b.isKeyguardLocked()) {
         Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
         return false;
      } else {
         long var2 = SystemClock.elapsedRealtimeNanos();
         .qnm var4 = .qdj.c();
         var4.c = var2;
         return this.f(var1, var4.b());
      }
   }

   public boolean launchLensActivityWithBitmapForTranslate(Bitmap var1) {
      if (!this.e()) {
         Log.e("LensApi", "Translate is not supported.");
         return false;
      } else {
         .qfi var4 = .qdc.c.O();
         .qdb var2 = .qdb.a;
         if (!var4.b.ad()) {
            var4.p();
         }

         .qdc var3 = (.qdc)var4.b;
         var2.getClass();
         var3.b = var2;
         var3.a = 2;
         .qdc var5 = (.qdc)var4.i();
         .qnm var6 = .qdj.c();
         var6.d = 5;
         var6.b = var5;
         return this.f(var1, var6.b());
      }
   }

   public void onPause() {
      AmbientDelegate var3 = this.c;
      .mzx.A();
      Object var4 = var3.c;
      .mzx.A();
      .nar var2 = (.nar)var4;
      if (var2.l()) {
         .qfk var5 = (.qfk).lcp.c.O();
         if (!var5.b.ad()) {
            var5.p();
         }

         .lcp var1 = (.lcp)var5.b;
         var1.b = 345;
         var1.a |= 1;
         var1 = (.lcp)var5.i();

         label30: {
            Object var9;
            try {
               .lcj var10 = ((.nar)var4).i;
               .mzx.C(var10);
               var10.e(var1.J());
               break label30;
            } catch (RemoteException var7) {
               var9 = var7;
            } catch (SecurityException var8) {
               var9 = var8;
            }

            Log.e("LensServiceConnImpl", "Unable to end Lens service session.", (Throwable)var9);
         }

         var2.i = null;
         var2.d = 0;
         var2.e = null;
         var2.f = null;
      }

      if (var2.i()) {
         try {
            ((.nar)var4).b.unbindService((ServiceConnection)var4);
         } catch (IllegalArgumentException var6) {
            Log.w("LensServiceConnImpl", oBLUVToV.oQeEnKeuEIypFH);
         }

         var2.h = null;
      }

      var2.g = 1;
      var2.g(1);
      var3.a = null;
   }

   public void onResume() {
      AmbientDelegate var1 = this.c;
      .mzx.A();
      ((.nar)var1.c).m();
   }

   public boolean requestLensActivityPendingIntent(PendingIntentConsumer var1) {
      return this.g(.qdj.c().b(), var1);
   }

   public boolean requestLensActivityPendingIntentWithBitmap(Bitmap var1, PendingIntentConsumer var2) {
      .qnm var3 = .qdj.c();
      var3.g = var1;
      return this.g(var3.b(), var2);
   }

   public boolean requestLensActivityPendingIntentWithBitmapUri(Context var1, Uri var2, PendingIntentConsumer var3) {
      if (var1 != null) {
         var1.grantUriPermission("com.google.android.googlequicksearchbox", var2, 1);
      }

      .qnm var4 = .qdj.c();
      var4.f = var2;
      return this.g(var4.b(), var3);
   }
}
