import java.util.List;

public final class cyw {
   public final List a;

   public cyw(List var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && c.E(this.getClass(), var1.getClass())) {
         cyw var2 = (cyw)var1;
         return c.E(this.a, var2.a);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      return pwm.aN(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", (qvt)null, 56);
   }
}
