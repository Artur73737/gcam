package androidx.compose.foundation;

public final class HoverableElement extends .bmp {
   private final .lmk a;

   public HoverableElement(.lmk var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof HoverableElement)) {
         return false;
      } else {
         return .c.E(((HoverableElement)var1).a, this.a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31;
   }
}
