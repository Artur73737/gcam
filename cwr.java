import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.wear.widget.CircledImageView;

public final class cwr implements Callback {
   final Object a;
   private final int b;

   public cwr(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void invalidateDrawable(Drawable var1) {
      switch(this.b) {
      case 0:
         ((CircledImageView)this.a).invalidate();
         return;
      default:
         ((cut)this.a).invalidateSelf();
      }
   }

   public final void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      switch(this.b) {
      default:
         ((cut)this.a).scheduleSelf(var2, var3);
      case 0:
      }
   }

   public final void unscheduleDrawable(Drawable var1, Runnable var2) {
      switch(this.b) {
      default:
         ((cut)this.a).unscheduleSelf(var2);
      case 0:
      }
   }
}
