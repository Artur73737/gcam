@qus(
   b = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2",
   c = "Share.kt",
   d = "invokeSuspend",
   e = {227}
)
final class rfd extends quw implements qvx {
   int a;
   Object b;
   final ree c;
   final rfg d;
   final Object e;

   public rfd(ree var1, rfg var2, Object var3, que var4) {
      super(2, var4);
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rfo var4 = (rfo)this.b;
         rfo var3 = rfo.a;
         switch(var4.ordinal()) {
         case 0:
            ree var6 = this.c;
            rfg var5 = this.d;
            this.a = 1;
            if (var6.gY(var5, this) == var2) {
               return var2;
            }

            return qsn.a;
         case 1:
         default:
            return qsn.a;
         case 2:
            var1 = this.e;
            if (var1 == rfm.a) {
               throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
            }

            ((rga)this.d).d(var1);
            return qsn.a;
         }
      default:
         pwm.bs(var1);
         return qsn.a;
      }
   }

   public final que c(Object var1, que var2) {
      rfd var3 = new rfd(this.c, this.d, this.e, var2);
      var3.b = var1;
      return var3;
   }
}
