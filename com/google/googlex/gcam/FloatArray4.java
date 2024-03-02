package com.google.googlex.gcam;

public class FloatArray4 {
   public transient long a;
   protected transient boolean b;

   public FloatArray4() {
      this(GcamModuleJNI.new_FloatArray4__SWIG_0(), true);
   }

   public FloatArray4(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public final float a(int var1) {
      return GcamModuleJNI.FloatArray4_get(this.a, this, var1);
   }

   public final long b() {
      return GcamModuleJNI.FloatArray4_size(this.a, this);
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
               GcamModuleJNI.delete_FloatArray4(var1);
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

   public final void d(int var1, float var2) {
      GcamModuleJNI.FloatArray4_set(this.a, this, var1, var2);
   }

   protected final void finalize() {
      this.c();
   }
}
