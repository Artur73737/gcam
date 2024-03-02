package com.google.googlex.gcam;

public class ClientShotMetadata {
   protected transient boolean a;
   private transient long b;

   public ClientShotMetadata() {
      long var1 = GcamModuleJNI.new_ClientShotMetadata();
      super();
      this.a = true;
      this.b = var1;
   }

   public static long a(ClientShotMetadata var0) {
      return var0 == null ? 0L : var0.b;
   }

   public final void b() {
      synchronized(this){}

      Throwable var10000;
      label136: {
         long var1;
         boolean var10001;
         try {
            var1 = this.b;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label136;
         }

         if (var1 == 0L) {
            return;
         }

         try {
            if (this.a) {
               this.a = false;
               GcamModuleJNI.delete_ClientShotMetadata(var1);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label136;
         }

         label124:
         try {
            this.b = 0L;
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

   public final void c(LocationData var1) {
      GcamModuleJNI.ClientShotMetadata_location_set(this.b, this, var1.a, var1);
   }

   protected final void finalize() {
      this.b();
   }
}
