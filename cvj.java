import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import androidx.viewpager.widget.ViewPager;

public final class cvj extends LayoutParams {
   public boolean a;
   public int b;
   public final float c = 0.0F;

   public cvj() {
      super(-1, -1);
   }

   public cvj(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, ViewPager.a);
      this.b = var3.getInteger(0, 48);
      var3.recycle();
   }
}
