@qus(
   b = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {610}
)
final class aex extends quw implements qvx {
   int a;
   final aey b;
   private Object c;

   public aex(aey var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bil var3 = (bil)this.c;
         aew var4 = new aew(this.b, (que)null);
         this.a = 1;
         if (var3.l(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      aex var3 = new aex(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
