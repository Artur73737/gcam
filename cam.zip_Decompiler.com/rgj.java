@qus(
   b = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2",
   c = "ChannelFlow.kt",
   d = "invokeSuspend",
   e = {123}
)
final class rgj extends quw implements qvx {
   int a;
   final ref b;
   final rgl c;
   private Object d;

   public rgj(ref var1, rgl var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var6 = (qzv)this.d;
         ref var9 = this.b;
         rgl var7 = this.c;
         var6.getClass();
         qui var5 = var7.a;
         int var3 = var7.b;
         int var2 = var3;
         if (var3 == -3) {
            var2 = -2;
         }

         rgk var11 = new rgk(var7, (que)null);
         rdb var8 = quy.B(var2, 1, 4);
         rdn var10 = new rdn(qzp.b(var6, var5), var8);
         var10.j(3, var10, var11);
         this.a = 1;
         if (qwl.r(var9, var10, this) == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      rgj var3 = new rgj(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
