package androidx.wear.ambient;

import android.os.Bundle;

public final class AmbientLifecycleObserverImpl$callbackTranslator$1 implements AmbientDelegate$AmbientCallback {
   final AmbientLifecycleObserver$AmbientLifecycleCallback a;

   public AmbientLifecycleObserverImpl$callbackTranslator$1(AmbientLifecycleObserver$AmbientLifecycleCallback var1) {
      this.a = var1;
   }

   public final void onAmbientOffloadInvalidated() {
   }

   public final void onEnterAmbient(Bundle var1) {
      boolean var3 = false;
      boolean var2;
      if (var1 != null) {
         var2 = var1.getBoolean("com.google.android.wearable.compat.extra.BURN_IN_PROTECTION");
      } else {
         var2 = false;
      }

      if (var1 != null) {
         var3 = var1.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT");
      }

      this.a.onEnterAmbient(new AmbientLifecycleObserver$AmbientDetails(var2, var3));
   }

   public final void onExitAmbient() {
      this.a.onExitAmbient();
   }

   public final void onUpdateAmbient() {
      this.a.onUpdateAmbient();
   }
}
