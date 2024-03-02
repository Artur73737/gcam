public final class bse {
   public final int a;
   public final int b;
   public final int c;
   public final int d;
   public final float e;
   public final float f;
   public final brw g;

   public bse(brw var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this.g = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.f = var7;
   }

   public final float a(float var1) {
      return var1 + this.e;
   }

   public final int b(int var1) {
      return var1 + this.a;
   }

   public final int c(int var1) {
      return var1 + this.c;
   }

   public final int d(int var1) {
      return qxb.m(var1, this.a, this.b) - this.a;
   }

   public final int e(int var1) {
      return var1 - this.c;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bse)) {
         return false;
      } else {
         bse var2 = (bse)var1;
         if (!c.E(this.g, var2.g)) {
            return false;
         } else if (this.a != var2.a) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else if (this.d != var2.d) {
            return false;
         } else if (Float.compare(this.e, var2.e) != 0) {
            return false;
         } else {
            return Float.compare(this.f, var2.f) == 0;
         }
      }
   }

   public final bcj f(bcj var1) {
      return var1.g(es.i(0.0F, this.e));
   }

   public final int hashCode() {
      return (((((this.g.hashCode() * 31 + this.a) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + Float.floatToIntBits(this.e)) * 31 + Float.floatToIntBits(this.f);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ParagraphInfo(paragraph=");
      var1.append(this.g);
      var1.append(", startIndex=");
      var1.append(this.a);
      var1.append(", endIndex=");
      var1.append(this.b);
      var1.append(", startLineIndex=");
      var1.append(this.c);
      var1.append(", endLineIndex=");
      var1.append(this.d);
      var1.append(", top=");
      var1.append(this.e);
      var1.append(", bottom=");
      var1.append(this.f);
      var1.append(')');
      return var1.toString();
   }
}
