public final class zl implements yy {
   private final Object a;
   private final zh b;
   private final zh c;
   private final zh d;
   private final Object e;
   private final long f;
   private final aar g;
   private final bpe h;

   public zl(lmk var1, bpe var2, Object var3, zh var4) {
      var1.getClass();
      var4.getClass();
      aar var20 = new aar((lmk)var1.a);
      super();
      this.g = var20;
      this.h = var2;
      this.a = var3;
      zh var23 = (zh)((qvt)var2.a).eo(var3);
      this.b = var23;
      this.c = do.x(var4);
      Object var19 = var2.b;
      var23.getClass();
      if (var20.c == null) {
         var20.c = do.y(var23);
      }

      zh var22 = var20.c;
      zh var21 = var22;
      if (var22 == null) {
         qwp.b("targetVector");
         var21 = null;
      }

      int var16 = var21.b();
      int var15 = 0;

      double var5;
      double var7;
      float var11;
      for(var21 = var23; var15 < var16; ++var15) {
         var23 = var20.c;
         var22 = var23;
         if (var23 == null) {
            qwp.b("targetVector");
            var22 = null;
         }

         lmk var25 = var20.d;
         var11 = var21.a(var15);
         float var12 = var4.a(var15);
         yk var26 = (yk)var25.a;
         var5 = var26.a(var12);
         double var9 = (double)yl.a;
         float var14 = var26.a;
         float var13 = var26.b;
         var7 = (double)yl.a;
         Double.isNaN(var9);
         Double.isNaN(var7);
         var9 = var7 / (var9 - 1.0D);
         var7 = (double)(var14 * var13);
         var5 = Math.exp(var9 * var5);
         Double.isNaN(var7);
         var12 = Math.signum(var12);
         var22.e(var15, var11 + (float)(var7 * var5) * var12);
      }

      var22 = var20.c;
      var21 = var22;
      if (var22 == null) {
         qwp.b("targetVector");
         var21 = null;
      }

      this.e = ((qvt)var19).eo(var21);
      aar var24 = this.g;
      var21 = this.b;
      var21.getClass();
      if (var24.b == null) {
         var24.b = do.y(var21);
      }

      var21 = var24.b;
      if (var21 == null) {
         qwp.b("velocityVector");
         var21 = null;
      }

      var16 = var21.b();
      long var17 = 0L;

      for(var15 = 0; var15 < var16; ++var15) {
         var1 = var24.d;
         var11 = var4.a(var15);
         var7 = ((yk)var1.a).a(var11);
         var5 = (double)yl.a;
         Double.isNaN(var5);
         var17 = Math.max(var17, (long)(Math.exp(var7 / (var5 - 1.0D)) * 1000.0D) * 1000000L);
      }

      this.f = var17;
      var21 = do.x(this.g.a(var17, this.b, var4));
      this.d = var21;
      var16 = var21.b();

      for(var15 = 0; var15 < var16; ++var15) {
         var21 = this.d;
         var21.e(var15, qxb.j(var21.a(var15), 0.0F, 0.0F));
      }

   }

   public final long a() {
      return this.f;
   }

   public final zh b(long var1) {
      return !sp.d(this, var1) ? this.g.a(var1, this.b, this.c) : this.d;
   }

   public final Object c(long var1) {
      if (!sp.d(this, var1)) {
         Object var15 = this.h.b;
         aar var17 = this.g;
         zh var18 = this.b;
         zh var16 = this.c;
         var18.getClass();
         if (var17.a == null) {
            var17.a = do.y(var18);
         }

         zh var14 = var17.a;
         Object var13 = null;
         zh var12 = var14;
         if (var14 == null) {
            qwp.b("valueVector");
            var12 = null;
         }

         int var8 = var12.b();

         for(int var7 = 0; var7 < var8; ++var7) {
            var14 = var17.a;
            var12 = var14;
            if (var14 == null) {
               qwp.b("valueVector");
               var12 = null;
            }

            lmk var19 = var17.d;
            float var4 = var18.a(var7);
            float var3 = var16.a(var7);
            yj var20 = ((yk)var19.a).b(var3);
            long var10 = var20.c;
            if (var10 > 0L) {
               var3 = (float)(var1 / 1000000L) / (float)var10;
            } else {
               var3 = 1.0F;
            }

            float var5 = var20.b;
            float var6 = Math.signum(var20.a);
            int var9 = xt.a;
            var12.e(var7, var4 + var5 * var6 * xt.a(var3).a);
         }

         var12 = var17.a;
         if (var12 == null) {
            qwp.b("valueVector");
            var12 = (zh)var13;
         }

         return ((qvt)var15).eo(var12);
      } else {
         return this.e;
      }
   }

   // $FF: synthetic method
   public final boolean d(long var1) {
      return sp.d(this, var1);
   }

   public final void e() {
   }

   public final void f() {
   }

   public final bpe g() {
      return this.h;
   }
}
