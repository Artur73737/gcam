import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;

public final class bcq {
   public static final Bitmap a(int var0, int var1, int var2, boolean var3, bec var4) {
      var4.getClass();
      Config var5;
      if (c.n(var2, 0)) {
         var5 = Config.ARGB_8888;
      } else if (c.n(var2, 1)) {
         var5 = Config.ALPHA_8;
      } else if (c.n(var2, 2)) {
         var5 = Config.RGB_565;
      } else if (c.n(var2, 3)) {
         var5 = Config.RGBA_F16;
      } else if (c.n(var2, 4)) {
         var5 = Config.HARDWARE;
      } else {
         var5 = Config.ARGB_8888;
      }

      Bitmap var6 = Bitmap.createBitmap((DisplayMetrics)null, var0, var1, var5, var3, bdb.a(var4));
      var6.getClass();
      return var6;
   }

   public static final bec b(Bitmap var0) {
      var0.getClass();
      ColorSpace var1 = var0.getColorSpace();
      if (var1 != null) {
         bec var2 = bdb.b(var1);
         if (var2 != null) {
            return var2;
         }
      }

      float[] var3 = bee.a;
      return bee.c;
   }

   public static void c(bcw var0, bcj var1, bco var2) {
      var0.k(var1.b, var1.c, var1.d, var1.e, var2);
   }

   // $FF: synthetic method
   public static void d(bcw var0, bcj var1) {
      var0.n(var1);
   }

   public static void e(bcw var0, bcj var1) {
      var0.m(var1.b, var1.c, var1.d, var1.e);
   }

   // $FF: synthetic method
   public static void f(bcw var0, bbf var1) {
      var0.r(var1);
   }

   public static final float g(long var0) {
      bec var5 = bcy.g(var0);
      if (c.o(var5.b, 12884901888L)) {
         var5.getClass();
         bei var7 = ((ben)var5).p;
         float var3 = (float)(var7.a((double)bcy.d(var0)) * 0.2126D + var7.a((double)bcy.c(var0)) * 0.7152D + var7.a((double)bcy.b(var0)) * 0.0722D);
         float var2;
         if (var3 <= 0.0F) {
            var2 = 0.0F;
         } else {
            var2 = var3;
            if (var3 >= 1.0F) {
               return 1.0F;
            }
         }

         return var2;
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append("The specified color must be encoded in an RGB color space. The supplied color space is ");
         String var6 = beb.a(var5.b);
         var4.append(var6);
         throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(var6));
      }
   }

   public static final int h(long var0) {
      float[] var2 = bee.a;
      return (int)(bcy.e(var0, bee.c) >>> 32);
   }

   public static final long i(int var0) {
      long var1 = bcy.a;
      return (long)var0 << 32;
   }

   public static final long j(long var0) {
      long var2 = bcy.a;
      return var0 << 32;
   }

   public static final long k(float var0, float var1, float var2, float var3, bec var4) {
      var4.getClass();
      float var5 = var4.b(0);
      if (var0 <= var4.a(0) && var5 <= var0) {
         var5 = var4.b(1);
         if (var1 <= var4.a(1) && var5 <= var1) {
            var5 = var4.b(2);
            if (var2 <= var4.a(2) && var5 <= var2 && !(var3 < 0.0F) && var3 <= 1.0F) {
               long var10;
               long var12;
               if (!var4.f()) {
                  int var7 = var4.c;
                  if (var7 != -1) {
                     short var21 = bdb.c(var0);
                     short var9 = bdb.c(var1);
                     short var8 = bdb.c(var2);
                     var0 = Math.max(0.0F, Math.min(var3, 1.0F));
                     long var18 = (long)var21;
                     long var16 = (long)var9;
                     long var14 = (long)var8;
                     var12 = (long)var7;
                     var10 = bcy.a;
                     return (var16 & 65535L) << 32 | (var18 & 65535L) << 48 | (var14 & 65535L) << 16 | ((long)((int)(var0 * 1023.0F + 0.5F)) & 1023L) << 6 | 63L & var12;
                  }

                  throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
               }

               int var6 = (int)(var3 * 255.0F + 0.5F);
               var10 = (long)((int)(var0 * 255.0F + 0.5F) << 16 | var6 << 24 | (int)(var1 * 255.0F + 0.5F) << 8 | (int)(var2 * 255.0F + 0.5F));
               var12 = bcy.a;
               return (var10 & 4294967295L) << 32;
            }
         }
      }

      StringBuilder var20 = new StringBuilder();
      var20.append("red = ");
      var20.append(var0);
      var20.append(", green = ");
      var20.append(var1);
      var20.append(", blue = ");
      var20.append(var2);
      var20.append(", alpha = ");
      var20.append(var3);
      var20.append(" outside the range for ");
      var20.append(var4);
      throw new IllegalArgumentException(var20.toString());
   }

   public static final long l(long var0, long var2) {
      var0 = bcy.e(var0, bcy.g(var2));
      float var9 = bcy.a(var0);
      float var4 = bcy.d(var0);
      float var5 = bcy.d(var2);
      float var8 = bcy.a(var2);
      float var10 = 1.0F - var9;
      float var7 = var8 * var10 + var9;
      float var6 = 0.0F;
      if (var7 == 0.0F) {
         var4 = 0.0F;
      } else {
         var4 = (var4 * var9 + var5 * var8 * var10) / var7;
      }

      var5 = bcy.c(var0);
      float var11 = bcy.c(var2);
      if (var7 == 0.0F) {
         var5 = 0.0F;
      } else {
         var5 = (var5 * var9 + var11 * var8 * var10) / var7;
      }

      var11 = bcy.b(var0);
      float var12 = bcy.b(var2);
      if (var7 != 0.0F) {
         var6 = (var11 * var9 + var12 * var8 * var10) / var7;
      }

      return k(var4, var5, var6, var7, bcy.g(var2));
   }

   // $FF: synthetic method
   public static long m(int var0, int var1, int var2) {
      return i(var0 << 16 | -16777216 | var1 << 8 | var2);
   }

   public static final void n(Canvas var0, boolean var1) {
      var0.getClass();
      bcx.a.a(var0, var1);
   }
}
