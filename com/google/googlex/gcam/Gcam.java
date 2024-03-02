package com.google.googlex.gcam;

public class Gcam {
   public transient long a;
   protected transient boolean b = true;

   public Gcam(long var1) {
      this.a = var1;
   }

   public static long a(Gcam var0) {
      return var0 == null ? 0L : var0.a;
   }

   public final StaticMetadata b(int var1) {
      return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.a, this, var1), false);
   }

   public final Tuning c(int var1) {
      return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.a, this, var1));
   }

   public final void d(int var1) {
      GcamModuleJNI.Gcam_FlushTemporalBinning(this.a, this, var1);
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
               GcamModuleJNI.delete_Gcam(var1);
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

   public final boolean f() {
      return GcamModuleJNI.Gcam_AllSensorIdsUnique(this.a, this);
   }

   protected final void finalize() {
      this.e();
   }
}
