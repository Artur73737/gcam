package com.google.googlex.gcam;

public class StringStaticMetadataMap {
   public transient long a;
   protected transient boolean b;

   public StringStaticMetadataMap() {
      this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
   }

   public StringStaticMetadataMap(long var1, boolean var3) {
      this.b = var3;
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
               GcamModuleJNI.delete_StringStaticMetadataMap(var1);
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

   public final void b(String var1, StaticMetadata var2) {
      GcamModuleJNI.StringStaticMetadataMap_set(this.a, this, var1, StaticMetadata.a(var2), var2);
   }

   protected final void finalize() {
      this.a();
   }
}
