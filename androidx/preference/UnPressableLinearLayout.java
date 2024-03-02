package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class UnPressableLinearLayout extends LinearLayout {
   public UnPressableLinearLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public UnPressableLinearLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected final void dispatchSetPressed(boolean var1) {
   }
}
