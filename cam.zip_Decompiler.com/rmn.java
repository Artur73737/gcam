public final class rmn extends qfn implements qgv {
   public static final rmn b;
   private static volatile qhb c;
   public qfw a;

   static {
      rmn var0 = new rmn();
      b = var0;
      qfn.ab(rmn.class, var0);
   }

   private rmn() {
      this.a = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
      case 3:
         return new rmn();
      case 4:
         return new qfi(b);
      case 5:
         return b;
      case 6:
         qhb var3 = c;
         var2 = var3;
         if (var3 == null) {
            synchronized(rmn.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = c;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(b);
                     c = (qhb)var2;
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
