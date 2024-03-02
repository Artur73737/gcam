import java.util.Iterator;
import java.util.List;

public final class bgi extends gh implements Iterable, qxc {
   public final String a;
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;
   public final float g;
   public final float h;
   public final List i;
   public final List j;

   public bgi() {
      List var1 = bgj.a;
      throw null;
   }

   public bgi(String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, List var9, List var10) {
      var1.getClass();
      var9.getClass();
      var10.getClass();
      super();
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
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && var1 instanceof bgi) {
         String var2 = this.a;
         bgi var3 = (bgi)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (this.b == var3.b && this.c == var3.c && this.d == var3.d && this.e == var3.e && this.f == var3.f && this.g == var3.g && this.h == var3.h) {
            if (!c.E(this.i, var3.i)) {
               return false;
            } else {
               return c.E(this.j, var3.j);
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return ((((((((this.a.hashCode() * 31 + Float.floatToIntBits(this.b)) * 31 + Float.floatToIntBits(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.e)) * 31 + Float.floatToIntBits(this.f)) * 31 + Float.floatToIntBits(this.g)) * 31 + Float.floatToIntBits(this.h)) * 31 + this.i.hashCode()) * 31 + this.j.hashCode();
   }

   public final Iterator iterator() {
      return new bgh(this, 0);
   }
}
