import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;

public final class rlu extends qfn implements qgv {
   public static final rlu u;
   private static volatile qhb x;
   public int a;
   public long b;
   public String c;
   public String d;
   public rkp e;
   public rkr f;
   public rlf g;
   public rlo h;
   public rjz i;
   public rll j;
   public rkt k;
   public rjv l;
   public rlt m;
   public rli n;
   public qfw o;
   public rlc p;
   public rls q;
   public rlj r;
   public rkk s;
   public rlb t;
   private rld v;
   private byte w = 2;

   static {
      rlu var0 = new rlu();
      u = var0;
      qfn.ab(rlu.class, var0);
   }

   private rlu() {
      String var1 = DeBfHrQZSt.gEHgdLdZ;
      this.c = var1;
      this.d = var1;
      this.o = qhe.b;
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.w;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.w = var3;
         return null;
      case 2:
         return Y(u, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0005ဉ\u0018\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0019\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u001b\u0010ᐉ\f\u0011ဈ\u0002\u0015ဉ\u001c\u0017ဉ\u001a\u001dᐉ\u0015\u001eဉ\u0016\u001fဉ\u0017 ဉ\u0013\"\u001b", new Object[]{"a", "e", "b", "c", "p", "f", "g", "q", "h", "i", "j", "s", "k", "d", "t", "r", "v", "m", "n", "l", "o", rkl.class});
      case 3:
         return new rlu();
      case 4:
         return new qfi(u);
      case 5:
         return u;
      case 6:
         qhb var4 = x;
         var2 = var4;
         if (var4 == null) {
            synchronized(rlu.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = x;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(u);
                     x = (qhb)var2;
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
