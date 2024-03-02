package com.google.googlex.gcam;

public class AfMetadata {
   public transient long a;

   public AfMetadata() {
      this(GcamModuleJNI.new_AfMetadata());
   }

   public AfMetadata(long var1) {
      this.a = var1;
   }

   public final WeightedPixelRectVector a() {
      long var1 = GcamModuleJNI.AfMetadata_metering_rectangles_get(this.a, this);
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

   public final void c(.ptm var1) {
      GcamModuleJNI.AfMetadata_mode_set(this.a, this, var1.h);
   }

   public final void d(.ptn var1) {
      GcamModuleJNI.AfMetadata_state_set(this.a, this, var1.i);
   }

   public final void e(int var1) {
      GcamModuleJNI.AfMetadata_trigger_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.b();
   }
}
