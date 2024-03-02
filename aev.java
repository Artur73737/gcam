@qus(
   b = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1$2$1$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {625}
)
final class aev extends quw implements qvx {
   int a;
   final agc b;
   final long c;

   public aev(agc var1, long var2, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         afw var4 = this.b.a;
         acn var5 = acn.b;
         aeu var3 = new aeu(this.b, this.c, (que)null);
         this.a = 1;
         if (var4.a(var5, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aev(this.b, this.c, var2);
   }
}
