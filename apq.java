@qus(
   b = "androidx.compose.material.SwipeableState$snapInternalToOffset$2",
   c = "Swipeable.kt",
   d = "invokeSuspend",
   e = {}
)
final class apq extends quw implements qvx {
   final float a;
   final apu b;
   private Object c;

   public apq(float var1, apu var2, que var3) {
      super(2, var3);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      ((aeb)this.c).b(this.a - this.b.m.f());
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      apq var3 = new apq(this.a, this.b, var2);
      var3.c = var1;
      return var3;
   }
}
