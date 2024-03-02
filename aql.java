@qus(
   b = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1",
   c = "RippleAnimation.kt",
   d = "invokeSuspend",
   e = {112}
)
final class aql extends quw implements qvx {
   int a;
   final aqn b;

   public aql(aqn var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var5 = this.b.g;
         Float var3 = quy.d(0.0F);
         aak var4 = sq.i(150, 0, zo.b, 2);
         this.a = 1;
         if (yt.h(var5, var3, var4, (qvt)null, this, 12) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new aql(this.b, var2);
   }
}
