@qus(
   b = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2",
   c = "BringIntoViewResponder.kt",
   d = "invokeSuspend",
   e = {179}
)
final class alo extends quw implements qvx {
   int a;
   final alr b;
   final qvi c;

   public alo(alr var1, qvi var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ali var4 = this.b.d();
         bjf var5 = this.b.f();
         if (var5 == null) {
            return qsn.a;
         }

         qvi var3 = this.c;
         this.a = 1;
         if (var4.b(var5, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new alo(this.b, this.c, var2);
   }
}
