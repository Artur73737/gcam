import android.os.Handler;
import android.view.View;
import android.view.Window;

final class bx extends cd implements cco, ccp, dh, di, cnm, pd, po, cry, cs, cfl {
   final by a;

   public bx(by var1) {
      super(var1, var1, new Handler());
      this.a = var1;
   }

   public final View a(int var1) {
      return this.a.findViewById(var1);
   }

   public final boolean b() {
      Window var1 = this.a.getWindow();
      return var1 != null && var1.peekDecorView() != null;
   }

   public final pn c() {
      return this.a.h;
   }

   public final void d(cew var1) {
      this.a.d(var1);
   }

   public final void e() {
      this.a.invalidateOptionsMenu();
   }

   public final void f(cew var1) {
      this.a.f(var1);
   }

   public final void g() {
   }

   public final clx getLifecycle() {
      return this.a.d;
   }

   public final crx getSavedStateRegistry() {
      return this.a.getSavedStateRegistry();
   }

   public final gfv getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging() {
      return this.a.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging();
   }
}
