public final class bek extends bec {
   public bek() {
      super("Generic L*a*b*", 12884901890L, 15);
   }

   public final float a(int var1) {
      return var1 == 0 ? 100.0F : 128.0F;
   }

   public final float b(int var1) {
      return var1 == 0 ? 0.0F : -128.0F;
   }

   public final float c(float var1, float var2, float var3) {
      var1 = qxb.j(var1, 0.0F, 100.0F);
      var2 = qxb.j(var3, -128.0F, 128.0F);
      var1 = (var1 + 16.0F) / 116.0F - var2 * 0.005F;
      if (var1 > 0.20689656F) {
         var1 = var1 * var1 * var1;
      } else {
         var1 = 0.12841855F * (var1 - 0.13793103F);
      }

      bep var4 = bej.a;
      return var1 * bej.e[2];
   }

   public final long d(float var1, float var2, float var3) {
      var1 = qxb.j(var1, 0.0F, 100.0F);
      var3 = qxb.j(var2, -128.0F, 128.0F);
      var2 = (var1 + 16.0F) / 116.0F;
      var1 = var3 * 0.002F + var2;
      if (var1 > 0.20689656F) {
         var1 = var1 * var1 * var1;
      } else {
         var1 = (var1 - 0.13793103F) * 0.12841855F;
      }

      if (var2 > 0.20689656F) {
         var2 = var2 * var2 * var2;
      } else {
         var2 = (var2 - 0.13793103F) * 0.12841855F;
      }

      bep var7 = bej.a;
      float[] var8 = bej.e;
      var3 = var8[0];
      float var4 = var8[1];
      long var5 = (long)Float.floatToIntBits(var1 * var3);
      return (long)Float.floatToIntBits(var2 * var4) & 4294967295L | var5 << 32;
   }

   public final long e(float var1, float var2, float var3, float var4, bec var5) {
      bep var6 = bej.a;
      float[] var7 = bej.e;
      var1 /= var7[0];
      var2 /= var7[1];
      var3 /= var7[2];
      if (var1 > 0.008856452F) {
         var1 = (float)Math.pow((double)var1, 0.3333333432674408D);
      } else {
         var1 = var1 * 7.787037F + 0.13793103F;
      }

      if (var2 > 0.008856452F) {
         var2 = (float)Math.pow((double)var2, 0.3333333432674408D);
      } else {
         var2 = var2 * 7.787037F + 0.13793103F;
      }

      if (var3 > 0.008856452F) {
         var3 = (float)Math.pow((double)var3, 0.3333333432674408D);
      } else {
         var3 = var3 * 7.787037F + 0.13793103F;
      }

      return bcq.k(qxb.j(116.0F * var2 - 16.0F, 0.0F, 100.0F), qxb.j((var1 - var2) * 500.0F, -128.0F, 128.0F), qxb.j((var2 - var3) * 200.0F, -128.0F, 128.0F), var4, var5);
   }
}
