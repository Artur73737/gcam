@qus(
   b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$1",
   c = "VirtualCameraManager.kt",
   d = "invokeSuspend",
   e = {76}
)
public final class up extends quw implements qvx {
   int a;
   final nwu b;

   public up(nwu var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         nwu var4 = this.b;
         this.a = 1;
         Object var2 = qzy.g(new vb(var4, (que)null), this);
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
      return new up(this.b, var2);
   }
}
