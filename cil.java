import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;

public final class cil {
   public static ColorStateList a(ImageView var0) {
      return var0.getImageTintList();
   }

   public static Mode b(ImageView var0) {
      return var0.getImageTintMode();
   }

   public static void c(ImageView var0, ColorStateList var1) {
      var0.setImageTintList(var1);
   }

   public static void d(ImageView var0, Mode var1) {
      var0.setImageTintMode(var1);
   }

   public static final void e(View var0) {
      Iterator var1 = qwo.e(new cgs(var0, (que)null)).a();

      while(var1.hasNext()) {
         f((View)var1.next()).K();
      }

   }

   public static final eze f(View var0) {
      eze var2 = (eze)var0.getTag(2131428045);
      eze var1 = var2;
      if (var2 == null) {
         var1 = new eze((short[])null, (byte[])null);
         var0.setTag(2131428045, var1);
      }

      return var1;
   }
}
