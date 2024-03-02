import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cvb extends ConstantState {
   private final ConstantState a;

   public cvb(ConstantState var1) {
      this.a = var1;
   }

   public final boolean canApplyTheme() {
      return this.a.canApplyTheme();
   }

   public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
   }

   public final Drawable newDrawable() {
      cvc var1 = new cvc();
      var1.e = (VectorDrawable)this.a.newDrawable();
      return var1;
   }

   public final Drawable newDrawable(Resources var1) {
      cvc var2 = new cvc();
      var2.e = (VectorDrawable)this.a.newDrawable(var1);
      return var2;
   }

   public final Drawable newDrawable(Resources var1, Theme var2) {
      cvc var3 = new cvc();
      var3.e = (VectorDrawable)this.a.newDrawable(var1, var2);
      return var3;
   }
}
