final class aar {
   public zh a;
   public zh b;
   public zh c;
   public final lmk d;

   public aar(lmk var1) {
      this.d = var1;
   }

   public final zh a(long var1, zh var3, zh var4) {
      var3.getClass();
      if (this.b == null) {
         this.b = do.y(var3);
      }

      zh var11 = this.b;
      var3 = var11;
      if (var11 == null) {
         qwp.b("velocityVector");
         var3 = null;
      }

      int var7 = var3.b();

      for(int var6 = 0; var6 < var7; ++var6) {
         var11 = this.b;
         var3 = var11;
         if (var11 == null) {
            qwp.b("velocityVector");
            var3 = null;
         }

         lmk var12 = this.d;
         float var5 = var4.a(var6);
         yj var13 = ((yk)var12.a).b(var5);
         long var9 = var13.c;
         if (var9 > 0L) {
            var5 = (float)(var1 / 1000000L) / (float)var9;
         } else {
            var5 = 1.0F;
         }

         int var8 = xt.a;
         var3.e(var6, xt.a(var5).b * Math.signum(var13.a) * var13.b / (float)var13.c * 1000.0F);
      }

      var3 = this.b;
      if (var3 == null) {
         qwp.b("velocityVector");
         return null;
      } else {
         return var3;
      }
   }
}
