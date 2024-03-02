@qus(
   b = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1",
   c = "Ripple.kt",
   d = "invokeSuspend",
   e = {136}
)
final class aqd extends quw implements qvx {
   int a;
   final aqq b;
   final lmk c;
   private Object d;

   public aqd(lmk var1, aqq var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var3 = (qzv)this.d;
         var1 = this.c.a;
         aqc var4 = new aqc(this.b, var3);
         this.a = 1;
         if (rfl.e((rfl)var1, var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      aqd var3 = new aqd(this.c, this.b, var2);
      var3.d = var1;
      return var3;
   }
}
