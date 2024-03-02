public final class rlo extends qfn implements qgv {
   public static final rlo k;
   private static volatile qhb l;
   public int a;
   public long b;
   public long c;
   public long d;
   public long e;
   public long f;
   public long g;
   public long h;
   public long i;
   public qfw j;

   static {
      rlo var0 = new rlo();
      k = var0;
      qfn.ab(rlo.class, var0);
   }

   private rlo() {
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
         return Y(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", rln.class});
      case 3:
         return new rlo();
      case 4:
         return new qfi(k);
      case 5:
         return k;
      case 6:
         qhb var3 = l;
         var2 = var3;
         if (var3 == null) {
            synchronized(rlo.class){}

            Throwable var10000;
            boolean var10001;
            label266: {
               try {
                  var3 = l;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label266;
               }

               var2 = var3;
               if (var3 == null) {
                  try {
                     var2 = new qfj(k);
                     l = (qhb)var2;
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

   public final void c() {
      qfw var1 = this.j;
      if (!var1.c()) {
         this.j = qfn.V(var1);
      }

   }
}
