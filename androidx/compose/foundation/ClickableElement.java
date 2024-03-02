package androidx.compose.foundation;

public final class ClickableElement extends .bmp {
   private final boolean a;
   private final .bri b;
   private final .qvi c;
   private final .lmk e;

   public ClickableElement(.lmk var1, boolean var2, .bri var3, .qvi var4) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
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
            ClickableElement var4 = (ClickableElement)var1;
            if (!.c.E(this.e, var4.e)) {
               return false;
            } else if (this.a != var4.a) {
               return false;
            } else if (!.c.E((Object)null, (Object)null)) {
               return false;
            } else if (!.c.E(this.b, var4.b)) {
               return false;
            } else {
               return .c.E(this.c, var4.c);
            }
         }
      }
   }

   public final int hashCode() {
      int var2 = this.e.hashCode();
      int var3 = .c.m(this.a);
      .bri var4 = this.b;
      int var1;
      if (var4 != null) {
         var1 = var4.a;
      } else {
         var1 = 0;
      }

      return ((var2 * 31 + var3) * 961 + var1) * 31 + this.c.hashCode();
   }
}
