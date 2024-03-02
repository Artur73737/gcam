package com.google.googlex.gcam;

public class MeshWarp {
   public transient long a;
   protected transient boolean b;

   public MeshWarp() {
      this(GcamModuleJNI.new_MeshWarp(), true);
   }

   public MeshWarp(long var1, boolean var3) {
      this.b = var3;
      this.a = var1;
   }

   public final int a() {
      return GcamModuleJNI.MeshWarp_grid_cols_get(this.a, this);
   }

   public final int b() {
      return GcamModuleJNI.MeshWarp_grid_rows_get(this.a, this);
   }

   public final FloatVector c() {
      long var1 = GcamModuleJNI.MeshWarp_mesh_warp_data_get(this.a, this);
      return var1 == 0L ? null : new FloatVector(var1, false);
   }

   public final PixelRect d() {
      long var1 = GcamModuleJNI.MeshWarp_mesh_warp_crop_region_get(this.a, this);
      return var1 == 0L ? null : new PixelRect(var1, false);
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
               GcamModuleJNI.delete_MeshWarp(var1);
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
      return GcamModuleJNI.MeshWarp_is_forward_mesh_get(this.a, this);
   }

   protected final void finalize() {
      this.e();
   }
}
