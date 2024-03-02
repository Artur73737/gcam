@qus(
   b = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1",
   c = "Collect.kt",
   d = "invokeSuspend",
   e = {50}
)
public final class rei extends quw implements qvx {
   int a;
   final ree b;

   public rei(ree var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var3 = this.b;
         this.a = 1;
         if (qwl.q(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new rei(this.b, var2);
   }
}
