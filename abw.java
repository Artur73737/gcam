@qus(
   b = "androidx.compose.foundation.FocusableNode$onFocusEvent$1",
   c = "Focusable.kt",
   d = "invokeSuspend",
   e = {237}
)
final class abw extends quw implements qvx {
   int a;
   final abx b;

   public abw(abx var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         alk var3 = this.b.b;
         this.a = 1;
         if (var3.a(this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new abw(this.b, var2);
   }
}
