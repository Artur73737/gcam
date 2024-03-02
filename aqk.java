@qus(
   b = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2",
   c = "RippleAnimation.kt",
   d = "invokeSuspend",
   e = {}
)
final class aqk extends quw implements qvx {
   final aqn a;
   private Object b;

   public aqk(aqn var1, que var2) {
      super(2, var2);
      this.a = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      qzv var3 = (qzv)this.b;
      qwo.o(var3, (qui)null, 0, new aqh(this.a, (que)null), 3);
      qwo.o(var3, (qui)null, 0, new aqi(this.a, (que)null), 3);
      return qwo.o(var3, (qui)null, 0, new aqj(this.a, (que)null), 3);
   }

   public final que c(Object var1, que var2) {
      aqk var3 = new aqk(this.a, var2);
      var3.b = var1;
      return var3;
   }
}
