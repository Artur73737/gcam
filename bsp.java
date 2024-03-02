import java.util.List;

public final class bsp {
   public final bry a;
   public final bss b;
   public final List c;
   public final int d;
   public final boolean e;
   public final int f;
   public final bxr g;
   public final bxy h;
   public final long i;
   public final fwf j;

   public bsp(bry var1, bss var2, List var3, int var4, boolean var5, int var6, bxr var7, bxy var8, fwf var9, long var10) {
      var1.getClass();
      var2.getClass();
      var9.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.j = var9;
      this.i = var10;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsp)) {
         return false;
      } else {
         bry var2 = this.a;
         bsp var3 = (bsp)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else if (this.d != var3.d) {
            return false;
         } else if (this.e != var3.e) {
            return false;
         } else if (!c.n(this.f, var3.f)) {
            return false;
         } else if (!c.E(this.g, var3.g)) {
            return false;
         } else if (this.h != var3.h) {
            return false;
         } else if (!c.E(this.j, var3.j)) {
            return false;
         } else {
            return c.o(this.i, var3.i);
         }
      }
   }

   public final int hashCode() {
      return ((((((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + 1) * 31 + this.d) * 31 + c.m(this.e)) * 31 + this.f) * 31 + this.g.hashCode()) * 31 + this.h.hashCode()) * 31 + this.j.hashCode()) * 31 + c.p(this.i);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextLayoutInput(text=");
      var1.append(this.a);
      var1.append(", style=");
      var1.append(this.b);
      var1.append(", placeholders=");
      var1.append(this.c);
      var1.append(", maxLines=");
      var1.append(this.d);
      var1.append(", softWrap=");
      var1.append(this.e);
      var1.append(", overflow=");
      var1.append(bxk.a(this.f));
      var1.append(", density=");
      var1.append(this.g);
      var1.append(", layoutDirection=");
      var1.append(this.h);
      var1.append(", fontFamilyResolver=");
      var1.append(this.j);
      var1.append(", constraints=");
      var1.append(bxq.f(this.i));
      var1.append(')');
      return var1.toString();
   }
}
