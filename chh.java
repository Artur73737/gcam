import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

class chh extends chm {
   final WindowInsets a;
   cdi b;
   private cdi c = null;
   private cho f;

   public chh(cho var1, WindowInsets var2) {
      super(var1);
      this.a = var2;
   }

   private cdi s(int var1, boolean var2) {
      cdi var4 = cdi.a;

      cdi var5;
      for(int var3 = 1; var3 <= 256; var4 = var5) {
         var5 = var4;
         if ((var1 & var3) != 0) {
            var5 = this.b(var3, false);
            var5 = cdi.c(Math.max(var4.b, var5.b), Math.max(var4.c, var5.c), Math.max(var4.d, var5.d), Math.max(var4.e, var5.e));
         }

         var3 += var3;
      }

      return var4;
   }

   private cdi t() {
      cho var1 = this.f;
      return var1 != null ? var1.g() : cdi.a;
   }

   private cdi u(View var1) {
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
   }

   public cdi a(int var1) {
      return this.s(var1, false);
   }

   protected cdi b(int var1, boolean var2) {
      cho var3;
      cdi var4;
      cdi var6;
      switch(var1) {
      case 1:
         return cdi.c(0, this.c().c, 0, 0);
      case 2:
         var4 = this.c();
         var3 = this.f;
         if (var3 != null) {
            var6 = var3.g();
         } else {
            var6 = null;
         }

         var1 = var4.e;
         if (var6 != null) {
            var1 = Math.min(var1, var6.e);
         }

         return cdi.c(var4.b, 0, var4.d, var1);
      case 8:
         var4 = this.c();
         var6 = this.t();
         var1 = var4.e;
         if (var1 > var6.e) {
            return cdi.c(0, 0, 0, var1);
         } else {
            var4 = this.b;
            if (var4 != null && !var4.equals(cdi.a)) {
               var1 = this.b.e;
               if (var1 > var6.e) {
                  return cdi.c(0, 0, 0, var1);
               }
            }

            return cdi.a;
         }
      case 16:
         return this.q();
      case 32:
         return this.p();
      case 64:
         return this.r();
      case 128:
         var3 = this.f;
         cfh var5;
         if (var3 != null) {
            var5 = var3.b.n();
         } else {
            var5 = this.n();
         }

         if (var5 != null) {
            return cdi.c(cfg.b(var5.a), cfg.d(var5.a), cfg.c(var5.a), cfg.a(var5.a));
         }

         return cdi.a;
      default:
         return cdi.a;
      }
   }

   public final cdi c() {
      if (this.c == null) {
         this.c = cdi.c(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
      }

      return this.c;
   }

   public cho d(int var1, int var2, int var3, int var4) {
      chf var5 = new chf(cho.m(this.a));
      var5.c(cho.h(this.c(), var1, var2, var3, var4));
      var5.b(cho.h(this.j(), var1, var2, var3, var4));
      return var5.a();
   }

   public void e(View var1) {
      cdi var2 = this.u(var1);
      cdi var3 = var2;
      if (var2 == null) {
         var3 = cdi.a;
      }

      this.g(var3);
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         chh var2 = (chh)var1;
         return Objects.equals(this.b, var2.b);
      }
   }

   public void f(cdi[] var1) {
   }

   public void g(cdi var1) {
      this.b = var1;
   }

   public void h(cho var1) {
      this.f = var1;
   }

   public boolean i() {
      return this.a.isRound();
   }
}
