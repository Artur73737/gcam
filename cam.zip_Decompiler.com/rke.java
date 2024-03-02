public final class rke extends qfn implements qgv {
   public static final rke i;
   private static volatile qhb j;
   public int a;
   public long b;
   public long c;
   public long d;
   public long e;
   public long f;
   public long g;
   public rkb h;

   static {
      rke var0 = new rke();
      i = var0;
      qfn.ab(rke.class, var0);
   }

   private rke() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
      case 3:
         return new rke();
      case 4:
         return new qfi(i);
      case 5:
         return i;
      case 6:
         qhb var3 = j;
         var2 = var3;
         if (var3 == null) {
            synchronized(rke.class){}

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
