import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class oln extends ImageButton {
   public int d;

   public oln(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public oln(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public oln(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = this.getVisibility();
   }

   public final void g(int var1, boolean var2) {
      super.setVisibility(var1);
      if (var2) {
         this.d = var1;
      }

   }

   public final void setVisibility(int var1) {
      this.g(var1, true);
   }
}
