import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.view.Surface;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class sr {
   public static final int a(OutputConfiguration var0) {
      var0.getClass();
      return var0.getMaxSharedSurfaceCount();
   }

   public static final SessionConfiguration b(int var0, List var1, Executor var2, StateCallback var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      return new SessionConfiguration(var0, var1, var2, var3);
   }

   public static final List c(CameraCharacteristics var0) {
      var0.getClass();
      return var0.getAvailablePhysicalCameraRequestKeys();
   }

   public static final List d(CameraCharacteristics var0) {
      var0.getClass();
      return var0.getAvailableSessionKeys();
   }

   public static final Map e(TotalCaptureResult var0) {
      var0.getClass();
      return var0.getPhysicalCameraResults();
   }

   public static final Set f(CameraCharacteristics var0) {
      var0.getClass();
      Set var1 = var0.getPhysicalCameraIds();
      var1.getClass();
      return var1;
   }

   public static final void g(CameraDevice var0, SessionConfiguration var1) {
      var0.getClass();
      var1.getClass();
      var0.createCaptureSession(var1);
   }

   public static final void h(CameraManager var0, String var1, Executor var2, android.hardware.camera2.CameraDevice.StateCallback var3) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var0.openCamera(var1, var2, var3);
   }

   public static final void i(CameraManager var0, Executor var1, AvailabilityCallback var2) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var0.registerAvailabilityCallback(var1, var2);
   }

   public static final void j(OutputConfiguration var0, Surface var1) {
      var0.getClass();
      var1.getClass();
      var0.removeSurface(var1);
   }

   public static final void k(SessionConfiguration var0, InputConfiguration var1) {
      var0.getClass();
      var1.getClass();
      var0.setInputConfiguration(var1);
   }

   public static final void l(OutputConfiguration var0, String var1) {
      var0.getClass();
      var0.setPhysicalCameraId(var1);
   }

   public static final void m(SessionConfiguration var0, CaptureRequest var1) {
      var0.getClass();
      var1.getClass();
      var0.setSessionParameters(var1);
   }

   public static final avi n(cmk var0, Object var1, asm var2) {
      var2.u(411178300);
      cmc var4 = (cmc)var2.e(bou.d);
      var2.u(-492369756);
      Object var3 = var2.f();
      if (var3 == asl.a) {
         if (var0.f != cmk.a) {
            var1 = var0.a();
         }

         var1 = sg.d(var1);
         var2.w(var1);
      } else {
         var1 = var3;
      }

      var2.n();
      att var5 = (att)var1;
      atj.b(var0, var4, new adb(var0, var4, var5, 7, (byte[])null), var2);
      var2.n();
      return var5;
   }

   public static final int o(int var0, int var1) {
      return var0 << var1 * 3 + 1;
   }

   public static final int p(int var0) {
      return o(2, var0);
   }

   public static final int q(int var0) {
      return o(1, var0);
   }

   public static final ayt r(int var0, boolean var1, Object var2) {
      ayt var3 = new ayt(var0, var1);
      var3.f(var2);
      return var3;
   }

   public static final boolean s(aug var0, aug var1) {
      return var0 == null || !var0.j() || c.E(var0, var1) || c.E(var0.g, var1.g);
   }

   public static final ayt t(asm var0, int var1, Object var2) {
      var0.getClass();
      var0.u(var1);
      Object var3 = var0.f();
      ayt var4;
      if (var3 == asl.a) {
         var4 = new ayt(var1, true);
         var0.w(var4);
      } else {
         var3.getClass();
         var4 = (ayt)var3;
      }

      var4.f(var2);
      var0.n();
      return var4;
   }

   public static final zh u(bpe var0, Object var1) {
      zh var2 = (zh)((qvt)var0.a).eo(var1);
      var2.d();
      return var2;
   }
}
