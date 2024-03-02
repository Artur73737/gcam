import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.WeakHashMap;

final class cfv implements OnGlobalLayoutListener, OnAttachStateChangeListener {
   public final WeakHashMap a = new WeakHashMap();

   public cfv() {
   }

   public final void a(View var1) {
      var1.getViewTreeObserver().addOnGlobalLayoutListener(this);
   }

   public final void onGlobalLayout() {
   }

   public final void onViewAttachedToWindow(View var1) {
      this.a(var1);
   }

   public final void onViewDetachedFromWindow(View var1) {
   }
}
