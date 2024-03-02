import android.hardware.camera2.CameraManager;

@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$awaitAvailableCamera$2",
   c = "RetryingCameraStateOpener.kt",
   d = "invokeSuspend",
   e = {104}
)
public final class st extends quw implements qvx {
   int a;
   final String b;
   final bpe c;

   public st(bpe var1, String var2, que var3) {
      super(2, var3);
      this.c = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         bpe var2 = this.c;
         String var4 = this.b;
         this.a = 1;
         qza var6 = new qza(quy.h(this), 1);
         var6.r();
         su var8 = new su(var4, var6);
         CameraManager var5 = (CameraManager)((qrz)var2.a).get();
         var5.getClass();
         sr.i(var5, ((bwc)var2.b).f(), var8);
         var6.s(new zy(var5, var8, 1));
         Object var7 = var6.c();
         var1 = var7;
         if (var7 == var3) {
            return var3;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return var1;
   }

   public final que c(Object var1, que var2) {
      return new st(this.c, this.b, var2);
   }
}
