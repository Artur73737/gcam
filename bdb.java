import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace.Rgb;
import android.graphics.ColorSpace.Rgb.TransferParameters;

public final class bdb {
   public static final ColorSpace a(bec var0) {
      var0.getClass();
      float[] var1 = bee.a;
      Object var4;
      if (c.E(var0, bee.c)) {
         var4 = ColorSpace.get(Named.SRGB);
         var4.getClass();
      } else if (c.E(var0, bee.o)) {
         var4 = ColorSpace.get(Named.ACES);
         var4.getClass();
      } else if (c.E(var0, bee.p)) {
         var4 = ColorSpace.get(Named.ACESCG);
         var4.getClass();
      } else if (c.E(var0, bee.m)) {
         var4 = ColorSpace.get(Named.ADOBE_RGB);
         var4.getClass();
      } else if (c.E(var0, bee.h)) {
         var4 = ColorSpace.get(Named.BT2020);
         var4.getClass();
      } else if (c.E(var0, bee.g)) {
         var4 = ColorSpace.get(Named.BT709);
         var4.getClass();
      } else if (c.E(var0, bee.r)) {
         var4 = ColorSpace.get(Named.CIE_LAB);
         var4.getClass();
      } else if (c.E(var0, bee.q)) {
         var4 = ColorSpace.get(Named.CIE_XYZ);
         var4.getClass();
      } else if (c.E(var0, bee.i)) {
         var4 = ColorSpace.get(Named.DCI_P3);
         var4.getClass();
      } else if (c.E(var0, bee.j)) {
         var4 = ColorSpace.get(Named.DISPLAY_P3);
         var4.getClass();
      } else if (c.E(var0, bee.e)) {
         var4 = ColorSpace.get(Named.EXTENDED_SRGB);
         var4.getClass();
      } else if (c.E(var0, bee.f)) {
         var4 = ColorSpace.get(Named.LINEAR_EXTENDED_SRGB);
         var4.getClass();
      } else if (c.E(var0, bee.d)) {
         var4 = ColorSpace.get(Named.LINEAR_SRGB);
         var4.getClass();
      } else if (c.E(var0, bee.k)) {
         var4 = ColorSpace.get(Named.NTSC_1953);
         var4.getClass();
      } else if (c.E(var0, bee.n)) {
         var4 = ColorSpace.get(Named.PRO_PHOTO_RGB);
         var4.getClass();
      } else if (c.E(var0, bee.l)) {
         var4 = ColorSpace.get(Named.SMPTE_C);
         var4.getClass();
      } else {
         if (var0 instanceof ben) {
            ben var2 = (ben)var0;
            float[] var3 = var2.d.a();
            beo var5 = var2.g;
            TransferParameters var6;
            if (var5 != null) {
               var6 = new TransferParameters(var5.b, var5.c, var5.d, var5.e, var5.f, var5.g, var5.a);
            } else {
               var6 = null;
            }

            if (var6 != null) {
               var4 = new Rgb(var0.a, var2.h, var3, var6);
            } else {
               var4 = new Rgb(var0.a, var2.h, var3, new bcz(var2.l, 1), new bcz(var2.o, 0), var0.b(0), var0.a(0));
            }
         } else {
            var4 = ColorSpace.get(Named.SRGB);
         }

         var4.getClass();
      }

      return (ColorSpace)var4;
   }

