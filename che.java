import android.view.WindowInsets;
import android.view.WindowInsets.Builder;

class che extends chg {
   final Builder a;

   public che() {
      this.a = new Builder();
   }

   public che(cho var1) {
      super(var1);
      WindowInsets var2 = var1.e();
      Builder var3;
      if (var2 != null) {
         var3 = new Builder(var2);
      } else {
         var3 = new Builder();
      }

      this.a = var3;
   }

   public cho a() {
      cho var1 = cho.m(this.a.build());
      var1.b.f((cdi[])null);
      return var1;
   }

   public void b(cdi var1) {
      this.a.setStableInsets(var1.a());
   }

   public void c(cdi var1) {
      this.a.setSystemWindowInsets(var1.a());
   }
}
