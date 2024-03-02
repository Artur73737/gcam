final class dhd extends dgw {
   public dhd() {
   }

   public final void a(dhe var1, dhe var2) {
      var1.c = var2;
   }

   public final void b(dhe var1, Thread var2) {
      var1.b = var2;
   }

   public final boolean c(dhf var1, dha var2, dha var3) {
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.e == var2) {
               var1.e = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean d(dhf var1, Object var2, Object var3) {
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.d == var2) {
               var1.d = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean e(dhf var1, dhe var2, dhe var3) {
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.f == var2) {
               var1.f = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }
}
