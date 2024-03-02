package com.google.googlex.gcam;

public class PixelRect {
   public transient long a;
   protected transient boolean b;

   public PixelRect() {
      this(GcamModuleJNI.new_PixelRect(), true);
   }

   public PixelRect(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public final int a() {
      return GcamModuleJNI.PixelRect_x0_get(this.a, this);
   }

   public final int b() {
      return GcamModuleJNI.PixelRect_y0_get(this.a, this);
   }

   public final int c() {
      return GcamModuleJNI.PixelRect_height(this.a, this);
   }

   public final int d() {
      return GcamModuleJNI.PixelRect_width(this.a, this);
   }

   public final void e() {
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
               GcamModuleJNI.delete_PixelRect(var1);
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

   public final void f(int var1) {
      GcamModuleJNI.PixelRect_x0_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.e();
   }

   public final void g(int var1) {
      GcamModuleJNI.PixelRect_x1_set(this.a, this, var1);
   }

   public final void h(int var1) {
      GcamModuleJNI.PixelRect_y0_set(this.a, this, var1);
   }

   public final void i(int var1) {
      GcamModuleJNI.PixelRect_y1_set(this.a, this, var1);
   }
}
