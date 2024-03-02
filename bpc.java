import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class bpc extends ViewGroup {
   public final HashMap a;
   private final HashMap b;

   public bpc(Context var1) {
      super(var1);
      this.setClipChildren(false);
      this.b = new HashMap();
      this.a = new HashMap();
   }

   protected final void dispatchDraw(Canvas var1) {
      var1.getClass();
   }

   public final boolean dispatchTouchEvent(MotionEvent var1) {
      return true;
   }

   public final void onDescendantInvalidated(View var1, View var2) {
      var1.getClass();
      var2.getClass();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      Set var6 = this.b.keySet();
      var6.getClass();
      Iterator var8 = var6.iterator();

      while(var8.hasNext()) {
         byc var7 = (byc)var8.next();
         var7.layout(var7.getLeft(), var7.getTop(), var7.getRight(), var7.getBottom());
      }

   }

   protected final void onMeasure(int var1, int var2) {
      if (MeasureSpec.getMode(var1) == 1073741824) {
         if (MeasureSpec.getMode(var2) == 1073741824) {
            this.setMeasuredDimension(MeasureSpec.getSize(var1), MeasureSpec.getSize(var2));
            Set var3 = this.b.keySet();
            var3.getClass();
            Iterator var4 = var3.iterator();
            if (var4.hasNext()) {
               byc var5 = (byc)var4.next();
               throw null;
            }
         } else {
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY");
         }
      } else {
         throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY");
      }
   }

   public final void requestLayout() {
      this.cleanupLayoutState(this);
      int var2 = this.getChildCount();

      for(int var1 = 0; var1 < var2; ++var1) {
         View var3 = this.getChildAt(var1);
         bmd var4 = (bmd)this.b.get(var3);
         if (var3.isLayoutRequested() && var4 != null) {
            bmd.ap(var4, false, 3);
         }
      }

   }

   public final boolean shouldDelayChildPressedState() {
      return false;
   }
}
