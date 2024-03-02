@qus(
   b = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2",
   c = "Merge.kt",
   d = "invokeSuspend",
   e = {34}
)
final class rgp extends quw implements qvx {
   int a;
   final rgt b;
   final ref c;
   final Object d;

   public rgp(rgt var1, ref var2, Object var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qvy var4 = this.b.d;
         ref var3 = this.c;
         var1 = this.d;
         this.a = 1;
         if (var4.a(var3, var1, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new rgp(this.b, this.c, this.d, var2);
   }
}
