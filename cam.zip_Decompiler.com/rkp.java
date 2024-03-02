public final class rkp extends qfl implements qgv {
   public static final rkp g;
   private static volatile qhb i;
   public int a;
   public rko b;
   public rkz c;
   public int d;
   public rkn e;
   public String f = "";
   private byte h = 2;

   static {
      rkp var0 = new rkp();
      g = var0;
      qfn.ab(rkp.class, var0);
   }

   private rkp() {
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.h;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.h = var3;
         return null;
      case 2:
         qfs var26 = qjc.o;
         return Y(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", var26, "e", "f"});
      case 3:
         return new rkp();
      case 4:
         return new qfk(g);
      case 5:
         return g;
      case 6:
         qhb var4 = i;
         var2 = var4;
         if (var4 == null) {
            synchronized(rkp.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = i;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(g);
                     i = (qhb)var2;
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
