import java.util.List;

public final class bgm extends gh {
   public final String a;
   public final List b;
   public final int c;
   public final bcu d;
   public final float e;
   public final bcu f;
   public final float g;
   public final float h;
   public final int i;
   public final int j;
   public final float k;
   public final float l;
   public final float m;
   public final float n;

   public bgm(String var1, List var2, int var3, bcu var4, float var5, bcu var6, float var7, float var8, int var9, int var10, float var11, float var12, float var13, float var14) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
      this.k = var11;
      this.l = var12;
      this.m = var13;
      this.n = var14;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         bgm var2 = (bgm)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (!c.E(this.d, var2.d)) {
            return false;
         } else {
            if (this.e == var2.e) {
               if (!c.E(this.f, var2.f)) {
                  return false;
               }

               if (this.g == var2.g && this.h == var2.h) {
                  if (!c.n(this.i, var2.i)) {
                     return false;
                  }

                  if (!c.n(this.j, var2.j)) {
                     return false;
                  }

                  if (this.k == var2.k && this.l == var2.l && this.m == var2.m && this.n == var2.n) {
                     if (!c.n(this.c, var2.c)) {
                        return false;
                     }

                     if (!c.E(this.b, var2.b)) {
                        return false;
                     }

                     return true;
                  }
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var3 = this.a.hashCode();
      int var4 = this.b.hashCode();
      bcu var6 = this.d;
      int var2 = 0;
      int var1;
      if (var6 != null) {
         var1 = var6.hashCode();
      } else {
         var1 = 0;
      }

      int var5 = Float.floatToIntBits(this.e);
      var6 = this.f;
      if (var6 != null) {
         var2 = var6.hashCode();
      }

      return ((((((((((((var3 * 31 + var4) * 31 + var1) * 31 + var5) * 31 + var2) * 31 + Float.floatToIntBits(this.g)) * 31 + Float.floatToIntBits(this.h)) * 31 + this.i) * 31 + this.j) * 31 + Float.floatToIntBits(this.k)) * 31 + Float.floatToIntBits(this.l)) * 31 + Float.floatToIntBits(this.m)) * 31 + Float.floatToIntBits(this.n)) * 31 + this.c;
   }
}
