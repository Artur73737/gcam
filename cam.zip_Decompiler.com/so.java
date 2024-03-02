import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

public final class so {
   public static final int a(Context var0, String var1) {
      var0.getClass();
      var1.getClass();
      return var0.checkSelfPermission(var1);
   }

   public static final Builder b(CameraDevice var0, TotalCaptureResult var1) {
      var0.getClass();
      var1.getClass();
      Builder var2 = var0.createReprocessCaptureRequest(var1);
      var2.getClass();
      return var2;
   }

   public static final InputConfiguration c(int var0, int var1, int var2) {
      return new InputConfiguration(var0, var1, var2);
   }

   public static final Surface d(CameraCaptureSession var0) {
      var0.getClass();
      return var0.getInputSurface();
   }

   public static final void e(CameraDevice var0, List var1, StateCallback var2, Handler var3) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var0.createConstrainedHighSpeedCaptureSession(var1, var2, var3);
   }

   public static final void f(CameraDevice var0, InputConfiguration var1, List var2, StateCallback var3, Handler var4) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var0.createReprocessableCaptureSession(var1, var2, var3, var4);
   }

   public static final boolean g(CameraCaptureSession var0) {
      var0.getClass();
      return var0.isReprocessable();
   }

   public static final void h(auw var0, asf var1, int var2) {
      while(true) {
         int var3 = var0.p;
         if (var2 > var3 && var2 < var0.g || var3 == 0 && var2 == 0) {
            return;
         }

         var0.C();
         if (var0.L(var0.p)) {
            var1.f();
         }

         var0.P();
      }
   }

   public static final att i(Object var0, avf var1) {
      return new aub(var0, var1);
   }

   public static final azw j() {
      return new azw();
   }

   public static final azz k() {
      return new azz();
   }

   public static final avi l(Object var0, asm var1) {
      var1.u(-1058319986);
      var1.u(-492369756);
      Object var3 = var1.f();
      Object var2 = var3;
      if (var3 == asl.a) {
         var2 = sg.d(var0);
         var1.w(var2);
      }

      var1.n();
      att var4 = (att)var2;
      var4.b(var0);
      var1.n();
      return var4;
   }

   public static final lmk m(bxr var0) {
      var0.getClass();
      return dp.p(new lmk(var0));
   }
}
