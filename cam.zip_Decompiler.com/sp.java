import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.List;

public final class sp {
   public static final int a(OutputConfiguration var0) {
      var0.getClass();
      return var0.getSurfaceGroupId();
   }

   public static final void b(CameraDevice var0, List var1, StateCallback var2, Handler var3) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var0.createCaptureSessionByOutputConfigurations(var1, var2, var3);
   }

   public static final void c(CameraDevice var0, InputConfiguration var1, List var2, StateCallback var3, Handler var4) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var0.createReprocessableCaptureSessionByConfigurations(var1, var2, var3, var4);
   }

   public static boolean d(yy var0, long var1) {
      return var1 >= var0.a();
   }

   public static final int e(int var0, int var1) {
      return var0 >> var1 & 31;
   }

   public static final int f(int var0) {
      return var0 - 1 & -32;
   }

   public static final Object[] g(Object var0) {
      Object[] var1 = new Object[32];
      var1[0] = var0;
      return var1;
   }

   public static final void h(List var0, int var1) {
      int var2 = var0.size();
      if (var1 < 0 || var1 >= var2) {
         throw new IndexOutOfBoundsException(c.aI(var2, var1, "Index ", " is out of bounds. The list has ", " elements."));
      }
   }

   public static final void i(List var0, int var1, int var2) {
      int var3 = var0.size();
      if (var1 <= var2) {
         if (var1 >= 0) {
            if (var2 > var3) {
               throw new IndexOutOfBoundsException(c.aJ((byte)41, var3, var2, "toIndex (", ") is more than than the list size ("));
            }
         } else {
            throw new IndexOutOfBoundsException(c.aK(var1, "fromIndex (", ") is less than 0."));
         }
      } else {
         throw new IllegalArgumentException(c.aI(var2, var1, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
      }
   }
}
