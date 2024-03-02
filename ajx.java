@qus(
   b = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1",
   c = "LazyListState.kt",
   d = "invokeSuspend",
   e = {450}
)
final class ajx extends quw implements qvx {
   int a;
   final ajz b;

   public ajx(ajz var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         zc var4 = this.b.u;
         Float var5 = quy.d(0.0F);
         zx var3 = sq.h(400.0F, quy.d(0.5F), 1);
         this.a = 1;
         if (dq.g(var4, var5, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new ajx(this.b, var2);
   }
}
