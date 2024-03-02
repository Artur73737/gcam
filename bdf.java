import java.util.Arrays;

public final class bdf {
   public final float[] a;

   // $FF: synthetic method
   public bdf(float[] var1) {
      this.a = var1;
   }

   public static final long a(float[] var0, long var1) {
      float var6 = bci.b(var1);
      float var5 = bci.c(var1);
      float var4 = 1.0F / (var0[3] * var6 + var0[7] * var5 + var0[15]);
      float var3;
      if (!Float.isInfinite(var4)) {
         var3 = var4;
         if (Float.isNaN(var4)) {
            var3 = 0.0F;
         }
      } else {
         var3 = 0.0F;
      }

      return es.i((var0[0] * var6 + var0[4] * var5 + var0[12]) * var3, var3 * (var0[1] * var6 + var0[5] * var5 + var0[13]));
   }

   public static final void b(float[] var0, bch var1) {
      long var6 = a(var0, es.i(var1.a, var1.b));
      long var8 = a(var0, es.i(var1.a, var1.d));
      long var2 = a(var0, es.i(var1.c, var1.b));
      long var4 = a(var0, es.i(var1.c, var1.d));
      var1.a = Math.min(Math.min(bci.b(var6), bci.b(var8)), Math.min(bci.b(var2), bci.b(var4)));
      var1.b = Math.min(Math.min(bci.c(var6), bci.c(var8)), Math.min(bci.c(var2), bci.c(var4)));
      var1.c = Math.max(Math.max(bci.b(var6), bci.b(var8)), Math.max(bci.b(var2), bci.b(var4)));
      var1.d = Math.max(Math.max(bci.c(var6), bci.c(var8)), Math.max(bci.c(var2), bci.c(var4)));
   }

   // $FF: synthetic method
   public static float[] c() {
      return new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   // $FF: synthetic method
   public static void d(float[] var0, float var1, float var2) {
      float var6 = var0[0];
      float var16 = var0[4];
      float var17 = var0[8];
      float var3 = var0[12];
      float var4 = var0[1];
      float var13 = var0[5];
      float var18 = var0[9];
      float var5 = var0[13];
      float var8 = var0[2];
      float var10 = var0[6];
      float var14 = var0[10];
      float var12 = var0[14];
      float var7 = var0[3];
      float var11 = var0[7];
      float var15 = var0[11];
      float var9 = var0[15];
      var0[12] = var6 * var1 + var16 * var2 + var17 * 0.0F + var3;
      var0[13] = var4 * var1 + var13 * var2 + var18 * 0.0F + var5;
      var0[14] = var8 * var1 + var10 * var2 + var14 * 0.0F + var12;
      var0[15] = var7 * var1 + var11 * var2 + var15 * 0.0F + var9;
   }

   public final boolean equals(Object var1) {
      boolean var2 = var1 instanceof bdf;
      float[] var3 = this.a;
      return var2 && c.E(var3, ((bdf)var1).a);
   }

   public final int hashCode() {
      return Arrays.hashCode(this.a);
   }

   public final String toString() {
      float[] var2 = this.a;
      StringBuilder var1 = new StringBuilder();
      var1.append("\n            |");
      var1.append(var2[0]);
      var1.append(' ');
      var1.append(var2[1]);
      var1.append(' ');
      var1.append(var2[2]);
      var1.append(' ');
      var1.append(var2[3]);
      var1.append("|\n            |");
      var1.append(var2[4]);
      var1.append(' ');
      var1.append(var2[5]);
      var1.append(' ');
      var1.append(var2[6]);
      var1.append(' ');
      var1.append(var2[7]);
      var1.append("|\n            |");
      var1.append(var2[8]);
      var1.append(' ');
      var1.append(var2[9]);
      var1.append(' ');
      var1.append(var2[10]);
      var1.append(' ');
      var1.append(var2[11]);
      var1.append("|\n            |");
      var1.append(var2[12]);
      var1.append(' ');
      var1.append(var2[13]);
      var1.append(' ');
      var1.append(var2[14]);
      var1.append(' ');
      var1.append(var2[15]);
      var1.append("|\n        ");
      return qwp.j(var1.toString());
   }
}
