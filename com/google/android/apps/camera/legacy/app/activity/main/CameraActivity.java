package com.google.android.apps.camera.legacy.app.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

public class CameraActivity extends .gxz implements .gss, .efu {
   private static final .pds A;
   private CameraActivityTiming B;
   private boolean C;
   private .gyz D;
   private .gze E;
   public .flx u;
   public .frq v;
   public .jqy w;
   public .iyw x;

   static {
      .npq var2 = .npq.a;
      long var0 = SystemClock.elapsedRealtime();
      if (.ntq.h() && var2.c > 0L && var0 <= SystemClock.elapsedRealtime() && (var2.m.b == null || var0 <= var2.m.b) && var2.e == 0L) {
         var2.e = var0;
         var2.l.f = true;
      }

      A = .pds.h("com.google.android.apps.camera.legacy.app.activity.main.CameraActivity");
   }

   public final .flx a() {
      return this.u;
   }

   public final .gst b(Class var1) {
      return (.gst)var1.cast(this.D);
   }

   protected void onCreate(Bundle var1) {
      this.n().e("CameraActivity#onCreate");
      long var5 = SystemClock.elapsedRealtimeNanos();
      this.C = false;
      super.onCreate(var1);
      .gzh var19 = ((CameraApp)this.getApplicationContext()).f();
      super.r = (.min)var19.h.get();
      super.t = (.ekd)var19.z.get();
      super.s = .hgf.b(var19.iw);
      this.w = (.jqy)var19.C.get();
      this.u = (.flx)var19.f.get();
      .jhd var10 = (.jhd)var19.D.get();
      this.x = (.iyw)var19.F.get();
      this.v = new .frq((.mkb)var19.I.get(), .gtz.b());
      .jqy var12 = this.w;
      .jqt var13 = var12.a;
      Instrumentation var27 = var12.d;
      .mxu var11 = var12.b;
      .min var36 = var12.c;
      int var2 = var13.a++;
      .jqv var44 = new .jqv(var2, var13.b);
      long var3;
      if (var44.a()) {
         var3 = .jrt.e().m;
      } else {
         var3 = var5;
      }

      CameraActivityTiming var30 = new CameraActivityTiming(var3, var11, var44, var36);
      var27.f(var30);
      this.B = var30;
      var30.recordActivityOnCreateStart(var5);
      .frq var28 = this.v;
      String var32 = this.toString();
      .mbx.a();
      if (var28.d == null) {
         var28.d = var28.a.b("CameraActivity onCreate: ".concat(String.valueOf(var32)));
      }

      var28.b.postDelayed(new .fks(var28, 16), 3000L);
      .flx var34 = this.u;
      Float var29 = .fmd.a;
      var34.c();
      CameraActivityTiming var39 = this.B;
      this.n().e("setupDefaultActivity#init");
      .ve var37 = this.p();
      .gtz var31 = this.o();
      .lmk var42 = new .lmk(var39);
      var37.getClass();
      var31.getClass();
      this.D = new .gyz(var19.a, var37, var31, var42);
      this.n().g("activityInitializer#get");
      .gyh var20 = (.gyh)this.D.ak.get();
      this.n().g("activityInitializer#start");
      var20.b();
      if (this.isVoiceInteractionRoot()) {
         Intent var33 = new Intent(this.getIntent());
         .gyz var16 = this.D;
         boolean var7 = var16.a.B();
         boolean var9 = var16.a.z();
         boolean var8 = var16.a.A();
         .kha var14 = (.kha)var16.ah.get();
         .qrz var46 = var16.am;
         var42 = .ken.b((.flx)var16.a.f.get());
         Object var17 = var16.bN.a;
         .jqs var40 = (.jqs)var16.a.r.get();
         .dmw var21 = (.dmw)var16.a.fJ.get();
         .moa var15 = (.moa)var16.a.cQ.get();
         .jhd var49 = (.jhd)var16.a.D.get();
         Activity var50 = (Activity)var17;
         .oup var18 = .onk.q(new .gsu(var7, var9, var8, var42, var50));
         .otw var48 = .gsv.c(.gsv.b(var33, var50, var18, var15), var33, var14, var46, var42, var50, var21, var18, var15, var49, var40);
         .gsv.a(var33, var48.h() ^ true, var50, var49);
         var50.setIntent(var33);
         if (var48.h() && .gsv.d((.ksm)var48.c(), var14, var46, var42, var50, var21, var40)) {
            ((.pdq)A.c().I(2003)).q("Warning: have Launched outside activity and coming soon finish activity.");
            this.C = true;
         }
      }

      this.n().g("#cameraUiModule#inflate");
      .gyz var22 = this.D;
      .eh var35 = var22.bN.c();
      .gtz var43 = var22.bN;
      .kvl var23 = new .kvl(var43.a, 1);
      Window var45 = .grw.b(var43);
      LayoutInflater var47 = var35.getLayoutInflater();
      .mbx.a();
      LayoutParams var38 = var45.getAttributes();
      var38.rotationAnimation = 3;
      var38.layoutInDisplayCutoutMode = 1;
      var45.setAttributes(var38);
      var45.addFlags(Integer.MIN_VALUE);
      var45.setBackgroundDrawable((Drawable)null);
      var45.getDecorView().setPadding(0, 0, 0, 0);
      ((Activity)var23.a).setContentView(2131623968);
      .kpd var24 = new .kpd(var47, new .kpb(.lmk.p(var23)));
      this.n().g("activityUiInitializer#get");
      .gyz var41 = this.D;
      .gze var25 = new .gze(var41.a, var41.b, var24);
      this.E = var25;
      .gyj var26 = (.gyj)var25.R.get();
      this.n().g("#activityUiInitializer#start");
      var26.b();
      this.n().f();
      if (!this.q() && !this.isVoiceInteractionRoot()) {
         .ega.f(this.getIntent());
      }

      this.setRecentsScreenshotEnabled(false);
      this.B.i(.jra.b, CameraActivityTiming.b);
      this.n().f();
   }

