package com.google.android.apps.camera.bottombar.dagger;

import com.google.android.apps.camera.bottombar.BottomBarController;

public final class BottomBarControllerModule_ProvideBottomBarControllerFactory implements .qpo {
   private final .qrz activityLifecycleProvider;
   private final .qrz cameraUiProvider;
   private final .qrz gcaConfigProvider;
   private final .qrz mainThreadProvider;
   private final BottomBarControllerModule module;

   public BottomBarControllerModule_ProvideBottomBarControllerFactory(BottomBarControllerModule var1, .qrz var2, .qrz var3, .qrz var4, .qrz var5) {
      this.module = var1;
      this.cameraUiProvider = var2;
      this.gcaConfigProvider = var3;
      this.mainThreadProvider = var4;
      this.activityLifecycleProvider = var5;
   }

   public static BottomBarControllerModule_ProvideBottomBarControllerFactory create(BottomBarControllerModule var0, .qrz var1, .qrz var2, .qrz var3, .qrz var4) {
      return new BottomBarControllerModule_ProvideBottomBarControllerFactory(var0, var1, var2, var3, var4);
   }

   public static BottomBarController provideBottomBarController(BottomBarControllerModule var0, .kpb var1, .flx var2, .mbx var3, .hgk var4) {
      BottomBarController var5 = var0.provideBottomBarController(var1, var2, var3, var4);
      var5.getClass();
      return var5;
   }

   public BottomBarController get() {
      return provideBottomBarController(this.module, (.kpb)this.cameraUiProvider.get(), (.flx)this.gcaConfigProvider.get(), (.mbx)this.mainThreadProvider.get(), (.hgk)this.activityLifecycleProvider.get());
   }
}
