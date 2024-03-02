public final class aug {
   public int a;
   public auh b;
   public qvx c;
   public int d;
   public dhq e;
   public dhq f;
   public nxj g;

   public aug(auh var1) {
      this.b = var1;
   }

   public final void a() {
      auh var1 = this.b;
      if (var1 != null) {
         var1.k(this, (Object)null);
      }

   }

   public final void b() {
      auh var1 = this.b;
      if (var1 != null) {
         var1.l();
      }

      this.b = null;
      this.f = null;
      this.e = null;
   }

   public final void c(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.a | 4;
      } else {
         var2 = this.a & -5;
      }

      this.a = var2;
   }

   public final void d(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.a | 8;
      } else {
         var2 = this.a & -9;
      }

      this.a = var2;
   }

   public final void e(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.a | 32;
      } else {
         var2 = this.a & -33;
      }

      this.a = var2;
   }

   public final void f(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.a | 16;
      } else {
         var2 = this.a & -17;
      }

      this.a = var2;
   }

   public final void g(int var1) {
      this.d = var1;
      this.f(false);
   }

   public final boolean h() {
      return (this.a & 16) != 0;
   }

   public final boolean i() {
      return (this.a & 1) != 0;
   }

   public final boolean j() {
      if (this.b != null) {
         nxj var1 = this.g;
         if (var1 != null && var1.f()) {
            return true;
         }
      }

      return false;
   }

   public final boolean k() {
      return this.e != null;
   }

   public final int l(Object var1) {
      auh var2 = this.b;
      return var2 != null ? var2.k(this, var1) : 1;
   }

   public final void m() {
      this.a |= 1;
   }
}
