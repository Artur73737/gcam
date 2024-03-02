import android.util.ArraySet;
import java.util.Comparator;

public final class ajf implements Comparator {
   final Object a;
   private final int b;

   public ajf(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public ajf(Object var1, int var2, byte[] var3) {
      this.b = var2;
      this.a = var1;
   }

   public final int compare(Object var1, Object var2) {
      int var4 = this.b;
      int var3 = -1;
      Object var10;
      ajq var13;
      ajq var15;
      switch(var4) {
      case 0:
         var13 = (ajq)var1;
         var3 = ((ajg)this.a).b.a(var13.d);
         var13 = (ajq)var2;
         return quy.n(var3, ((ajg)this.a).b.a(var13.d));
      case 1:
         var13 = (ajq)var1;
         var3 = ((ako)this.a).a(var13.d);
         var13 = (ajq)var2;
         return quy.n(var3, ((ako)this.a).a(var13.d));
      case 2:
         var15 = (ajq)var2;
         var3 = ((ako)this.a).a(var15.d);
         var13 = (ajq)var1;
         return quy.n(var3, ((ako)this.a).a(var13.d));
      case 3:
         var15 = (ajq)var2;
         var3 = ((ajg)this.a).b.a(var15.d);
         var13 = (ajq)var1;
         return quy.n(var3, ((ajg)this.a).b.a(var13.d));
      case 4:
         Object var11 = this.a;
         int[] var18 = bol.a;
         return ((Number)((qvx)var11).a(var1, var2)).intValue();
      case 5:
         var3 = ((Comparator)this.a).compare(var1, var2);
         if (var3 != 0) {
            return var3;
         }

         return quy.n(((bro)var1).e, ((bro)var2).e);
      case 6:
         var10 = this.a;
         jok var12 = (jok)var1;
         jok var14 = (jok)var2;
         var4 = ((jmo)var10).a.b().compare(var12.a, var14.a);
         if (var4 == 0) {
            boolean var5 = var12.d;
            if (var5 != var14.d) {
               if (!var5) {
                  var3 = 1;
               }
            } else {
               var3 = 0;
            }
         } else {
            var3 = var4;
         }

         return var3;
      default:
         var10 = this.a;
         mwe var17 = (mwe)var1;
         mwe var16 = (mwe)var2;
         long var8 = var17.b;
         long var6 = var16.b;
         if (var8 != var6) {
            long var20;
            var3 = (var20 = var8 - var6) == 0L ? 0 : (var20 < 0L ? -1 : 1);
         } else {
            var4 = var17.c.compareToIgnoreCase(var16.c);
            if (var4 != 0) {
               var3 = var4;
            } else {
               ArraySet var19 = (ArraySet)var10;
               if (!var19.isEmpty()) {
                  if (var19.contains(onk.T(var17.e.i().d)) && !var19.contains(onk.T(var16.e.i().d))) {
                     var3 = 1;
                     return var3;
                  }

                  if (var19.contains(onk.T(var16.e.i().d)) && !var19.contains(onk.T(var17.e.i().d))) {
                     return var3;
                  }
               }

               var4 = var17.e.i().d.compareToIgnoreCase(var16.e.i().d);
               var3 = var4;
               if (var4 == 0) {
                  long var21;
                  var3 = (var21 = var17.a - var16.a) == 0L ? 0 : (var21 < 0L ? -1 : 1);
               }
            }
         }

         return var3;
      }
   }
}
