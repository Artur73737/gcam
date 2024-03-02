import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import java.util.Arrays;

public final class bof {
   public static final void a(cht var0, bro var1) {
      var0.getClass();
      var1.getClass();
      if (bom.e(var1)) {
         if ((brc)la.l(var1.c, brk.u) != null) {
            var0.h(new chr(16908358, (CharSequence)null));
         }

         if ((brc)la.l(var1.c, brk.w) != null) {
            var0.h(new chr(16908359, (CharSequence)null));
         }

         if ((brc)la.l(var1.c, brk.v) != null) {
            var0.h(new chr(16908360, (CharSequence)null));
         }

         if ((brc)la.l(var1.c, brk.x) != null) {
            var0.h(new chr(16908361, (CharSequence)null));
         }
      }

   }

   public static final boolean b(float var0, float var1, long var2, float var4, float var5) {
      float var6 = bcg.a(var2);
      float var7 = bcg.b(var2);
      var1 -= var5;
      var0 -= var4;
      return var0 * var0 / (var6 * var6) + var1 * var1 / (var7 * var7) <= 1.0F;
   }

   public static final String c(Object var0) {
      String var1;
      if (var0.getClass().isAnonymousClass()) {
         var1 = var0.getClass().getName();
      } else {
         var1 = var0.getClass().getSimpleName();
      }

      StringBuilder var2 = new StringBuilder();
      var2.append(var1);
      var2.append('@');
      String var3 = String.format("%07x", Arrays.copyOf(new Object[]{System.identityHashCode(var0)}, 1));
      var3.getClass();
      var2.append(var3);
      return var2.toString();
   }

   public static final boolean d(bbf var0, float var1, float var2) {
      bcj var8 = new bcj(var1 - 0.005F, -0.005F + var2, var1 + 0.005F, var2 + 0.005F);
      bbf var7 = eu.i();
      if (!Float.isNaN(var8.b)) {
         if (!Float.isNaN(var8.c)) {
            if (!Float.isNaN(var8.d)) {
               if (!Float.isNaN(var8.e)) {
                  Object var6 = var7.c;
                  var1 = var8.b;
                  float var3 = var8.c;
                  var2 = var8.d;
                  float var4 = var8.e;
                  ((RectF)var6).set(var1, var3, var2, var4);
                  Object var14 = var7.a;
                  Object var9 = var7.c;
                  Direction var12 = Direction.CCW;
                  RectF var16 = (RectF)var9;
                  ((Path)var14).addRect(var16, var12);
                  bbf var15 = eu.i();
                  Op var13;
                  if (c.n(1, 0)) {
                     var13 = Op.DIFFERENCE;
                  } else if (c.n(1, 1)) {
                     var13 = Op.INTERSECT;
                  } else if (c.n(1, 4)) {
                     var13 = Op.REVERSE_DIFFERENCE;
                  } else if (c.n(1, 2)) {
                     var13 = Op.UNION;
                  } else {
                     var13 = Op.XOR;
                  }

                  var9 = var15.a;
                  Object var10 = var0.a;
                  Path var11 = (Path)var7.a;
                  Path var17 = (Path)var10;
                  ((Path)var9).op(var17, var11, var13);
                  boolean var5 = ((Path)var15.a).isEmpty();
                  var15.k();
                  var7.k();
                  return !var5;
               } else {
                  throw new IllegalStateException("Rect.bottom is NaN");
               }
            } else {
               throw new IllegalStateException("Rect.right is NaN");
            }
         } else {
            throw new IllegalStateException("Rect.top is NaN");
         }
      } else {
         throw new IllegalStateException("Rect.left is NaN");
      }
   }
}
