import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;

public final class aix {
   public static final WrapContentElement a;
   public static final WrapContentElement b;
   private static final WrapContentElement c;
   private static final WrapContentElement d;

   static {
      int var0 = bar.a;
      a = gg.c(baq.g);
      b = gg.c(baq.f);
      c = gg.b(baq.d);
      d = gg.b(baq.c);
   }

   public static final bbb a(bbb var0, float var1, float var2) {
      var0.getClass();
      return new UnspecifiedConstraintsElement(var1, var2);
   }

   public static final bbb b(bbb var0, float var1) {
      return var0.g(new SizeElement(0.0F, var1, 0.0F, var1, true, 5));
   }

   public static final bbb c(bbb var0, float var1) {
      var0.getClass();
      return var0.g(new SizeElement(var1, var1, var1, var1, true));
   }

   // $FF: synthetic method
   public static bbb d(bbb var0, bat var1) {
      var0.getClass();
      int var2 = bar.a;
      WrapContentElement var3;
      if (c.E(var1, baq.d)) {
         var3 = c;
      } else if (c.E(var1, baq.c)) {
         var3 = d;
      } else {
         var3 = gg.b(var1);
      }

      return var0.g(var3);
   }
}
