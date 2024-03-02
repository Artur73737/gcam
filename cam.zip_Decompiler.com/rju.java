public final class rju extends qfn implements qgv {
   public static final rju j;
   private static volatile qhb k;
   public int a;
   public String b = "";
   public int c;
   public int d;
   public int e;
   public long f;
   public long g;
   public long h;
   public boolean i;

   static {
      rju var0 = new rju();
      j = var0;
      qfn.ab(rju.class, var0);
   }

   private rju() {
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         qfs var26 = qjc.m;
         qfs var25 = qjc.l;
         return Y(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", var26, "d", "e", var25, "f", "g", "h", "i"});
      case 3:
         return new rju();
      case 4:
         return new qfi(j);
      case 5:
         return j;
      case 6:
         qhb var3 = k;
         var2 = var3;
         if (var3 == null) {
            synchronized(rju.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = k;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(j);
                     k = (qhb)var2;
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
