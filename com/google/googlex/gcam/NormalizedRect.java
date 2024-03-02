package com.google.googlex.gcam;

public class NormalizedRect {
   public transient long a;
   protected transient boolean b;

   public NormalizedRect() {
      this(GcamModuleJNI.new_NormalizedRect(), true);
   }

   public NormalizedRect(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public static long a(NormalizedRect var0) {
      return var0 == null ? 0L : var0.a;
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
               GcamModuleJNI.delete_NormalizedRect(var1);
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

   public final void c(float var1) {
      GcamModuleJNI.NormalizedRect_x0_set(this.a, this, var1);
   }

   public final void d(float var1) {
      GcamModuleJNI.NormalizedRect_x1_set(this.a, this, var1);
   }

   public final void e(float var1) {
      GcamModuleJNI.NormalizedRect_y0_set(this.a, this, var1);
   }

   public final void f(float var1) {
      GcamModuleJNI.NormalizedRect_y1_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.b();
   }
}
