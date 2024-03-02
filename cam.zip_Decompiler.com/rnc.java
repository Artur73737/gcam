public final class rnc extends qfn implements qgv {
   public static final rnc e;
   private static volatile qhb f;
   public int a;
   public qfu b;
   public qfw c;
   public int d;

   static {
      rnc var0 = new rnc();
      e = var0;
      qfn.ab(rnc.class, var0);
   }

   private rnc() {
      this.b = qfo.b;
      this.c = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         qfs var25 = qjc.a;
         return Y(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002ࠬ\u0003င\u0001\u0004\u001b", new Object[]{"a", "b", var25, "d", "c", qjb.class});
      case 3:
         return new rnc();
      case 4:
         return new qfi(e);
      case 5:
         return e;
      case 6:
         qhb var3 = f;
         var2 = var3;
         if (var3 == null) {
            synchronized(rnc.class){}

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
