public class beh {
   public static final beh a;
   public static final beh b;
   public static final beh c;
   public final bec d;
   private final bec e;
   private final bec f;
   private final float[] g;

   static {
      float[] var0 = bee.a;
      a = bdb.d(bee.c);
      b = new beh(bee.c, bee.t, 0);
      c = new beh(bee.t, bee.c, 0);
   }

   public beh(bec var1, bec var2, int var3) {
      var1.getClass();
      var2.getClass();
      bec var12;
      if (c.o(var1.b, 12884901888L)) {
         bep var7 = bej.a;
         var12 = bdb.o(var1, bej.b);
      } else {
         var12 = var1;
      }

      bec var13;
      if (c.o(var2.b, 12884901888L)) {
         bep var8 = bej.a;
         var13 = bdb.o(var2, bej.b);
      } else {
         var13 = var2;
      }

      boolean var4 = c.n(var3, 3);
      ben var9 = null;
      float[] var10;
      if (!var4) {
         var10 = (float[])var9;
      } else {
         label52: {
            boolean var6 = c.o(var1.b, 12884901888L);
            boolean var5 = c.o(var2.b, 12884901888L);
            var4 = var5;
            if (var6) {
               if (var5) {
                  var10 = (float[])var9;
                  break label52;
               }

               var4 = false;
            }

            if (!var6 && !var4) {
               var10 = (float[])var9;
            } else {
               if (!var6) {
                  var1 = var2;
               }

               var9 = (ben)var1;
               if (var6) {
                  var10 = var9.d.a();
               } else {
                  bep var11 = bej.a;
                  var10 = bej.e;
               }

               float[] var14;
               if (var4) {
                  var14 = var9.d.a();
               } else {
                  bep var15 = bej.a;
                  var14 = bej.e;
               }

               var10 = new float[]{var10[0] / var14[0], var10[1] / var14[1], var10[2] / var14[2]};
            }
         }
      }

      this(var2, var12, var13, var10);
   }

   public beh(bec var1, bec var2, bec var3, float[] var4) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
   }

   public long a(float var1, float var2, float var3, float var4) {
      long var8 = this.e.d(var1, var2, var3);
      int var7 = (int)(var8 & 4294967295L);
      float var6 = Float.intBitsToFloat((int)(var8 >> 32));
      float var5 = Float.intBitsToFloat(var7);
      var2 = this.e.c(var1, var2, var3);
      float[] var10 = this.g;
      if (var10 != null) {
         var1 = var10[0];
         var3 = var10[1];
         var2 *= var10[2];
         var1 = var6 * var1;
         var3 = var5 * var3;
      } else {
         var1 = var6;
         var3 = var5;
      }

      return this.f.e(var1, var3, var2, var4, this.d);
   }
}
