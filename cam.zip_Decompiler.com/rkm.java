public final class rkm extends qfn implements qgv {
   public static final rkm i;
   private static volatile qhb j;
   public int a;
   public int b;
   public int c;
   public long d;
   public long e;
   public long f;
   public long g;
   public long h;

   static {
      rkm var0 = new rkm();
      i = var0;
      qfn.ab(rkm.class, var0);
   }

   private rkm() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(i, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
      case 3:
         return new rkm();
      case 4:
         return new qfi(i);
      case 5:
         return i;
      case 6:
         qhb var3 = j;
         var2 = var3;
         if (var3 == null) {
            synchronized(rkm.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = j;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(i);
                     j = (qhb)var2;
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
