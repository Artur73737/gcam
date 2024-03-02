@qus(
   b = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {552}
)
final class afk extends quw implements qvx {
   int a;
   final afm b;
   final long c;

   public afk(afm var1, long var2, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         agc var5 = this.b.a;
         long var2 = this.c;
         this.a = 1;
         if (var5.g(var2, this) == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new afk(this.b, this.c, var2);
   }
}
