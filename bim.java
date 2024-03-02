import com.google.android.libraries.social.licenses.an.fJos;

public final class bim {
   public long a;
   public float b;

   public bim(long var1, float var3) {
      this.a = var1;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bim)) {
         return false;
      } else {
         bim var2 = (bim)var1;
         if (this.a != var2.a) {
            return false;
         } else {
            return Float.compare(this.b, var2.b) == 0;
         }
      }
   }

   public final int hashCode() {
      return c.p(this.a) * 31 + Float.floatToIntBits(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DataPointAtTime(time=");
      var1.append(this.a);
      var1.append(fJos.azDnnFB);
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
