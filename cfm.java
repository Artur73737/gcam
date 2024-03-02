import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

public final class cfm {
   static int a(MenuItem var0) {
      return var0.getAlphabeticModifiers();
   }

   static int b(MenuItem var0) {
      return var0.getNumericModifiers();
   }

   static ColorStateList c(MenuItem var0) {
      return var0.getIconTintList();
   }

   static Mode d(MenuItem var0) {
      return var0.getIconTintMode();
   }

   public static MenuItem e(MenuItem var0, char var1, int var2) {
      return var0.setAlphabeticShortcut(var1, var2);
   }

   public static MenuItem f(MenuItem var0, CharSequence var1) {
      return var0.setContentDescription(var1);
   }

   public static MenuItem g(MenuItem var0, ColorStateList var1) {
      return var0.setIconTintList(var1);
   }

   public static MenuItem h(MenuItem var0, Mode var1) {
      return var0.setIconTintMode(var1);
   }

   public static MenuItem i(MenuItem var0, char var1, int var2) {
      return var0.setNumericShortcut(var1, var2);
   }

   static MenuItem j(MenuItem var0, char var1, char var2, int var3, int var4) {
      return var0.setShortcut(var1, var2, var3, var4);
   }

   public static MenuItem k(MenuItem var0, CharSequence var1) {
      return var0.setTooltipText(var1);
   }

   static CharSequence l(MenuItem var0) {
      return var0.getContentDescription();
   }

   static CharSequence m(MenuItem var0) {
      return var0.getTooltipText();
   }
}
