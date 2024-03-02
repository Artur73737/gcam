import android.util.Log;
import com.google.android.apps.camera.facemetadata.jni.Mc.gREaEL;
import java.util.Map;

public final class sl implements tt {
   private final ws a;
   private final qr b;
   private final int c;

   public sl(bwc var1, qr var2, ws var3, fwf var4, int var5) {
      this.c = var5;
      var1.getClass();
      var4.getClass();
      super();
      this.b = var2;
      this.a = var3;
   }

   public sl(bwc var1, ws var2, qr var3, fwf var4, int var5) {
      this.c = var5;
      var1.getClass();
      var4.getClass();
      super();
      this.a = var2;
      this.b = var3;
   }

   public final Map a(tl var1, Map var2, tz var3) {
      int var4 = this.c;
      String var5 = gREaEL.WbZNft;
      qr var6;
      StringBuilder var10;
      switch(var4) {
      case 0:
         ug var8 = kr.b(this.b, this.a, var2);
         qtg var7;
         if (var8.a.isEmpty()) {
            var10 = new StringBuilder();
            var10.append("Failed to create OutputConfigurations for ");
            var6 = this.b;
            var10.append(var6);
            Log.w(var5, "Failed to create OutputConfigurations for ".concat(var6.toString()));
            var3.f();
            var7 = qtg.a;
         } else {
            if (!var1.f(var8.a, var3)) {
               var10 = new StringBuilder();
               var10.append("Failed to create capture session from ");
               var10.append(var1);
               var10.append(" for ");
               var10.append(var3);
               var10.append('!');
               Log.w(var5, var10.toString());
               var3.c();
            }

            var7 = qtg.a;
         }

         return var7;
      default:
         if (c.E(this.b.f, qt.c)) {
            if (kr.b(this.b, this.a, var2).a.isEmpty()) {
               var10 = new StringBuilder();
               var10.append("Failed to create OutputConfigurations for ");
               var6 = this.b;
               var10.append(var6);
               Log.w(var5, "Failed to create OutputConfigurations for ".concat(var6.toString()));
               var3.f();
               return qtg.a;
            } else {
               var4 = tm.a;
               throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            }
         } else {
            StringBuilder var9 = new StringBuilder();
            var9.append("Unsupported session mode: ");
            var9.append(this.b.f);
            var9.append(" for Extension CameraGraph");
            throw new IllegalArgumentException(var9.toString());
         }
      }
   }
}
