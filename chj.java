import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

class chj extends chi {
   public chj(cho var1, WindowInsets var2) {
      super(var1, var2);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof chj)) {
         return false;
      } else {
         chj var2 = (chj)var1;
         return Objects.equals(this.a, var2.a) && Objects.equals(this.b, var2.b);
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public cfh n() {
      DisplayCutout var1 = this.a.getDisplayCutout();
      return var1 == null ? null : new cfh(var1);
   }

   public cho o() {
      return cho.m(this.a.consumeDisplayCutout());
   }
}
