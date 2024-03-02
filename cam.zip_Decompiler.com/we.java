import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.List;

public final class we {
   private static final List a;
   private static final List b;
   private static final List c;

   static {
      Integer var0 = 2;
      Integer var3 = 4;
      Integer var6 = 3;
      pwm.aS(new Integer[]{var0, var3, var6});
      pwm.aS(new Integer[]{var0, var6});
      Integer var4 = 6;
      Integer var1 = 5;
      pwm.aS(new Integer[]{var0, var4, var3, var1});
      pwm.ak(var6);
      pwm.ak(var6);
      List var2 = pwm.aS(new Integer[]{var3, var1});
      a = var2;
      List var5 = pwm.aS(new Integer[]{var0, var3, var6});
      b = var5;
      Key var7 = CaptureRequest.CONTROL_AF_TRIGGER;
      var1 = 1;
      pwm.ab(pwm.bq(var7, var1));
      pwm.ab(pwm.bq(CaptureRequest.CONTROL_AF_TRIGGER, var0));
      pwm.ad(new qsg[]{pwm.bq(CaptureRequest.CONTROL_AF_TRIGGER, var1), pwm.bq(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, var1)});
      rw var9 = new rw();
      (new qzg()).O(var9);
      Integer var10 = 0;
      pwm.aS(new Integer[]{var10, var1, var0, var3});
      List var8 = pwm.aS(new Integer[]{var10, var6, var1, var0, var4});
      c = var8;
      pwm.aS(new Integer[]{var10, var1, var0});
      pwm.ad(new qsg[]{pwm.bq(CaptureResult.CONTROL_AE_STATE, var5), pwm.bq(CaptureResult.CONTROL_AF_STATE, var2)});
      pwm.ad(new qsg[]{pwm.bq(CaptureRequest.CONTROL_AF_TRIGGER, var0), pwm.bq(CaptureRequest.CONTROL_AE_LOCK, true)});
      pwm.ab(pwm.bq(CaptureRequest.CONTROL_AE_LOCK, false));
      pwm.ad(new qsg[]{pwm.bq(CaptureRequest.CONTROL_AF_TRIGGER, var0), pwm.bq(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, var0)});
      pwm.ab(pwm.bq(CaptureResult.CONTROL_AF_STATE, var8));
   }
}
