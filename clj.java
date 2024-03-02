import java.lang.reflect.Method;

@Deprecated
final class clj {
   final int a;
   final Method b;

   public clj(int var1, Method var2) {
      this.a = var1;
      this.b = var2;
      var2.setAccessible(true);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof clj)) {
         return false;
      } else {
         clj var2 = (clj)var1;
         return this.a == var2.a && this.b.getName().equals(var2.b.getName());
      }
   }

   public final int hashCode() {
      return this.a * 31 + this.b.getName().hashCode();
   }
}
