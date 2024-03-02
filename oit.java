import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class oit extends caz {
   private int a = 0;
   private qeu b;

   public oit() {
   }

   public oit(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final int R() {
      qeu var1 = this.b;
      return var1 != null ? var1.a : 0;
   }

   public final boolean S(int var1) {
      qeu var2 = this.b;
      if (var2 != null) {
         return var2.S(var1);
      } else {
         this.a = var1;
         return false;
      }
   }

   public boolean e(CoordinatorLayout var1, View var2, int var3) {
      this.gm(var1, var2, var3);
      if (this.b == null) {
         this.b = new qeu(var2);
      }

      this.b.R();
      this.b.Q();
      var3 = this.a;
      if (var3 != 0) {
         this.b.S(var3);
         this.a = 0;
      }

      return true;
   }

   protected void gm(CoordinatorLayout var1, View var2, int var3) {
      var1.j(var2, var3);
   }
}
