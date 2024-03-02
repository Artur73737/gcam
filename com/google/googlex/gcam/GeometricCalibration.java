package com.google.googlex.gcam;

public class GeometricCalibration {
   public transient long a;
   protected transient boolean b;

   public GeometricCalibration() {
      long var1 = GcamModuleJNI.new_GeometricCalibration();
      super();
      this.b = true;
      this.a = var1;
   }

   public final void a() {
      synchronized(this){}

      Throwable var10000;
      label136: {
         long var1;
         boolean var10001;
         try {
            var1 = this.a;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label136;
         }

         if (var1 == 0L) {
            return;
         }

         try {
            if (this.b) {
               this.b = false;
               GcamModuleJNI.delete_GeometricCalibration(var1);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label136;
         }

         label124:
         try {
            this.a = 0L;
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label124;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public final void b(float[] var1) {
      GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.a, this, var1);
   }

   public final void c(float[] var1) {
      GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.a, this, var1);
   }

   public final void d(.pty var1) {
      GcamModuleJNI.GeometricCalibration_quality_set(this.a, this, var1.c);
   }

   protected final void finalize() {
      this.a();
   }
}
