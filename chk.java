import android.view.WindowInsets;

class chk extends chj {
   private cdi c = null;
   private cdi f = null;
   private cdi g = null;

   public chk(cho var1, WindowInsets var2) {
      super(var1, var2);
   }

   public cho d(int var1, int var2, int var3, int var4) {
      return cho.m(this.a.inset(var1, var2, var3, var4));
   }

   public cdi p() {
      if (this.f == null) {
         this.f = cdi.d(this.a.getMandatorySystemGestureInsets());
      }

      return this.f;
   }

   public cdi q() {
      if (this.c == null) {
         this.c = cdi.d(this.a.getSystemGestureInsets());
      }

      return this.c;
   }

   public cdi r() {
      if (this.g == null) {
         this.g = cdi.d(this.a.getTappableElementInsets());
      }

      return this.g;
   }
}
