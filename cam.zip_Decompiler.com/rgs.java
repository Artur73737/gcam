@qus(
   b = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3",
   c = "Merge.kt",
   d = "invokeSuspend",
   e = {27}
)
final class rgs extends quw implements qvx {
   int a;
   final rgt b;
   final ref c;
   private Object d;

   public rgs(rgt var1, ref var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = (qzv)this.d;
         qwz var5 = new qwz();
         rgt var3 = this.b;
         ree var6 = var3.c;
         rgr var7 = new rgr(var5, var4, var3, this.c, 0);
         this.a = 1;
         if (var6.gY(var7, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      rgs var3 = new rgs(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
