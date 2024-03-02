@qus(
   b = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1",
   c = "Share.kt",
   d = "invokeSuspend",
   e = {}
)
final class rfc extends quw implements qvx {
   int a;

   public rfc(que var1) {
      super(2, var1);
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      pwm.bs(var1);
      boolean var2;
      if (this.a > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final que c(Object var1, que var2) {
      rfc var3 = new rfc(var2);
      var3.a = ((Number)var1).intValue();
      return var3;
   }
}
