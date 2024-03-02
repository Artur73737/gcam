final class rfj implements raj {
   public final rfl a;
   public final long b;
   public final Object c;
   public final que d;

   public rfj(rfl var1, long var2, Object var4, que var5) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
   }

   public final void gD() {
      rfl var5 = this.a;
      synchronized(var5){}

      Throwable var10000;
      label140: {
         long var1;
         boolean var10001;
         long var3;
         try {
            var3 = this.b;
            var1 = var5.d();
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label140;
         }

         if (var3 < var1) {
            return;
         }

         Object var6;
         Object[] var7;
         try {
            var7 = var5.a;
            var7.getClass();
            var6 = rfm.a(var7, this.b);
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label140;
         }

         if (var6 != this) {
            return;
         }

         try {
            rfm.b(var7, this.b, rfm.a);
            var5.h();
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label140;
         }

         return;
      }

      Throwable var20 = var10000;
      throw var20;
   }
}
