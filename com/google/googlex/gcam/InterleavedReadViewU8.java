package com.google.googlex.gcam;

public class InterleavedReadViewU8 {
   public transient long a;
   protected transient boolean b;

   public InterleavedReadViewU8() {
      this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_0());
   }

   public InterleavedReadViewU8(long var1) {
      this.b = true;
      this.a = var1;
   }

   public final int a() {
      return GcamModuleJNI.InterleavedReadViewU8_c_stride(this.a, this);
   }

   public final int b() {
      return GcamModuleJNI.InterleavedReadViewU8_channels(this.a, this);
   }

   public final int c() {
      return GcamModuleJNI.InterleavedReadViewU8_height(this.a, this);
   }

   public final int d() {
      return GcamModuleJNI.InterleavedReadViewU8_width(this.a, this);
   }

   public final int e() {
      return GcamModuleJNI.InterleavedReadViewU8_x_stride(this.a, this);
   }

   public final int f() {
      return GcamModuleJNI.InterleavedReadViewU8_y_stride(this.a, this);
   }

   protected final void finalize() {
      this.h();
   }

   public final .pus g() {
      long var1 = GcamModuleJNI.InterleavedReadViewU8_data(this.a, this);
      return var1 == 0L ? null : new .pus(var1);
   }

   public final void h() {
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
               GcamModuleJNI.delete_InterleavedReadViewU8(var1);
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
}
