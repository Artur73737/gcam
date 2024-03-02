public final class zs implements zq {
   private final int a;
   private final int b;
   private final zm c;

   public zs() {
      zm var1 = zo.a;
      throw null;
   }

   public zs(int var1, int var2, zm var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   private final long g(long var1) {
      long var5 = (long)this.b;
      long var3 = (long)this.a;
      var1 -= var5;
      if (var1 < 0L) {
         var1 = 0L;
      } else {
         if (var1 <= var3) {
            return var1;
         }

         var1 = var3;
      }

      return var1;
   }

   // $FF: synthetic method
   public final float b(float var1, float var2, float var3) {
      return this.d(this.e(var1, var2, var3), var1, var2, var3);
   }

   public final float c(long var1, float var3, float var4, float var5) {
      var1 = this.g(var1 / 1000000L);
      int var6 = this.a;
      if (var6 == 0) {
         var5 = 1.0F;
      } else {
         var5 = (float)var1 / (float)var6;
      }

      var5 = this.c.a(qxb.j(var5, 0.0F, 1.0F));
      return var3 * (1.0F - var5) + var4 * var5;
   }

   public final float d(long var1, float var3, float var4, float var5) {
      var1 = this.g(var1 / 1000000L);
      if (var1 == 0L) {
         return var5;
      } else {
         float var6 = this.c((-1L + var1) * 1000000L, var3, var4, var5);
         return (this.c(var1 * 1000000L, var3, var4, var5) - var6) * 1000.0F;
      }
   }

   public final long e(float var1, float var2, float var3) {
      return (long)(this.b + this.a) * 1000000L;
   }

   // $FF: synthetic method
   public final aaq f() {
      return dq.h(this);
   }
}
