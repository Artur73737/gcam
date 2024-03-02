import android.view.WindowInsets;

class chi extends chh {
   private cdi c = null;

   public chi(cho var1, WindowInsets var2) {
      super(var1, var2);
   }

   public final cdi j() {
      if (this.c == null) {
         this.c = cdi.c(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
      }

      return this.c;
   }

   public cho k() {
      return cho.m(this.a.consumeStableInsets());
   }

   public cho l() {
      return cho.m(this.a.consumeSystemWindowInsets());
   }

   public boolean m() {
      return this.a.isConsumed();
   }
}
