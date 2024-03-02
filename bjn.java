import java.util.Map;
import java.util.Set;

public final class bjn implements bju {
   final bjq a;
   final int b;
   final bju c;
   private final bju d;
   private final int e;

   public bjn(bju var1, bjq var2, int var3, bju var4, int var5) {
      this.e = var5;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var1;
   }

   public final int c() {
      switch(this.e) {
      case 0:
         return this.d.c();
      default:
         return this.d.c();
      }
   }

   public final int d() {
      switch(this.e) {
      case 0:
         return this.d.d();
      default:
         return this.d.d();
      }
   }

   public final Map e() {
      switch(this.e) {
      case 0:
         return this.d.e();
      default:
         return this.d.e();
      }
   }

   public final void f() {
      switch(this.e) {
      case 0:
         this.a.d = this.b;
         this.c.f();
         bjq var1 = this.a;
         var1.c(var1.d);
         return;
      default:
         this.a.e = this.b;
         this.c.f();
         bjq var2 = this.a;
         Set var3 = var2.k.entrySet();
         bkh var4 = new bkh(var2, 1);
         var3.getClass();
         pwm.aP(var3, var4, true);
      }
   }
}
