import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

final class cxc extends ViewOutlineProvider {
   final boolean a;

   public cxc(boolean var1) {
      this.a = var1;
   }

   public final void getOutline(View var1, Outline var2) {
      if (this.a) {
         var2.setOval(0, 0, var1.getWidth(), var1.getHeight());
      } else {
         var2.setRect(0, 0, var1.getWidth(), var1.getHeight());
      }

      var2.setAlpha(0.0F);
   }
}
