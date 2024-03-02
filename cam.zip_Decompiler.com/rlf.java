public final class rlf extends qfn implements qgv {
   public static final rlf l;
   private static volatile qhb n;
   public int a;
   public boolean b;
   public rkz c;
   public String d = "";
   public String e = "";
   public int f;
   public String g = "";
   public pph h;
   public qkg i;
   public rlh j;
   public rle k;
   private byte m = 2;

   static {
      rlf var0 = new rlf();
      l = var0;
      qfn.ab(rlf.class, var0);
   }

   private rlf() {
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
         qfs var26 = qjc.u;
         return Y(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", var26, "g", "h", "i", "j", "k"});
      case 3:
         return new rlf();
      case 4:
         return new qfi(l);
      case 5:
         return l;
      case 6:
         qhb var4 = n;
         var2 = var4;
         if (var4 == null) {
            synchronized(rlf.class){}

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
