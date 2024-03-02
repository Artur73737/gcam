import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class cid {
   public static Interpolator a(Path var0) {
      return new PathInterpolator(var0);
   }

   static Interpolator b(float var0, float var1) {
      return new PathInterpolator(var0, var1);
   }

   public static Interpolator c(float var0, float var1, float var2, float var3) {
      return new PathInterpolator(var0, var1, var2, var3);
   }
}
