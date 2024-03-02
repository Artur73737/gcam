import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;

public final class cvw extends AmbientLifecycleObserver$AmbientLifecycleCallback$_CC {
   final ViewPager2 a;

   public cvw(ViewPager2 var1) {
      this.a = var1;
   }

   public final void c(int var1) {
      this.a.clearFocus();
      if (this.a.hasFocus()) {
         this.a.e.requestFocus(2);
      }

   }
}
