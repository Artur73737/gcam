import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.wear.ambient.WearableControllerProvider;
import java.lang.ref.WeakReference;

final class czk implements OnAttachStateChangeListener {
   private final czl a;
   private final WeakReference b;

   public czk(czl var1, Activity var2) {
      this.a = var1;
      this.b = new WeakReference(var2);
   }

   public final void onViewAttachedToWindow(View var1) {
      var1.getClass();
      var1.removeOnAttachStateChangeListener(this);
      Activity var2 = (Activity)this.b.get();
      IBinder var3 = WearableControllerProvider.a(var2);
      if (var2 != null) {
         if (var3 != null) {
            this.a.b(var3, var2);
         }
      }
   }

   public final void onViewDetachedFromWindow(View var1) {
      var1.getClass();
   }
}
