import java.util.ArrayList;

public abstract class rgl implements ree {
   public final qui a;
   public final int b;

   public rgl(qui var1, int var2) {
      this.a = var1;
      this.b = var2;
      boolean var3 = qzx.a;
   }

   // $FF: synthetic method
   public static Object e(rgl var0, ref var1, que var2) {
      Object var3 = qzy.g(new rgj(var1, var0, (que)null), var2);
      return var3 == qul.a ? var3 : qsn.a;
   }

   protected abstract Object b(rdo var1, que var2);

   public abstract rgl d(qui var1, int var2);

   public ree f() {
      return null;
   }

   public Object gY(ref var1, que var2) {
      return e(this, var1, var2);
   }

   public String toString() {
      ArrayList var2 = new ArrayList(4);
      qui var3 = this.a;
      StringBuilder var4;
      if (var3 != quj.a) {
         var4 = new StringBuilder();
         var4.append("context=");
         var4.append(var3);
         var2.add("context=".concat(var3.toString()));
      }

      int var1 = this.b;
      if (var1 != -3) {
         var2.add(c.aE(var1, "capacity="));
      }

      String var6 = qzy.a(this);
      String var5 = pwm.aN(var2, ", ", (CharSequence)null, (CharSequence)null, (qvt)null, 62);
      var4 = new StringBuilder();
      var4.append(var6);
      var4.append("[");
      var4.append(var5);
      var4.append("]");
      return var4.toString();
   }
}
