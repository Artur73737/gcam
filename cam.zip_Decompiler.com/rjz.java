public final class rjz extends qfn implements qgv {
   public static final rjz c;
   private static volatile qhb e;
   public int a;
   public rjy b;
   private byte d = 2;

   static {
      rjz var0 = new rjz();
      c = var0;
      qfn.ab(rjz.class, var0);
   }

   private rjz() {
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.d;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.d = var3;
         return null;
      case 2:
         return Y(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
      case 3:
         return new rjz();
      case 4:
         return new qfi(c);
      case 5:
         return c;
      case 6:
         qhb var4 = e;
         var2 = var4;
         if (var4 == null) {
            synchronized(rjz.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = e;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(c);
                     e = (qhb)var2;
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
