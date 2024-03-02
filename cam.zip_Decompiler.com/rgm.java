@qus(
   b = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2",
   c = "ChannelFlow.kt",
   d = "invokeSuspend",
   e = {152}
)
final class rgm extends quw implements qvx {
   int a;
   Object b;
   final rgn c;

   public rgm(rgn var1, que var2) {
      super(2, var2);
      this.c = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ref var4 = (ref)this.b;
         rgn var3 = this.c;
         this.a = 1;
         if (var3.c(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      rgm var3 = new rgm(this.c, var2);
      var3.b = var1;
      return var3;
   }
}
