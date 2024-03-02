public final class rmp extends qfn implements qgv {
   public static final rmp c;
   private static volatile qhb d;
   public int a = 0;
   public Object b;

   static {
      rmp var0 = new rmp();
      c = var0;
      qfn.ab(rmp.class, var0);
   }

   private rmp() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", rmn.class, rms.class, rmt.class});
      case 3:
         return new rmp();
      case 4:
         return new qfi(c);
      case 5:
         return c;
      case 6:
         qhb var3 = d;
         var2 = var3;
         if (var3 == null) {
            synchronized(rmp.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = d;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(c);
                     d = (qhb)var2;
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
