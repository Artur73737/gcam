import android.graphics.Path;
import android.os.Trace;

public final class csr {
   public static boolean a() {
      return Trace.isEnabled();
   }

   public static Path b(float var0, float var1, float var2, float var3) {
      Path var4 = new Path();
      var4.moveTo(var0, var1);
      var4.lineTo(var2, var3);
      return var4;
   }
}
