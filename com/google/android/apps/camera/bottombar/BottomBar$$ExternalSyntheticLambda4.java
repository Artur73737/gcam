package com.google.android.apps.camera.bottombar;

import android.content.res.Resources;
import android.view.View;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

// $FF: synthetic class
public final class BottomBar$$ExternalSyntheticLambda4 implements Consumer {
   public int f$0;
   public .cap f$1;
   public Resources f$2;

   // $FF: synthetic method
   public BottomBar$$ExternalSyntheticLambda4(int var1, .cap var2, Resources var3) {
      this.f$0 = var1;
      this.f$1 = var2;
      this.f$2 = var3;
   }

   public final void accept(Object var1) {
      BottomBar.lambda$adjustPadding$0(this.f$0, this.f$1, this.f$2, (View)var1);
   }

   // $FF: synthetic method
   public Consumer andThen(Consumer var1) {
      return Consumer$_CC.$default$andThen(this, var1);
   }
}
