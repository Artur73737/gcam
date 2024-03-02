public final class bff {
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final bgi e;
   public final long f;
   public final int g;
   public final boolean h;
   private final String i = "";

   public bff(float var1, float var2, float var3, float var4, bgi var5, long var6, int var8, boolean var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var8;
      this.h = var9;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bff)) {
         return false;
      } else {
         String var2 = this.i;
         bff var3 = (bff)var1;
         if (!c.E(var2, var3.i)) {
            return false;
         } else if (!bxt.c(this.a, var3.a)) {
            return false;
         } else if (!bxt.c(this.b, var3.b)) {
            return false;
         } else if (this.c == var3.c && this.d == var3.d) {
            if (!c.E(this.e, var3.e)) {
               return false;
            } else if (!c.o(this.f, var3.f)) {
               return false;
            } else if (!c.n(this.g, var3.g)) {
               return false;
            } else {
               return this.h == var3.h;
            }
         } else {
            return false;
         }
      }
   }

   public final int hashCode() {
      return (((((((this.i.hashCode() * 31 + Float.floatToIntBits(this.a)) * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + this.e.hashCode()) * 31 + c.p(this.f)) * 31 + this.g) * 31 + c.m(this.h);
   }
}
