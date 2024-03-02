package androidx.compose.ui.layout;

public final class LayoutIdElement extends .bmp {
   private final Object a;

   public LayoutIdElement(Object var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof LayoutIdElement)) {
         return false;
      } else {
         LayoutIdElement var2 = (LayoutIdElement)var1;
         return .c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LayoutIdElement(layoutId=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
