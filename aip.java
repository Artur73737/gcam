import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class aip {
   public final float a;
   public final float b;
   private final float c;
   private final float d;

   public aip(float var1, float var2, float var3, float var4) {
      this.c = var1;
      this.a = var2;
      this.d = var3;
      this.b = var4;
   }

   public final float a(bxy var1) {
      var1.getClass();
      float var2;
      if (var1 == bxy.a) {
         var2 = this.c;
      } else {
         var2 = this.d;
      }

      return var2;
   }

   public final float b(bxy var1) {
      var1.getClass();
      float var2;
      if (var1 == bxy.a) {
         var2 = this.d;
      } else {
         var2 = this.c;
      }

      return var2;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof aip)) {
         return false;
      } else {
         float var2 = this.c;
         aip var3 = (aip)var1;
         return bxt.c(var2, var3.c) && bxt.c(this.a, var3.a) && bxt.c(this.d, var3.d) && bxt.c(this.b, var3.b);
      }
   }

   public final int hashCode() {
      return ((Float.floatToIntBits(this.c) * 31 + Float.floatToIntBits(this.a)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PaddingValues(start=");
      var1.append(bxt.b(this.c));
      var1.append(", top=");
      var1.append(bxt.b(this.a));
      var1.append(DzzpnVggahPIX.WaclmLCcZv);
      var1.append(bxt.b(this.d));
      var1.append(", bottom=");
      var1.append(bxt.b(this.b));
      var1.append(')');
      return var1.toString();
   }
}
