import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;

public final class bce implements Comparator {
   public static final bce a = new bce(0);
   public static final Comparator b = new bce(17);
   public static final bce c = new bce(3);
   public static final bce d = new bce(4);
   public static final bce e = new bce(5);
   public static final bce f = new bce(6);
   public static final bce g = new bce(15);
   public static final bce h = new bce(16);
   private final int i;

   public bce(int var1) {
      this.i = var1;
   }

   private static final axf a(bmd var0) {
      axf var1;
      for(var1 = new axf(new bmd[16]); var0 != null; var0 = var0.n()) {
         var1.f(0, var0);
      }

      return var1;
   }

   // $FF: synthetic method
   public final int compare(Object var1, Object var2) {
      int var8 = this.i;
      int var5 = -1;
      byte var7 = 0;
      byte var6 = 0;
      long var9;
      long var11;
      View var18;
      mhs var21;
      View var22;
      mhs var27;
      int[] var30;
      int[] var32;
      bro var35;
      bcj var37;
      bro var39;
      int var40;
      bcj var41;
      bmd var42;
      bmd var45;
      int var49;
      switch(var8) {
      case 0:
         bcd var58 = (bcd)var1;
         bcd var46 = (bcd)var2;
         if (var58 != null) {
            if (var46 == null) {
               throw new IllegalArgumentException("compare requires non-null focus targets");
            }

            if (ej.m(var58) && ej.m(var46)) {
               var45 = jj.h(var58);
               var42 = jj.h(var46);
               if (c.E(var45, var42)) {
                  var5 = 0;
               } else {
                  axf var52 = a(var45);
                  axf var50 = a(var42);
                  var49 = Math.min(var52.b - 1, var50.b - 1);
                  if (var49 >= 0) {
                     var5 = var6;

                     while(true) {
                        if (!c.E(var52.a[var5], var50.a[var5])) {
                           var5 = qwp.a(((bmd)var52.a[var5]).j(), ((bmd)var50.a[var5]).j());
                           return var5;
                        }

                        if (var5 == var49) {
                           break;
                        }

                        ++var5;
                     }
                  }

                  throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
               }
            } else if (!ej.m(var58)) {
               if (!ej.m(var46)) {
                  return 0;
               }

               var5 = 1;
            }

            return var5;
         }

         throw new IllegalArgumentException("compare requires non-null focus targets");
      case 1:
         kp var44 = (kp)var1;
         kp var14 = (kp)var2;
         RecyclerView var48 = var44.d;
         boolean var47;
         if (var48 != null) {
            var47 = false;
         } else {
            var47 = true;
         }

         boolean var43;
         if (var14.d != null) {
            var43 = false;
         } else {
            var43 = true;
         }

         if (var47 != var43) {
            if (var48 == null) {
               var5 = 1;
            }
         } else {
            boolean var13 = var44.a;
            if (var13 != var14.a) {
               if (!var13) {
                  var5 = 1;
               }
            } else {
               var40 = var14.b - var44.b;
               var5 = var40;
               if (var40 == 0) {
                  var40 = var44.c - var14.c;
                  var5 = var40;
                  if (var40 == 0) {
                     var5 = 0;
                  }
               }
            }
         }

         return var5;
      case 2:
         var42 = (bmd)var1;
         var45 = (bmd)var2;
         var42.getClass();
         var45.getClass();
         var5 = qwp.a(var42.f, var45.f);
         if (var5 != 0) {
            return var5;
         }

         return qwp.a(var42.hashCode(), var45.hashCode());
      case 3:
         var42 = (bmd)var1;
         var45 = (bmd)var2;
         var42.getClass();
         var45.getClass();
         var5 = qwp.a(var45.f, var42.f);
         if (var5 != 0) {
            return var5;
         }

         return qwp.a(var42.hashCode(), var45.hashCode());
      case 4:
         var35 = (bro)var1;
         var39 = (bro)var2;
         var35.getClass();
         var39.getClass();
         var37 = var35.c();
         var41 = var39.c();
         var5 = Float.compare(var37.b, var41.b);
         if (var5 == 0) {
            var5 = Float.compare(var37.c, var41.c);
            if (var5 == 0) {
               var5 = Float.compare(var37.e, var41.e);
               if (var5 == 0) {
                  var5 = Float.compare(var37.d, var41.d);
               }
            }
         }

         return var5;
      case 5:
         var35 = (bro)var1;
         var39 = (bro)var2;
         var35.getClass();
         var39.getClass();
         var37 = var35.c();
         var41 = var39.c();
         var5 = Float.compare(var37.d, var41.d);
         if (var5 == 0) {
            var5 = Float.compare(var37.c, var41.c);
            if (var5 == 0) {
               var5 = Float.compare(var37.e, var41.e);
               if (var5 == 0) {
                  var5 = Float.compare(var37.b, var41.b);
               }
            }
         }

         return var5;
      case 6:
         qsg var34 = (qsg)var1;
         qsg var38 = (qsg)var2;
         var34.getClass();
         var38.getClass();
         var5 = Float.compare(((bcj)var34.a).c, ((bcj)var38.a).c);
         if (var5 != 0) {
            return var5;
         }

         return Float.compare(((bcj)var34.a).e, ((bcj)var38.a).e);
      case 7:
         byz var33 = (byz)var1;
         byz var36 = (byz)var2;
         return var33.c - var36.c;
      case 8:
         var18 = (View)var1;
         var22 = (View)var2;
         float var4 = cgd.c(var18);
         float var3 = cgd.c(var22);
         if (!(var4 > var3)) {
            if (!(var4 < var3)) {
               return 0;
            }

            var5 = 1;
         }

         return var5;
      case 9:
         var30 = (int[])var1;
         var32 = (int[])var2;
         return var30[0] - var32[0];
      case 10:
         var30 = (int[])var1;
         var32 = (int[])var2;
         var40 = var30[0];
         var5 = var32[0];
         if (var40 == var5) {
            var5 = var30[1] - var32[1];
         } else {
            var5 = var40 - var5;
         }

         return var5;
      case 11:
         dqw var28 = (dqw)var1;
         dqw var31 = (dqw)var2;
         if (var28.b() == var31.b()) {
            var40 = var28.a();
            var5 = var31.a();
         } else {
            var40 = var28.b();
            var5 = var31.b();
         }

         return var40 - var5;
      case 12:
         get var26 = (get)var1;
         return Float.compare(((get)var2).c, var26.c);
      case 13:
         var21 = (mhs)var1;
         var27 = (mhs)var2;
         var40 = var21.a;
         var5 = var21.b;
         return var27.a * var27.b - var40 * var5;
      case 14:
         mek var23 = (mek)var1;
         mek var29 = (mek)var2;
         var11 = var23.a();
         var9 = var29.a();
         if (var11 < var9) {
            var5 = 1;
         } else if (var11 <= var9) {
            return 0;
         }

         return var5;
      case 15:
         var21 = (mhs)var1;
         var27 = (mhs)var2;
         var11 = var21.b();
         var9 = var27.b();
         long var62;
         var5 = (var62 = var11 - var9) == 0L ? 0 : (var62 < 0L ? -1 : 1);
         if (var11 == var9) {
            var5 = c.q(Math.min(var21.a, var21.b), Math.min(var27.a, var27.b));
         }

         if (var5 == 0) {
            return c.q(var21.a, var27.a);
         }

         return var5;
      case 16:
         mmv var20 = (mmv)var1;
         mmv var25 = (mmv)var2;
         long var63;
         return (var63 = var20.r() - var25.r()) == 0L ? 0 : (var63 < 0L ? -1 : 1);
      case 17:
         mps var19 = (mps)var1;
         mps var24 = (mps)var2;
         return mpv.a.compare(var19.b, var24.b);
      case 18:
         var18 = (View)var1;
         var22 = (View)var2;
         return var18.getTop() - var22.getTop();
      case 19:
         return ((Comparable)var1).compareTo((Comparable)var2);
      default:
         rmm var51 = (rmm)var1;
         rmm var59 = (rmm)var2;
         if ("Fallback-Cronet-Provider".equals(var51.a())) {
            var5 = 1;
         } else if (!"Fallback-Cronet-Provider".equals(var59.a())) {
            String var53 = var51.b();
            String var54 = var59.b();
            if (var53 == null || var54 == null) {
               IllegalArgumentException var57 = new IllegalArgumentException("The input values cannot be null");
               throw var57;
            }

            String[] var55 = var53.split("\\.");
            String[] var60 = var54.split("\\.");
            var5 = var7;

            while(true) {
               var40 = var55.length;
               if (var5 < var40 && var5 < var60.length) {
                  NumberFormatException var10000;
                  label233: {
                     boolean var10001;
                     try {
                        var49 = Integer.parseInt(var55[var5]);
                        var40 = Integer.parseInt(var60[var5]);
                     } catch (NumberFormatException var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label233;
                     }

                     if (var49 == var40) {
                        ++var5;
                        continue;
                     }

                     try {
                        var40 = Integer.signum(var49 - var40);
                     } catch (NumberFormatException var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label233;
                     }

                     var5 = var40;
                     break;
                  }

                  NumberFormatException var56 = var10000;
                  var53 = var55[var5];
                  String var15 = var60[var5];
                  StringBuilder var61 = new StringBuilder();
                  var61.append("Unable to convert version segments into integers: ");
                  var61.append(var53);
                  var61.append(" & ");
                  var61.append(var15);
                  throw new IllegalArgumentException(var61.toString(), var56);
               }

               var5 = Integer.signum(var40 - var60.length);
               break;
            }

            var5 = -var5;
         }

         return var5;
      }
   }
}
