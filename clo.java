@qus(
   b = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1",
   c = "FlowExt.kt",
   d = "invokeSuspend",
   e = {92}
)
final class clo extends quw implements qvx {
   int a;
   final ree b;
   final rdo c;

   public clo(ree var1, rdo var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var4 = this.b;
         cln var3 = new cln(this.c, 0);
         this.a = 1;
         if (var4.gY(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new clo(this.b, this.c, var2);
   }
}
