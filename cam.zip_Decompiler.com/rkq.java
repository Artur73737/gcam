import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;

public final class rkq extends qfn implements qgv {
   public static final rkq g;
   private static volatile qhb i;
   public int a;
   public int b;
   public int c;
   public String d;
   public qfv e;
   public rks f;
   private byte h = 2;

   static {
      rkq var0 = new rkq();
      g = var0;
      qfn.ab(rkq.class, var0);
   }

   private rkq() {
      qhe var1 = qhe.b;
      this.d = "";
      this.e = qgl.b;
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
         String var27 = NgAyRSYlmLoD.bZYgxwlSMPL;
         qfs var26 = qjc.p;
         return Y(g, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005င\u0005\b᠌\b\u0011ဈ\u0013\u0015(\u0016ဉ\u0016", new Object[]{var27, "b", "c", var26, "d", "e", "f"});
      case 3:
         return new rkq();
      case 4:
         return new qfi(g);
      case 5:
         return g;
      case 6:
         qhb var4 = i;
         var2 = var4;
         if (var4 == null) {
            synchronized(rkq.class){}

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
