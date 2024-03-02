@qus(
   b = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1",
   c = "Merge.kt",
   d = "invokeSuspend",
   e = {214, 214}
)
final class rew extends quw implements qvy {
   int a;
   Object b;
   final qvx c;
   private Object d;

   public rew(qvx var1, que var2) {
      super(3, var2);
      this.c = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      Object var2;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var2 = this.d;
         var1 = this.b;
         qvx var4 = this.c;
         this.a = 1;
         var1 = var4.a(var1, this);
         if (var1 == var3) {
            return var3;
         }
         break;
      case 1:
         var2 = this.d;
         pwm.bs(var1);
         break;
      default:
         pwm.bs(var1);
         return qsn.a;
      }

      this.d = null;
      this.a = 2;
      if (((ref)var2).a(var1, this) == var3) {
         return var3;
      } else {
         return qsn.a;
      }
   }
}
