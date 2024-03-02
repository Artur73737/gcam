public final class cig {
   public int a;
   public int b;
   public float c;
   public float d;
   public long e = Long.MIN_VALUE;
   public long f = 0L;
   public long g = -1L;
   public float h;
   public int i;

   public final float a(long var1) {
      long var5 = this.e;
      if (var1 < var5) {
         return 0.0F;
      } else {
         long var7 = this.g;
         float var3;
         if (var7 >= 0L && var1 >= var7) {
            var3 = this.h;
            float var4 = (float)this.i;
            return 1.0F - var3 + var3 * cih.a((float)(var1 - var7) / var4, 0.0F, 1.0F);
         } else {
            var3 = (float)this.a;
            return cih.a((float)(var1 - var5) / var3, 0.0F, 1.0F) * 0.5F;
         }
      }
   }
}
