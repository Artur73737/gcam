public final class alv extends alt {
   public alv(alu var1, alu var2, alu var3, alu var4) {
      var2.getClass();
      var3.getClass();
      var4.getClass();
      super(var1, var2, var3, var4);
   }

   public final bdn b(long var1, float var3, float var4, float var5, float var6, bxy var7) {
      Object var10;
      if (var3 + var4 + var6 + var5 == 0.0F) {
         var10 = new bdh(et.m(var1));
      } else {
         bbf var9 = eu.i();
         float var8;
         if (var7 == bxy.a) {
            var8 = var3;
         } else {
            var8 = var4;
         }

         var9.f(0.0F, var8);
         var9.e(var8, 0.0F);
         if (var7 == bxy.a) {
            var3 = var4;
         }

         var9.e(bcl.c(var1) - var3, 0.0F);
         var9.e(bcl.c(var1), var3);
         if (var7 == bxy.a) {
            var3 = var5;
         } else {
            var3 = var6;
         }

         var9.e(bcl.c(var1), bcl.a(var1) - var3);
         var9.e(bcl.c(var1) - var3, bcl.a(var1));
         if (var7 == bxy.a) {
            var5 = var6;
         }

         var9.e(var5, bcl.a(var1));
         var9.e(0.0F, bcl.a(var1) - var5);
         var9.c();
         var10 = new bdg(var9);
      }

      return (bdn)var10;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof alv) {
            alu var2 = super.a;
            alv var3 = (alv)var1;
            if (c.E(var2, var3.a) && c.E(super.b, var3.b) && c.E(super.c, var3.c)) {
               if (!c.E(super.d, var3.d)) {
                  return false;
               }

               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return ((super.a.hashCode() * 31 + super.b.hashCode()) * 31 + super.c.hashCode()) * 31 + super.d.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CutCornerShape(topStart = ");
      var1.append(super.a);
      var1.append(", topEnd = ");
      var1.append(super.b);
      var1.append(", bottomEnd = ");
      var1.append(super.c);
      var1.append(", bottomStart = ");
      var1.append(super.d);
      var1.append(')');
      return var1.toString();
   }
}
