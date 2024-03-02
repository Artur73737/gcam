package androidx.compose.foundation.layout;

public final class PaddingValuesElement extends .bmp {
   private final .aip a;

   public PaddingValuesElement(.aip var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      PaddingValuesElement var2;
      if (var1 instanceof PaddingValuesElement) {
         var2 = (PaddingValuesElement)var1;
      } else {
         var2 = null;
      }

      return var2 == null ? false : .c.E(this.a, var2.a);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
