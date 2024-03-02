package android.support.v8.renderscript;

public class Matrix2f {
   final float[] mMat;

   public Matrix2f() {
      this.mMat = new float[4];
      this.loadIdentity();
   }

   public Matrix2f(float[] var1) {
      float[] var2 = new float[4];
      this.mMat = var2;
      System.arraycopy(var1, 0, var2, 0, var2.length);
   }

   public float get(int var1, int var2) {
      return this.mMat[var1 + var1 + var2];
   }

   public float[] getArray() {
      return this.mMat;
   }

   public void load(Matrix2f var1) {
      float[] var2 = var1.getArray();
      float[] var3 = this.mMat;
      System.arraycopy(var2, 0, var3, 0, var3.length);
   }

   public void loadIdentity() {
      float[] var1 = this.mMat;
      var1[0] = 1.0F;
      var1[1] = 0.0F;
      var1[2] = 0.0F;
      var1[3] = 1.0F;
   }

   public void loadMultiply(Matrix2f var1, Matrix2f var2) {
      for(int var6 = 0; var6 < 2; ++var6) {
         float var4 = 0.0F;
         float var3 = 0.0F;

         for(int var7 = 0; var7 < 2; ++var7) {
            float var5 = var2.get(var6, var7);
            var4 += var1.get(var7, 0) * var5;
            var3 += var1.get(var7, 1) * var5;
         }

         this.set(var6, 0, var4);
         this.set(var6, 1, var3);
      }

   }

   public void loadRotate(float var1) {
      double var2 = (double)(var1 * 0.017453292F);
      float var4 = (float)Math.cos(var2);
      var1 = (float)Math.sin(var2);
      float[] var5 = this.mMat;
      var5[0] = var4;
      var5[1] = -var1;
      var5[2] = var1;
      var5[3] = var4;
   }

   public void loadScale(float var1, float var2) {
      this.loadIdentity();
      float[] var3 = this.mMat;
      var3[0] = var1;
      var3[3] = var2;
   }

   public void multiply(Matrix2f var1) {
      Matrix2f var2 = new Matrix2f();
      var2.loadMultiply(this, var1);
      this.load(var2);
   }

   public void rotate(float var1) {
      Matrix2f var2 = new Matrix2f();
      var2.loadRotate(var1);
      this.multiply(var2);
   }

   public void scale(float var1, float var2) {
      Matrix2f var3 = new Matrix2f();
      var3.loadScale(var1, var2);
      this.multiply(var3);
   }

   public void set(int var1, int var2, float var3) {
      this.mMat[var1 + var1 + var2] = var3;
   }

   public void transpose() {
      float[] var2 = this.mMat;
      float var1 = var2[1];
      var2[1] = var2[2];
      var2[2] = var1;
   }
}
