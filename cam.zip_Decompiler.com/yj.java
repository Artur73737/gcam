import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;

public final class yj {
   public final float a;
   public final float b;
   public final long c;

   public yj(float var1, float var2, long var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof yj)) {
         return false;
      } else {
         yj var2 = (yj)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else {
            return this.c == var2.c;
         }
      }
   }

   public final int hashCode() {
      return (Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + c.p(this.c);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FlingInfo(initialVelocity=");
      var1.append(this.a);
      var1.append(TRoaEYDrhZZT.vqTuEP);
      var1.append(this.b);
      var1.append(", duration=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
