package com.google.googlex.gcam;

public class Size {
   public transient long a;

   public Size() {
      this(GcamModuleJNI.new_Size());
   }

   public Size(long var1) {
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
