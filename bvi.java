public final class bvi implements bup {
   public final int a;
   public final bvb b;
   private final bvc c;
   private final int d;
   private final int e;

   public bvi(int var1, bvc var2, int var3, bvb var4) {
      this.a = var1;
      this.c = var2;
      this.d = var3;
      this.b = var4;
      this.e = 0;
   }

   public final void a() {
   }

   public final int b() {
      return this.d;
   }

   public final bvc c() {
      return this.c;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvi)) {
         return false;
      } else {
         int var2 = this.a;
         bvi var3 = (bvi)var1;
         if (var2 == var3.a && c.E(this.c, var3.c)) {
            if (!c.n(this.d, var3.d)) {
               return false;
            }

            if (c.E(this.b, var3.b)) {
               var2 = var3.e;
               if (!c.n(0, 0)) {
                  return false;
               }

               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return ((this.a * 31 + this.c.p) * 31 + this.d) * 961 + this.b.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ResourceFont(resId=");
      var1.append(this.a);
      var1.append(", weight=");
      var1.append(this.c);
      var1.append(", style=");
      var1.append(buy.b(this.d));
      var1.append(", loadingStrategy=");
      var1.append(bux.a());
      var1.append(')');
      return var1.toString();
   }
}
