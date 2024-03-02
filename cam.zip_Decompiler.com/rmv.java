public final class rmv extends qfn implements qgv {
   public static final rmv e;
   private static volatile qhb f;
   public int a;
   public rmu b;
   public rmw c;
   public rmx d;

   static {
      rmv var0 = new rmv();
      e = var0;
      qfn.ab(rmv.class, var0);
   }

   private rmv() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
      case 3:
         return new rmv();
      case 4:
         return new qfi(e);
      case 5:
         return e;
      case 6:
         qhb var3 = f;
         var2 = var3;
         if (var3 == null) {
            synchronized(rmv.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = f;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(e);
                     f = (qhb)var2;
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
