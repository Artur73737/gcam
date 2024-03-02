package com.google.googlex.gcam;

public class PortraitRequest {
   public transient long a;
   protected transient boolean b;

   public PortraitRequest() {
      long var1 = GcamModuleJNI.new_PortraitRequest();
      super();
      this.b = true;
      this.a = var1;
   }

   public final PixelRectVector a() {
      long var1 = GcamModuleJNI.PortraitRequest_faces_get(this.a, this);
      return var1 == 0L ? null : new PixelRectVector(var1, false);
   }

   public final void b() {
      synchronized(this){}

      Throwable var10000;
      label136: {
         long var1;
         boolean var10001;
         try {
            var1 = this.a;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label136;
         }

         if (var1 == 0L) {
            return;
         }

         try {
            if (this.b) {
               this.b = false;
               GcamModuleJNI.delete_PortraitRequest(var1);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label136;
         }

         label124:
         try {
            this.a = 0L;
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label124;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public final void c(.pts var1) {
      GcamModuleJNI.PortraitRequest_depth_processing_set(this.a, this, var1.d);
   }

   public final boolean d() {
      return GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_get(this.a, this);
   }

   public final boolean e() {
      return GcamModuleJNI.PortraitRequest_use_gpu_resample_get(this.a, this);
   }

   protected final void finalize() {
      this.b();
   }
}
