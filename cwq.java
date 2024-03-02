import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;

public final class cwq extends LayoutParams {
   public int a = 0;

   public cwq(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var4 = var1.obtainStyledAttributes(var2, cwg.c, 0, 0);
      byte var3 = 2;
      if (!var4.hasValueOrEmpty(2)) {
         var3 = 0;
      }

      this.a = var4.getInt(var3, 0);
      var4.recycle();
   }

   public cwq(android.view.ViewGroup.LayoutParams var1) {
      super(var1);
   }
}
