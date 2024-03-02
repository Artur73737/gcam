public abstract class bec {
   public final String a;
   public final long b;
   public final int c;

   public bec(String var1, long var2, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      if (var1.length() != 0) {
         if (var4 < -1 || var4 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
         }
      } else {
         throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
      }
   }

   public abstract float a(int var1);

   public abstract float b(int var1);

   public float c(float var1, float var2, float var3) {
      throw null;
   }

   public long d(float var1, float var2, float var3) {
      throw null;
   }

   public long e(float var1, float var2, float var3, float var4, bec var5) {
      throw null;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         bec var2 = (bec)var1;
         if (this.c != var2.c) {
            return false;
         } else {
            return !c.E(this.a, var2.a) ? false : c.o(this.b, var2.b);
         }
      } else {
         return false;
      }
   }

   public boolean f() {
      return false;
   }

   public int hashCode() {
      return (this.a.hashCode() * 31 + (int)(this.b ^ 3L)) * 31 + this.c;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a);
      var1.append(" (id=");
      var1.append(this.c);
      var1.append(", model=");
      var1.append(beb.a(this.b));
      var1.append(')');
      return var1.toString();
   }
}
