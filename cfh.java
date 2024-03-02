import android.view.DisplayCutout;

public final class cfh {
   public final DisplayCutout a;

   public cfh(DisplayCutout var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         cfh var2 = (cfh)var1;
         return cex.b(this.a, var2.a);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DisplayCutoutCompat{");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
