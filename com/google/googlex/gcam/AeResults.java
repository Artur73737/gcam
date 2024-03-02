package com.google.googlex.gcam;

public class AeResults {
   public transient long a;
   protected transient boolean b;

   public AeResults() {
      this(GcamModuleJNI.new_AeResults(), true);
   }

   public AeResults(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public final float a(.ptl var1) {
      return GcamModuleJNI.AeResults_FinalTet(this.a, this, var1.c);
   }

   public final AeModeResult b() {
      long var1 = GcamModuleJNI.AeResults_portrait_result_get(this.a, this);
      return var1 == 0L ? null : new AeModeResult(var1, false);
   }

   public final void c() {
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
               GcamModuleJNI.delete_AeResults(var1);
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

   public final void d(AeModeResult[] var1) {
      long var5 = this.a;
      long[] var8 = new long[2];

      for(int var2 = 0; var2 < 2; ++var2) {
         AeModeResult var7 = var1[var2];
         long var3;
         if (var7 == null) {
            var3 = 0L;
         } else {
            var3 = var7.a;
         }

         var8[var2] = var3;
      }

      GcamModuleJNI.AeResults_mode_result_set(var5, this, var8);
   }

   public final void e(float var1) {
      GcamModuleJNI.AeResults_predicted_image_brightness_set(this.a, this, var1);
   }

   public final void f(boolean var1) {
      GcamModuleJNI.AeResults_process_ae_stats_executed_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.c();
   }

   public final void g(float var1) {
      GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(this.a, this, var1);
   }

   public final void h(float var1) {
      GcamModuleJNI.AeResults_safe_underexposure_set(this.a, this, var1);
   }

   public final void i(float var1) {
      GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(this.a, this, var1);
   }
}
