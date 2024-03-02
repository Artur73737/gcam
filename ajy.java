@qus(
   b = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2",
   c = "LazyListState.kt",
   d = "invokeSuspend",
   e = {459}
)
final class ajy extends quw implements qvx {
   int a;
   final ajz b;

   public ajy(ajz var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         zc var3 = this.b.u;
         Float var5 = quy.d(0.0F);
         zx var4 = sq.h(400.0F, quy.d(0.5F), 1);
         this.a = 1;
         if (dq.g(var3, var5, var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new ajy(this.b, var2);
   }
}
