public final class rki extends qfn implements qgv {
   public static final rki c;
   public static final nzu d;
   private static volatile qhb e;
   public int a;
   public rkj b;

   static {
      rki var0 = new rki();
      c = var0;
      qfn.ab(rki.class, var0);
      d = qfn.ag(rkk.a, var0, var0, 516454629, qig.k);
   }

   private rki() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
      case 3:
         return new rki();
      case 4:
         return new qfi(c);
      case 5:
         return c;
      case 6:
         qhb var3 = e;
         var2 = var3;
         if (var3 == null) {
            synchronized(rki.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = e;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(c);
                     e = (qhb)var2;
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
