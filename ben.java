import java.util.Arrays;

public final class ben extends bec {
   private static final bei q;
   public final bep d;
   public final float e;
   public final float f;
   public final beo g;
   public final float[] h;
   public final float[] i;
   public final float[] j;
   public final bei k;
   public final qvt l;
   public final bei m;
   public final bei n;
   public final qvt o;
   public final bei p;
   private final boolean r;

   static {
      q = bed.c;
   }

   public ben(String var1, float[] var2, bep var3, double var4, float var6, float var7, int var8) {
      Object var9;
      if (var4 == 1.0D) {
         var9 = q;
      } else {
         var9 = new bem(var4, 1);
      }

      Object var10;
      if (var4 == 1.0D) {
         var10 = q;
      } else {
         var10 = new bem(var4, 0);
      }

      this(var1, var2, var3, (float[])null, (bei)var9, (bei)var10, var6, var7, new beo(var4, 1.0D, 0.0D, 0.0D, 0.0D), var8);
   }

   public ben(String var1, float[] var2, bep var3, beo var4, int var5) {
      var4.getClass();
      bda var6;
      if (var4.f == 0.0D && var4.g == 0.0D) {
         var6 = new bda(var4, 4);
      } else {
         var6 = new bda(var4, 5);
      }

      bda var7;
      if (var4.f == 0.0D && var4.g == 0.0D) {
         var7 = new bda(var4, 6);
      } else {
         var7 = new bda(var4, 7);
      }

      this(var1, var2, var3, (float[])null, var6, var7, 0.0F, 1.0F, var4, var5);
   }

   public ben(String var1, float[] var2, bep var3, float[] var4, bei var5, bei var6, float var7, float var8, beo var9, int var10) {
      var2.getClass();
      var6.getClass();
      super(var1, 12884901888L, var10);
      this.d = var3;
      this.e = var7;
      this.f = var8;
      this.g = var9;
      this.k = var5;
      this.l = new arh(this, 16);
      this.m = new bda(this, 2);
      this.n = var6;
      this.o = new arh(this, 15);
      this.p = new bda(this, 3);
      int var31 = var2.length;
      if (var31 != 6 && var31 != 9) {
         throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
      } else if (!(var7 >= var8)) {
         float[] var35 = new float[6];
         float var13;
         float var14;
         float var15;
         if (var31 == 9) {
            var13 = var2[0];
            var15 = var2[1];
            var14 = var13 + var15 + var2[2];
            var35[0] = var13 / var14;
            var35[1] = var15 / var14;
            var14 = var2[3];
            var13 = var2[4];
            var15 = var14 + var13 + var2[5];
            var35[2] = var14 / var15;
            var35[3] = var13 / var15;
            var15 = var2[6];
            var13 = var2[7];
            var14 = var15 + var13 + var2[8];
            var35[4] = var15 / var14;
            var35[5] = var13 / var14;
         } else {
            pwm.bf(var2, var35, 6);
         }

         this.h = var35;
         if (var4 == null) {
            float var19 = var35[0];
            float var20 = 1.0F - var19;
            float var21 = var35[1];
            float var22 = var20 / var21;
            var14 = var35[2];
            var13 = 1.0F - var14;
            var15 = var35[3];
            float var25 = var13 / var15;
            float var16 = var35[4];
            float var18 = 1.0F - var16;
            float var17 = var35[5];
            float var23 = var18 / var17;
            float var29 = var3.a;
            float var30 = var3.b;
            float var24 = (1.0F - var29) / var30;
            float var26 = var19 / var21;
            float var28 = var14 / var15;
            float var27 = var16 / var17;
            var29 /= var30;
            var27 -= var26;
            var28 -= var26;
            var26 = var29 - var26;
            var25 -= var22;
            var22 = ((var24 - var22) * var28 - var25 * var26) / ((var23 - var22) * var28 - var27 * var25);
            var26 = (var26 - var27 * var22) / var28;
            var27 = 1.0F - var26 - var22;
            var25 = var27 / var21;
            var23 = var26 / var15;
            var24 = var22 / var17;
            this.i = new float[]{var19 * var25, var27, var25 * (var20 - var21), var14 * var23, var26, var23 * (var13 - var15), var16 * var24, var22, var24 * (var18 - var17)};
         } else {
            var31 = var4.length;
            if (var31 != 9) {
               throw new IllegalArgumentException(c.aE(var31, "Transform must have 9 entries! Has "));
            }

            this.i = var4;
         }

         this.j = bdb.l(this.i);
         var13 = gf.p(var35);
         var2 = bee.a;
         if (var13 / gf.p(bee.b) > 0.9F) {
            var13 = var35[0];
            var13 = var35[1];
            var13 = var35[2];
            var13 = var35[3];
            var13 = var35[4];
            var13 = var35[5];
         }

         boolean var32;
         if (var10 == 0) {
            var32 = true;
         } else {
            label81: {
               var2 = bee.a;
               var35.getClass();
               if (var35 != var2) {
                  for(var10 = 0; var10 < 6; ++var10) {
                     if (Float.compare(var35[var10], var2[var10]) != 0 && Math.abs(var35[var10] - var2[var10]) > 0.001F) {
                        var32 = false;
                        break label81;
                     }
                  }
               }

               bep var36 = bej.a;
               if (!bdb.j(var3, bej.d)) {
                  var32 = false;
               } else {
                  label97: {
                     if (var7 == 0.0F && var8 == 1.0F) {
                        ben var37 = bee.c;
                        double var11 = 0.0D;

                        while(true) {
                           if (!(var11 <= 1.0D)) {
                              var32 = true;
                              break label97;
                           }

                           if (!gf.q(var11, var5, var37.k)) {
                              var32 = false;
                              break label97;
                           }

                           if (!gf.q(var11, var6, var37.n)) {
                              break;
                           }

                           var11 += 0.00392156862745098D;
                        }
                     }

                     var32 = false;
                  }
               }
            }
         }

         this.r = var32;
      } else {
         StringBuilder var33 = new StringBuilder();
         var33.append("Invalid range: min=");
         var33.append(var7);
         var33.append(", max=");
         var33.append(var8);
         var33.append("; min must be strictly < max");
         IllegalArgumentException var34 = new IllegalArgumentException(var33.toString());
         throw var34;
      }
   }

