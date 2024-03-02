public final class ym extends bba implements blv {
   public yg a;
   public yh b;
   public qvt c;
   public bar d;
   public duu e;
   public duu f;
   public duu g;
   public jed h;
   private boolean i;
   private long j;
   private long k;
   private final qvt l;
   private final qvt m;

   public ym() {
   }

   public ym(jed var1, duu var2, duu var3, duu var4, yg var5, yh var6, qvt var7) {
      this.h = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.a = var5;
      this.b = var6;
      this.c = var7;
      this.j = xy.a;
      this.k = car.aa(0, 0, 15);
      this.l = new ou(this, 12);
      this.m = new ou(this, 13);
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      Object var18 = this.h.d();
      Object var17 = this.h.e();
      ya var16 = null;
      int var5;
      if (var18 == var17) {
         this.d = null;
      } else if (this.d == null) {
         this.c();
         var5 = bar.a;
         this.d = baq.a;
      }

      long var10;
      bke var23;
      if (var1.eM()) {
         var23 = var2.l(var3);
         var10 = car.I(var23.a, var23.b);
         this.j = var10;
         this.i = true;
         this.k = var3;
         Object var22 = this.h.e();
         var16 = ya.b;
         ou var24 = new ou(var23, 9);
         var3 = var10;
         if (var22 != var16) {
            var3 = 0L;
         }

         return ja.g(var1, bxx.b(var3), bxx.a(var3), var24);
      } else {
         if (this.i) {
            var10 = this.k;
         } else {
            var10 = var3;
         }

         var23 = var2.l(var10);
         long var12 = car.I(var23.a, var23.b);
         var10 = this.j;
         if (c.o(var10, xy.a)) {
            var10 = var12;
         }

         duu var19 = this.e;
         avi var20;
         if (var19 != null) {
            var20 = var19.b(this.l, new yf(this, var10));
         } else {
            var20 = var16;
         }

         if (var20 != null) {
            var12 = ((bxx)var20.a()).a;
         }

         long var14 = car.Y(var3, var12);
         var19 = this.f;
         if (var19 != null) {
            var3 = ((bxw)var19.b(yb.e, new ou(this, 10)).a()).b;
         } else {
            var3 = bxw.a;
         }

         var19 = this.g;
         if (var19 != null) {
            var12 = ((bxw)var19.b(this.m, new ou(this, 11)).a()).b;
         } else {
            var12 = bxw.a;
         }

         bar var21 = this.d;
         if (var21 != null) {
            var10 = var21.a(var10, var14, bxy.a);
         } else {
            var10 = bxw.a;
         }

         int var7 = bxw.a(var12);
         int var6 = bxw.b(var12);
         int var9 = bxx.b(var14);
         int var8 = bxx.a(var14);
         var5 = bxw.b(var10);
         return ja.g(var1, var9, var8, new ye(var23, car.K(bxw.a(var10) + var7, var5 + var6), var3, this));
      }
   }

   public final void c() {
      yq var1;
      if (this.h.r().a(ya.a, ya.b)) {
         var1 = this.a.b;
         var1 = this.b.b;
      } else {
         var1 = this.b.b;
         var1 = this.a.b;
      }
   }

   public final void er() {
      this.i = false;
      this.j = xy.a;
   }
}
