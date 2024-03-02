package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.activity.main.CameraVoiceActivity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

public class CameraImageActivity extends .gxz {
   private boolean u = false;

   public final boolean isVoiceInteractionRoot() {
      return super.isVoiceInteractionRoot() || this.u;
   }

   protected final void onCreate(Bundle var1) {
      super.onCreate(var1);
      .gzh var18 = ((CameraApp)this.getApplicationContext()).f();
      .ve var14 = this.p();
      .gtz var5 = this.o();
      var14.getClass();
      var5.getClass();
      var18 = var18.a;
      .gbe var12 = .gbe.b(var5);
      .grv var6 = .grv.b(var5);
      .gyc var10 = .gyc.b(var14);
      .qrz var7 = .qpn.b(.eec.e(.qpn.b(.egg.d(var18.E, var18.u, var10)), var18.F));
      .qrz var13 = .qpn.b(.eec.d(var18.fH, var7));
      .gyf var22 = .gyf.b(var14);
      .gyg var11 = .gyg.b(var14);
      .jik var8 = .jik.b(var18.eY, var18.D);
      .qrz var9 = .qpn.b(.fjp.f(var22, var12, var6, .qpn.b(.guw.a(var11, var12, var8, var18.gm, var18.gn, var18.go, var18.gp, var18.gq, var18.gr, var18.f, var18.r, var18.l, var18.i)), .qpn.b(.iru.i(var6, var18.fI)), var18.D));
      var9 = .qpn.b(.itw.e(var12, var6, var18.l, var13, var18.h, var18.f, var9));
      .ibv var35 = .ibv.b(var18.aa);
      .qrz var15 = .qpn.b(.isl.f(var6, var11, var18.l, var18.r, var18.bK));
      .qrz var29 = .qpn.b(.hty.c(var10, var35, var18.Z, var18.aa, var15, var18.L));
      var13 = .qpn.b(.ken.a(var15));
      var15 = .qpn.b(.eec.b(.gsc.b(var5), var18.l));
      .qrz var16 = .qpn.b(.eff.e(var12, var15, var6, var18.r, var18.o, var18.ak));
      .gyb var36 = .gyb.b(var14);
      .qrz var17 = .qpn.b(.eqk.a(var18.l, var36, var6));
      .qrz var38 = .qpn.b(.eff.f(var18.l, var18.fG, var16, var18.ak, var18.o, var17));
      var15 = .qpn.b(.eio.c(.qpn.b(.eff.d(var12, var15, var6, var18.r, var18.o, var18.ak)), var18.l, var18.fG, var18.ak, var18.r, var18.o, var17));
      .grz var41 = .grz.b(var5);
      .qrz var32 = .qpn.b(.fga.a(var41));
      var15 = .qpn.b(.fft.a(var18.au, var18.l, var38, var15, var18.fG, var18.ak, var18.bg, var41, var18.f, var18.bS, var32));
      .gsa var39 = .gsa.b(var5);
      var15 = .qpn.b(.enw.d(var6, var10, var15, var18.f, var18.D, var13, var18.bS, var29, var18.aa, var39));
      .qrz var26 = .qpn.b(.iui.e(var29, var18.t, var18.au, var18.cQ, var18.D, var18.fX, var10, var18.f, var13, var15, var39));
      var13 = var18.D;
      .ezs var30 = .ezs.a(var13, var18.gv, var18.f);
      .kkd var21 = .kkd.a(var6, var22, var18.au, var26, var13, var30, var18.gf, var8, var32);
      boolean var3 = var18.B();
      boolean var4 = var18.z();
      boolean var2 = var18.A();
      .kha var23 = (.kha)var9.get();
      .lmk var24 = .ken.b((.flx)var18.f.get());
      Object var31 = var5.a;
      .jqs var20 = (.jqs)var18.r.get();
      .dmw var25 = (.dmw)var18.fJ.get();
      .moa var27 = (.moa)var18.cQ.get();
      .jhd var19 = (.jhd)var18.D.get();
      Activity var33 = (Activity)var31;
      .oup var37 = .onk.q(new .gsu(var3, var4, var2, var24, var33));
      .fnh var40 = .fzl.a();
      Intent var34 = new Intent(this.getIntent());
      var3 = var40.equals(.fnh.a);
      var2 = false;
      if (var3 && var34.getBooleanExtra("gca_eng_fake_viroot", false)) {
         var2 = true;
      }

      this.u = var2;
      if (this.isVoiceInteractionRoot()) {
         var34.setClass(this, CameraVoiceActivity.class);
      } else {
         var34.setClass(this, CameraActivity.class);
      }

      var34.addFlags(268435456);
      this.getIntent().getAction();
      this.isVoiceInteractionRoot();
      .otw var28 = .gsv.c(.gsv.b(var34, var33, var37, var27), var34, var23, var21, var24, var33, var25, var37, var27, var19, var20);
      .gsv.a(var34, true ^ var28.h(), var33, var19);
      var33.setIntent(var34);
      if (!var28.h() || !.gsv.d((.ksm)var28.c(), var23, var21, var24, var33, var25, var20)) {
         var33.startActivity(var34);
      }

      this.finish();
   }
}
