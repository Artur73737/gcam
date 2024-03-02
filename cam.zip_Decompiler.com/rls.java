public final class rls extends qfn implements qgv {
   public static final rls d;
   private static volatile qhb g;
   public int a;
   public int b;
   public int c = 1;
   private rlq e;
   private byte f = 2;

   static {
      rls var0 = new rls();
      d = var0;
      qfn.ab(rls.class, var0);
   }

   private rls() {
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.f;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.f = var3;
         return null;
      case 2:
         qfs var26 = rlr.a;
         return Y(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", var26, "c", "e"});
      case 3:
         return new rls();
      case 4:
         return new qfi(d);
      case 5:
         return d;
      case 6:
         qhb var4 = g;
         var2 = var4;
         if (var4 == null) {
            synchronized(rls.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = g;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(d);
                     g = (qhb)var2;
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
