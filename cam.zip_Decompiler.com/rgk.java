@qus(
   b = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1",
   c = "ChannelFlow.kt",
   d = "invokeSuspend",
   e = {60}
)
final class rgk extends quw implements qvx {
   int a;
   Object b;
   final rgl c;

   public rgk(rgl var1, que var2) {
      super(2, var2);
      this.c = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rdo var4 = (rdo)this.b;
         rgl var3 = this.c;
         this.a = 1;
         if (var3.b(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      rgk var3 = new rgk(this.c, var2);
      var3.b = var1;
      return var3;
   }
}
