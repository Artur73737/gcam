package androidx.wear.ambient;

import android.os.Bundle;
import com.google.android.wearable.compat.WearableActivityController.AmbientCallback;

final class WearableControllerProvider$1 extends AmbientCallback {
   final AmbientDelegate$AmbientCallback a;

   public WearableControllerProvider$1(AmbientDelegate$AmbientCallback var1) {
      this.a = var1;
   }

   public final void onEnterAmbient(Bundle var1) {
      this.a.onEnterAmbient(var1);
   }

   public final void onExitAmbient() {
      this.a.onExitAmbient();
   }

   public final void onInvalidateAmbientOffload() {
      this.a.onAmbientOffloadInvalidated();
   }

   public final void onUpdateAmbient() {
      this.a.onUpdateAmbient();
   }
}
