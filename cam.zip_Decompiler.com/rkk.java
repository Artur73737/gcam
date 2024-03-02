public final class rkk extends qfl implements qgv {
   public static final rkk a;
   private static volatile qhb c;
   private byte b = 2;

   static {
      rkk var0 = new rkk();
      a = var0;
      qfn.ab(rkk.class, var0);
   }

   private rkk() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return this.b;
      case 1:
      default:
         byte var3;
         if (var2 == null) {
            var3 = 0;
         } else {
            var3 = 1;
         }

         this.b = var3;
         return null;
      case 2:
         return Y(a, "\u0001\u0000", (Object[])null);
      case 3:
         return new rkk();
      case 4:
         return new qfk(a);
      case 5:
         return a;
      case 6:
         qhb var4 = c;
         var2 = var4;
         if (var4 == null) {
            synchronized(rkk.class){}

            Throwable var10000;
            boolean var10001;
            label291: {
               try {
                  var4 = c;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label291;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(a);
                     c = (qhb)var2;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label291;
                  }
               }

               label276:
               try {
                  return var2;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label276;
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
