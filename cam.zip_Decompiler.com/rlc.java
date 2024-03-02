public final class rlc extends qfn implements qgv {
   public static final rlc g;
   private static volatile qhb h;
   public int a;
   public String b = "";
   public String c = "";
   public int d;
   public long e;
   public String f = "";

   static {
      rlc var0 = new rlc();
      g = var0;
      qfn.ab(rlc.class, var0);
   }

   private rlc() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         qfs var25 = qjc.s;
         return Y(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", var25, "e", "f"});
      case 3:
         return new rlc();
      case 4:
         return new qfi(g);
      case 5:
         return g;
      case 6:
         qhb var3 = h;
         var2 = var3;
         if (var3 == null) {
            synchronized(rlc.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = h;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(g);
                     h = (qhb)var2;
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
