@qus(
   b = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2",
   c = "RippleAnimation.kt",
   d = "invokeSuspend",
   e = {95}
)
final class aqi extends quw implements qvx {
   int a;
   final aqn b;

   public aqi(aqn var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         yt var5 = this.b.h;
         Float var3 = quy.d(1.0F);
         aak var4 = sq.i(225, 0, zo.a, 2);
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
      return new aqi(this.b, var2);
   }
}
