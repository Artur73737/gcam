package androidx.compose.ui.semantics;

public final class AppendedSemanticsElement extends .bmp implements .baz {
   public final .qvt a;
   private final boolean b = false;

   public AppendedSemanticsElement(.qvt var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof AppendedSemanticsElement)) {
         return false;
      } else {
         AppendedSemanticsElement var3 = (AppendedSemanticsElement)var1;
         boolean var2 = var3.b;
         return .c.E(this.a, var3.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AppendedSemanticsElement(mergeDescendants=false, properties=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
