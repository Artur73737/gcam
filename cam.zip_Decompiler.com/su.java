import android.hardware.camera2.CameraManager.AvailabilityCallback;

public final class su extends AvailabilityCallback {
   final String a;
   final qza b;
   private final qyn c;

   public su(String var1, qza var2) {
      this.a = var1;
      this.b = var2;
      this.c = qwp.f(false);
   }

   public final void onCameraAccessPrioritiesChanged() {
      if (this.c.b()) {
         this.b.gP(true);
      }

   }

   public final void onCameraAvailable(String var1) {
      var1.getClass();
      if (c.E(var1, this.a)) {
         var1 = this.a;
         StringBuilder var2 = new StringBuilder();
         var2.append(qu.b(var1));
         var2.append(" is now available.");
         if (this.c.b()) {
            this.b.gP(true);
         }
      }

   }
}
