public final class rkr extends qfn implements qgv {
   public static final rkr b;
   private static volatile qhb d;
   public qfw a;
   private byte c = 2;

   static {
      rkr var0 = new rkr();
      b = var0;
      qfn.ab(rkr.class, var0);
   }

   private rkr() {
      this.a = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.c;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.c = var3;
         return null;
      case 2:
         return Y(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", rkq.class});
      case 3:
         return new rkr();
      case 4:
         return new qfi(b);
      case 5:
         return b;
      case 6:
         qhb var4 = d;
         var2 = var4;
         if (var4 == null) {
            synchronized(rkr.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = d;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(b);
                     d = (qhb)var2;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label286;
                  }
               }

               label271:
               try {
                  return var2;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label271;
               }
            }

            while(true) {
               Throwable var25 = var10000;

               try {
                  throw var25;
               } catch (Throwable var21) {
                  var10000 = var21;
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
