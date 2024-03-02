import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

public final class cds extends cdt {
   public cds(Resources var1, Bitmap var2) {
      super(var1, var2);
   }

   public final void a(int var1, int var2, int var3, Rect var4, Rect var5) {
      Gravity.apply(var1, var2, var3, var4, var5, 0);
   }

   public final void getOutline(Outline var1) {
      this.b();
      var1.setRoundRect(this.e, super.d);
   }
}
