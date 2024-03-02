package com.google.googlex.gcam;

public class AwbMetadata {
   public transient long a;

   public AwbMetadata() {
      this(GcamModuleJNI.new_AwbMetadata());
   }

   public AwbMetadata(long var1) {
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
