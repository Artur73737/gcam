import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

public final class cfu {
   static PointerIcon a(Bitmap var0, float var1, float var2) {
      return PointerIcon.create(var0, var1, var2);
   }

   public static PointerIcon b(Context var0, int var1) {
      return PointerIcon.getSystemIcon(var0, var1);
   }

   static PointerIcon c(Resources var0, int var1) {
      return PointerIcon.load(var0, var1);
   }
}
