import android.graphics.Bitmap;
import android.graphics.Canvas;

public final class bgd extends bgb {
   public final bfd a;
   public qvi b;
   public final att c;
   public float d;
   public float e;
   private boolean f;
   private final bfb g;
   private long h;
   private final qvt i;

   public bgd() {
      bfd var1 = new bfd();
      var1.g(0.0F);
      var1.h(0.0F);
      var1.e(new amp(this, 13));
      this.a = var1;
      this.f = true;
      this.g = new bfb();
      this.b = ara.l;
      this.c = sg.d((Object)null);
      this.h = bcl.b;
      this.i = new arh(this, 17);
   }

   public final void a() {
      this.f = true;
      this.b.a();
   }

   public final void c(bev var1) {
      this.f(var1, 1.0F, (dmw)null);
   }

   public final dmw d() {
      return (dmw)this.c.a();
   }

   public final void f(bev var1, float var2, dmw var3) {
      if (var3 == null) {
         var3 = this.d();
      }

      dmx var12;
      if (this.f || !c.o(this.h, var1.j())) {
         this.a.i(bcl.c(var1.j()) / this.d);
         this.a.j(bcl.a(var1.j()) / this.e);
         bfb var16 = this.g;
         float var4 = (float)Math.ceil((double)bcl.c(var1.j()));
         float var5 = (float)Math.ceil((double)bcl.a(var1.j()));
         bxy var15 = var1.k();
         qvt var14 = this.i;
         var15.getClass();
         var14.getClass();
         var12 = var16.d;
         Object var13 = var16.a;
         long var8 = car.I((int)var4, (int)var5);
         if (var12 == null || var13 == null || bxx.b(var8) > var12.h() || bxx.a(var8) > var12.g()) {
            int var6 = bxx.b(var8);
            int var7 = bxx.a(var8);
            float[] var21 = bee.a;
            ben var22 = bee.c;
            var22.getClass();
            var12 = new dmx(bcq.a(var6, var7, 0, true, var22));
            var13 = new bcm();
            ((bcm)var13).f(new Canvas(eu.k(var12)));
            var16.d = var12;
            var16.a = (bcw)var13;
         }

         var16.b = var8;
         bet var19 = var16.c;
         long var10 = car.J(var8);
         ber var20 = var19.a;
         bxr var17 = var20.a;
         bxy var18 = var20.b;
         bcw var25 = var20.c;
         var8 = var20.d;
         var20.b(var1);
         var20.c(var15);
         var20.a((bcw)var13);
         var20.d = var10;
         ((bcw)var13).e();
         gf.n(var19, bcy.a, 0L, 0, 62);
         var14.eo(var19);
         ((bcw)var13).d();
         ber var23 = var19.a;
         var23.b(var17);
         var23.c(var18);
         var23.a(var25);
         var23.d = var8;
         ((Bitmap)var12.a).prepareToDraw();
         this.f = false;
         this.h = var1.j();
      }

      bfb var24 = this.g;
      var12 = var24.d;
      if (var12 != null) {
         gf.t(var1, var12, 0L, var24.b, 0L, var2, var3, 0, 858);
      } else {
         throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Params: \tname: ");
      var1.append(this.a.e);
      var1.append("\n\tviewportWidth: ");
      var1.append(this.d);
      var1.append("\n\tviewportHeight: ");
      var1.append(this.e);
      var1.append("\n");
      return var1.toString();
   }
}
