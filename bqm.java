import android.view.View;
import android.view.View.OnAttachStateChangeListener;

public final class bqm implements OnAttachStateChangeListener {
   final View a;
   final auo b;

   public bqm(View var1, auo var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onViewAttachedToWindow(View var1) {
      var1.getClass();
   }

   public final void onViewDetachedFromWindow(View var1) {
      var1.getClass();
      this.a.removeOnAttachStateChangeListener(this);
      this.b.r();
   }
}
