package androidx.compose.ui.draw;

public final class DrawWithContentElement extends .bmp {
   private final .qvt a;

   public DrawWithContentElement(.qvt var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof DrawWithContentElement)) {
         return false;
      } else {
         DrawWithContentElement var2 = (DrawWithContentElement)var1;
         return .c.E(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DrawWithContentElement(onDraw=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
