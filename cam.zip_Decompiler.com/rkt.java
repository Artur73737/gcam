public final class rkt extends qfn implements qgv {
   public static final rkt f;
   private static volatile qhb h;
   public int a;
   public long b;
   public int c;
   public qfw d;
   public rkx e;
   private byte g = 2;

   static {
      rkt var0 = new rkt();
      f = var0;
      qfn.ab(rkt.class, var0);
   }

   private rkt() {
      this.d = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.g;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.g = var3;
         return null;
      case 2:
         qfs var26 = qjc.q;
         return Y(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"a", "b", "d", rku.class, "c", var26, "e"});
      case 3:
         return new rkt();
      case 4:
         return new qfi(f);
      case 5:
         return f;
      case 6:
         qhb var4 = h;
         var2 = var4;
         if (var4 == null) {
            synchronized(rkt.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = h;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(f);
                     h = (qhb)var2;
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