   public static final bec b(ColorSpace var0) {
      var0.getClass();
      int var4 = var0.getId();
      float[] var10;
      Object var11;
      if (var4 == Named.SRGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.c;
      } else if (var4 == Named.ACES.ordinal()) {
         var10 = bee.a;
         var11 = bee.o;
      } else if (var4 == Named.ACESCG.ordinal()) {
         var10 = bee.a;
         var11 = bee.p;
      } else if (var4 == Named.ADOBE_RGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.m;
      } else if (var4 == Named.BT2020.ordinal()) {
         var10 = bee.a;
         var11 = bee.h;
      } else if (var4 == Named.BT709.ordinal()) {
         var10 = bee.a;
         var11 = bee.g;
      } else if (var4 == Named.CIE_LAB.ordinal()) {
         var10 = bee.a;
         var11 = bee.r;
      } else if (var4 == Named.CIE_XYZ.ordinal()) {
         var10 = bee.a;
         var11 = bee.q;
      } else if (var4 == Named.DCI_P3.ordinal()) {
         var10 = bee.a;
         var11 = bee.i;
      } else if (var4 == Named.DISPLAY_P3.ordinal()) {
         var10 = bee.a;
         var11 = bee.j;
      } else if (var4 == Named.EXTENDED_SRGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.e;
      } else if (var4 == Named.LINEAR_EXTENDED_SRGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.f;
      } else if (var4 == Named.LINEAR_SRGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.d;
      } else if (var4 == Named.NTSC_1953.ordinal()) {
         var10 = bee.a;
         var11 = bee.k;
      } else if (var4 == Named.PRO_PHOTO_RGB.ordinal()) {
         var10 = bee.a;
         var11 = bee.n;
      } else if (var4 == Named.SMPTE_C.ordinal()) {
         var10 = bee.a;
         var11 = bee.l;
      } else if (var0 instanceof Rgb) {
         Rgb var7 = (Rgb)var0;
         TransferParameters var6 = var7.getTransferParameters();
         bep var5;
         if (var7.getWhitePoint().length == 3) {
            float var3 = var7.getWhitePoint()[0];
            float var2 = var7.getWhitePoint()[1];
            float var1 = var3 + var2 + var7.getWhitePoint()[2];
            var5 = new bep(var3 / var1, var2 / var1);
         } else {
            var5 = new bep(var7.getWhitePoint()[0], var7.getWhitePoint()[1]);
         }

         beo var12;
         if (var6 != null) {
            var12 = new beo(var6.g, var6.a, var6.b, var6.c, var6.d, var6.e, var6.f);
         } else {
            var12 = null;
         }

         String var8 = var7.getName();
         var8.getClass();
         float[] var9 = var7.getPrimaries();
         var9.getClass();
         var11 = new ben(var8, var9, var5, var7.getTransform(), new bda(var0, 1), new bda(var0, 0), var0.getMinValue(0), var0.getMaxValue(0), var12, var7.getId());
      } else {
         var10 = bee.a;
         var11 = bee.c;
      }

      return (bec)var11;
   }

   public static final short c(float var0) {
      int var6 = Float.floatToRawIntBits(var0);
      int var4 = var6 >>> 31;
      int var5 = var6 & 8388607;
      int var3 = var6 >>> 23 & 255;
      int var2 = 0;
      int var1 = 0;
      if (var3 == 255) {
         if (var5 != 0) {
            var1 = 512;
         }

         var2 = 31;
      } else {
         var3 -= 112;
         if (var3 >= 31) {
            var1 = 0;
            var2 = 49;
         } else if (var3 <= 0) {
            if (var3 >= -10) {
               var3 = (var5 | 8388608) >> 1 - var3;
               var1 = var3;
               if ((var3 & 4096) != 0) {
                  var1 = var3 + 8192;
               }

               var1 >>= 13;
            } else {
               var1 = 0;
            }
         } else {
            var1 = var6 >> 13 & 1023;
            if ((var5 & 4096) != 0) {
               var1 = (var3 << 10 | var1) + 1 | var4 << 15;
               return (short)var1;
            }

            var2 = var3;
         }
      }

      var1 |= var4 << 15 | var2 << 10;
      return (short)var1;
   }

   public static final beh d(bec var0) {
      var0.getClass();
      return new bef(var0);
   }

   public static final double e(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (var0 >= var8 * var6) {
         var0 = (Math.pow(var0, 1.0D / var10) - var4) / var2;
      } else {
         var0 /= var6;
      }

      return var0;
   }

   public static final double f(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (var0 >= var8) {
         var0 = Math.pow(var2 * var0 + var4, var10);
      } else {
         var0 *= var6;
      }

      return var0;
   }

   public static final float g(float[] var0, float var1, float var2, float var3) {
      var0.getClass();
      return var0[0] * var1 + var0[3] * var2 + var0[6] * var3;
   }

   public static final float h(float[] var0, float var1, float var2, float var3) {
      var0.getClass();
      return var0[1] * var1 + var0[4] * var2 + var0[7] * var3;
   }

   public static final float i(float[] var0, float var1, float var2, float var3) {
      var0.getClass();
      return var0[2] * var1 + var0[5] * var2 + var0[8] * var3;
   }

   public static final boolean j(bep var0, bep var1) {
      if (var0 != var1) {
         return Math.abs(var0.a - var1.a) < 0.001F && Math.abs(var0.b - var1.b) < 0.001F;
      } else {
         return true;
      }
   }

