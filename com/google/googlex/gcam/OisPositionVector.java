package com.google.googlex.gcam;

public class OisPositionVector {
   public transient long a;

   public OisPositionVector() {
      this(GcamModuleJNI.new_OisPositionVector__SWIG_0());
   }

   public OisPositionVector(long var1) {
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
