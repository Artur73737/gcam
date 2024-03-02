@qus(
   b = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3",
   c = "Recomposer.kt",
   d = "invokeSuspend",
   e = {970}
)
final class auk extends quw implements qvx {
   int a;
   final qvy b;
   final atr c;
   private Object d;

   public auk(qvy var1, atr var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = (qzv)this.d;
         qvy var3 = this.b;
         atr var5 = this.c;
         this.a = 1;
         if (var3.a(var4, var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      auk var3 = new auk(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
