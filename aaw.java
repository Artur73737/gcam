@qus(
   b = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {799}
)
final class aaw extends quw implements qvx {
   int a;
   final aay b;
   final ahr c;

   public aaw(aay var1, ahr var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         lmk var3 = this.b.f;
         ahr var4 = this.c;
         this.a = 1;
         if (var3.aM(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aaw(this.b, this.c, var2);
   }
}
