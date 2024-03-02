final class dhc implements Runnable {
   final dhf a;
   final psd b;

   public dhc(dhf var1, psd var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      if (this.a.d == this) {
         Object var1 = dhf.a(this.b);
         if (dhf.b.d(this.a, this, var1)) {
            dhf.b(this.a);
         }

      }
   }
}
