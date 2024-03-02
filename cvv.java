import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;

public final class cvv extends AmbientLifecycleObserver$AmbientLifecycleCallback$_CC {
   final ViewPager2 a;

   public cvv(ViewPager2 var1) {
      this.a = var1;
   }

   public final void a(int var1) {
      if (var1 == 0) {
         this.a.f();
      }

   }

   public final void c(int var1) {
      ViewPager2 var2 = this.a;
      if (var2.b != var1) {
         var2.b = var1;
         ((cwb)var2.j).f();
      }

   }
}
