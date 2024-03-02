public final class bjr implements bjf {
   private final bmo a;

   public bjr(bmo var1) {
      this.a = var1;
   }

   public final bmz a() {
      return this.a.g;
   }

   public final long d() {
      bmo var1 = this.a;
      return car.I(var1.a, var1.b);
   }

   public final long e(bjf var1, long var2) {
      var1.getClass();
      bmo var16;
      if (var1 instanceof bjr) {
         var16 = ((bjr)var1).a;
         var16.g.Z();
         bmo var17 = this.a().S(var16.g).u();
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         long var12;
         if (var17 != null) {
            var12 = var16.u(var17);
            var2 = car.K(qxg.e(bci.b(var2)), qxg.e(bci.c(var2)));
            var6 = bxw.a(var12);
            var7 = bxw.b(var12);
            var12 = this.a.u(var17);
            var5 = bxw.a(var12);
            var4 = bxw.b(var12);
            var8 = bxw.b(var2);
            var2 = car.K(var6 + bxw.a(var2), var7 + var8);
            var6 = bxw.b(var2);
            var2 = car.K(bxw.a(var2) - var5, var6 - var4);
            var4 = bxw.b(var2);
            var2 = es.i((float)bxw.a(var2), (float)var4);
         } else {
            var17 = iz.f(var16);
            var12 = var16.u(var17);
            long var14 = var17.j;
            var8 = bxw.a(var12);
            int var10 = bxw.a(var14);
            int var9 = bxw.b(var12);
            int var11 = bxw.b(var14);
            var2 = car.K(qxg.e(bci.b(var2)), qxg.e(bci.c(var2)));
            var16 = this.a;
            var12 = var16.u(iz.f(var16));
            var14 = iz.f(var16).j;
            var5 = bxw.a(var12);
            var4 = bxw.a(var14);
            var7 = bxw.b(var12);
            var6 = bxw.b(var14);
            bmz var19 = iz.f(this.a).g.p;
            var19.getClass();
            bmz var18 = var17.g.p;
            var18.getClass();
            var12 = car.K(var8 + var10, var9 + var11);
            var9 = bxw.b(var12);
            var8 = bxw.a(var12);
            var10 = bxw.b(var2);
            var2 = car.K(var8 + bxw.a(var2), var9 + var10);
            var9 = bxw.b(var2);
            var8 = bxw.a(var2);
            var2 = car.K(var5 + var4, var7 + var6);
            var4 = bxw.b(var2);
            var2 = car.K(var8 - bxw.a(var2), var9 - var4);
            var4 = bxw.b(var2);
            var2 = var19.e(var18, es.i((float)bxw.a(var2), (float)var4));
         }

         return var2;
      } else {
         var16 = iz.f(this.a);
         return bci.f(this.e(var16.k, var2), var16.g.e(var1, bci.a));
      }
   }

   public final long f(long var1) {
      throw null;
   }

   public final long g(long var1) {
      bmz var4 = this.a();
      bmo var3 = iz.f(this.a);
      return var4.g(bci.f(var1, bci.e(this.e(var3.k, bci.a), this.a().e(var3.g, bci.a))));
   }

   public final bcj h(bjf var1, boolean var2) {
      return this.a().h(var1, var2);
   }

   public final bjf i() {
      if (this.k()) {
         bmz var3 = this.a().n.s().p;
         Object var2 = null;
         bjr var1 = (bjr)var2;
         if (var3 != null) {
            bmo var4 = var3.u();
            var1 = (bjr)var2;
            if (var4 != null) {
               var1 = var4.k;
            }
         }

         return var1;
      } else {
         throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
      }
   }

   public final boolean k() {
      return this.a().k();
   }
}
