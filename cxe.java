import android.animation.Animator.AnimatorListener;
import androidx.wear.widget.drawer.PageIndicatorView;

public final class cxe extends cwz {
   final PageIndicatorView a;

   public cxe(PageIndicatorView var1) {
      this.a = var1;
   }

   public final void a() {
      PageIndicatorView var1 = this.a;
      var1.c = false;
      var1.animate().alpha(0.0F).setListener((AnimatorListener)null).setStartDelay((long)this.a.a).setDuration((long)this.a.b).start();
   }
}
