@qus(
   b = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1",
   c = "SuspendingPointerInputFilter.kt",
   d = "invokeSuspend",
   e = {562}
)
final class bik extends quw implements qvx {
   int a;
   final bil b;

   public bik(bil var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var4 = this.b;
         qvx var3 = var4.a;
         this.a = 1;
         if (var3.a(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new bik(this.b, var2);
   }
}
