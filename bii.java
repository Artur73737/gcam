@qus(
   b = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1",
   c = "SuspendingPointerInputFilter.kt",
   d = "invokeSuspend",
   e = {720, 721}
)
final class bii extends quw implements qvx {
   int a;
   final long b;
   final bij c;

   public bii(long var1, bij var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var3;
   }

   public final Object b(Object var1) {
      label20: {
         qul var4 = qul.a;
         switch(this.a) {
         case 0:
            pwm.bs(var1);
            long var2 = this.b;
            this.a = 1;
            if (qzy.d(var2 - 1L, this) == var4) {
               return var4;
            }
            break;
         case 1:
            pwm.bs(var1);
            break;
         default:
            pwm.bs(var1);
            break label20;
         }

         this.a = 2;
         if (qzy.d(1L, this) == var4) {
            return var4;
         }
      }

      qza var5 = this.c.b;
      if (var5 != null) {
         var5.gP(pwm.br(new bhm(this.b)));
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new bii(this.b, this.c, var2);
   }
}
