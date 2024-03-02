import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatus$1",
   c = "Camera2CameraStatusMonitor.kt",
   d = "invokeSuspend",
   e = {71}
)
public final class tb extends quw implements qvx {
   int a;
   final qrz b;
   final bwc c;
   private Object d;

   public tb(qrz var1, bwc var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rdo var5 = (rdo)this.d;
         CameraManager var3 = (CameraManager)this.b.get();
         ta var4 = new ta(var5);
         var3.getClass();
         sr.i(var3, (Executor)this.c.c, var4);
         us var6 = new us(var3, var4, 1, (byte[])null);
         this.a = 1;
         if (quy.x(var5, var6, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      tb var3 = new tb(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
