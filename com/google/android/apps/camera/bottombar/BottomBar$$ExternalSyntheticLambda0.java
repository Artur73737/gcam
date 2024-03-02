package com.google.android.apps.camera.bottombar;

import j$.util.function.Consumer$_CC;
import java.util.Map;
import java.util.function.Consumer;

// $FF: synthetic class
public final class BottomBar$$ExternalSyntheticLambda0 implements Consumer {
   public BottomBar f$0;
   public Map f$1;

   // $FF: synthetic method
   public BottomBar$$ExternalSyntheticLambda0(BottomBar var1, Map var2) {
      this.f$0 = var1;
      this.f$1 = var2;
   }

   public final void accept(Object var1) {
      this.f$0.lambda$updateCombineStatus$2$com-google-android-apps-camera-bottombar-BottomBar(this.f$1, (BottomBar$SideButtonPosition)var1);
   }

   // $FF: synthetic method
   public Consumer andThen(Consumer var1) {
      return Consumer$_CC.$default$andThen(this, var1);
   }
}
