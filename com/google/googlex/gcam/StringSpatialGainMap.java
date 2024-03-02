package com.google.googlex.gcam;

public class StringSpatialGainMap {
   public transient long a;

   public StringSpatialGainMap() {
      this(GcamModuleJNI.new_StringSpatialGainMap__SWIG_0());
   }

   public StringSpatialGainMap(long var1) {
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
