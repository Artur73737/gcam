import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class mp extends cfe {
   final RecyclerView a;
   public final mo b;

   public mp(RecyclerView var1) {
      this.a = var1;
      cfe var2 = this.j();
      if (var2 != null && var2 instanceof mo) {
         this.b = (mo)var2;
      } else {
         this.b = new mo(this);
      }
   }

   public final void a(View var1, AccessibilityEvent var2) {
      super.a(var1, var2);
      if (var1 instanceof RecyclerView && !this.k()) {
         lx var3 = ((RecyclerView)var1).n;
         if (var3 != null) {
            var3.R(var2);
         }
      }

   }

   public void b(View var1, cht var2) {
      super.b(var1, var2);
      if (!this.k()) {
         lx var4 = this.a.n;
         if (var4 != null) {
            RecyclerView var3 = var4.s;
            var4.m(var3.f, var3.M, var2);
         }
      }

   }

   public boolean h(View var1, int var2, Bundle var3) {
      if (super.h(var1, var2, var3)) {
         return true;
      } else {
         if (!this.k()) {
            lx var4 = this.a.n;
            if (var4 != null) {
               return var4.t(var2, var3);
            }
         }

         return false;
      }
   }

   public cfe j() {
      return this.b;
   }

   final boolean k() {
      return this.a.an();
   }
}
