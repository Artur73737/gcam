@qus(
   b = "androidx.camera.camera2.pipe.compat.CaptureSessionState$finalizeSession$1",
   c = "CaptureSessionState.kt",
   d = "invokeSuspend",
   e = {353}
)
final class ty extends quw implements qvx {
   int a;
   final long b;
   final tz c;
   private Object d;

   public ty(long var1, tz var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var3;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var5 = (qzv)this.d;
         long var2 = this.b;
         StringBuilder var6 = new StringBuilder();
         var6.append("Finalizing ");
         var6.append(var5);
         var6.append(" in ");
         var6.append(var2);
         var6.append(" ms");
         var2 = this.b;
         this.a = 1;
         if (qzy.d(var2, this) == var4) {
            return var4;
         }
         break;
      default:
         pwm.bs(var1);
      }

      this.c.e(0L);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      ty var3 = new ty(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
