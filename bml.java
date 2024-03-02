public final class bml {
   public final bmd a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e;
   public boolean f;
   public boolean g;
   public boolean h;
   public int i;
   public int j;
   public boolean k;
   public boolean l;
   public int m;
   public final bmj n;
   public bmh o;
   public int p;

   public bml(bmd var1) {
      this.a = var1;
      this.p = 5;
      this.n = new bmj(this);
   }

   public final bmz a() {
      return this.a.n.c;
   }

   public final bxq b() {
      bmj var1 = this.n;
      return var1.i ? bxq.e(var1.d) : null;
   }

   public final void c() {
      this.n.r = true;
      bmh var1 = this.o;
      if (var1 != null) {
         var1.p = true;
      }

   }

   public final void d() {
      this.d = true;
      this.e = true;
   }

   public final void e() {
      this.g = true;
      this.h = true;
   }

   public final void f() {
      this.c = true;
   }

   public final void g(int var1) {
      int var2 = this.m;
      this.m = var1;
      boolean var3 = false;
      boolean var5;
      if (var2 != 0) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var1 == 0) {
         var3 = true;
      }

      if (var5 != var3) {
         bmd var4 = this.a.n();
         bml var6;
         if (var4 != null) {
            var6 = var4.o;
         } else {
            var6 = null;
         }

         if (var6 != null) {
            if (var1 == 0) {
               var6.g(var6.m - 1);
               return;
            }

            var6.g(var6.m + 1);
         }
      }

   }

   public final void h(boolean var1) {
      if (this.l != var1) {
         this.l = var1;
         if (var1) {
            if (!this.k) {
               this.g(this.m + 1);
               return;
            }
         } else if (!this.k) {
            this.g(this.m - 1);
         }
      }

   }

   public final void i(boolean var1) {
      if (this.k != var1) {
         this.k = var1;
         if (var1) {
            if (!this.l) {
               this.g(this.m + 1);
               return;
            }
         } else if (!this.l) {
            this.g(this.m - 1);
         }
      }

   }

   public final void j() {
      bmj var1 = this.n;
      bmd var3;
      if ((var1.o != null || var1.u.a().c() != null) && var1.n) {
         var1.n = false;
         var1.o = var1.u.a().c();
         var3 = this.a.n();
         if (var3 != null) {
            bmd.ap(var3, false, 3);
         }
      }

      bmh var4 = this.o;
      if (var4 != null) {
         bmo var2;
         if (var4.s == null) {
            var2 = var4.t.a().u();
            var2.getClass();
            if (var2.c() == null) {
               return;
            }
         }

         if (var4.r) {
            var4.r = false;
            var2 = var4.t.a().u();
            var2.getClass();
            var4.s = var2.c();
            var3 = this.a;
            if (this.k(var3)) {
               var3 = var3.n();
               if (var3 != null) {
                  bmd.ap(var3, false, 3);
                  return;
               }
            } else {
               var3 = var3.n();
               if (var3 != null) {
                  bmd.an(var3, false, 3);
                  return;
               }
            }
         }
      }

   }

   public final boolean k(bmd var1) {
      bmd var4 = var1.e;
      boolean var3 = false;
      boolean var2 = var3;
      if (var4 != null) {
         var1 = var1.n();
         if (var1 != null) {
            var1 = var1.e;
         } else {
            var1 = null;
         }

         if (var1 != null) {
            if (this.b) {
               return true;
            }

            var2 = var3;
         } else {
            var2 = true;
         }
      }

      return var2;
   }
}
