public final class rni extends qfn implements qgv {
   public static final rni f;
   private static volatile qhb g;
   public qgp a;
   public qgp b;
   public qfw c;
   public qfu d;
   public qfw e;

   static {
      rni var0 = new rni();
      f = var0;
      qfn.ab(rni.class, var0);
   }

   private rni() {
      this.a = qgp.a;
      this.b = qgp.a;
      this.c = qhe.b;
      this.d = qfo.b;
      this.e = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         nlf var26 = rng.a;
         nlf var25 = rnh.a;
         return Y(f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", var26, "b", var25, "c", rnf.class, "d", "e", rnc.class});
      case 3:
         return new rni();
      case 4:
         return new qfi(f);
      case 5:
         return f;
      case 6:
         qhb var3 = g;
         var2 = var3;
         if (var3 == null) {
            synchronized(rni.class){}

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
