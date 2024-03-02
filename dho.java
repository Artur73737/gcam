public final class dho {
   public static final dub a = new dub();
   private static dhn b = null;

   public static dhm a() {
      return new dia();
   }

   public static void b() {
      synchronized(dho.class){}

      label119: {
         Throwable var10000;
         Throwable var13;
         label123: {
            dhn var0;
            boolean var10001;
            try {
               var0 = b;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label123;
            }

            if (var0 != null) {
               break label119;
            }

            try {
               var0 = new dhn();
               b = var0;
               break label119;
            } catch (Throwable var11) {
               var13 = var11;

               label111:
               try {
                  System.out.println(var13);
                  break label119;
               } catch (Throwable var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label111;
               }
            }
         }

         var13 = var10000;
         throw var13;
      }

   }
}
