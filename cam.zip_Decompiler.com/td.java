@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$close$1$1$1$2",
   c = "Camera2CaptureSequenceProcessor.kt",
   d = "invokeSuspend",
   e = {309}
)
final class td extends quw implements qvx {
   int a;
   final tc b;

   public td(tc var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         tc var4 = this.b;
         this.a = 1;
         Object var2 = var4.f.k(this);
         var1 = var2;
         if (var2 != qul.a) {
            var1 = qsn.a;
         }

         if (var1 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new td(this.b, var2);
   }
}
