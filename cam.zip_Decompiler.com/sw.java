@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2CameraController$start$1$4",
   c = "Camera2CameraController.kt",
   d = "invokeSuspend",
   e = {129}
)
final class sw extends quw implements qvx {
   int a;
   final sx b;

   public sw(sx var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         sx var5 = this.b;
         this.a = 1;
         qwz var2 = new qwz();
         var1 = var5.b;
         synchronized(var1){}

         vd var4;
         try {
            var4 = var5.f;
            var2.a = var5.d;
         } finally {
            ;
         }

         if (var4 != null && var2.a != null) {
            Object var8 = var4.f.gY(new uq(var2, var5, 1, (byte[])null), this);
            var1 = var8;
            if (var8 != qul.a) {
               var1 = qsn.a;
            }
         } else {
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
      return new sw(this.b, var2);
   }
}
