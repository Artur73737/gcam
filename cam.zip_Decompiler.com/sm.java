import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

public final class sm implements rz {
   private final OutputConfiguration a;
   private final Surface b;

   public sm(OutputConfiguration var1) {
      this.a = var1;
      this.b = var1.getSurface();
   }

   public final Object a(qxs var1) {
      return c.E(var1, qxa.a(OutputConfiguration.class)) ? this.a : null;
   }

   public final void b(Surface var1) {
      var1.getClass();
      sq.c(this.a, var1);
   }

   public final String toString() {
      return this.a.toString();
   }
}
