@qus(
   b = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1$2$1$1$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {}
)
final class aeu extends quw implements qvx {
   final agc a;
   final long b;
   private Object c;

   public aeu(agc var1, long var2, que var4) {
      super(2, var4);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      afj var3 = (afj)this.c;
      this.a.c(var3, this.b, 4);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      aeu var3 = new aeu(this.a, this.b, var2);
      var3.c = var1;
      return var3;
   }
}
