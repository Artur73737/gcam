import java.util.Comparator;

public final class wr implements Comparator {
   public static final wr a = new wr(3);
   public static final wr b = new wr(5);
   public static final wr c = new wr(6);
   public static final wr d = new wr(7);
   public static final wr e = new wr(8);
   public static final wr f = new wr(9);
   public static final wr g = new wr(10);
   public static final wr h = new wr(11);
   public static final wr i = new wr(12);
   public static final wr j = new wr(13);
   public static final wr k = new wr(14);
   public static final wr l = new wr(15);
   public static final wr m = new wr(16);
   public static final wr n = new wr(17);
   public static final wr o = new wr(18);
   public static final wr p = new wr(19);
   public static final wr q = new wr(20);
   private final int r;

   public wr(int var1) {
      this.r = var1;
   }

   public final int compare(Object var1, Object var2) {
      int var3;
      int var4;
      gtz var26;
      wq var41;
      switch(this.r) {
      case 0:
         var41 = (wq)var1;
         var3 = wt.e.indexOf(rx.a(var41.c));
         var41 = (wq)var2;
         return quy.n(var3, wt.e.indexOf(rx.a(var41.c)));
      case 1:
         var41 = (wq)var1;
         var3 = pwm.ar(wt.d, var41.e);
         var41 = (wq)var2;
         return quy.n(var3, pwm.ar(wt.d, var41.e));
      case 2:
         return quy.n(((atl)var1).a, ((atl)var2).a);
      case 3:
         bmd var40 = (bmd)var1;
         bmd var36 = (bmd)var2;
         qvi var44 = bmd.b;
         var40.ar();
         var36.ar();
         return qwp.a(var40.j(), var36.j());
      case 4:
         return quy.n(((brx)var1).b, ((brx)var2).b);
      case 5:
         qsg var39 = (qsg)var1;
         qsg var34 = (qsg)var2;
         return ((Number)var39.b).intValue() - ((Number)var39.a).intValue() - (((Number)var34.b).intValue() - ((Number)var34.a).intValue());
      case 6:
         byte[] var37 = (byte[])var1;
         byte[] var33 = (byte[])var2;
         var3 = var37.length;
         var4 = var33.length;
         if (var3 != var4) {
            var3 -= var4;
         } else {
            byte var29 = 0;
            var3 = 0;

            while(true) {
               if (var3 >= var37.length) {
                  var3 = var29;
                  break;
               }

               byte var5 = var37[var3];
               byte var6 = var33[var3];
               if (var5 != var6) {
                  var3 = var5 - var6;
                  break;
               }

               ++var3;
            }
         }

         return var3;
      case 7:
         cow var35 = (cow)var1;
         cow var31 = (cow)var2;
         return c.q(var35.b, var31.b);
      case 8:
         izs var32 = (izs)var1;
         izs var30 = (izs)var2;
         var3 = var32.a.width();
         var4 = var32.a.height();
         return var30.a.width() * var30.a.height() - var3 * var4;
      case 9:
         var26 = (gtz)var1;
         gtz var25 = (gtz)var2;
         var1 = var26.a;
         String var27 = (String)var25.a;
         return ((String)var1).compareTo(var27);
      case 10:
         gtz var43 = (gtz)var1;
         var26 = (gtz)var2;
         var2 = var43.b;
         String var28 = (String)var26.b;
         return ((String)var2).compareTo(var28);
      case 11:
         fyt var24 = (fyt)var1;
         fyt var22 = (fyt)var2;
         return var24.a.b.a() - var22.a.b.a();
      case 12:
         grs var23 = (grs)var1;
         grs var21 = (grs)var2;
         var4 = var23.p();
         var3 = var21.p();
         if (var4 != 0) {
            if (var4 == var3) {
               var3 = var23.e().compareTo(var21.e());
            } else {
               var3 = c.q(gsy.e(var21.p()), gsy.e(var23.p()));
            }

            return var3;
         }

         throw null;
      case 13:
         moq var17 = (moq)var1;
         moq var19 = (moq)var2;
         mll var20 = var17.b();
         var20.getClass();
         long var7 = var20.b;
         var20 = var19.b();
         var20.getClass();
         long var45;
         return (var45 = var7 - var20.b) == 0L ? 0 : (var45 < 0L ? -1 : 1);
      case 14:
         hwv var15 = (hwv)var1;
         hwv var18 = (hwv)var2;
         long var47;
         return (var47 = (Long)var15.c().i() - (Long)var18.c().i()) == 0L ? 0 : (var47 < 0L ? -1 : 1);
      case 15:
         huy var13 = (huy)var1;
         return Float.compare(((huy)var2).b(), var13.b());
      case 16:
         return ((Float)var1).compareTo((Float)var2);
      case 17:
         gdb var12 = (gdb)var1;
         return Float.compare(((gdb)var2).b, var12.b);
      case 18:
         jcn var11 = (jcn)var1;
         jcn var16 = (jcn)var2;
         pds var9 = jcd.c;
         long var46;
         return (var46 = var11.c() - var16.c()) == 0L ? 0 : (var46 < 0L ? -1 : 1);
      case 19:
         kwx var10 = (kwx)var1;
         kwx var14 = (kwx)var2;
         return var10.c.compareTo(var14.c);
      default:
         mkw var42 = (mkw)var1;
         mkw var38 = (mkw)var2;
         var3 = mkx.a;
         return var38.a() - var42.a();
      }
   }
}
