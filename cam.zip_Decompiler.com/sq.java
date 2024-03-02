import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import java.util.List;

public final class sq {
   public static final OutputConfiguration a(Size var0, Class var1) {
      var0.getClass();
      var1.getClass();
      return new OutputConfiguration(var0, var1);
   }

   public static final List b(OutputConfiguration var0) {
      var0.getClass();
      List var1 = var0.getSurfaces();
      var1.getClass();
      return var1;
   }

   public static final void c(OutputConfiguration var0, Surface var1) {
      var0.getClass();
      var1.getClass();
      var0.addSurface(var1);
   }

   public static final void d(OutputConfiguration var0) {
      var0.getClass();
      var0.enableSurfaceSharing();
   }

   public static final void e(CameraCaptureSession var0, List var1) {
      var0.getClass();
      var1.getClass();
      var0.finalizeOutputConfigurations(var1);
   }

   public static final zx f(float var0, float var1, Object var2) {
      return new zx(var0, var1, var2);
   }

   public static final aak g(int var0, int var1, zm var2) {
      var2.getClass();
      return new aak(var0, var1, var2);
   }

   // $FF: synthetic method
   public static zx h(float var0, Object var1, int var2) {
      float var3;
      if (1 != (var2 & 1)) {
         var3 = 0.0F;
      } else {
         var3 = 1.0F;
      }

      if ((var2 & 2) != 0) {
         var0 = 1500.0F;
      }

      if ((var2 & 4) != 0) {
         var1 = null;
      }

      return f(var3, var0, var1);
   }

   // $FF: synthetic method
   public static aak i(int var0, int var1, zm var2, int var3) {
      if ((var3 & 4) != 0) {
         var2 = zo.a;
      }

      if ((var3 & 2) != 0) {
         var1 = 0;
      }

      if (1 == (var3 & 1)) {
         var0 = 300;
      }

      return g(var0, var1, var2);
   }

   public static final int j(int var0, int var1) {
      return var0 >> var1 & 31;
   }

   public static final Object[] k(Object[] var0, int var1, Object var2, Object var3) {
      int var4 = var0.length;
      Object[] var5 = new Object[var4 + 2];
      pwm.bn(var0, var5, 0, 0, var1, 6);
      pwm.bh(var0, var5, var1 + 2, var1, var4);
      var5[var1] = var2;
      var5[var1 + 1] = var3;
      return var5;
   }

   public static final Object[] l(Object[] var0, int var1) {
      int var2 = var0.length;
      Object[] var3 = new Object[var2 - 2];
      pwm.bn(var0, var3, 0, 0, var1, 6);
      pwm.bh(var0, var3, var1, var1 + 2, var2);
      return var3;
   }

   public static final Object[] m(Object[] var0, int var1) {
      int var2 = var0.length;
      Object[] var3 = new Object[var2 - 1];
      pwm.bn(var0, var3, 0, 0, var1, 6);
      pwm.bh(var0, var3, var1, var1 + 1, var2);
      return var3;
   }
}
