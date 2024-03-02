import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

final class chd {
   public static Field a;
   public static Field b;
   public static Field c;
   public static boolean d;

   static {
      try {
         Field var0 = View.class.getDeclaredField("mAttachInfo");
         a = var0;
         var0.setAccessible(true);
         Class var3 = Class.forName("android.view.View$AttachInfo");
         Field var1 = var3.getDeclaredField("mStableInsets");
         b = var1;
         var1.setAccessible(true);
         var0 = var3.getDeclaredField("mContentInsets");
         c = var0;
         var0.setAccessible(true);
         d = true;
      } catch (ReflectiveOperationException var2) {
         Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo ".concat(String.valueOf(var2.getMessage())), var2);
      }
   }
}
