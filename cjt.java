public final class cjt extends cjs {
   public final hut q;

   public cjt(jaq var1) {
      super(var1);
      hut var2 = new hut();
      this.q = var2;
      var2.b = this.b() * 62.5F;
   }

   public final boolean e(long var1) {
      hut var11 = this.q;
      float var8 = this.i;
      float var7 = this.h;
      Object var12 = var11.c;
      double var5 = (double)var7;
      float var9 = var11.a;
      double var3 = Math.exp((double)((float)var1 / 1000.0F * var9));
      Double.isNaN(var5);
      ((cjo)var12).b = (float)(var5 * var3);
      cjo var14 = (cjo)var11.c;
      var9 = var14.b;
      var14.a = var8 + (var9 - var7) / var11.a;
      if (var11.a(var9)) {
         ((cjo)var11.c).b = 0.0F;
      }

      cjo var13 = (cjo)var11.c;
      var9 = var13.a;
      this.i = var9;
      var7 = var13.b;
      this.h = var7;
      var8 = this.o;
      if (var9 < var8) {
         this.i = var8;
         return true;
      } else {
         float var10 = this.n;
         if (var9 > var10) {
            this.i = var10;
            return true;
         } else {
            return var9 >= var10 || var9 <= var8 || this.q.a(var7);
         }
      }
   }

   public final void k() {
      super.h();
   }
}
