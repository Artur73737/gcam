public final class alz extends alt {
   public alz(alu var1, alu var2, alu var3, alu var4) {
      var2.getClass();
      var3.getClass();
      var4.getClass();
      super(var1, var2, var3, var4);
   }

   public final bdn b(long var1, float var3, float var4, float var5, float var6, bxy var7) {
      Object var16;
      if (var3 + var4 + var5 + var6 == 0.0F) {
         var16 = new bdh(et.m(var1));
      } else {
         bcj var15 = et.m(var1);
         float var8;
         if (var7 == bxy.a) {
            var8 = var3;
         } else {
            var8 = var4;
         }

         long var11 = es.k(var8, var8);
         if (var7 == bxy.a) {
            var3 = var4;
         }

         long var9 = es.k(var3, var3);
         if (var7 == bxy.a) {
            var3 = var5;
         } else {
            var3 = var6;
         }

         var1 = es.k(var3, var3);
         if (var7 == bxy.a) {
            var5 = var6;
         }

         long var13 = es.k(var5, var5);
         var16 = new bdi(new bck(var15.b, var15.c, var15.d, var15.e, var11, var9, var1, var13));
      }

      return (bdn)var16;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof alz) {
            alu var2 = super.a;
            alz var3 = (alz)var1;
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
      var1.append("RoundedCornerShape(topStart = ");
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
