package android.support.v8.renderscript;

public class Matrix4f {
   final float[] mMat;

   public Matrix4f() {
      this.mMat = new float[16];
      this.loadIdentity();
   }

   public Matrix4f(float[] var1) {
      float[] var2 = new float[16];
      this.mMat = var2;
      System.arraycopy(var1, 0, var2, 0, var2.length);
   }

   private float computeCofactor(int var1, int var2) {
      int var15 = (var1 + 1) % 4;
      int var11 = (var2 + 1) % 4 * 4;
      float[] var17 = this.mMat;
      float var4 = var17[var15 + var11];
      int var13 = (var1 + 2) % 4;
      int var12 = (var2 + 2) % 4 * 4;
      float var6 = var17[var13 + var12];
      int var14 = (var1 + 3) % 4;
      int var16 = (var2 + 3) % 4 * 4;
      float var5 = var17[var14 + var16];
      float var9 = var17[var13 + var16];
      float var10 = var17[var14 + var12];
      float var8 = var17[var12 + var15];
      float var3 = var17[var13 + var11];
      float var7 = var17[var14 + var11];
      var3 = var4 * (var6 * var5 - var9 * var10) - var8 * (var5 * var3 - var9 * var7) + var17[var15 + var16] * (var3 * var10 - var6 * var7);
      return (var1 + var2 & 1) != 0 ? -var3 : var3;
   }

   public float get(int var1, int var2) {
      return this.mMat[var1 * 4 + var2];
   }

   public float[] getArray() {
      return this.mMat;
   }

