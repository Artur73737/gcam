public final class rle extends qfn implements qgv {
   public static final rle d;
   private static volatile qhb e;
   public int a;
   public int b;
   public int c;

   static {
      rle var0 = new rle();
      d = var0;
      qfn.ab(rle.class, var0);
   }

   private rle() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         qfs var25 = qjc.t;
         return Y(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"a", "b", var25, "c"});
      case 3:
         return new rle();
      case 4:
         return new qfi(d);
      case 5:
         return d;
      case 6:
         qhb var3 = e;
         var2 = var3;
         if (var3 == null) {
            synchronized(rle.class){}

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
                     var2 = new qfj(d);
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
