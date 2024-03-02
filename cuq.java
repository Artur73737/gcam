import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

public final class cuq extends ConstantState {
   int a;
   cvc b;
   public AnimatorSet c;
   ArrayList d;
   xh e;

   public final int getChangingConfigurations() {
      return 0;
   }

   public final Drawable newDrawable() {
      throw new IllegalStateException("No constant state support for SDK < 24.");
   }

   public final Drawable newDrawable(Resources var1) {
      throw new IllegalStateException("No constant state support for SDK < 24.");
   }
}
