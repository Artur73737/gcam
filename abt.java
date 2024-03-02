@qus(
   b = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1",
   c = "Focusable.kt",
   d = "invokeSuspend",
   e = {310}
)
final class abt extends quw implements qvx {
   int a;
   final ahp b;
   final lmk c;

   public abt(lmk var1, ahp var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         lmk var4 = this.c;
         ahp var3 = this.b;
         this.a = 1;
         if (var4.aM(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new abt(this.c, this.b, var2);
   }
}