   protected final void onDestroy() {
      .frq var1 = this.v;
      .mbx.a();
      var1.a();
      super.onDestroy();
   }

   protected final void onResume() {
      this.B.i(.jra.h, CameraActivityTiming.a);
      super.onResume();
      this.B.i(.jra.i, CameraActivityTiming.b);
      .hdp.b(this.u);
      if (this.C) {
         this.finish();
      }

   }

   protected final void onStart() {
      long var3;
      CameraActivityTiming var5;
      label27: {
         var5 = this.B;
         var3 = var5.l.a();
         .jqv var6 = var5.d;
         ++var6.a;
         int var1 = var6.b();
         if (var1 == 3) {
            var5.a();
            var5.f = var5.e.a("FirstPreviewFrame");
            var5.g = var5.e.a("FirstFrameReceived");
            var5.h = var5.e.a("ShutterButtonEnabled");
            .jra[] var7 = .jra.values();
            int var2 = var7.length;

            for(var1 = 0; var1 < var2; ++var1) {
               .jra var9 = var7[var1];
               if (var9.s) {
                  var5.j(var9, var3, CameraActivityTiming.k);
               }
            }
         } else if (var1 == 1) {
            break label27;
         }

         .hqd var10 = var5.o;
      }

      var5.j(.jra.g, var3, CameraActivityTiming.a);
      .mhq var11 = this.x.c();
      .frq var8 = this.v;
      String var12 = this.toString();
      .mbx.a();
      if (var8.c == null) {
         var8.c = var8.a.b("CameraActivity onStart: ".concat(String.valueOf(var12)));
      }

      var8.a();
      super.onStart();
      var11.close();
   }

   protected final void onStop() {
      .frq var1 = this.v;
      .mbx.a();
      .mhq var2 = var1.c;
      if (var2 != null) {
         var2.close();
         var1.c = null;
      }

      var1.a();
      super.onStop();
   }

   protected boolean q() {
      return false;
   }
}
