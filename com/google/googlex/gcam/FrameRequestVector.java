package com.google.googlex.gcam;

public class FrameRequestVector {
   public transient long a;
   protected transient boolean b;

   public FrameRequestVector() {
      this(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
   }

   public FrameRequestVector(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public final long a() {
      return GcamModuleJNI.FrameRequestVector_size(this.a, this);
   }

   public final FrameRequest b(int var1) {
      return new FrameRequest(GcamModuleJNI.FrameRequestVector_get(this.a, this, var1), false);
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
               GcamModuleJNI.delete_FrameRequestVector(var1);
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

   public final boolean d() {
      return GcamModuleJNI.FrameRequestVector_isEmpty(this.a, this);
   }

   protected final void finalize() {
      this.c();
   }
}
