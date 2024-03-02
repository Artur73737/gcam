@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {103}
)
final class agn extends quw implements qvx {
   int a;
   final afd b;

   public agn(afd var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         afd var3 = this.b;
         this.a = 1;
         if (var3.i(this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new agn(this.b, var2);
   }
}
