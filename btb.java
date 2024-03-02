import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spanned;

public final class btb {
   public static final void a(Paint var0, CharSequence var1, int var2, int var3, Rect var4) {
      var0.getClass();
      var1.getClass();
      var4.getClass();
      var0.getTextBounds(var1, var2, var3, var4);
   }

   public static final boolean b(Spanned var0, Class var1) {
      return var0.nextSpanTransition(-1, var0.length(), var1) != var0.length();
   }

   public static final Object c(Object var0, bup var1, bvc var2, int var3) {
      var1.getClass();
      Object var7 = var0;
      if (var0 instanceof Typeface) {
         boolean var6 = c.n(1, 1);
         boolean var4 = false;
         boolean var5;
         if ((var6 || c.n(1, 2)) && !c.E(var1.c(), var2) && var2.a(bvc.f) >= 0 && var1.c().a(bvc.f) < 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         if ((c.n(1, 1) || c.n(1, 3)) && !c.n(var3, var1.b())) {
            var4 = true;
         }

         if (!var4 && !var5) {
            return var0;
         }

         int var8;
         if (var5) {
            var8 = var2.p;
         } else {
            var8 = var1.c().p;
         }

         if (var4) {
            var6 = c.n(var3, 1);
         } else {
            var6 = c.n(var1.b(), 1);
         }

         var7 = bvk.a.a((Typeface)var0, var8, var6);
      }

      return var7;
   }
}
