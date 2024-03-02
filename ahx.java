public final class ahx implements ahw {
   private final float a;
   private final boolean b;
   private final qvx c;
   private final float d;

   public ahx(float var1, qvx var2) {
      this.a = var1;
      this.b = true;
      this.c = var2;
      this.d = var1;
   }

   public final float a() {
      return this.d;
   }

   public final void b(bxr var1, int var2, int[] var3, bxy var4, int[] var5) {
      int var13 = var3.length;
      if (var13 != 0) {
         int var12 = var1.eJ(this.a);
         bxy var15 = bxy.b;
         byte var11 = 0;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var4 != var15) {
            var9 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;

            while(true) {
               var10 = var6;
               if (var9 >= var13) {
                  break;
               }

               var10 = var3[var9];
               var6 = Math.min(var6, var2 - var10);
               var5[var8] = var6;
               var6 = Math.min(var12, var2 - var6 - var10);
               int var14 = var5[var8];
               ++var9;
               ++var8;
               var7 = var6;
               var6 += var14 + var10;
            }
         } else {
            var8 = var13 - 1;
            var6 = 0;
            var7 = 0;

            while(true) {
               var10 = var6;
               if (var8 < 0) {
                  break;
               }

               var9 = var3[var8];
               var6 = Math.min(var6, var2 - var9);
               var5[var8] = var6;
               var7 = Math.min(var12, var2 - var6 - var9);
               var6 = var5[var8] + var9 + var7;
               --var8;
            }
         }

         var6 = var10 - var7;
         if (var6 < var2) {
            var6 = ((Number)this.c.a(var2 - var6, var4)).intValue();
            var7 = var5.length;

            for(var2 = var11; var2 < var7; ++var2) {
               var5[var2] += var6;
            }
         }

      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ahx)) {
         return false;
      } else {
         ahx var3 = (ahx)var1;
         if (!bxt.c(this.a, var3.a)) {
            return false;
         } else {
            boolean var2 = var3.b;
            return c.E(this.c, var3.c);
         }
      }
   }

   public final int hashCode() {
      return (Float.floatToIntBits(this.a) * 31 + 1) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Arrangement#spacedAligned(");
      var1.append(bxt.b(this.a));
      var1.append(", ");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
