package androidx.compose.foundation.layout;

public final class SizeElement extends .bmp {
   private final float a;
   private final float b;
   private final float c;
   private final float e;
   private final boolean f;

   public SizeElement(float var1, float var2, float var3, float var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.f = var5;
   }

   // $FF: synthetic method
   public SizeElement(float var1, float var2, float var3, float var4, boolean var5, int var6) {
      if ((var6 & 8) != 0) {
         var4 = Float.NaN;
      }

      if ((var6 & 4) != 0) {
         var3 = Float.NaN;
      }

      if ((var6 & 2) != 0) {
         var2 = Float.NaN;
      }

      if (1 == (var6 & 1)) {
         var1 = Float.NaN;
      }

      this(var1, var2, var3, var4, var5);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof SizeElement)) {
         return false;
      } else {
         float var2 = this.a;
         SizeElement var3 = (SizeElement)var1;
         if (!.bxt.c(var2, var3.a)) {
            return false;
         } else if (!.bxt.c(this.b, var3.b)) {
            return false;
         } else if (!.bxt.c(this.c, var3.c)) {
            return false;
         } else if (!.bxt.c(this.e, var3.e)) {
            return false;
         } else {
            return this.f == var3.f;
         }
      }
   }

   public final int hashCode() {
      return (((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.e)) * 31 + .c.m(this.f);
   }
}
