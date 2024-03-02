@qus(
   b = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1",
   c = "ChannelFlow.kt",
   d = "invokeSuspend",
   e = {212}
)
final class rhl extends quw implements qvx {
   int a;
   Object b;
   final ref c;

   public rhl(ref var1, que var2) {
      super(2, var2);
      this.c = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         Object var3 = this.b;
         ref var4 = this.c;
         this.a = 1;
         if (var4.a(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      rhl var3 = new rhl(this.c, var2);
      var3.b = var1;
      return var3;
   }
}
