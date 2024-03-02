import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

public final class bpx implements bnd {
   private static final qvx a;
   private final boa b;
   private qvt c;
   private qvi d;
   private boolean e;
   private final bpv f;
   private boolean g;
   private boolean h;
   private final bps i;
   private long j;
   private bco k;
   private final dmw l;
   private final eze m;

   static {
      a = bpf.c;
   }

   public bpx(boa var1, qvt var2, qvi var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.f = new bpv(var1.d);
      this.i = new bps(a);
      this.l = new dmw((byte[])null, (byte[])null);
      this.j = bdx.a;
      eze var4 = new eze((byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
      ((RenderNode)var4.a).setHasOverlappingRendering(true);
      this.m = var4;
   }

   private final void k(boolean var1) {
      if (var1 != this.e) {
         this.e = var1;
         this.b.h(this, var1);
      }

   }

   private final void l() {
      bqv.a.a(this.b);
   }

   public final long a(long var1, boolean var3) {
      if (var3) {
         float[] var4 = this.i.b(this.m);
         if (var4 != null) {
            var1 = bdf.a(var4, var1);
         } else {
            var1 = bci.b;
         }
      } else {
         var1 = bdf.a(this.i.c(this.m), var1);
      }

      return var1;
   }

   public final void b() {
      if (this.m.Y()) {
         ((RenderNode)this.m.a).discardDisplayList();
      }

      this.c = null;
      this.d = null;
      this.g = true;
      this.k(false);
      this.b.p();
      this.b.s(this);
   }

   public final void c(bcw var1) {
      Canvas var10 = bcn.a(var1);
      boolean var7 = var10.isHardwareAccelerated();
      boolean var6 = false;
      if (var7) {
         this.h();
         if (this.m.O() > 0.0F) {
            var6 = true;
         }

         this.h = var6;
         if (var6) {
            var1.c();
         }

         eze var12 = this.m;
         var10.getClass();
         var10.drawRenderNode((RenderNode)var12.a);
         if (this.h) {
            var1.b();
         }

      } else {
         float var2 = (float)this.m.Q();
         float var5 = (float)this.m.R();
         float var4 = (float)((RenderNode)this.m.a).getRight();
         float var3 = (float)((RenderNode)this.m.a).getBottom();
         if (this.m.N() < 1.0F) {
            bco var9 = this.k;
            bco var8 = var9;
            if (var9 == null) {
               var8 = eu.h();
               this.k = var8;
            }

            var8.h(this.m.N());
            var10.saveLayer(var2, var5, var4, var3, (Paint)var8.b);
         } else {
            var1.e();
         }

         var1.g(var2, var5);
         var1.a(this.i.c(this.m));
         if (this.m.X() || this.m.W()) {
            this.f.b(var1);
         }

         qvt var11 = this.c;
         if (var11 != null) {
            var11.eo(var1);
         }

         var1.d();
         this.k(false);
      }
   }

   public final void d(bch var1, boolean var2) {
      if (var2) {
         float[] var3 = this.i.b(this.m);
         if (var3 == null) {
            var1.c();
         } else {
            bdf.b(var3, var1);
         }
      } else {
         bdf.b(this.i.c(this.m), var1);
      }
   }

   public final void e(long var1) {
      int var4 = this.m.Q();
      int var6 = this.m.R();
      int var5 = bxw.b(var1);
      int var3 = bxw.a(var1);
      if (var4 != var3 || var6 != var5) {
         if (var4 != var3) {
            ((RenderNode)this.m.a).offsetLeftAndRight(var3 - var4);
         }

         if (var6 != var5) {
            ((RenderNode)this.m.a).offsetTopAndBottom(var5 - var6);
         }

         this.l();
         this.i.a();
      }
   }

   public final void f(long var1) {
      eze var12 = this.m;
      float var4 = bdx.a(this.j);
      int var7 = bxx.b(var1);
      float var3 = (float)var7;
      var12.U(var4 * var3);
      var12 = this.m;
      var4 = bdx.b(this.j);
      int var6 = bxx.a(var1);
      float var5 = (float)var6;
      var12.V(var4 * var5);
      var12 = this.m;
      int var9 = var12.Q();
      int var11 = this.m.R();
      int var10 = this.m.Q();
      int var8 = this.m.R();
      if (((RenderNode)var12.a).setPosition(var9, var11, var10 + var7, var8 + var6)) {
         this.f.c(et.k(var3, var5));
         this.m.T(this.f.a());
         this.invalidate();
         this.i.a();
      }

   }

   public final void g(qvt var1, qvi var2) {
      this.k(false);
      this.g = false;
      this.h = false;
      this.j = bdx.a;
      this.c = var1;
      this.d = var2;
   }

   public final void h() {
      if (this.e || !this.m.Y()) {
         boolean var1 = this.m.X();
         bbf var2 = null;
         if (var1) {
            bpv var3 = this.f;
            if (!var3.d()) {
               var2 = var3.g();
            }
         }

         qvt var6 = this.c;
         if (var6 != null) {
            eze var9 = this.m;
            dmw var4 = this.l;
            RecordingCanvas var7 = ((RenderNode)var9.a).beginRecording();
            var7.getClass();
            bcm var8 = (bcm)var4.a;
            Canvas var5 = var8.a;
            var8.f(var7);
            Object var10 = var4.a;
            if (var2 != null) {
               ((bcw)var10).e();
               bcq.f((bcw)var10, var2);
            }

            var6.eo(var10);
            if (var2 != null) {
               ((bcw)var10).d();
            }

            ((bcm)var4.a).f(var5);
            ((RenderNode)var9.a).endRecording();
         }

         this.k(false);
      }
   }

   public final boolean i(long var1) {
      float var4 = bci.b(var1);
      float var3 = bci.c(var1);
      if (this.m.W()) {
         return !(var4 < 0.0F) && var4 < (float)this.m.S() && !(var3 < 0.0F) && var3 < (float)this.m.P();
      } else {
         return this.m.X() ? this.f.e(var1) : true;
      }
   }

   public final void invalidate() {
      if (!this.e && !this.g) {
         this.b.invalidate();
         this.k(true);
      }

   }

   public final void j(float var1, float var2, float var3, float var4, float var5, float var6, long var7, bdr var9, boolean var10, long var11, long var13, int var15, bxy var16, bxr var17) {
      var9.getClass();
      var16.getClass();
      var17.getClass();
      this.j = var7;
      boolean var21 = this.m.X();
      boolean var19 = true;
      boolean var18;
      if (var21 && !this.f.d()) {
         var18 = true;
      } else {
         var18 = false;
      }

      ((RenderNode)this.m.a).setScaleX(var1);
      ((RenderNode)this.m.a).setScaleY(var2);
      ((RenderNode)this.m.a).setAlpha(var3);
      ((RenderNode)this.m.a).setTranslationX(0.0F);
      ((RenderNode)this.m.a).setTranslationY(0.0F);
      ((RenderNode)this.m.a).setElevation(var4);
      eze var22 = this.m;
      int var20 = bcq.h(var11);
      ((RenderNode)var22.a).setAmbientShadowColor(var20);
      var22 = this.m;
      var20 = bcq.h(var13);
      ((RenderNode)var22.a).setSpotShadowColor(var20);
      ((RenderNode)this.m.a).setRotationZ(var5);
      ((RenderNode)this.m.a).setRotationX(0.0F);
      ((RenderNode)this.m.a).setRotationY(0.0F);
      ((RenderNode)this.m.a).setCameraDistance(var6);
      this.m.U(bdx.a(var7) * (float)this.m.S());
      this.m.V(bdx.b(var7) * (float)this.m.P());
      var22 = this.m;
      if (var10 && var9 != bdm.a) {
         var21 = true;
      } else {
         var21 = false;
      }

      ((RenderNode)var22.a).setClipToOutline(var21);
      var22 = this.m;
      if (var10 && var9 == bdm.a) {
         var10 = true;
      } else {
         var10 = false;
      }

      ((RenderNode)var22.a).setClipToBounds(var10);
      var22 = this.m;
      bpw.a.a((RenderNode)var22.a, (bdn)null);
      Object var25 = this.m.a;
      RenderNode var26;
      if (c.n(var15, 1)) {
         var26 = (RenderNode)var25;
         var26.setUseCompositingLayer(true, (Paint)null);
         var26.setHasOverlappingRendering(true);
      } else if (c.n(var15, 2)) {
         var26 = (RenderNode)var25;
         var26.setUseCompositingLayer(false, (Paint)null);
         var26.setHasOverlappingRendering(false);
      } else {
         var26 = (RenderNode)var25;
         var26.setUseCompositingLayer(false, (Paint)null);
         var26.setHasOverlappingRendering(true);
      }

      var10 = this.f.f(var9, this.m.N(), this.m.X(), this.m.O(), var16, var17);
      this.m.T(this.f.a());
      boolean var24;
      if (this.m.X() && !this.f.d()) {
         var24 = var19;
      } else {
         var24 = false;
      }

      if (var18 != var24 || var24 && var10) {
         this.invalidate();
      } else {
         this.l();
      }

      if (!this.h && this.m.O() > 0.0F) {
         qvi var23 = this.d;
         if (var23 != null) {
            var23.a();
         }
      }

      this.i.a();
   }
}
