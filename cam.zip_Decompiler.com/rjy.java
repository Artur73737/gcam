public final class rjy extends qfn implements qgv {
   public static final rjy l;
   private static volatile qhb n;
   public int a;
   public int b;
   public long c;
   public String d = "";
   public String e = "";
   public rkk f;
   public int g;
   public long h;
   public rkh i;
   public long j;
   public long k;
   private byte m = 2;

   static {
      rjy var0 = new rjy();
      l = var0;
      qfn.ab(rjy.class, var0);
   }

   private rjy() {
      qhe var1 = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.m;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.m = var3;
         return null;
      case 2:
         qfs var27 = qjc.n;
         qfs var26 = qjc.n;
         return Y(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"a", "b", var27, "g", var26, "h", "i", "j", "c", "d", "e", "f", "k"});
      case 3:
         return new rjy();
      case 4:
         return new qfi(l);
      case 5:
         return l;
      case 6:
         qhb var4 = n;
         var2 = var4;
         if (var4 == null) {
            synchronized(rjy.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = n;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(l);
                     n = (qhb)var2;
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
