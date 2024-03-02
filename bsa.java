public final class bsa {
   private final bsp a;

   public bsa(bsp var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsa)) {
         return false;
      } else {
         bsp var5 = this.a;
         bry var6 = var5.a;
         bsa var8 = (bsa)var1;
         if (c.E(var6, var8.a.a) && var5.b.t(var8.a.b) && c.E(var5.c, var8.a.c)) {
            int var2 = var5.d;
            bsp var9 = var8.a;
            if (var2 == var9.d && var5.e == var9.e && c.n(var5.f, var9.f) && c.E(var5.g, var9.g)) {
               bxy var10 = var5.h;
               bsp var7 = var8.a;
               if (var10 == var7.h && var5.j == var7.j) {
                  var2 = bxq.b(var5.i);
                  long var3 = var8.a.i;
                  if (var2 == bxq.b(var3)) {
                     if (bxq.a(var5.i) != bxq.a(var3)) {
                        return false;
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      bsp var15 = this.a;
      int var11 = var15.a.hashCode();
      bss var16 = var15.b;
      bsn var17 = var16.b;
      int var10 = car.H(var17.b);
      bvc var18 = var17.c;
      char var9 = 0;
      int var1;
      if (var18 != null) {
         var1 = var18.p;
      } else {
         var1 = 0;
      }

      buy var19 = var17.d;
      int var2;
      if (var19 != null) {
         var2 = var19.a;
      } else {
         var2 = 0;
      }

      byte var3;
      if (var17.e != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      buq var20 = var17.f;
      int var4;
      if (var20 != null) {
         var4 = var20.hashCode();
      } else {
         var4 = 0;
      }

      String var21 = var17.g;
      int var5;
      if (var21 != null) {
         var5 = var21.hashCode();
      } else {
         var5 = 0;
      }

      int var12 = car.H(var17.h);
      int var6;
      if (var17.i != null) {
         var6 = Float.floatToIntBits(0.0F);
      } else {
         var6 = 0;
      }

      bxh var22 = var17.j;
      int var7;
      if (var22 != null) {
         var7 = var22.hashCode();
      } else {
         var7 = 0;
      }

      bwe var23 = var17.k;
      int var8;
      if (var23 != null) {
         var8 = var23.hashCode();
      } else {
         var8 = 0;
      }

      int var14 = c.p(var17.l);
      int var13 = var16.c.hashCode();
      if (var16.d != null) {
         var9 = '闋';
      }

      return (((((((((var11 * 31 + (((((((((((var10 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var12) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var14) * 961 + var13) * 31 + var9) * 31 + 1) * 31 + var15.d) * 31 + c.m(var15.e)) * 31 + var15.f) * 31 + var15.g.hashCode()) * 31 + var15.h.hashCode()) * 31 + var15.j.hashCode()) * 31 + bxq.b(var15.i)) * 31 + bxq.a(var15.i);
   }
}
