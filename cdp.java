import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

final class cdp {
   static Drawable a(Drawable var0, Drawable var1) {
      return new AdaptiveIconDrawable(var0, var1);
   }

   static Icon b(Bitmap var0) {
      return Icon.createWithAdaptiveBitmap(var0);
   }
}
