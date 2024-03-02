@qus(
   b = "androidx.compose.foundation.HoverableNode$onPointerEvent$1",
   c = "Hoverable.kt",
   d = "invokeSuspend",
   e = {91}
)
final class acf extends quw implements qvx {
   int a;
   final ach b;

   public acf(ach var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ach var3 = this.b;
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
      return new acf(this.b, var2);
   }
}
