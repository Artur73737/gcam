@qus(
   b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$ActiveCamera$1",
   c = "VirtualCameraManager.kt",
   d = "invokeSuspend",
   e = {337}
)
final class ur extends quw implements qvx {
   int a;
   final ut b;
   private Object c;

   public ur(ut var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var3 = (qzv)this.c;
         ut var4 = this.b;
         rga var5 = var4.a.c;
         uq var6 = new uq(var4, var3, 0);
         this.a = 1;
         if (var5.gY(var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      throw new qsc();
   }

   public final que c(Object var1, que var2) {
      ur var3 = new ur(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
