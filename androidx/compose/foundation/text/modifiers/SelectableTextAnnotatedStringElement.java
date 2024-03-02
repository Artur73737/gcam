package androidx.compose.foundation.text.modifiers;

import java.util.List;

public final class SelectableTextAnnotatedStringElement extends .bmp {
   private final .bry a;
   private final .bss b;
   private final .qvt c;
   private final int e;
   private final boolean f;
   private final int g;
   private final int h;
   private final List i;
   private final .qvt j;
   private final .ami k;
   private final .qnd l;
   private final .fwf m;

   public SelectableTextAnnotatedStringElement(.bry var1, .bss var2, .fwf var3, .qvt var4, int var5, boolean var6, int var7, .ami var8, .qnd var9) {
      var2.getClass();
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.m = var3;
      this.c = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = 1;
      this.i = null;
      this.j = null;
      this.k = var8;
      this.l = var9;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof SelectableTextAnnotatedStringElement)) {
         return false;
      } else {
         .qnd var3 = this.l;
         SelectableTextAnnotatedStringElement var4 = (SelectableTextAnnotatedStringElement)var1;
         if (!.c.E(var3, var4.l)) {
            return false;
         } else if (!.c.E(this.a, var4.a)) {
            return false;
         } else if (!.c.E(this.b, var4.b)) {
            return false;
         } else {
            List var5 = var4.i;
            if (!.c.E((Object)null, (Object)null)) {
               return false;
            } else if (!.c.E(this.m, var4.m)) {
               return false;
            } else if (!.c.E(this.c, var4.c)) {
               return false;
            } else if (!.c.n(this.e, var4.e)) {
               return false;
            } else if (this.f != var4.f) {
               return false;
            } else if (this.g != var4.g) {
               return false;
            } else {
               int var2 = var4.h;
               .qvt var6 = var4.j;
               if (!.c.E((Object)null, (Object)null)) {
                  return false;
               } else {
                  return .c.E(this.k, var4.k);
               }
            }
         }
      }
   }

   public final int hashCode() {
      int var3 = this.a.hashCode();
      int var5 = this.b.hashCode();
      int var4 = this.m.hashCode();
      .qvt var10 = this.c;
      int var2 = 0;
      int var1;
      if (var10 != null) {
         var1 = var10.hashCode();
      } else {
         var1 = 0;
      }

      int var6 = this.e;
      int var7 = .c.m(this.f);
      int var8 = this.g;
      int var9 = this.k.hashCode();
      .qnd var11 = this.l;
      if (var11 != null) {
         var2 = var11.hashCode();
      }

      return ((((((((var3 * 31 + var5) * 31 + var4) * 31 + var1) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + 1) * 29791 + var9) * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SelectableTextAnnotatedStringElement(text=");
      var1.append(this.a);
      var1.append(", style=");
      var1.append(this.b);
      var1.append(", fontFamilyResolver=");
      var1.append(this.m);
      var1.append(", onTextLayout=");
      var1.append(this.c);
      var1.append(", overflow=");
      var1.append(.bxk.a(this.e));
      var1.append(", softWrap=");
      var1.append(this.f);
      var1.append(", maxLines=");
      var1.append(this.g);
      var1.append(", minLines=1, placeholders=");
      var1.append((Object)null);
      var1.append(", onPlaceholderLayout=");
      var1.append((Object)null);
      var1.append(", selectionController=");
      var1.append(this.k);
      var1.append(", color=");
      var1.append(this.l);
      var1.append(')');
      return var1.toString();
   }
}
