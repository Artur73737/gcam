import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.util.Log;

public final class ta extends AvailabilityCallback {
   final rdo a;

   public ta(rdo var1) {
      this.a = var1;
   }

   public final void onCameraAccessPrioritiesChanged() {
      Object var1 = quy.z(this.a, rb.a);
      if (var1 instanceof rde) {
         rdf.b(var1);
         Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
      }

   }

   public final void onCameraAvailable(String var1) {
      var1.getClass();
      rdo var2 = this.a;
      qu.c(var1);
      Object var3 = quy.z(var2, new ra(var1));
      if (var3 instanceof rde) {
         rdf.b(var3);
         StringBuilder var4 = new StringBuilder();
         var4.append("Failed to emit CameraAvailable(");
         var4.append(var1);
         var4.append(')');
         Log.w("CXCP", var4.toString());
      }

   }
}
