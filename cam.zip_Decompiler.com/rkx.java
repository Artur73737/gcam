import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;

public final class rkx extends qfn implements qgv {
   public static final rkx w;
   private static volatile qhb x;
   public int a;
   public long b;
   public long c;
   public long d;
   public long e;
   public long f;
   public long g;
   public long h;
   public long i;
   public long j;
   public long k;
   public long l;
   public long m;
   public long n;
   public long o;
   public long p;
   public boolean q;
   public int r;
   public boolean s;
   public rkv t;
   public rkv u;
   public qgp v;

   static {
      rkx var0 = new rkx();
      w = var0;
      qfn.ab(rkx.class, var0);
   }

   private rkx() {
      this.v = qgp.a;
   }

   protected final Object a(int var1, Object var2) {
      switch(var1 - 1) {
      case 0:
         return 1;
      case 1:
      default:
         return null;
      case 2:
         String var26 = PUdPFKr.XxVrhzFhBaCh;
         nlf var4 = rkw.a;
         qfs var27 = qjc.r;
         return Y(w, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"a", "b", "e", "h", "j", "k", "p", "q", "t", "u", "c", var26, "v", var4, "f", "i", "g", "l", "m", "r", var27, "n", "o", "s"});
      case 3:
         return new rkx();
      case 4:
         return new qfi(w);
      case 5:
         return w;
      case 6:
         qhb var3 = x;
         var2 = var3;
         if (var3 == null) {
            synchronized(rkx.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = x;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(w);
                     x = (qhb)var2;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label266;
                  }
               }

               label251:
               try {
                  return var2;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label251;
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
