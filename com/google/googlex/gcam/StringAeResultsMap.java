package com.google.googlex.gcam;

public class StringAeResultsMap {
   public transient long a;

   public StringAeResultsMap() {
      this(GcamModuleJNI.new_StringAeResultsMap__SWIG_0());
   }

   public StringAeResultsMap(long var1) {
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
