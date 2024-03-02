package androidx.compose.foundation.gestures;

public final class ScrollableElement extends .bmp {
   private final .afw a;
   private final .aez b;
   private final .acv c;
   private final boolean e;
   private final boolean f;
   private final .acz g;
   private final .ip h;
   private final .lmk i;

   public ScrollableElement(.afw var1, .aez var2, .acv var3, boolean var4, boolean var5, .ip var6, .lmk var7, .acz var8) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.f = var5;
      this.h = var6;
      this.i = var7;
      this.g = var8;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ScrollableElement)) {
         return false;
      } else {
         .afw var2 = this.a;
         ScrollableElement var3 = (ScrollableElement)var1;
         if (!.c.E(var2, var3.a)) {
            return false;
         } else if (this.b != var3.b) {
            return false;
         } else if (!.c.E(this.c, var3.c)) {
            return false;
         } else if (this.e != var3.e) {
            return false;
         } else if (this.f != var3.f) {
            return false;
         } else if (!.c.E(this.h, var3.h)) {
            return false;
         } else if (!.c.E(this.i, var3.i)) {
            return false;
         } else {
            return .c.E(this.g, var3.g);
         }
      }
   }

   public final int hashCode() {
      int var3 = this.a.hashCode();
      int var2 = this.b.hashCode();
      .acv var4 = this.c;
      int var1;
      if (var4 != null) {
         var1 = var4.hashCode();
      } else {
         var1 = 0;
      }

      return ((((((var3 * 31 + var2) * 31 + var1) * 31 + .c.m(this.e)) * 31 + .c.m(this.f)) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + this.g.hashCode();
   }
}
