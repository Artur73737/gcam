public final class yk {
   public final float a;
   public final float b;
   private final bxr c;

   public yk(float var1, bxr var2) {
      this.a = var1;
      this.c = var2;
      var1 = var2.a();
      float var3 = yl.a;
      this.b = var1 * 386.0878F * 160.0F * 0.84F;
   }

   public final double a(float var1) {
      int var8 = xt.a;
      float var7 = this.a;
      float var6 = this.b;
      double var4 = (double)(Math.abs(var1) * 0.35F);
      double var2 = (double)(var7 * var6);
      Double.isNaN(var4);
      Double.isNaN(var2);
      return Math.log(var4 / var2);
   }

   public final yj b(float var1) {
      double var2 = this.a(var1);
      double var6 = (double)yl.a;
      float var10 = this.a;
      float var11 = this.b;
      double var4 = (double)yl.a;
      Double.isNaN(var6);
      --var6;
      Double.isNaN(var4);
      double var8 = var4 / var6;
      var4 = (double)(var10 * var11);
      var8 = Math.exp(var8 * var2);
      Double.isNaN(var4);
      var2 = Math.exp(var2 / var6);
      return new yj(var1, (float)(var4 * var8), (long)(var2 * 1000.0D));
   }
}
