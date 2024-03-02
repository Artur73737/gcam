public final class bht implements bho, bks, baz {
   public bho a;
   public qvt c;
   public boolean e;
   public boolean f;
   private final att g;
   private final bht h;
   private final lmk i;

   public bht(bho var1, qvt var2) {
      this.a = var1;
      this.c = var2;
      this.g = sg.d((Object)null);
      this.i = bhs.a;
      this.h = this;
   }

   private final void k() {
      this.e = false;
      if (this.f) {
         this.c.eo(this.a);
      } else if (this.b() == null) {
         this.c.eo((Object)null);
      } else {
         bht var1 = this.b();
         if (var1 != null) {
            var1.k();
         }

      }
   }

   // $FF: synthetic method
   public final Object a() {
      return this.h;
   }

   public final bht b() {
      return (bht)this.g.a();
   }

   public final void c(bht var1) {
      if (this.f) {
         if (var1 == null) {
            this.c.eo((Object)null);
         } else {
            var1.k();
         }
      }

      this.f = false;
   }

   public final lmk d() {
      return this.i;
   }

   public final void e(bkt var1) {
      bht var2 = this.b();
      bht var3 = (bht)var1.eq(bhs.a);
      this.g.b(var3);
      if (var2 != null && this.b() == null) {
         this.c(var2);
         this.c = axa.k;
      }

   }

   public final void f() {
      this.e = true;
      bht var1 = this.b();
      if (var1 != null) {
         var1.f();
      }

   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   // $FF: synthetic method
   public final Object h(Object var1, qvx var2) {
      return dq.j(this, var1, var2);
   }

   // $FF: synthetic method
   public final boolean i(qvt var1) {
      return dq.k(this, var1);
   }

   public final boolean j() {
      bht var3 = this.b();
      boolean var2 = false;
      boolean var1 = var2;
      if (var3 != null) {
         var1 = var2;
         if (var3.j()) {
            var1 = true;
         }
      }

      return var1;
   }
}
