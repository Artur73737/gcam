public final class rlg extends qfn implements qgv {
   public static final rlg f;
   private static volatile qhb g;
   public int a;
   public int b;
   public int c;
   public qfu d;
   public qfu e;

   static {
      rlg var0 = new rlg();
      f = var0;
      qfn.ab(rlg.class, var0);
   }

   private rlg() {
      qfo var1 = qfo.b;
      this.d = var1;
      this.e = var1;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"a", "b", "c", "d", "e"});
      case 3:
         return new rlg();
      case 4:
         return new qfi(f);
      case 5:
         return f;
      case 6:
         qhb var3 = g;
         var2 = var3;
         if (var3 == null) {
            synchronized(rlg.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = g;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(f);
                     g = (qhb)var2;
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
