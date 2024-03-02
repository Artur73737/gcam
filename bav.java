public final class bav implements bbb {
   public final bbb a;
   public final bbb b;

   public bav(bbb var1, bbb var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof bav) {
         bbb var2 = this.a;
         bav var3 = (bav)var1;
         if (c.E(var2, var3.a) && c.E(this.b, var3.b)) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   public final Object h(Object var1, qvx var2) {
      return this.b.h(this.a.h(var1, var2), var2);
   }

   public final int hashCode() {
      return this.a.hashCode() + this.b.hashCode() * 31;
   }

   public final boolean i(qvt var1) {
      return this.a.i(var1) && this.b.i(var1);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('[');
      var1.append((String)this.h("", ajt.m));
      var1.append(']');
      return var1.toString();
   }
}
