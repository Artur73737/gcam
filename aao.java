import java.util.ArrayList;
import java.util.List;

public final class aao implements zi {
   private final int a;
   private final Object b;

   public aao(float var1, float var2, int var3) {
      this.a = var3;
      this.b = new zr(var1, var2);
   }

   public aao(zh var1, float var2, float var3, int var4) {
      this.a = var4;
      qxq var6 = qxb.p(0, var1.b());
      ArrayList var5 = new ArrayList(pwm.aL(var6));
      qtj var7 = var6.a();

      while(var7.a) {
         var5.add(new zr(var2, var3, var1.a(var7.a())));
      }

      this.b = var5;
   }

   // $FF: synthetic method
   public final zq a(int var1) {
      switch(this.a) {
      case 0:
         return (zq)this.b;
      default:
         return (zr)((List)this.b).get(var1);
      }
   }
}
