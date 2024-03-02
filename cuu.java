import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

abstract class cuu extends Drawable {
   public Drawable e;

   public cuu() {
   }

   public void applyTheme(Theme var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         cdm.b(var2, var1);
      }

   }

   public final void clearColorFilter() {
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.clearColorFilter();
      } else {
         super.clearColorFilter();
      }
   }

   public final Drawable getCurrent() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getCurrent() : super.getCurrent();
   }

   public final int getMinimumHeight() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getMinimumHeight() : super.getMinimumHeight();
   }

   public final int getMinimumWidth() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getMinimumWidth() : super.getMinimumWidth();
   }

   public final boolean getPadding(Rect var1) {
      Drawable var2 = this.e;
      return var2 != null ? var2.getPadding(var1) : super.getPadding(var1);
   }

   public final int[] getState() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getState() : super.getState();
   }

   public final Region getTransparentRegion() {
      Drawable var1 = this.e;
      return var1 != null ? var1.getTransparentRegion() : super.getTransparentRegion();
   }

   public final void jumpToCurrentState() {
      Drawable var1 = this.e;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

   }

   protected void onBoundsChange(Rect var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setBounds(var1);
      } else {
         super.onBoundsChange(var1);
      }
   }

   protected boolean onLevelChange(int var1) {
      Drawable var2 = this.e;
      return var2 != null ? var2.setLevel(var1) : super.onLevelChange(var1);
   }

   public final void setChangingConfigurations(int var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setChangingConfigurations(var1);
      } else {
         super.setChangingConfigurations(var1);
      }
   }

   public final void setColorFilter(int var1, Mode var2) {
      Drawable var3 = this.e;
      if (var3 != null) {
         var3.setColorFilter(var1, var2);
      } else {
         super.setColorFilter(var1, var2);
      }
   }

   public final void setFilterBitmap(boolean var1) {
      Drawable var2 = this.e;
      if (var2 != null) {
         var2.setFilterBitmap(var1);
      }

   }

   public final void setHotspot(float var1, float var2) {
      Drawable var3 = this.e;
      if (var3 != null) {
         cdm.d(var3, var1, var2);
      }

   }

   public final void setHotspotBounds(int var1, int var2, int var3, int var4) {
      Drawable var5 = this.e;
      if (var5 != null) {
         cdm.e(var5, var1, var2, var3, var4);
      }

   }

   public final boolean setState(int[] var1) {
      Drawable var2 = this.e;
      return var2 != null ? var2.setState(var1) : super.setState(var1);
   }
}
