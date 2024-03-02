import java.math.BigInteger;

public final class cyi implements Comparable {
   public static final cyi a = new cyi(0, 1, 0, "");
   public final int b;
   public final int c;
   public final int d;
   private final String e;
   private final qsd f;

   public cyi(int var1, int var2, int var3, String var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = pwm.bt(new bmc(this, 18));
   }

   private final BigInteger b() {
      Object var1 = this.f.a();
      var1.getClass();
      return (BigInteger)var1;
   }

   public final int a(cyi var1) {
      var1.getClass();
      return this.b().compareTo(var1.b());
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof cyi)) {
         return false;
      } else {
         int var2 = this.b;
         cyi var3 = (cyi)var1;
         return var2 == var3.b && this.c == var3.c && this.d == var3.d;
      }
   }

   public final int hashCode() {
      return ((this.b + 527) * 31 + this.c) * 31 + this.d;
   }

   public final String toString() {
      String var3;
      if (!qwp.l(this.e)) {
         StringBuilder var1 = new StringBuilder();
         var1.append('-');
         var1.append(this.e);
         var3 = var1.toString();
      } else {
         var3 = "";
      }

      StringBuilder var2 = new StringBuilder();
      var2.append(this.b);
      var2.append('.');
      var2.append(this.c);
      var2.append('.');
      var2.append(this.d);
      var2.append(var3);
      return var2.toString();
   }
}
