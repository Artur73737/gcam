@qus(
   b = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1",
   c = "Wrapper.android.kt",
   d = "invokeSuspend",
   e = {155}
)
public final class bqt extends quw implements qvx {
   int a;
   final bqu b;

   public bqt(bqu var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         boa var4 = this.b.a;
         this.a = 1;
         Object var2 = var4.g.q(this);
         var1 = var2;
         if (var2 != qul.a) {
            var1 = qsn.a;
         }

         if (var1 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new bqt(this.b, var2);
   }
}
