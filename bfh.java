import com.google.geo.lightfield.processing.vc.ejXS;

public final class bfh extends bga {
   public final float a;
   public final float b;
   public final float c;
   public final boolean d;
   public final boolean e;
   public final float f;
   public final float g;

   public bfh(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7) {
      super(false, false, 3);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bfh)) {
         return false;
      } else {
         bfh var2 = (bfh)var1;
         if (Float.compare(this.a, var2.a) != 0) {
            return false;
         } else if (Float.compare(this.b, var2.b) != 0) {
            return false;
         } else if (Float.compare(this.c, var2.c) != 0) {
            return false;
         } else if (this.d != var2.d) {
            return false;
         } else if (this.e != var2.e) {
            return false;
         } else if (Float.compare(this.f, var2.f) != 0) {
            return false;
         } else {
            return Float.compare(this.g, var2.g) == 0;
         }
      }
   }

   public final int hashCode() {
      return (((((Float.floatToIntBits(this.a) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + this.d) * 31 + this.e) * 31 + Float.floatToIntBits(this.f)) * 31 + Float.floatToIntBits(this.g);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ArcTo(horizontalEllipseRadius=");
      var1.append(this.a);
      var1.append(", verticalEllipseRadius=");
      var1.append(this.b);
      var1.append(", theta=");
      var1.append(this.c);
      var1.append(", isMoreThanHalf=");
      var1.append(this.d);
      var1.append(", isPositiveArc=");
      var1.append(this.e);
      var1.append(ejXS.BkavchZwTnnf);
      var1.append(this.f);
      var1.append(", arcStartY=");
      var1.append(this.g);
      var1.append(')');
      return var1.toString();
   }
}
