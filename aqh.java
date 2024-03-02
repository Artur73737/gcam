@qus(
   b = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1",
   c = "RippleAnimation.kt",
   d = "invokeSuspend",
   e = {89}
)
final class aqh extends quw implements qvx {
   int a;
   final aqn b;

   public aqh(aqn var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var5 = this.b.g;
         Float var4 = quy.d(1.0F);
         aak var3 = sq.i(75, 0, zo.b, 2);
         this.a = 1;
         if (yt.h(var5, var4, var3, (qvt)null, this, 12) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aqh(this.b, var2);
   }
}
