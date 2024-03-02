public final class bdi extends bdn {
   public final bck a;
   public final bbf b;

   public bdi(bck var1) {
      this.a = var1;
      float var2 = bcg.a(var1.h);
      float var3 = bcg.a(var1.g);
      boolean var5 = true;
      boolean var4;
      if (var2 == var3 && bcg.a(var1.g) == bcg.a(var1.f) && bcg.a(var1.f) == bcg.a(var1.e)) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (bcg.b(var1.h) != bcg.b(var1.g) || bcg.b(var1.g) != bcg.b(var1.f) || bcg.b(var1.f) != bcg.b(var1.e)) {
         var5 = false;
      }

      bbf var7;
      if (var4 && var5) {
         var7 = null;
      } else {
         bbf var6 = eu.i();
         var6.b(var1);
         var7 = var6;
      }

      this.b = var7;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bdi)) {
         return false;
      } else {
         return c.E(this.a, ((bdi)var1).a);
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
