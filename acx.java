public final class acx implements acz {
   public final zb a;

   public acx() {
      zb var1 = acy.a;
      this.a = acy.a;
   }

   public final float a(float var1, float var2, float var3) {
      float var4 = var2 + var1;
      if ((!(var1 >= 0.0F) || !(var4 <= var3)) && (!(var1 < 0.0F) || !(var4 > var3))) {
         var2 = Math.abs(var1);
         var3 = var4 - var3;
         if (!(var2 < Math.abs(var3))) {
            return var3;
         }
      } else {
         var1 = 0.0F;
      }

      return var1;
   }
}