   public boolean inverse() {
      Matrix4f var7 = new Matrix4f();
      byte var4 = 0;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            var7.mMat[var2 * 4 + var3] = this.computeCofactor(var2, var3);
         }
      }

      float[] var6 = this.mMat;
      float var1 = var6[0];
      float[] var5 = var7.mMat;
      var1 = var1 * var5[0] + var6[4] * var5[1] + var6[8] * var5[2] + var6[12] * var5[3];
      if ((double)Math.abs(var1) < 1.0E-6D) {
         return false;
      } else {
         var1 = 1.0F / var1;

         for(var2 = var4; var2 < 16; ++var2) {
            this.mMat[var2] = var7.mMat[var2] * var1;
         }

         return true;
      }
   }

   public boolean inverseTranspose() {
      Matrix4f var5 = new Matrix4f();
      byte var4 = 0;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            var5.mMat[var3 * 4 + var2] = this.computeCofactor(var2, var3);
         }
      }

      float[] var6 = this.mMat;
      float var1 = var6[0];
      float[] var7 = var5.mMat;
      var1 = var1 * var7[0] + var6[4] * var7[4] + var6[8] * var7[8] + var6[12] * var7[12];
      if ((double)Math.abs(var1) < 1.0E-6D) {
         return false;
      } else {
         var1 = 1.0F / var1;

         for(var2 = var4; var2 < 16; ++var2) {
            this.mMat[var2] = var5.mMat[var2] * var1;
         }

         return true;
      }
   }

   public void load(Matrix3f var1) {
      float[] var2 = this.mMat;
      float[] var3 = var1.mMat;
      var2[0] = var3[0];
      var2[1] = var3[1];
      var2[2] = var3[2];
      var2[3] = 0.0F;
      var2[4] = var3[3];
      var2[5] = var3[4];
      var2[6] = var3[5];
      var2[7] = 0.0F;
      var2[8] = var3[6];
      var2[9] = var3[7];
      var2[10] = var3[8];
      var2[11] = 0.0F;
      var2[12] = 0.0F;
      var2[13] = 0.0F;
      var2[14] = 0.0F;
      var2[15] = 1.0F;
   }

   public void load(Matrix4f var1) {
      float[] var3 = var1.getArray();
      float[] var2 = this.mMat;
      System.arraycopy(var3, 0, var2, 0, var2.length);
   }

   public void loadFrustum(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.loadIdentity();
      float var8 = var5 + var5;
      float var7 = var2 - var1;
      float var9 = var8 / var7;
      float[] var10 = this.mMat;
      var10[0] = var9;
      var9 = var4 - var3;
      var10[5] = var8 / var9;
      var10[8] = (var2 + var1) / var7;
      var10[9] = (var4 + var3) / var9;
      var1 = -(var6 + var5);
      var2 = var6 - var5;
      var10[10] = var1 / var2;
      var10[11] = -1.0F;
      var10[14] = var6 * -2.0F * var5 / var2;
      var10[15] = 0.0F;
   }

   public void loadIdentity() {
      float[] var1 = this.mMat;
      var1[0] = 1.0F;
      var1[1] = 0.0F;
      var1[2] = 0.0F;
      var1[3] = 0.0F;
      var1[4] = 0.0F;
      var1[5] = 1.0F;
      var1[6] = 0.0F;
      var1[7] = 0.0F;
      var1[8] = 0.0F;
      var1[9] = 0.0F;
      var1[10] = 1.0F;
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
   }

   public void loadMultiply(Matrix4f var1, Matrix4f var2) {
      for(int var8 = 0; var8 < 4; ++var8) {
         float var6 = 0.0F;
         float var5 = 0.0F;
         float var4 = 0.0F;
         float var3 = 0.0F;

         for(int var9 = 0; var9 < 4; ++var9) {
            float var7 = var2.get(var8, var9);
            var6 += var1.get(var9, 0) * var7;
            var5 += var1.get(var9, 1) * var7;
            var4 += var1.get(var9, 2) * var7;
            var3 += var1.get(var9, 3) * var7;
         }

         this.set(var8, 0, var6);
         this.set(var8, 1, var5);
         this.set(var8, 2, var4);
         this.set(var8, 3, var3);
      }

   }

   public void loadOrtho(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.loadIdentity();
      float var7 = var2 - var1;
      float var8 = 2.0F / var7;
      float[] var10 = this.mMat;
      var10[0] = var8;
      float var9 = var4 - var3;
      var10[5] = 2.0F / var9;
      var8 = var6 - var5;
      var10[10] = -2.0F / var8;
      var10[12] = -(var2 + var1) / var7;
      var10[13] = -(var4 + var3) / var9;
      var10[14] = -(var6 + var5) / var8;
   }

   public void loadOrthoWindow(int var1, int var2) {
      this.loadOrtho(0.0F, (float)var1, (float)var2, 0.0F, -1.0F, 1.0F);
   }

   public void loadPerspective(float var1, float var2, float var3, float var4) {
      double var5 = (double)var1;
      Double.isNaN(var5);
      float var7 = var3 * (float)Math.tan((double)((float)(var5 * 3.141592653589793D / 360.0D)));
      var1 = -var7;
      this.loadFrustum(var1 * var2, var7 * var2, var1, var7, var3, var4);
   }

   public void loadProjectionNormalized(int var1, int var2) {
      Matrix4f var4 = new Matrix4f();
      Matrix4f var5 = new Matrix4f();
      float var3;
      if (var1 > var2) {
         var3 = (float)var1 / (float)var2;
         var4.loadFrustum(-var3, var3, -1.0F, 1.0F, 1.0F, 100.0F);
      } else {
         var3 = (float)var1;
         var3 = (float)var2 / var3;
         var4.loadFrustum(-1.0F, 1.0F, -var3, var3, 1.0F, 100.0F);
      }

      var5.loadRotate(180.0F, 0.0F, 1.0F, 0.0F);
      var4.loadMultiply(var4, var5);
      var5.loadScale(-2.0F, 2.0F, 1.0F);
      var4.loadMultiply(var4, var5);
      var5.loadTranslate(0.0F, 0.0F, 2.0F);
      var4.loadMultiply(var4, var5);
      this.load(var4);
   }

   public void loadRotate(float var1, float var2, float var3, float var4) {
      float[] var12 = this.mMat;
      var12[3] = 0.0F;
      var12[7] = 0.0F;
      var12[11] = 0.0F;
      var12[12] = 0.0F;
      var12[13] = 0.0F;
      var12[14] = 0.0F;
      var12[15] = 1.0F;
      double var5 = (double)(var1 * 0.017453292F);
      float var9 = (float)Math.cos(var5);
      float var10 = (float)Math.sin(var5);
      float var11 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      float var8 = var2;
      float var7 = var3;
      var1 = var4;
      if (var11 == 1.0F) {
         var1 = 1.0F / var11;
         var8 = var2 * var1;
         var7 = var3 * var1;
         var1 = var4 * var1;
      }

      var2 = 1.0F - var9;
      var4 = var8 * var10;
      var3 = var7 * var10;
      var10 *= var1;
      var12 = this.mMat;
      var12[0] = var8 * var8 * var2 + var9;
      var11 = var8 * var7 * var2;
      var12[4] = var11 - var10;
      var8 = var8 * var1 * var2;
      var12[8] = var8 + var3;
      var12[1] = var11 + var10;
      var12[5] = var7 * var7 * var2 + var9;
      var7 = var7 * var1 * var2;
      var12[9] = var7 - var4;
      var12[2] = var8 - var3;
      var12[6] = var7 + var4;
      var12[10] = var1 * var1 * var2 + var9;
   }

   public void loadScale(float var1, float var2, float var3) {
      this.loadIdentity();
      float[] var4 = this.mMat;
      var4[0] = var1;
      var4[5] = var2;
      var4[10] = var3;
   }

   public void loadTranslate(float var1, float var2, float var3) {
      this.loadIdentity();
      float[] var4 = this.mMat;
      var4[12] = var1;
      var4[13] = var2;
      var4[14] = var3;
   }

   public void multiply(Matrix4f var1) {
      Matrix4f var2 = new Matrix4f();
      var2.loadMultiply(this, var1);
      this.load(var2);
   }

   public void rotate(float var1, float var2, float var3, float var4) {
      Matrix4f var5 = new Matrix4f();
      var5.loadRotate(var1, var2, var3, var4);
      this.multiply(var5);
   }

   public void scale(float var1, float var2, float var3) {
      Matrix4f var4 = new Matrix4f();
      var4.loadScale(var1, var2, var3);
      this.multiply(var4);
   }

   public void set(int var1, int var2, float var3) {
      this.mMat[var1 * 4 + var2] = var3;
   }

   public void translate(float var1, float var2, float var3) {
      Matrix4f var4 = new Matrix4f();
      var4.loadTranslate(var1, var2, var3);
      this.multiply(var4);
   }

   public void transpose() {
      int var3;
      for(int var2 = 0; var2 < 3; var2 = var3) {
         var3 = var2 + 1;

         for(int var4 = var3; var4 < 4; ++var4) {
            float[] var7 = this.mMat;
            int var5 = var2 * 4 + var4;
            float var1 = var7[var5];
            int var6 = var4 * 4 + var2;
            var7[var5] = var7[var6];
            var7[var6] = var1;
         }
      }

   }
}
