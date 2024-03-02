@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {232}
)
public final class agl extends quw implements qvx {
   int a;
   final qvy b;
   final qvt c;
   final afd d;
   final bil e;
   private Object f;

   public agl(bil var1, qvy var2, qvt var3, afd var4, que var5) {
      super(2, var5);
      this.e = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var3 = (qzv)this.f;
         bil var4 = this.e;
         agk var5 = new agk(var3, this.b, this.c, this.d, (que)null);
         this.a = 1;
         if (et.i(var4, var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      agl var3 = new agl(this.e, this.b, this.c, this.d, var2);
      var3.f = var1;
      return var3;
   }
}
