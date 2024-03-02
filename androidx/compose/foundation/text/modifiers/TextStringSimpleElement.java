package androidx.compose.foundation.text.modifiers;

public final class TextStringSimpleElement extends .bmp {
   private final String a;
   private final .bss b;
   private final int c;
   private final boolean e;
   private final int f;
   private final int g;
   private final .qnd h;
   private final .fwf i;

   public TextStringSimpleElement(String var1, .bss var2, .fwf var3, int var4, boolean var5, int var6, .qnd var7) {
      var2.getClass();
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.i = var3;
      this.c = var4;
      this.e = var5;
      this.f = var6;
      this.g = 1;
      this.h = var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof TextStringSimpleElement)) {
         return false;
      } else {
         .qnd var3 = this.h;
         TextStringSimpleElement var4 = (TextStringSimpleElement)var1;
         if (!.c.E(var3, var4.h)) {
            return false;
         } else if (!.c.E(this.a, var4.a)) {
            return false;
         } else if (!.c.E(this.b, var4.b)) {
            return false;
         } else if (!.c.E(this.i, var4.i)) {
            return false;
         } else if (!.c.n(this.c, var4.c)) {
            return false;
         } else if (this.e != var4.e) {
            return false;
         } else if (this.f != var4.f) {
            return false;
         } else {
            int var2 = var4.g;
            return true;
         }
      }
   }

   public final int hashCode() {
      int var3 = this.a.hashCode();
      int var4 = this.b.hashCode();
      int var7 = this.i.hashCode();
      int var5 = this.c;
      int var2 = .c.m(this.e);
      int var6 = this.f;
      .qnd var8 = this.h;
      int var1;
      if (var8 != null) {
         var1 = var8.hashCode();
      } else {
         var1 = 0;
      }

      return ((((((var3 * 31 + var4) * 31 + var7) * 31 + var5) * 31 + var2) * 31 + var6) * 31 + 1) * 31 + var1;
   }
}
