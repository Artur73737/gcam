package com.google.googlex.gcam;

public class LandmarkMap {
   private transient long a;

   public LandmarkMap() {
      this(GcamModuleJNI.new_LandmarkMap__SWIG_0());
   }

   public LandmarkMap(long var1) {
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

   public final void b(int var1, FaceInfo$Landmark var2) {
      GcamModuleJNI.LandmarkMap_set(this.a, this, var1, var2.a, var2);
   }

   protected final void finalize() {
      this.a();
   }
}
