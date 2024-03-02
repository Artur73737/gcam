package com.google.googlex.gcam;

public class Uint8Vector {
   public transient long a;

   public Uint8Vector() {
      this(GcamModuleJNI.new_Uint8Vector__SWIG_0());
   }

   public Uint8Vector(long var1) {
      this.a = var1;
   }

   public final void a() {
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
      this.a();
   }
}
