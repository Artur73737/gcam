package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

public class BottomBarControllerModule {
   // $FF: synthetic method
   static void lambda$provideBottomBarController$0(.kpb var0, BottomBarController var1) {
      ((MainActivityLayout)var0.c).f(var1);
   }

   public BottomBarController provideBottomBarController(.kpb var1, .flx var2, .mbx var3, .hgk var4) {
      Object var5 = var1.f;
      BottomBarController var6 = new BottomBarController((BottomBar)var5, var2);
      var3.c(new BottomBarControllerModule$$ExternalSyntheticLambda0(var1, var6));
      .hdp.d(var3, var4, (.hgy)var5);
      return var6;
   }
}
