@qus(
   b = "kotlinx.coroutines.flow.StartedLazily$command$1",
   c = "SharingStarted.kt",
   d = "invokeSuspend",
   e = {155}
)
final class rft extends quw implements qvx {
   int a;
   final rfy b;
   private Object c;

   public rft(rfy var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ref var3 = (ref)this.c;
         qwv var4 = new qwv();
         rfy var5 = this.b;
         rfs var6 = new rfs(var4, var3);
         this.a = 1;
         if (rfl.e((rfl)var5, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      throw new qsc();
   }

   public final que c(Object var1, que var2) {
      rft var3 = new rft(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
