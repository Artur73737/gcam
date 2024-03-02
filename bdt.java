import android.graphics.Shader;

public final class bdt extends bcu {
   public final long a;

   public bdt(long var1) {
      this.a = var1;
   }

   public final void a(long var1, bco var3, float var4) {
      var3.h(1.0F);
      if (var4 == 1.0F) {
         var1 = this.a;
      } else {
         var1 = this.a;
         var1 = bcy.i(var1, bcy.a(var1) * var4);
      }

      var3.j(var1);
      if (var3.c != null) {
         var3.l((Shader)null);
      }

   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bdt)) {
         return false;
      } else {
         return c.o(this.a, ((bdt)var1).a);
      }
   }

   public final int hashCode() {
      return c.p(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SolidColor(value=");
      var1.append(bcy.h(this.a));
      var1.append(')');
      return var1.toString();
   }
}
