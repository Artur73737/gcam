import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.camera.processing.UOb.gKVNpqGY;

public final class cwd extends RecyclerView {
   final ViewPager2 aa;

   public cwd(ViewPager2 var1, Context var2) {
      super(var2);
      this.aa = var1;
   }

   public final CharSequence getAccessibilityClassName() {
      return "android.support.v7.widget.RecyclerView";
   }

   public final void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setFromIndex(this.aa.b);
      var1.setToIndex(this.aa.b);
      var1.setSource(((cwb)this.aa.j).a);
      var1.setClassName(gKVNpqGY.xHWM);
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return this.aa.g && super.onInterceptTouchEvent(var1);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      return this.aa.g && super.onTouchEvent(var1);
   }
}
