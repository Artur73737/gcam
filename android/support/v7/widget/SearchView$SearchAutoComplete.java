package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;

public class SearchView$SearchAutoComplete extends .ih {
   private int a;

   public SearchView$SearchAutoComplete(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SearchView$SearchAutoComplete(Context var1, AttributeSet var2) {
      this(var1, var2, 2130968655);
   }

   public SearchView$SearchAutoComplete(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = this.getThreshold();
   }

   public final boolean enoughToFilter() {
      return this.a <= 0 || super.enoughToFilter();
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics var4 = this.getResources().getDisplayMetrics();
      Configuration var3 = this.getResources().getConfiguration();
      int var1 = var3.screenWidthDp;
      int var2 = var3.screenHeightDp;
      short var5;
      if (var1 >= 960 && var2 >= 720 && var3.orientation == 2) {
         var5 = 256;
      } else if (var1 < 600) {
         var5 = 160;
      } else {
         var5 = 192;
      }

      this.setMinWidth((int)TypedValue.applyDimension(1, (float)var5, var4));
   }

   protected final void onFocusChanged(boolean var1, int var2, Rect var3) {
      super.onFocusChanged(var1, var2, var3);
      throw null;
   }

   public final boolean onKeyPreIme(int var1, KeyEvent var2) {
      int var3 = var1;
      if (var1 == 4) {
         DispatcherState var4;
         if (var2.getAction() == 0 && var2.getRepeatCount() == 0) {
            var4 = this.getKeyDispatcherState();
            if (var4 != null) {
               var4.startTracking(var2, this);
            }

            return true;
         }

         if (var2.getAction() == 1) {
            var4 = this.getKeyDispatcherState();
            if (var4 != null) {
               var4.handleUpEvent(var2);
            }

            if (var2.isTracking()) {
               if (!var2.isCanceled()) {
                  throw null;
               }

               var3 = 4;
               return super.onKeyPreIme(var3, var2);
            }
         }

         var3 = 4;
      }

      return super.onKeyPreIme(var3, var2);
   }

   public final void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         throw null;
      }
   }

   public final void performCompletion() {
   }

   protected final void replaceText(CharSequence var1) {
   }

   public final void setThreshold(int var1) {
      super.setThreshold(var1);
      this.a = var1;
   }
}
