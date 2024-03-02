public class qwn extends qwh implements qwm, qxu {
   private final int a;
   private final int b;

   public qwn(int var1, Class var2, String var3, String var4, int var5) {
      this(var1, d, var2, var3, var4, var5);
   }

   public qwn(int var1, Object var2, Class var3, String var4, String var5) {
      this(var1, var2, var3, var4, var5, 0);
   }

   public qwn(int var1, Object var2, Class var3, String var4, String var5, int var6) {
      boolean var7;
      if (1 != var6) {
         var7 = false;
      } else {
         var7 = true;
      }

      super(var2, var3, var4, var5, var7);
      this.a = var1;
      this.b = 0;
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof qwn) {
         qwn var3 = (qwn)var1;
         if (super.f.equals(var3.f) && super.g.equals(var3.g)) {
            int var2 = var3.b;
            if (this.a == var3.a && c.E(super.e, var3.e) && c.E(this.e(), var3.e())) {
               return true;
            }
         }

         return false;
      } else {
         return var1 instanceof qxu ? var1.equals(this.c()) : false;
      }
   }

   public final int ew() {
      return this.a;
   }

   protected final void g() {
      int var1 = qxa.a;
   }

   public final int hashCode() {
      this.e();
      return (this.e().hashCode() * 31 + super.f.hashCode()) * 31 + super.g.hashCode();
   }

   public final String toString() {
      qxr var1 = this.c();
      if (var1 != this) {
         return var1.toString();
      } else {
         String var3;
         if ("<init>".equals(super.f)) {
            var3 = "constructor (Kotlin reflection is not available)";
         } else {
            String var2 = super.f;
            StringBuilder var4 = new StringBuilder();
            var4.append("function ");
            var4.append(var2);
            var4.append(" (Kotlin reflection is not available)");
            var3 = var4.toString();
         }

         return var3;
      }
   }
}
