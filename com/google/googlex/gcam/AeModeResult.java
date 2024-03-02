package com.google.googlex.gcam;

public class AeModeResult {
   public transient long a;
   protected transient boolean b;

   public AeModeResult() {
      this(GcamModuleJNI.new_AeModeResult(), true);
   }

   public AeModeResult(long var1, boolean var3) {
      this.b = var3;
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
               GcamModuleJNI.delete_AeModeResult(var1);
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

   public final void b(float var1) {
      GcamModuleJNI.AeModeResult_final_tet_set(this.a, this, var1);
   }

   public final void c(float var1) {
      GcamModuleJNI.AeModeResult_ideal_tet_set(this.a, this, var1);
   }

   public final void d(float var1) {
      GcamModuleJNI.AeModeResult_log_scene_brightness_set(this.a, this, var1);
   }

   public final void e(float var1) {
      GcamModuleJNI.AeModeResult_touch_area_linear_value_set(this.a, this, var1);
   }

   public final void f(boolean var1) {
      GcamModuleJNI.AeModeResult_touch_roi_clip_protection_tripped_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.a();
   }
}
