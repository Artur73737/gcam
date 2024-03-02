public final class aup implements avf {
   public static final aup a = new aup(0);
   public static final aup b = new aup(1);
   public static final aup c = new aup(2);
   private final int d;

   private aup(int var1) {
      this.d = var1;
   }

   public final boolean a(Object var1, Object var2) {
      switch(this.d) {
      case 0:
         if (var1 == var2) {
            return true;
         }

         return false;
      case 1:
         return false;
      default:
         return c.E(var1, var2);
      }
   }

   public final String toString() {
      switch(this.d) {
      case 0:
         return "ReferentialEqualityPolicy";
      case 1:
         return "NeverEqualPolicy";
      default:
         return "StructuralEqualityPolicy";
      }
   }
}
