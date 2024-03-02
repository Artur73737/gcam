@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {241}
)
final class agh extends quw implements qvx {
   int a;
   final qvy b;
   final afd c;
   final bhw d;

   public agh(qvy var1, afd var2, bhw var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qvy var4 = this.b;
         afd var3 = this.c;
         bci var5 = bci.i(this.d.c);
         this.a = 1;
         if (var4.a(var3, var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new agh(this.b, this.c, this.d, var2);
   }
}
