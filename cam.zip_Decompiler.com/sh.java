import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;

public final class sh extends StateCallback {
   private final tl a;
   private final Handler b;
   private final qyq c;
   private final qyq d;
   private final tz e;
   private final blj f;

   public sh(tl var1, tz var2, ue var3, blj var4, Handler var5) {
      var5.getClass();
      super();
      this.a = var1;
      this.e = var2;
      this.f = var4;
      this.b = var5;
      this.c = qwp.i(var3);
      this.d = qwp.i((Object)null);
   }

   private final void a() {
      ue var1 = (ue)this.c.a((Object)null);
      if (var1 != null) {
         var1.f();
      }

   }

   private final void b() {
      this.a();
      this.e.f();
   }

   private final tk c(CameraCaptureSession var1, blj var2) {
      tk var3 = (tk)this.d.a;
      if (var3 == null) {
         Object var4;
         if (var1 instanceof CameraConstrainedHighSpeedCaptureSession) {
            var4 = new sb(this.a, (CameraConstrainedHighSpeedCaptureSession)var1, var2, this.b);
         } else {
            var4 = new sa(this.a, var1, var2, this.b);
         }

         if (this.d.d((Object)null, var4)) {
            return (tk)var4;
         } else {
            var4 = this.d.a;
            var4.getClass();
            return (tk)var4;
         }
      } else {
         return var3;
      }
   }

   public final void onActive(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" Active");
   }

   public final void onCaptureQueueEmpty(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" CaptureQueueEmpty");
      sg.a(var1, (StateCallback)null);
   }

   public final void onClosed(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" Closed");
      var3 = new StringBuilder();
      var3.append(var2);
      var3.append("#onClosed");
      Trace.beginSection(var2.toString().concat("#onClosed"));
      var2.c();
      Trace.endSection();
      this.b();
   }

   public final void onConfigureFailed(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" Configuration Failed");
      String var4 = var2.toString().concat(" Configuration Failed");
      Log.w(TRoaEYDrhZZT.hSWUnapSYfU, var4);
      var3 = new StringBuilder();
      var3.append(var2);
      var3.append("#onConfigureFailed");
      Trace.beginSection(var2.toString().concat("#onConfigureFailed"));
      var2.c();
      Trace.endSection();
      this.b();
   }

   public final void onConfigured(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      tk var4 = this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" Configured");
      var3 = new StringBuilder();
      var3.append(var2);
      var3.append("#configure");
      Trace.beginSection(var2.toString().concat("#configure"));
      var2.a(var4);
      Trace.endSection();
      this.a();
   }

   public final void onReady(CameraCaptureSession var1) {
      var1.getClass();
      tz var2 = this.e;
      this.c(var1, this.f);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append(" Ready");
   }
}
