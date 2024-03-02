@qus(
   b = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1",
   c = "Clickable.kt",
   d = "invokeSuspend",
   e = {808}
)
final class aax extends quw implements qvx {
   int a;
   final aay b;
   final ahr c;

   public aax(aay var1, ahr var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         lmk var4 = this.b.f;
         ahs var3 = new ahs(this.c);
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
      return new aax(this.b, this.c, var2);
   }
}
