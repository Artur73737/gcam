package androidx.compose.foundation.layout;

public final class UnspecifiedConstraintsElement extends .bmp {
   private final float a;
   private final float b;

   public UnspecifiedConstraintsElement(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof UnspecifiedConstraintsElement)) {
         return false;
      } else {
         float var2 = this.a;
         UnspecifiedConstraintsElement var3 = (UnspecifiedConstraintsElement)var1;
         return .bxt.c(var2, var3.a) && .bxt.c(this.b, var3.b);
      }
   }

   public final int hashCode() {
      return Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b);
   }
}
