@qus(
   b = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3",
   c = "RippleAnimation.kt",
   d = "invokeSuspend",
   e = {101}
)
final class aqj extends quw implements qvx {
   int a;
   final aqn b;

   public aqj(aqn var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var3 = this.b.i;
         Float var4 = quy.d(1.0F);
         aak var5 = sq.i(225, 0, zo.b, 2);
         this.a = 1;
         if (yt.h(var3, var4, var5, (qvt)null, this, 12) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aqj(this.b, var2);
   }
}
