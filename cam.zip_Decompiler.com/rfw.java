@qus(
   b = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2",
   c = "SharingStarted.kt",
   d = "invokeSuspend",
   e = {}
)
final class rfw extends quw implements qvx {
   Object a;

   public rfw(que var1) {
      super(2, var1);
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      pwm.bs(var1);
      boolean var2;
      if ((rfo)this.a != rfo.a) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final que c(Object var1, que var2) {
      rfw var3 = new rfw(var2);
      var3.a = var1;
      return var3;
   }
}
