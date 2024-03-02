package com.google.googlex.gcam;

public class PostviewParams {
   public transient long a;
   protected transient boolean b;

   public PostviewParams() {
      long var1 = GcamModuleJNI.new_PostviewParams();
      super();
      this.b = true;
      this.a = var1;
   }

   public final void a() {
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
               GcamModuleJNI.delete_PostviewParams(var1);
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

   public final void b(.pum var1) {
      GcamModuleJNI.PostviewParams_pixel_format_set(this.a, this, var1.l);
   }

   public final void c(int var1) {
      GcamModuleJNI.PostviewParams_target_height_set(this.a, this, var1);
   }

   public final void d(int var1) {
      GcamModuleJNI.PostviewParams_target_width_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.a();
   }
}
