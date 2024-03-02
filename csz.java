import android.view.ViewGroup;

final class csz extends cts {
   boolean a = false;
   final ViewGroup b;

   public csz(ViewGroup var1) {
      this.b = var1;
   }

   public final void a(ctr var1) {
      if (!this.a) {
         cud.b(this.b, false);
      }

      var1.A(this);
   }

   public final void b() {
      cud.b(this.b, false);
      this.a = true;
   }

   public final void c() {
      cud.b(this.b, false);
   }

   public final void d() {
      cud.b(this.b, true);
   }
}
