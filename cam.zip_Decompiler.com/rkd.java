public final class rkd extends qfn implements qgv {
   public static final rkd a;
   private static volatile qhb b;

   static {
      rkd var0 = new rkd();
      a = var0;
      qfn.ab(rkd.class, var0);
   }

   private rkd() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(a, "\u0001\u0000", (Object[])null);
      case 3:
         return new rkd();
      case 4:
         return new qfi(a);
      case 5:
         return a;
      case 6:
         qhb var3 = b;
         var2 = var3;
         if (var3 == null) {
            synchronized(rkd.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = b;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(a);
                     b = (qhb)var2;
                  } catch (Throwable var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label266;
                  }
               }

               label251:
               try {
                  return var2;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label251;
               }
            }

            while(true) {
               Throwable var24 = var10000;

               try {
                  throw var24;
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  continue;
               }
            }
         } else {
            return var2;
         }
      }
   }
}
