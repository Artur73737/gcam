import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class lz {
   public RecyclerView a;
   private Scroller b;
   private final et c = new mu(this);

   public abstract int a(lx var1, int var2, int var3);

   public abstract View b(lx var1);

   public abstract int[] c(lx var1, View var2);

   public mj d(lx var1) {
      return !(var1 instanceof mi) ? null : new mv(this, this.a.getContext());
   }

   public void e(RecyclerView var1) {
      RecyclerView var2 = this.a;
      if (var2 != var1) {
         if (var2 != null) {
            var2.aA(this.c);
            this.a.H = null;
         }

         this.a = var1;
         if (var1 != null) {
            if (var1.H == null) {
               var1.az(this.c);
               var1 = this.a;
               var1.H = this;
               this.b = new Scroller(var1.getContext(), new DecelerateInterpolator());
               this.f();
            } else {
               throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
         }
      }
   }

   public final void f() {
      RecyclerView var3 = this.a;
      if (var3 != null) {
         lx var5 = var3.n;
         if (var5 != null) {
            View var4 = this.b(var5);
            if (var4 != null) {
               int[] var6 = this.c(var5, var4);
               int var1 = 0;
               int var2 = var6[0];
               if (var2 == 0) {
                  if (var6[1] == 0) {
                     return;
                  }
               } else {
                  var1 = var2;
               }

               this.a.av(var1, var6[1]);
            }
         }
      }
   }

   public int[] g(int var1, int var2) {
      this.b.fling(0, 0, var1, var2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      return new int[]{this.b.getFinalX(), this.b.getFinalY()};
   }
}
