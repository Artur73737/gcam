import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public final class cit {
   static int a(View var0) {
      return var0.getLayoutDirection();
   }

   static int b(View var0) {
      return var0.getTextDirection();
   }

   static Locale c(TextView var0) {
      return var0.getTextLocale();
   }

   static void d(TextView var0, Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      var0.setCompoundDrawablesRelative(var1, var2, var3, var4);
   }

   static void e(TextView var0, int var1, int var2, int var3, int var4) {
      var0.setCompoundDrawablesRelativeWithIntrinsicBounds(var1, var2, var3, var4);
   }

   static void f(TextView var0, Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      var0.setCompoundDrawablesRelativeWithIntrinsicBounds(var1, var2, var3, var4);
   }

   static void g(View var0, int var1) {
      var0.setTextDirection(var1);
   }

   public static Drawable[] h(TextView var0) {
      return var0.getCompoundDrawablesRelative();
   }

   public static final clw i(clw var0, clw var1) {
      var0.getClass();
      return var1 != null && var1.compareTo(var0) < 0 ? var1 : var0;
   }
}
