package androidx.compose.foundation;

public final class BackgroundElement extends .bmp {
   private final long a;
   private final .bdr b;

   public BackgroundElement(long var1, .bdr var3) {
      this.a = var1;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      BackgroundElement var2;
      if (var1 instanceof BackgroundElement) {
         var2 = (BackgroundElement)var1;
      } else {
         var2 = null;
      }

      if (var2 == null) {
         return false;
      } else {
         return .c.o(this.a, var2.a) && .c.E((Object)null, (Object)null) && .c.E(this.b, var2.b);
      }
   }

   public final int hashCode() {
      return (.c.p(this.a) * 961 + Float.floatToIntBits(1.0F)) * 31 + this.b.hashCode();
   }
}
