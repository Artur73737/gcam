import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

public class bpm extends ViewGroup {
   private boolean a;

   public bpm(Context var1) {
      super(var1);
      this.setClipChildren(false);
      this.setTag(2131427749, true);
   }

   public final void a(bcw var1, View var2, long var3) {
      super.drawChild(bcn.a(var1), var2, var3);
   }

   protected void dispatchDraw(Canvas var1) {
      var1.getClass();
      int var3 = super.getChildCount();

      for(int var2 = 0; var2 < var3; ++var2) {
         View var4 = this.getChildAt(var2);
         var4.getClass();
         if (((bqc)var4).f) {
            this.a = true;

            try {
               super.dispatchDraw(var1);
            } finally {
               this.a = false;
            }

            return;
         }
      }

   }

   public final int getChildCount() {
      return this.a ? super.getChildCount() : 0;
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
   }

   protected final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }
}
