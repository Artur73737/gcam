package com.google.googlex.gcam;

public class AeMetadata {
   private transient long a;

   public AeMetadata() {
      this(GcamModuleJNI.new_AeMetadata());
   }

   public AeMetadata(long var1) {
      this.a = var1;
   }

   public final WeightedPixelRectVector a() {
      long var1 = GcamModuleJNI.AeMetadata_metering_rectangles_get(this.a, this);
      return var1 == 0L ? null : new WeightedPixelRectVector(var1);
   }

   public final void b() {
      synchronized(this){}

      try {
         if (this.a != 0L) {
            this.a = 0L;
            return;
         }
      } finally {
         ;
      }

   }

   public final void c(float var1) {
      GcamModuleJNI.AeMetadata_exposure_compensation_set(this.a, this, var1);
   }

   public final void d(boolean var1) {
      GcamModuleJNI.AeMetadata_lock_set(this.a, this, var1);
   }

   public final void e(.pti var1) {
      GcamModuleJNI.AeMetadata_mode_set(this.a, this, var1.h);
   }

   public final void f(int var1) {
      GcamModuleJNI.AeMetadata_precapture_trigger_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.b();
   }

   public final void g(.ptj var1) {
      GcamModuleJNI.AeMetadata_priority_mode_set(this.a, this, var1.e);
   }

   public final void h(.ptk var1) {
      GcamModuleJNI.AeMetadata_state_set(this.a, this, var1.h);
   }
}
