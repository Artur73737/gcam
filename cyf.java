import java.util.ArrayList;
import java.util.Collection;

final class cyf extends cyg {
   private final Object a;
   private final String b;

   public cyf(Object var1, String var2) {
      this.a = var1;
      this.b = var2;
      StringBuilder var5 = new StringBuilder();
      var5.append(var2);
      var5.append(" value: ");
      var5.append(var1);
      cyj var6 = new cyj(var5.toString());
      StackTraceElement[] var8 = var6.getStackTrace();
      var8.getClass();
      int var4 = var8.length;
      int var3 = qxb.k(var4 - 2, 0);
      if (var3 < 0) {
         IllegalArgumentException var7 = new IllegalArgumentException(c.aK(var3, "Requested element count ", " is less than zero."));
         throw var7;
      } else {
         if (var3 == 0) {
            var1 = qtf.a;
         } else if (var3 >= var4) {
            var1 = pwm.ba(var8);
         } else if (var3 == 1) {
            var1 = pwm.ak(var8[var4 - 1]);
         } else {
            var1 = new ArrayList(var3);

            for(var3 = var4 - var3; var3 < var4; ++var3) {
               ((ArrayList)var1).add(var8[var3]);
            }
         }

         var6.setStackTrace((StackTraceElement[])((Collection)var1).toArray(new StackTraceElement[0]));
      }
   }

   public final cyg a(String var1, qvt var2) {
      return this;
   }

   public final Object b() {
      return null;
   }
}
