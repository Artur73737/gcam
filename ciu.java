import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.TextView;

public final class ciu {
   static int a(TextView var0) {
      return var0.getBreakStrategy();
   }

   static int b(TextView var0) {
      return var0.getHyphenationFrequency();
   }

   static ColorStateList c(TextView var0) {
      return var0.getCompoundDrawableTintList();
   }

   static Mode d(TextView var0) {
      return var0.getCompoundDrawableTintMode();
   }

   static void e(TextView var0, int var1) {
      var0.setBreakStrategy(var1);
   }

   public static void f(TextView var0, ColorStateList var1) {
      var0.setCompoundDrawableTintList(var1);
   }

   public static void g(TextView var0, Mode var1) {
      var0.setCompoundDrawableTintMode(var1);
   }

   static void h(TextView var0, int var1) {
      var0.setHyphenationFrequency(var1);
   }

   public static final void i(Activity var0, clv var1) {
      var1.getClass();
      if (var0 instanceof cme) {
         ((cme)var0).a().b(var1);
      } else {
         if (var0 instanceof cmc) {
            clx var2 = ((cmc)var0).getLifecycle();
            if (var2 instanceof clx) {
               var2.b(var1);
            }
         }

      }
   }
}
