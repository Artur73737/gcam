import android.graphics.Rect;

public final class cyx {
   private final cya a;
   private final cho b;

   public cyx(cya var1, cho var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Rect a() {
      return this.a.c();
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

         if (!c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            cyx var4 = (cyx)var1;
            if (!c.E(this.a, var4.a)) {
               return false;
            } else {
               return c.E(this.b, var4.b);
            }
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("WindowMetrics( bounds=");
      var1.append(this.a);
      var1.append(", windowInsetsCompat=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