   public static final float[] k(float[] var0, float[] var1, float[] var2) {
      p(var0, var1);
      p(var0, var2);
      float var5 = var2[0] / var1[0];
      float var4 = var2[1] / var1[1];
      float var3 = var2[2] / var1[2];
      return m(l(var0), n(new float[]{var5, var4, var3}, var0));
   }

   public static final float[] l(float[] var0) {
      var0.getClass();
      float var7 = var0[0];
      float var12 = var0[3];
      float var4 = var0[6];
      float var10 = var0[1];
      float var5 = var0[4];
      float var3 = var0[7];
      float var13 = var0[2];
      float var9 = var0[5];
      float var6 = var0[8];
      float var11 = var5 * var6 - var3 * var9;
      float var8 = var3 * var13 - var10 * var6;
      float var1 = var10 * var9 - var5 * var13;
      var0 = new float[var0.length];
      float var2 = var7 * var11 + var12 * var8 + var4 * var1;
      var0[0] = var11 / var2;
      var0[1] = var8 / var2;
      var0[2] = var1 / var2;
      var0[3] = (var4 * var9 - var12 * var6) / var2;
      var0[4] = (var6 * var7 - var4 * var13) / var2;
      var0[5] = (var13 * var12 - var9 * var7) / var2;
      var0[6] = (var12 * var3 - var4 * var5) / var2;
      var0[7] = (var4 * var10 - var3 * var7) / var2;
      var0[8] = (var7 * var5 - var12 * var10) / var2;
      return var0;
   }

   public static final float[] m(float[] var0, float[] var1) {
      var0.getClass();
      var1.getClass();
      float var5 = var0[0];
      float var8 = var1[0];
      float var12 = var0[3];
      float var19 = var1[1];
      float var15 = var0[6];
      float var27 = var1[2];
      float var13 = var0[1];
      float var21 = var1[0];
      float var22 = var0[4];
      float var10 = var0[7];
      float var2 = var0[2];
      float var11 = var0[5];
      float var14 = var1[1];
      float var23 = var0[8];
      float var25 = var0[0];
      float var28 = var1[3];
      float var17 = var1[4];
      float var6 = var1[5];
      float var3 = var0[1];
      float var24 = var1[3];
      float var20 = var0[2];
      float var26 = var1[4];
      float var9 = var1[6];
      float var16 = var0[3];
      float var7 = var1[7];
      float var18 = var1[8];
      float var4 = var1[6];
      return new float[]{var5 * var8 + var12 * var19 + var15 * var27, var13 * var21 + var19 * var22 + var10 * var27, var2 * var21 + var14 * var11 + var27 * var23, var28 * var25 + var12 * var17 + var15 * var6, var3 * var24 + var22 * var17 + var10 * var6, var24 * var20 + var11 * var26 + var6 * var23, var25 * var9 + var16 * var7 + var15 * var18, var3 * var4 + var0[4] * var7 + var10 * var18, var20 * var4 + var0[5] * var1[7] + var23 * var18};
   }

   public static final float[] n(float[] var0, float[] var1) {
      var1.getClass();
      float var5 = var0[0];
      float var12 = var1[0];
      float var6 = var0[1];
      float var11 = var1[1];
      float var10 = var0[2];
      float var3 = var1[2];
      float var8 = var0[0];
      float var7 = var1[3];
      float var2 = var0[1];
      float var4 = var1[4];
      float var9 = var0[2];
      return new float[]{var5 * var12, var6 * var11, var10 * var3, var7 * var8, var4 * var2, var1[5] * var9, var8 * var1[6], var2 * var1[7], var9 * var1[8]};
   }

   // $FF: synthetic method
   public static bec o(bec var0, bep var1) {
      bea var3 = bea.a;
      if (c.o(var0.b, 12884901888L)) {
         ben var2 = (ben)var0;
         if (!j(var2.d, var1)) {
            float[] var4 = var1.a();
            var4 = m(k(var3.b, var2.d.a(), var4), var2.i);
            return new ben(var2.a, var2.h, var1, var4, var2.k, var2.n, var2.e, var2.f, var2.g, -1);
         }
      }

      return var0;
   }

   public static final void p(float[] var0, float[] var1) {
      float var3 = var1[0];
      float var2 = var1[1];
      float var4 = var1[2];
      var1[0] = var0[0] * var3 + var0[3] * var2 + var0[6] * var4;
      var1[1] = var0[1] * var3 + var0[4] * var2 + var0[7] * var4;
      var1[2] = var0[2] * var3 + var0[5] * var2 + var0[8] * var4;
   }
}
