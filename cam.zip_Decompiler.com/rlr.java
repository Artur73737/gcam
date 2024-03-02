public final class rlr implements qfs {
   static final qfs a = new rlr(0);
   static final qfs b = new rlr(1);
   static final qfs c = new rlr(2);
   public static final qfs d = new rlr(3);
   private final int e;

   private rlr(int var1) {
      this.e = var1;
   }

   public final boolean a(int var1) {
      switch(this.e) {
      case 0:
         return c.aq(var1);
      case 1:
         rlm var2 = rlm.a;
         switch(var1) {
         case 0:
            var2 = rlm.a;
            break;
         case 1:
            var2 = rlm.b;
            break;
         case 2:
            var2 = rlm.c;
            break;
         default:
            var2 = null;
         }

         if (var2 != null) {
            return true;
         }

         return false;
      case 2:
         return c.ao(var1);
      default:
         return c.ap(var1);
      }
   }
}
