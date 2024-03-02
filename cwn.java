import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.wear.widget.SwipeDismissFrameLayout;

public final class cwn {
   public float a;
   public float b;
   public float c;

   // $FF: synthetic method
   public static void b(cww var0) {
      int var1 = var0.a.size() - 1;
      if (var1 >= 0) {
         AmbientLifecycleObserverKt var2 = (AmbientLifecycleObserverKt)var0.a.get(var1);
         throw null;
      }
   }

   // $FF: synthetic method
   public static void c(SwipeDismissFrameLayout var0) {
      b(var0);

      for(int var1 = var0.b.size() - 1; var1 >= 0; --var1) {
         AmbientMode$AmbientCallback var2 = (AmbientMode$AmbientCallback)var0.b.get(var1);
      }

   }

   public final float a() {
      return this.a + this.b + this.c;
   }
}
