package com.google.googlex.gcam;

public class GrayReadViewU8 {
   public transient long a;
   protected transient boolean b;

   public GrayReadViewU8() {
      this(GcamModuleJNI.new_GrayReadViewU8__SWIG_0());
   }

   public GrayReadViewU8(long var1) {
      this.b = true;
      this.a = var1;
   }

   public final int a() {
      return GcamModuleJNI.GrayReadViewU8_x_stride(this.a, this);
   }

   public final int b() {
      return GcamModuleJNI.GrayReadViewU8_y_stride(this.a, this);
   }

   public final void c() {
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
               GcamModuleJNI.delete_GrayReadViewU8(var1);
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

   protected final void finalize() {
      this.c();
   }
}