   public final float a(int var1) {
      return this.f;
   }

   public final float b(int var1) {
      return this.e;
   }

   public final float c(float var1, float var2, float var3) {
      var1 = (float)this.p.a((double)var1);
      var2 = (float)this.p.a((double)var2);
      var3 = (float)this.p.a((double)var3);
      return bdb.i(this.i, var1, var2, var3);
   }

   public final long d(float var1, float var2, float var3) {
      var1 = (float)this.p.a((double)var1);
      float var4 = (float)this.p.a((double)var2);
      var3 = (float)this.p.a((double)var3);
      var2 = bdb.g(this.i, var1, var4, var3);
      var1 = bdb.h(this.i, var1, var4, var3);
      return (long)Float.floatToIntBits(var2) << 32 | (long)Float.floatToIntBits(var1) & 4294967295L;
   }

   public final long e(float var1, float var2, float var3, float var4, bec var5) {
      float var9 = bdb.g(this.j, var1, var2, var3);
      float var8 = bdb.h(this.j, var1, var2, var3);
      var1 = bdb.i(this.j, var1, var2, var3);
      double var6 = (double)var9;
      var2 = (float)this.m.a(var6);
      var6 = (double)var8;
      var3 = (float)this.m.a(var6);
      var6 = (double)var1;
      return bcq.k(var2, var3, (float)this.m.a(var6), var4, var5);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         if (!super.equals(var1)) {
            return false;
         } else {
            ben var3 = (ben)var1;
            if (Float.compare(var3.e, this.e) != 0) {
               return false;
            } else if (Float.compare(var3.f, this.f) != 0) {
               return false;
            } else if (!c.E(this.d, var3.d)) {
               return false;
            } else if (!Arrays.equals(this.h, var3.h)) {
               return false;
            } else {
               beo var2 = this.g;
               if (var2 != null) {
                  return c.E(var2, var3.g);
               } else if (var3.g == null) {
                  return true;
               } else {
                  return !c.E(this.k, var3.k) ? false : c.E(this.n, var3.n);
               }
            }
         }
      } else {
         return false;
      }
   }

   public final boolean f() {
      return this.r;
   }

   public final int hashCode() {
      int var7 = super.hashCode();
      int var6 = this.d.hashCode();
      int var5 = Arrays.hashCode(this.h);
      float var1 = this.e;
      int var4 = 0;
      int var2;
      if (var1 == 0.0F) {
         var2 = 0;
      } else {
         var2 = Float.floatToIntBits(var1);
      }

      var1 = this.f;
      int var3;
      if (var1 == 0.0F) {
         var3 = 0;
      } else {
         var3 = Float.floatToIntBits(var1);
      }

      beo var8 = this.g;
      if (var8 != null) {
         var4 = var8.hashCode();
      }

      var3 = ((((var7 * 31 + var6) * 31 + var5) * 31 + var2) * 31 + var3) * 31 + var4;
      var2 = var3;
      if (this.g == null) {
         var2 = (var3 * 31 + this.k.hashCode()) * 31 + this.n.hashCode();
      }

      return var2;
   }
}
