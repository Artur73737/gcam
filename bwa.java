public final class bwa {
   public final bry a;
   public final long b;
   private final bsr c;

   // $FF: synthetic method
   public bwa(bry var1, long var2) {
      this.a = var1;
      int var5 = this.a().length();
      int var6 = bsr.a(var2);
      int var4 = qxb.m(bsr.d(var2), 0, var5);
      var5 = qxb.m(var6, 0, var5);
      if (var4 != bsr.d(var2) || var5 != bsr.a(var2)) {
         var2 = lb.f(var4, var5);
      }

      this.b = var2;
      this.c = null;
   }

   public final String a() {
      return this.a.a;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bwa)) {
         return false;
      } else {
         long var2 = this.b;
         bwa var5 = (bwa)var1;
         if (c.o(var2, var5.b)) {
            bsr var4 = var5.c;
            if (c.E((Object)null, (Object)null) && c.E(this.a, var5.a)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + c.p(this.b)) * 31;
   }

   public final String toString() {
      StringBuilder var4 = new StringBuilder();
      var4.append("TextFieldValue(text='");
      var4.append(this.a);
      var4.append("', selection=");
      long var1 = this.b;
      StringBuilder var3 = new StringBuilder();
      var3.append("TextRange(");
      var3.append(bsr.d(var1));
      var3.append(", ");
      var3.append(bsr.a(var1));
      var3.append(')');
      var4.append(var3.toString());
      var4.append(", composition=");
      var4.append((Object)null);
      var4.append(')');
      return var4.toString();
   }
}
