import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public final class cur extends ConstantState {
   private final ConstantState a;

   public cur(ConstantState var1) {
      this.a = var1;
   }

   public final boolean canApplyTheme() {
      return this.a.canApplyTheme();
   }

   public final int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
   }

   public final Drawable newDrawable() {
      cut var1 = new cut();
      var1.e = this.a.newDrawable();
      var1.e.setCallback(var1.d);
      return var1;
   }

   public final Drawable newDrawable(Resources var1) {
      cut var2 = new cut();
      var2.e = this.a.newDrawable(var1);
      var2.e.setCallback(var2.d);
      return var2;
   }

   public final Drawable newDrawable(Resources var1, Theme var2) {
      cut var3 = new cut();
      var3.e = this.a.newDrawable(var1, var2);
      var3.e.setCallback(var3.d);
      return var3;
   }
}
