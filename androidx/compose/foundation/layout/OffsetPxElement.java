package androidx.compose.foundation.layout;

public final class OffsetPxElement extends .bmp {
   private final .qvt a;

   public OffsetPxElement(.qvt var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         OffsetPxElement var2;
         if (var1 instanceof OffsetPxElement) {
            var2 = (OffsetPxElement)var1;
         } else {
            var2 = null;
         }

         if (var2 == null) {
            return false;
         } else {
            return .c.E(this.a, var2.a);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + 1231;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OffsetPxModifier(offset=");
      var1.append(this.a);
      var1.append(", rtlAware=true)");
      return var1.toString();
   }
}
