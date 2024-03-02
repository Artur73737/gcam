package androidx.compose.foundation.layout;

public final class PaddingElement extends .bmp {
   private final float a;
   private final float b;
   private final float c;
   private final float e;

   // $FF: synthetic method
   public PaddingElement(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      if (!(var1 >= 0.0F) && !.bxt.c(var1, Float.NaN) || !(var2 >= 0.0F) && !.bxt.c(var2, Float.NaN) || !(var3 >= 0.0F) && !.bxt.c(var3, Float.NaN) || !(var4 >= 0.0F) && !.bxt.c(var4, Float.NaN)) {
         throw new IllegalArgumentException("Padding must be non-negative");
      }
   }

   public final boolean equals(Object var1) {
      PaddingElement var2;
      if (var1 instanceof PaddingElement) {
         var2 = (PaddingElement)var1;
      } else {
         var2 = null;
      }

      if (var2 == null) {
         return false;
      } else {
         return .bxt.c(this.a, var2.a) && .bxt.c(this.b, var2.b) && .bxt.c(this.c, var2.c) && .bxt.c(this.e, var2.e);
      }
   }

   public final int hashCode() {
      return (((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.e)) * 31 + .c.m(true);
   }
}
