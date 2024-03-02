@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {115}
)
final class agp extends quv implements qvx {
   int a;
   private Object b;

   public agp(que var1) {
      super(var1);
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bij var4 = (bij)this.b;
         this.a = 1;
         Object var2 = ahb.e(var4, this);
         var1 = var2;
         if (var2 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return var1;
   }

   public final que c(Object var1, que var2) {
      agp var3 = new agp(var2);
      var3.b = var1;
      return var3;
   }
}
