package androidx.wear.ambient;

import android.app.Activity;
import java.util.concurrent.Executor;

public final class AmbientLifecycleObserverKt {
   public static final AmbientLifecycleObserver AmbientLifecycleObserver(Activity var0, AmbientLifecycleObserver$AmbientLifecycleCallback var1) {
      var0.getClass();
      var1.getClass();
      return new AmbientLifecycleObserverImpl(var0, AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0.INSTANCE, var1);
   }

   public static final AmbientLifecycleObserver AmbientLifecycleObserver(Activity var0, Executor var1, AmbientLifecycleObserver$AmbientLifecycleCallback var2) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      return new AmbientLifecycleObserverImpl(var0, var1, var2);
   }
}
