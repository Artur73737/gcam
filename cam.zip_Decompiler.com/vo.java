import android.content.Context;
import android.os.Trace;

public final class vo {
   private final Context a;
   private volatile boolean b;

   public vo(Context var1) {
      this.a = var1;
   }

   public final boolean a() {
      if (!this.b) {
         Trace.beginSection("CXCP#checkCameraPermission");
         if (so.a(this.a, "android.permission.CAMERA") == 0) {
            this.b = true;
         }

         Trace.endSection();
      }

      return this.b;
   }
}
