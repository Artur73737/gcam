package com.google.googlex.gcam;

public class AwbInfo {
   public transient long a;
   protected transient boolean b;

   public AwbInfo() {
      this(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
   }

   public AwbInfo(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public static long a(AwbInfo var0) {
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
               GcamModuleJNI.delete_AwbInfo(var1);
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

   public final void c(FloatArray9 var1) {
      GcamModuleJNI.AwbInfo_rgb2rgb_set(this.a, this, var1.a, var1);
   }

   public final void d(FloatArray4 var1) {
      GcamModuleJNI.AwbInfo_rggb_gains_set(this.a, this, var1.a, var1);
   }

   protected final void finalize() {
      this.b();
   }
}
