package com.google.googlex.gcam;

public class ShotMetadata {
   public transient long a;
   protected transient boolean b;

   public ShotMetadata() {
      this(GcamModuleJNI.new_ShotMetadata__SWIG_0());
   }

   public ShotMetadata(long var1) {
      this.b = true;
      this.a = var1;
   }

   public ShotMetadata(ShotMetadata var1) {
      this(GcamModuleJNI.new_ShotMetadata__SWIG_1(a(var1), var1));
   }

   public static long a(ShotMetadata var0) {
      return var0 == null ? 0L : var0.a;
   }

   public final long b() {
      return GcamModuleJNI.ShotMetadata_timestamp_unix_us_get(this.a, this);
   }

   public final AeResults c() {
      long var1 = GcamModuleJNI.ShotMetadata_ae_results_get(this.a, this);
      return var1 == 0L ? null : new AeResults(var1, false);
   }

   public final FrameMetadata d() {
      long var1 = GcamModuleJNI.ShotMetadata_frame_metadata_get(this.a, this);
      return var1 == 0L ? null : new FrameMetadata(var1, false);
   }

   public final .ptz e() {
      return .ptz.a(GcamModuleJNI.ShotMetadata_image_rotation_get(this.a, this));
   }

   public final StaticMetadata f() {
      long var1 = GcamModuleJNI.ShotMetadata_static_metadata_get(this.a, this);
      return var1 == 0L ? null : new StaticMetadata(var1, false);
   }

   protected final void finalize() {
      this.i();
   }

   public final String g() {
      return GcamModuleJNI.ShotMetadata_software_suffix_get(this.a, this);
   }

   public final void h(String var1) {
      GcamModuleJNI.ShotMetadata_AppendToMakernoteSummary(this.a, this, var1);
   }

   public final void i() {
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
               GcamModuleJNI.delete_ShotMetadata(var1);
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

   public final void j(String var1) {
      GcamModuleJNI.ShotMetadata_slowraw_path_set(this.a, this, var1);
   }

   public final void k(String var1) {
      GcamModuleJNI.ShotMetadata_software_suffix_set(this.a, this, var1);
   }

   public final boolean l() {
      return GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_get(this.a, this);
   }
}
