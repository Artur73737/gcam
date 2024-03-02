package com.google.googlex.gcam;

public class PhysicalStabilityThresholds {
   public transient long a;

   public PhysicalStabilityThresholds() {
      this(GcamModuleJNI.new_PhysicalStabilityThresholds());
   }

   public PhysicalStabilityThresholds(long var1) {
      this.a = var1;
   }

   public final void a() {
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

   protected final void finalize() {
      this.a();
   }
}
