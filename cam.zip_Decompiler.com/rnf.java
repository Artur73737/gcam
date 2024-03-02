public final class rnf extends qfn implements qgv {
   public static final rnf h;
   private static volatile qhb i;
   public qgp a;
   public qgp b;
   public qfw c;
   public qfv d;
   public qfu e;
   public qfu f;
   public qfv g;

   static {
      rnf var0 = new rnf();
      h = var0;
      qfn.ab(rnf.class, var0);
   }

   private rnf() {
      this.a = qgp.a;
      this.b = qgp.a;
      this.c = qhe.b;
      this.d = qgl.b;
      qfo var1 = qfo.b;
      this.e = var1;
      this.f = var1;
      this.g = qgl.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         nlf var25 = rnd.a;
         nlf var26 = rne.a;
         return Y(h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"a", var25, "b", var26, "c", rnb.class, "d", "e", "f", "g"});
      case 3:
         return new rnf();
      case 4:
         return new qfi(h);
      case 5:
         return h;
      case 6:
         qhb var3 = i;
         var2 = var3;
         if (var3 == null) {
            synchronized(rnf.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = i;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(h);
                     i = (qhb)var2;
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
