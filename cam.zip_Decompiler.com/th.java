import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Locale;

@qus(
   b = "androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$3",
   c = "Camera2DeviceCloser.kt",
   d = "invokeSuspend",
   e = {}
)
public final class th extends quw implements qvt {
   final CameraDevice a;

   public th(CameraDevice var1, que var2) {
      super(1, var2);
      this.a = var1;
   }

   public final Object b(Object var1) {
      qul var8 = qul.a;
      pwm.bs(var1);
      CameraDevice var11 = this.a;
      long var6 = SystemClock.elapsedRealtimeNanos();
      var11.getId();
      StringBuilder var12 = new StringBuilder();
      var12.append("CameraDevice-");
      var12.append(var11.getId());
      var12.append("#close");
      String var13 = var12.toString();

      try {
         Trace.beginSection(var13);
         var11.close();
      } finally {
         Trace.endSection();
      }

      long var4 = SystemClock.elapsedRealtimeNanos();
      var11.getId();
      double var2 = (double)(var4 - var6);
      Double.isNaN(var2);
      String.format((Locale)null, "%.3f ms", Arrays.copyOf(new Object[]{var2 / 1000000.0D}, 1)).getClass();
      return qsn.a;
   }
}
