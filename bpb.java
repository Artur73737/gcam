import android.view.ViewConfiguration;

public final class bpb implements bqa {
   private final ViewConfiguration a;

   public bpb(ViewConfiguration var1) {
      this.a = var1;
   }

   public final float a() {
      return (float)this.a.getScaledTouchSlop();
   }

   public final long b() {
      return (long)ViewConfiguration.getDoubleTapTimeout();
   }

   public final long c() {
      return (long)ViewConfiguration.getLongPressTimeout();
   }

   // $FF: synthetic method
   public final long d() {
      return car.M(48.0F, 48.0F);
   }
}
