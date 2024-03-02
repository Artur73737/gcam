package com.google.googlex.gcam;

public class LocationData {
   public transient long a;
   protected transient boolean b;

   public LocationData() {
      long var1 = GcamModuleJNI.new_LocationData();
      super();
      this.b = true;
      this.a = var1;
   }

   public final void a() {
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
               GcamModuleJNI.delete_LocationData(var1);
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

   public final void b(double var1) {
      GcamModuleJNI.LocationData_altitude_set(this.a, this, var1);
   }

   public final void c(double var1) {
      GcamModuleJNI.LocationData_degree_of_precision_set(this.a, this, var1);
   }

   public final void d(double var1) {
      GcamModuleJNI.LocationData_latitude_set(this.a, this, var1);
   }

   public final void e(double var1) {
      GcamModuleJNI.LocationData_longitude_set(this.a, this, var1);
   }

   public final void f(String var1) {
      GcamModuleJNI.LocationData_processing_method_set(this.a, this, var1);
   }

   protected final void finalize() {
      this.a();
   }

   public final void g(long var1) {
      GcamModuleJNI.LocationData_timestamp_unix_set(this.a, this, var1);
   }
}
