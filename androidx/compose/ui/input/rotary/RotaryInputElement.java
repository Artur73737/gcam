package androidx.compose.ui.input.rotary;

public final class RotaryInputElement extends .bmp {
   private final .qvt a;
   private final .qvt b;

   public RotaryInputElement(.qvt var1) {
      this.a = var1;
      this.b = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof RotaryInputElement)) {
         return false;
      } else {
         RotaryInputElement var2 = (RotaryInputElement)var1;
         if (!.c.E(this.a, var2.a)) {
            return false;
         } else {
            .qvt var3 = var2.b;
            return .c.E((Object)null, (Object)null);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RotaryInputElement(onRotaryScrollEvent=");
      var1.append(this.a);
      var1.append(", onPreRotaryScrollEvent=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
