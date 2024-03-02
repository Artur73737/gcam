package androidx.compose.foundation.gestures;

public final class DraggableElement extends .bmp {
   private final .aeq a;
   private final .qvt b;
   private final .aez c;
   private final .qvi e;
   private final .qvy f;
   private final .qvy g;
   private final .lmk h;

   public DraggableElement(.aeq var1, .qvt var2, .aez var3, .lmk var4, .qvi var5, .qvy var6, .qvy var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.h = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
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
            DraggableElement var4 = (DraggableElement)var1;
            if (!.c.E(this.a, var4.a)) {
               return false;
            } else if (!.c.E(this.b, var4.b)) {
               return false;
            } else if (this.c != var4.c) {
               return false;
            } else if (!.c.E(this.h, var4.h)) {
               return false;
            } else if (!.c.E(this.e, var4.e)) {
               return false;
            } else if (!.c.E(this.f, var4.f)) {
               return false;
            } else {
               return .c.E(this.g, var4.g);
            }
         }
      }
   }

   public final int hashCode() {
      int var4 = this.a.hashCode();
      int var2 = this.b.hashCode();
      int var3 = this.c.hashCode();
      .lmk var5 = this.h;
      int var1;
      if (var5 != null) {
         var1 = var5.hashCode();
      } else {
         var1 = 0;
      }

      return (((((((var4 * 31 + var2) * 31 + var3) * 31 + .c.m(true)) * 31 + var1) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g.hashCode()) * 31 + .c.m(false);
   }
}
