package com.google.googlex.gcam;

public class ShotParams {
   public transient long a;
   protected transient boolean b;

   public ShotParams() {
      this(GcamModuleJNI.new_ShotParams__SWIG_0());
   }

   public ShotParams(long var1) {
      this.b = true;
      this.a = var1;
   }

   public ShotParams(ShotParams var1) {
      this(GcamModuleJNI.new_ShotParams__SWIG_1(var1.a, var1));
   }

   public final AeShotParams a() {
      long var1 = GcamModuleJNI.ShotParams_ae_get(this.a, this);
      return var1 == 0L ? null : new AeShotParams(var1, false);
   }

   public final void b() {
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
               GcamModuleJNI.delete_ShotParams(var1);
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

   public final void c(AwbInfo var1) {
      GcamModuleJNI.ShotParams_force_wb_set(this.a, this, AwbInfo.a(var1), var1);
   }

   public final void d(.puj var1) {
      GcamModuleJNI.ShotParams_merge_method_override_set(this.a, this, var1.c);
   }

   public final void e(boolean var1) {
      GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.a, this, var1);
   }

   public final void f(.pur var1) {
      GcamModuleJNI.ShotParams_resampling_method_override_set(this.a, this, var1.d);
   }

   protected final void finalize() {
      this.b();
   }

   public final void g(boolean var1) {
      GcamModuleJNI.ShotParams_shasta_enabled_set(this.a, this, var1);
   }

   public final void h(.puv var1) {
      GcamModuleJNI.ShotParams_walnut_option_set(this.a, this, var1.c);
   }

   public final boolean i() {
      return GcamModuleJNI.ShotParams_device_is_on_tripod_get(this.a, this);
   }
}
