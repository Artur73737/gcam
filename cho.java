import android.view.View;
import android.view.WindowInsets;

public final class cho {
   public static final cho a;
   public final chm b;

   static {
      a = chl.c;
   }

   public cho() {
      this.b = new chm(this);
   }

   private cho(WindowInsets var1) {
      this.b = new chl(this, var1);
   }

   static cdi h(cdi var0, int var1, int var2, int var3, int var4) {
      int var8 = Math.max(0, var0.b - var1);
      int var6 = Math.max(0, var0.c - var2);
      int var5 = Math.max(0, var0.d - var3);
      int var7 = Math.max(0, var0.e - var4);
      return var8 == var1 && var6 == var2 && var5 == var3 && var7 == var4 ? var0 : cdi.c(var8, var6, var5, var7);
   }

   public static cho m(WindowInsets var0) {
      return n(var0, (View)null);
   }

   public static cho n(WindowInsets var0, View var1) {
      cby.g(var0);
      cho var2 = new cho(var0);
      if (var1 != null && cga.e(var1)) {
         var2.p(cge.b(var1));
         var2.o(var1.getRootView());
      }

      return var2;
   }

   @Deprecated
   public final int a() {
      return this.b.c().e;
   }

   @Deprecated
   public final int b() {
      return this.b.c().b;
   }

   @Deprecated
   public final int c() {
      return this.b.c().d;
   }

   @Deprecated
   public final int d() {
      return this.b.c().c;
   }

   public final WindowInsets e() {
      chm var1 = this.b;
      return var1 instanceof chh ? ((chh)var1).a : null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof cho)) {
         return false;
      } else {
         cho var2 = (cho)var1;
         return cex.b(this.b, var2.b);
      }
   }

   public final cdi f(int var1) {
      return this.b.a(var1);
   }

   @Deprecated
   public final cdi g() {
      return this.b.j();
   }

   public final int hashCode() {
      chm var1 = this.b;
      return var1 == null ? 0 : var1.hashCode();
   }

   @Deprecated
   public final cho i() {
      return this.b.o();
   }

   @Deprecated
   public final cho j() {
      return this.b.k();
   }

   @Deprecated
   public final cho k() {
      return this.b.l();
   }

   public final cho l(int var1, int var2, int var3, int var4) {
      return this.b.d(var1, var2, var3, var4);
   }

   final void o(View var1) {
      this.b.e(var1);
   }

   final void p(cho var1) {
      this.b.h(var1);
   }

   public final boolean q() {
      return this.b.m();
   }
}
