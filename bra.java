import android.content.res.Resources.Theme;

public final class bra {
   private final Theme a;
   private final int b;

   public bra(Theme var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bra)) {
         return false;
      } else {
         bra var2 = (bra)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return this.b == var2.b;
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + this.b;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Key(theme=");
      var1.append(this.a);
      var1.append(", id=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
