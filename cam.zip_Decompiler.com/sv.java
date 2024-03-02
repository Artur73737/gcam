@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2CameraController$disconnectSessionAndCamera$deferred$1",
   c = "Camera2CameraController.kt",
   d = "invokeSuspend",
   e = {}
)
final class sv extends quw implements qvx {
   final tz a;
   final vd b;

   public sv(tz var1, vd var2, que var3) {
      super(2, var3);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      tz var3 = this.a;
      if (var3 != null) {
         var3.c();
      }

      vd var4 = this.b;
      if (var4 != null) {
         lh.b(var4);
         return qsn.a;
      } else {
         return null;
      }
   }

   public final que c(Object var1, que var2) {
      return new sv(this.a, this.b, var2);
   }
}
