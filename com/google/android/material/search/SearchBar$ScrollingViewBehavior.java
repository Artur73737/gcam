package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
   private boolean e = false;

   public SearchBar$ScrollingViewBehavior() {
   }

   public SearchBar$ScrollingViewBehavior(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public final boolean M() {
      return true;
   }

   public final void i(CoordinatorLayout var1, View var2, View var3) {
      super.i(var1, var2, var3);
      if (!this.e && var3 instanceof AppBarLayout) {
         this.e = true;
         AppBarLayout var4 = (AppBarLayout)var3;
         var4.setBackgroundColor(0);
         .oiu.a(var4, 0.0F);
      }

   }
}
