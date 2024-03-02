@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {99}
)
public final class agz extends quw implements qvx {
   int a;
   final qvy b;
   final qvt c;
   final bil d;
   private Object e;

   public agz(bil var1, qvy var2, qvt var3, que var4) {
      super(2, var4);
      this.d = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var3 = (qzv)this.e;
         afd var4 = new afd(this.d);
         bil var5 = this.d;
         agy var6 = new agy(var3, this.b, this.c, var4, (que)null);
         this.a = 1;
         if (et.i(var5, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      agz var3 = new agz(this.d, this.b, this.c, var2);
      var3.e = var1;
      return var3;
   }
}
