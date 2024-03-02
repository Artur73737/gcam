import android.view.ViewGroup;

public abstract class lq {
   public final lr a = new lr();
   public boolean b = false;
   public final int c = 1;

   public abstract int a();

   public int b(int var1) {
      return 0;
   }

   public long c(int var1) {
      return -1L;
   }

   public abstract mn d(ViewGroup var1, int var2);

   public abstract void e(mn var1, int var2);

   public void f(mn var1) {
   }

   public final void g(boolean var1) {
      if (!this.a.d()) {
         this.b = var1;
      } else {
         throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      }
   }

   public final void h(ej var1) {
      this.a.registerObserver(var1);
   }

   public final void i(ej var1) {
      this.a.unregisterObserver(var1);
   }
}
