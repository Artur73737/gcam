import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.-CC;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class cvq extends AmbientLifecycleObserver$AmbientLifecycleCallback$_CC {
   private final List a = new ArrayList(3);

   private static final void e(ConcurrentModificationException var0) {
      throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", var0);
   }

   public final void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1, float param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d(-CC var1) {
      this.a.add(var1);
   }
}
