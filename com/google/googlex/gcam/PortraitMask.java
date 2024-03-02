package com.google.googlex.gcam;

public class PortraitMask {
   public transient long a;

   public PortraitMask() {
      this(GcamModuleJNI.new_PortraitMask());
   }

   public PortraitMask(long var1) {
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
