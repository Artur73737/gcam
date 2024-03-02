package androidx.compose.foundation.layout;

public final class WrapContentElement extends .bmp {
   private final .qvx a;
   private final Object b;
   private final int c;

   public WrapContentElement(int var1, .qvx var2, Object var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         Class var3 = this.getClass();
         Class var2;
         if (var1 != null) {
            var2 = var1.getClass();
         } else {
            var2 = null;
         }

         if (!.c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            WrapContentElement var4 = (WrapContentElement)var1;
            if (this.c != var4.c) {
               return false;
            } else {
               return .c.E(this.b, var4.b);
            }
         }
      }
   }

   public final int hashCode() {
      int var1 = this.c;
      .c.ai(var1);
      return (var1 * 31 + 1237) * 31 + this.b.hashCode();
   }
}
