import android.view.View;
import android.view.WindowInsets;
import android.view.View.OnApplyWindowInsetsListener;

final class cgc implements OnApplyWindowInsetsListener {
   final cfs a;

   public cgc(View var1, cfs var2) {
      this.a = var2;
   }

   public WindowInsets onApplyWindowInsets(View var1, WindowInsets var2) {
      cho var3 = cho.n(var2, var1);
      return this.a.a(var1, var3).e();
   }
}
