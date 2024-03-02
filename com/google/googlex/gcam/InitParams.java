package com.google.googlex.gcam;

public class InitParams {
   public transient long a;
   protected transient boolean b;

   public InitParams() {
      long var1 = GcamModuleJNI.new_InitParams();
      super();
      this.b = true;
      this.a = var1;
   }

   public final .ptu a() {
      return .ptu.a(GcamModuleJNI.InitParams_execute_finish_on_get(this.a, this));
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
               GcamModuleJNI.delete_InitParams(var1);
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

   public final void c(.ptu var1) {
      GcamModuleJNI.InitParams_execute_finish_on_set(this.a, this, var1.e);
   }

   protected final void finalize() {
      this.b();
   }
}
