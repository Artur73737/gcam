import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.CompoundButton;

public final class cii {
   public static ColorStateList a(CompoundButton var0) {
      return var0.getButtonTintList();
   }

   public static Mode b(CompoundButton var0) {
      return var0.getButtonTintMode();
   }

   public static void c(CompoundButton var0, ColorStateList var1) {
      var0.setButtonTintList(var1);
   }

   public static void d(CompoundButton var0, Mode var1) {
      var0.setButtonTintMode(var1);
   }
}
