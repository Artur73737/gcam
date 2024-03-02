import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class cy extends EpicenterCallback {
   final Rect a;

   public cy(Rect var1) {
      this.a = var1;
   }

   public final Rect onGetEpicenter(Transition var1) {
      return this.a;
   }
}
