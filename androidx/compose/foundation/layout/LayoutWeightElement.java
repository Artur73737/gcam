package androidx.compose.foundation.layout;

public final class LayoutWeightElement extends .bmp {
   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         LayoutWeightElement var2;
         if (var1 instanceof LayoutWeightElement) {
            var2 = (LayoutWeightElement)var1;
         } else {
            var2 = null;
         }

         return var2 != null;
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(1.0F) * 31 + 1231;
   }
}
