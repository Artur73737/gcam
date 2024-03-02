import android.support.v7.widget.RecyclerView;

public final class cwf implements Runnable {
   private final int a;
   private final RecyclerView b;

   public cwf(int var1, RecyclerView var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      this.b.af(this.a);
   }
}
