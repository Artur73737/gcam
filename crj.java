import java.util.concurrent.atomic.AtomicBoolean;

public abstract class crj {
   private final crc a;
   private final AtomicBoolean b;
   private final qsd c;

   public crj(crc var1) {
      this.a = var1;
      this.b = new AtomicBoolean(false);
      this.c = pwm.bt(new bmc(this, 14));
   }

   private final csp a() {
      return (csp)this.c.a();
   }

   protected abstract String d();

   public final csp e() {
      this.a.k();
      csp var1;
      if (this.b.compareAndSet(false, true)) {
         var1 = this.a();
      } else {
         var1 = this.f();
      }

      return var1;
   }

   public final csp f() {
      return this.a.t(this.d());
   }

   public final void g(csp var1) {
      var1.getClass();
      if (var1 == this.a()) {
         this.b.set(false);
      }

   }
}
