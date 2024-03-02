package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientDelegate;

public class ActivityChooserView$InnerLayout extends LinearLayout {
   private static final int[] a = new int[]{16842964};

   public ActivityChooserView$InnerLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      AmbientDelegate var3 = AmbientDelegate.D(var1, var2, a);
      this.setBackgroundDrawable(var3.v(0));
      var3.z();
   }
}
