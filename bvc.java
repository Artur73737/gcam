public final class bvc implements Comparable {
   public static final bvc a;
   public static final bvc b;
   public static final bvc c;
   public static final bvc d;
   public static final bvc e;
   public static final bvc f;
   public static final bvc g;
   public static final bvc h;
   public static final bvc i;
   public static final bvc j;
   public static final bvc k;
   public static final bvc l;
   public static final bvc m;
   public static final bvc n;
   public static final bvc o;
   public final int p;

   static {
      bvc var7 = new bvc(100);
      a = var7;
      bvc var5 = new bvc(200);
      b = var5;
      bvc var2 = new bvc(300);
      c = var2;
      bvc var6 = new bvc(400);
      d = var6;
      bvc var0 = new bvc(500);
      e = var0;
      bvc var4 = new bvc(600);
      f = var4;
      bvc var1 = new bvc(700);
      g = var1;
      bvc var3 = new bvc(800);
      h = var3;
      bvc var8 = new bvc(900);
      i = var8;
      j = var7;
      k = var2;
      l = var6;
      m = var0;
      n = var1;
      o = var8;
      pwm.aS(new bvc[]{var7, var5, var2, var6, var0, var4, var1, var3, var8});
   }

   public bvc(int var1) {
      this.p = var1;
      if (var1 <= 0 || var1 >= 1001) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Font weight can be in range [1, 1000]. Current value: ");
         var2.append(var1);
         throw new IllegalArgumentException(var2.toString());
      }
   }

   public final int a(bvc var1) {
      var1.getClass();
      return qwp.a(this.p, var1.p);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bvc)) {
         return false;
      } else {
         return this.p == ((bvc)var1).p;
      }
   }

   public final int hashCode() {
      return this.p;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FontWeight(weight=");
      var1.append(this.p);
      var1.append(')');
      return var1.toString();
   }
}
