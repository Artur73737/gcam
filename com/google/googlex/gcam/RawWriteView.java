package com.google.googlex.gcam;

public class RawWriteView extends RawReadView {
   private transient long c;

   public RawWriteView() {
      this(GcamModuleJNI.new_RawWriteView__SWIG_0());
   }

   public RawWriteView(int var1, int var2, int var3, .puo var4, .pus var5) {
      this(GcamModuleJNI.new_RawWriteView__SWIG_1(var1, var2, var3, var4.f, .pus.a(var5)));
   }

   public RawWriteView(long var1) {
      super(GcamModuleJNI.RawWriteView_SWIGUpcast(var1));
      this.c = var1;
   }

   public static long c(RawWriteView var0) {
      return var0 == null ? 0L : var0.c;
   }

   public void a() {
      synchronized(this){}

      Throwable var10000;
      label185: {
         long var1;
         boolean var10001;
         try {
            var1 = this.c;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label185;
         }

         if (var1 != 0L) {
            try {
               if (this.b) {
                  this.b = false;
                  GcamModuleJNI.delete_RawWriteView(var1);
               }
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label185;
            }

            try {
               this.c = 0L;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label185;
            }
         }

         label168:
         try {
            super.a();
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label168;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   protected void finalize() {
      this.a();
   }
}
