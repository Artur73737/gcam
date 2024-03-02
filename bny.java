import android.view.ViewTreeObserver.OnTouchModeChangeListener;

// $FF: synthetic class
public final class bny implements OnTouchModeChangeListener {
   public final boa a;

   // $FF: synthetic method
   public bny(boa var1) {
      this.a = var1;
   }

   public final void onTouchModeChanged(boolean var1) {
      dmx var3 = this.a.F;
      byte var2 = 1;
      if (!var1) {
         var2 = 2;
      }

      var3.f(var2);
   }
}
