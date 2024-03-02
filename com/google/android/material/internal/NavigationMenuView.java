package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements .hk {
   public NavigationMenuView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public NavigationMenuView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public NavigationMenuView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.ad(new LinearLayoutManager(1));
   }

   public final void a(.gv var1) {
   }
}
