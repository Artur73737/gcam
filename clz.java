@qus(
   b = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1",
   c = "Lifecycle.kt",
   d = "invokeSuspend",
   e = {}
)
public final class clz extends quw implements qvx {
   final cly a;
   private Object b;

   public clz(cly var1, que var2) {
      super(2, var2);
      this.a = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      qzv var3 = (qzv)this.b;
      if (this.a.a.b.compareTo(clw.b) >= 0) {
         cly var4 = this.a;
         var4.a.a(var4);
      } else {
         qzy.x(var3.gO());
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      clz var3 = new clz(this.a, var2);
      var3.b = var1;
      return var3;
   }
}
