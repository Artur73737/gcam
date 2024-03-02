import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.camcorder.ui.stabilization.StabilizationUi;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;
import com.google.android.apps.camera.ui.cuttlefish.CountdownSliderUi;

// $FF: synthetic class
public final class cgv implements AnimatorUpdateListener {
   public final Object a;
   private final int b;

   public cgv(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public cgv(Object var1, int var2, byte[] var3) {
      this.b = var2;
      this.a = var1;
   }

   public final void onAnimationUpdate(ValueAnimator var1) {
      float var2;
      int var3;
      Object var4;
      kja var5;
      CatcherView var6;
      jnz var9;
      switch(this.b) {
      case 0:
         ((View)((fp)((AmbientMode$AmbientController)this.a).a).c.getParent()).invalidate();
         return;
      case 1:
         var2 = (Float)var1.getAnimatedValue();
         StateListDrawable var8 = ((km)this.a).b;
         var3 = (int)(var2 * 255.0F);
         var8.setAlpha(var3);
         ((km)this.a).c.setAlpha(var3);
         ((km)this.a).o();
         return;
      case 2:
         dje var10 = (dje)this.a;
         dmm var7 = var10.i;
         if (var7 != null) {
            var7.l(var10.b.c());
         }

         return;
      case 3:
         ((AutoTimerIndicatorView)this.a).invalidate();
         return;
      case 4:
         var4 = this.a;
         var2 = (Float)var1.getAnimatedValue();
         ((StabilizationUi)var4).b.setAlpha(var2);
         return;
      case 5:
         var2 = (Float)var1.getAnimatedValue();
         ((gba)((eyz)this.a).c).c(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 6:
         var2 = (Float)var1.getAnimatedValue();
         ((gba)((eyz)this.a).c).d(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 7:
         var2 = (Float)var1.getAnimatedValue();
         ((gay)((eyz)this.a).a).l(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 8:
         var2 = (Float)var1.getAnimatedValue();
         ((gay)((eyz)this.a).a).m(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 9:
         var2 = (Float)var1.getAnimatedValue();
         ((gay)((eyz)this.a).a).n(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 10:
         var2 = (Float)var1.getAnimatedValue();
         ((FocusIndicatorAccessoryView)((eyz)this.a).b).d(var2);
         ((FocusIndicatorAccessoryView)((eyz)this.a).b).invalidate();
         ((gay)((eyz)this.a).a).m(var2);
         ((FocusIndicatorRingView)((eyz)this.a).d).invalidate();
         return;
      case 11:
         var4 = this.a;
         var2 = (Float)var1.getAnimatedValue();
         ((CatcherView)var4).l = var2;
         var6 = (CatcherView)this.a;
         if (var6.l > 0.0F) {
            var6.invalidate();
         }

         return;
      case 12:
         var4 = this.a;
         var2 = (Float)var1.getAnimatedValue();
         ((CatcherView)var4).n = var2;
         var6 = (CatcherView)this.a;
         if (var6.n > 0.95F) {
            var6.invalidate();
         }

         return;
      case 13:
         ((hzt)this.a).b.setImageAlpha((Integer)var1.getAnimatedValue());
         return;
      case 14:
         var9 = (jnz)this.a;
         var9.getLayoutParams().height = (Integer)var1.getAnimatedValue();
         if (var9.f == 1) {
            var9.setAlpha(1.0F - var1.getAnimatedFraction());
         }

         var9.requestLayout();
         return;
      case 15:
         var9 = (jnz)this.a;
         var9.getLayoutParams().height = (Integer)var1.getAnimatedValue();
         var9.requestLayout();
         return;
      case 16:
         var9 = (jnz)this.a;
         var9.getLayoutParams().height = (Integer)var1.getAnimatedValue();
         var9.requestLayout();
         return;
      case 17:
         var4 = this.a;
         var2 = (Float)var1.getAnimatedValue();
         ((View)var4).setAlpha(var2);
         return;
      case 18:
         var4 = this.a;
         var2 = (Float)var1.getAnimatedValue();
         ((CountdownSliderUi)var4).setTranslationX(var2);
         return;
      case 19:
         var4 = this.a;
         var3 = (Integer)var1.getAnimatedValue();
         var5 = (kja)var4;
         var5.z = var3;
         var5.i();
         return;
      default:
         var4 = this.a;
         var3 = (Integer)var1.getAnimatedValue();
         var5 = (kja)var4;
         var5.n = var3;
         var5.i();
      }
   }
}
