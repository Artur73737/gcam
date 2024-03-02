package android.support.v8.renderscript;

public class Matrix3f {
   final float[] mMat;

   public Matrix3f() {
      this.mMat = new float[9];
      this.loadIdentity();
   }

   public Matrix3f(float[] var1) {
      float[] var2 = new float[9];
      this.mMat = var2;
      System.arraycopy(var1, 0, var2, 0, var2.length);
   }

   public float get(int var1, int var2) {
      return this.mMat[var1 * 3 + var2];
   }

   public float[] getArray() {
      return this.mMat;
   }

   public void load(Matrix3f var1) {
      float[] var3 = var1.getArray();
      float[] var2 = this.mMat;
      System.arraycopy(var3, 0, var2, 0, var2.length);
   }

   public void loadIdentity() {
      float[] var1 = this.mMat;
      var1[0] = 1.0F;
      var1[1] = 0.0F;
      var1[2] = 0.0F;
      var1[3] = 0.0F;
      var1[4] = 1.0F;
      var1[5] = 0.0F;
      var1[6] = 0.0F;
      var1[7] = 0.0F;
      var1[8] = 1.0F;
   }

   public void loadMultiply(Matrix3f var1, Matrix3f var2) {
      for(int var7 = 0; var7 < 3; ++var7) {
         float var5 = 0.0F;
         float var4 = 0.0F;
         float var3 = 0.0F;

         for(int var8 = 0; var8 < 3; ++var8) {
            float var6 = var2.get(var7, var8);
            var5 += var1.get(var8, 0) * var6;
            var4 += var1.get(var8, 1) * var6;
            var3 += var1.get(var8, 2) * var6;
         }

         this.set(var7, 0, var5);
         this.set(var7, 1, var4);
         this.set(var7, 2, var3);
      }

   }

   public void loadRotate(float var1) {
      this.loadIdentity();
      double var2 = (double)(var1 * 0.017453292F);
      var1 = (float)Math.cos(var2);
      float var4 = (float)Math.sin(var2);
      float[] var5 = this.mMat;
      var5[0] = var1;
      var5[1] = -var4;
      var5[3] = var4;
      var5[4] = var1;
   }

   public void loadRotate(float var1, float var2, float var3, float var4) {
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

      var3 = 1.0F - var9;
      var4 = var8 * var10;
      var2 = var7 * var10;
      var10 *= var1;
      float[] var12 = this.mMat;
      var12[0] = var8 * var8 * var3 + var9;
      var11 = var8 * var7 * var3;
      var12[3] = var11 - var10;
      var8 = var8 * var1 * var3;
      var12[6] = var8 + var2;
      var12[1] = var11 + var10;
      var12[4] = var7 * var7 * var3 + var9;
      var7 = var7 * var1 * var3;
      var12[7] = var7 - var4;
      var12[2] = var8 - var2;
      var12[5] = var7 + var4;
      var12[8] = var1 * var1 * var3 + var9;
   }

   public void loadScale(float var1, float var2) {
      this.loadIdentity();
      float[] var3 = this.mMat;
      var3[0] = var1;
      var3[4] = var2;
   }

   public void loadScale(float var1, float var2, float var3) {
      this.loadIdentity();
      float[] var4 = this.mMat;
      var4[0] = var1;
      var4[4] = var2;
      var4[8] = var3;
   }

   public void loadTranslate(float var1, float var2) {
      this.loadIdentity();
      float[] var3 = this.mMat;
      var3[6] = var1;
      var3[7] = var2;
   }

   public void multiply(Matrix3f var1) {
      Matrix3f var2 = new Matrix3f();
      var2.loadMultiply(this, var1);
      this.load(var2);
   }

   public void rotate(float var1) {
      Matrix3f var2 = new Matrix3f();
      var2.loadRotate(var1);
      this.multiply(var2);
   }

   public void rotate(float var1, float var2, float var3, float var4) {
      Matrix3f var5 = new Matrix3f();
      var5.loadRotate(var1, var2, var3, var4);
      this.multiply(var5);
   }

   public void scale(float var1, float var2) {
      Matrix3f var3 = new Matrix3f();
      var3.loadScale(var1, var2);
      this.multiply(var3);
   }

   public void scale(float var1, float var2, float var3) {
      Matrix3f var4 = new Matrix3f();
      var4.loadScale(var1, var2, var3);
      this.multiply(var4);
   }

   public void set(int var1, int var2, float var3) {
      this.mMat[var1 * 3 + var2] = var3;
   }

   public void translate(float var1, float var2) {
      Matrix3f var3 = new Matrix3f();
      var3.loadTranslate(var1, var2);
      this.multiply(var3);
   }

   public void transpose() {
      int var2;
      for(int var3 = 0; var3 < 2; var3 = var2) {
         var2 = var3 + 1;

         for(int var4 = var2; var4 < 3; ++var4) {
            float[] var7 = this.mMat;
            int var6 = var3 * 3 + var4;
            float var1 = var7[var6];
            int var5 = var4 * 3 + var3;
            var7[var6] = var7[var5];
            var7[var5] = var1;
         }
      }

   }
}
