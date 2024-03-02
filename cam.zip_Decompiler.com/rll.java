public final class rll extends qfn implements qgv {
   public static final rll n;
   private static volatile qhb o;
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public rlp i;
   public qfw j;
   public int k;
   public int l;
   public rlp m;

   static {
      rll var0 = new rll();
      n = var0;
      qfn.ab(rll.class, var0);
   }

   private rll() {
      this.j = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         return Y(n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"a", "b", "c", "e", "h", "j", rlk.class, "d", "f", "g", "i", "k", "l", "m"});
      case 3:
         return new rll();
      case 4:
         return new qfi(n);
      case 5:
         return n;
      case 6:
         qhb var3 = o;
         var2 = var3;
         if (var3 == null) {
            synchronized(rll.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = o;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(n);
                     o = (qhb)var2;
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
