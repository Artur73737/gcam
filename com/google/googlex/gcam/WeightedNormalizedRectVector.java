package com.google.googlex.gcam;

public class WeightedNormalizedRectVector {
   public transient long a;

   public WeightedNormalizedRectVector() {
      this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0());
   }

   public WeightedNormalizedRectVector(long var1) {
      this.a = var1;
   }

   public final long a() {
      return GcamModuleJNI.WeightedNormalizedRectVector_size(this.a, this);
   }

   public final void b(WeightedNormalizedRect var1) {
      GcamModuleJNI.WeightedNormalizedRectVector_add(this.a, this, var1.a, var1);
   }

   public final void c() {
      synchronized(this){}

      try {
         if (this.a == 0L) {
            return;
         }

         this.a = 0L;
      } finally {
         ;
      }

   }

   protected final void finalize() {
      this.c();
   }
}
