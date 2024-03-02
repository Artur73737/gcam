package com.google.android.apps.camera.ui.supermodeswitcher;

import android.content.Context;
import android.util.AttributeSet;

public final class SupermodeSwitcher extends .bno implements .kfw, .hgy, .hgx {
   private boolean a;

   public SupermodeSwitcher(Context var1) {
      var1.getClass();
      this(var1, (AttributeSet)null, 0, 6, (.qwl)null);
   }

   public SupermodeSwitcher(Context var1, AttributeSet var2) {
      var1.getClass();
      this(var1, var2, 0, 4, (.qwl)null);
   }

   public SupermodeSwitcher(Context var1, AttributeSet var2, int var3) {
      var1.getClass();
      super(var1, var2, var3);
      this.a = true;
   }

   // $FF: synthetic method
   public SupermodeSwitcher(Context var1, AttributeSet var2, int var3, int var4, .qwl var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = 0;
      }

      this(var1, var2, var3);
   }

   public final void a(.asm var1, int var2) {
      .asm var3 = var1.b(996734958);
      if ((var2 & 1) == 0 && var3.G()) {
         var3.q();
      } else {
         .qvx var4 = .knc.a;
         .edt.a((Context)null, false, false, false, .knc.b, var3, 1572864);
      }

      .aug var5 = var3.H();
      if (var5 != null) {
         var5.c = new .ajh(this, var2, 10);
      }
   }

   public final void onLayoutUpdated(.kge var1, .ktb var2) {
      var1.getClass();
      var2.getClass();
      Context var6 = this.getContext();
      var6.getClass();
      .eh var8 = (.eh)var6;
      .gfv var7 = var8.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging();
      .cnj var9 = var8.getDefaultViewModelProviderFactory();
      .cnp var12 = .cmt.b(var8);
      var7.getClass();
      var9.getClass();
      var12.getClass();
      .knt var11 = (.knt).clu.c(.knt.class, var7, var9, var12);
      boolean var5 = this.a;
      .cml var13 = var11.g;
      Object var10 = var11.f.a();
      var10.getClass();
      float var3 = .jbc.av((float).jbc.ax((.ktb)var10), (float).jbc.ax(var2));
      short var4;
      if (var3 > 0.0F && var3 <= 90.0F && !var5) {
         var4 = 250;
      } else {
         var4 = 0;
      }

      var13.h(.sq.i(var4, 0, .zo.a, 2));
      var11.e.h(var1);
      var11.f.h(var2);
      this.a = false;
   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.ktb var1) {
   }

   public final void onStop() {
      this.a = true;
   }
}
