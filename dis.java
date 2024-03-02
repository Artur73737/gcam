import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Iterator;

public final class dis implements djg {
   final Object a;
   private final int b;

   public dis(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final void a(Object var1) {
      int var2;
      Object var4;
      Throwable var9;
      switch(this.b) {
      case 0:
         var9 = (Throwable)var1;
         var4 = this.a;
         var2 = ((LottieAnimationView)var4).b;
         if (var2 != 0) {
            ((AppCompatImageView)var4).setImageResource(var2);
         }

         LottieAnimationView.a.a(var9);
         return;
      case 1:
         div var5 = (div)var1;
         var4 = this.a;
         LottieAnimationView var7 = (LottieAnimationView)var4;
         var7.c.setCallback((Callback)var4);
         var7.g = var5;
         var7.d = true;
         boolean var3 = var7.c.q(var5);
         var7.d = false;
         var7.a();
         if (var7.getDrawable() == var7.c) {
            if (!var3) {
               return;
            }
         } else if (!var3) {
            var3 = var7.i();
            AppCompatImageView var10 = (AppCompatImageView)var4;
            var10.setImageDrawable((Drawable)null);
            var10.setImageDrawable(var7.c);
            if (var3) {
               var7.c.l();
            }
         }

         var2 = var7.getVisibility();
         var7.onVisibilityChanged((View)var4, var2);
         var7.requestLayout();
         Iterator var8 = var7.f.iterator();

         while(var8.hasNext()) {
            ((dji)var8.next()).a();
         }

         return;
      case 2:
         div var6 = (div)var1;
         diy.a.remove(this.a);
         return;
      default:
         var9 = (Throwable)var1;
         diy.a.remove(this.a);
      }
   }
}
