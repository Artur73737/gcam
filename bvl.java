public final class bvl {
   public final buq a;
   public final bvc b;
   public final int c;
   public final int d;
   private final Object e;

   // $FF: synthetic method
   public bvl(buq var1, bvc var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = 1;
      this.e = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvl)) {
         return false;
      } else {
         bvl var3 = (bvl)var1;
         if (!c.E(this.a, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.n(this.c, var3.c)) {
            return false;
         } else {
            int var2 = var3.d;
            if (!c.n(1, 1)) {
               return false;
            } else {
               var1 = var3.e;
               return c.E((Object)null, (Object)null);
            }
         }
      }
   }

   public final int hashCode() {
      buq var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return (((var1 * 31 + this.b.p) * 31 + this.c) * 31 + 1) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TypefaceRequest(fontFamily=");
      var1.append(this.a);
      var1.append(", fontWeight=");
      var1.append(this.b);
      var1.append(", fontStyle=");
      var1.append(buy.b(this.c));
      var1.append(", fontSynthesis=");
      var1.append(buz.b());
      var1.append(", resourceLoaderCacheKey=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
