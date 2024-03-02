@qus(
   b = "androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1",
   c = "VirtualCamera.kt",
   d = "invokeSuspend",
   e = {180}
)
final class vc extends quw implements qvx {
   int a;
   final ree b;
   final vd c;

   public vc(ree var1, vd var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var4 = this.b;
         wv var3 = new wv(this.c, 1);
         this.a = 1;
         if (var4.gY(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new vc(this.b, this.c, var2);
   }
}
