import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;

public final class rjv extends qfn implements qgv {
   public static final rjv e;
   private static volatile qhb f;
   public int a;
   public qfw b;
   public rjw c;
   public int d;

   static {
      rjv var0 = new rjv();
      e = var0;
      qfn.ab(rjv.class, var0);
   }

   private rjv() {
      this.b = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         String var25 = zBdGS.qlyxND;
         return Y(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{var25, "b", rju.class, "c", "d"});
      case 3:
         return new rjv();
      case 4:
         return new qfi(e);
      case 5:
         return e;
      case 6:
         qhb var3 = f;
         var2 = var3;
         if (var3 == null) {
            synchronized(rjv.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = f;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(e);
                     f = (qhb)var2;
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
