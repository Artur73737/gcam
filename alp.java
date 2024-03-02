@qus(
   b = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2",
   c = "BringIntoViewResponder.kt",
   d = "invokeSuspend",
   e = {}
)
final class alp extends quw implements qvx {
   final alr a;
   final bjf b;
   final qvi c;
   final qvi d;
   private Object e;

   public alp(alr var1, bjf var2, qvi var3, qvi var4, que var5) {
      super(2, var5);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      qzv var3 = (qzv)this.e;
      qwo.o(var3, (qui)null, 0, new aln(this.a, this.b, this.c, (que)null), 3);
      return qwo.o(var3, (qui)null, 0, new alo(this.a, this.d, (que)null), 3);
   }

   public final que c(Object var1, que var2) {
      alp var3 = new alp(this.a, this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
