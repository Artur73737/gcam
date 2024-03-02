import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

public final class aqy extends RippleDrawable {
   public bcy a;
   public Integer b;
   private final boolean c;
   private boolean d;

   public aqy(boolean var1) {
      ColorStateList var3 = ColorStateList.valueOf(-16777216);
      ColorDrawable var2;
      if (var1) {
         var2 = new ColorDrawable(-1);
      } else {
         var2 = null;
      }

      super(var3, (Drawable)null, var2);
      this.c = var1;
   }

   public final Rect getDirtyBounds() {
      if (!this.c) {
         this.d = true;
      }

      Rect var1 = super.getDirtyBounds();
      var1.getClass();
      this.d = false;
      return var1;
   }

   public final boolean isProjected() {
      return this.d;
   }
}
