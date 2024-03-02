import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mn {
   private static final List s = Collections.emptyList();
   public final View a;
   public WeakReference b;
   public int c = -1;
   public int d = -1;
   public long e = -1L;
   public int f = -1;
   int g = -1;
   public mn h = null;
   public mn i = null;
   int j;
   List k = null;
   List l = null;
   mc m = null;
   boolean n = false;
   public int o = 0;
   public int p = -1;
   public RecyclerView q;
   public lq r;
   private int t = 0;

   public mn(View var1) {
      if (var1 != null) {
         this.a = var1;
      } else {
         throw new IllegalArgumentException("itemView may not be null");
      }
   }

   final boolean A() {
      return (this.j & 32) != 0;
   }

   public final int a() {
      RecyclerView var1 = this.q;
      return var1 == null ? -1 : var1.b(this);
   }

   public final int b() {
      int var2 = this.g;
      int var1 = var2;
      if (var2 == -1) {
         var1 = this.c;
      }

      return var1;
   }

   public final List c() {
      if ((this.j & 1024) == 0) {
         List var1 = this.k;
         return var1 != null && var1.size() != 0 ? this.l : s;
      } else {
         return s;
      }
   }

   public final void d(Object var1) {
      if (var1 == null) {
         this.e(1024);
      } else {
         if ((1024 & this.j) == 0) {
            if (this.k == null) {
               ArrayList var2 = new ArrayList();
               this.k = var2;
               this.l = Collections.unmodifiableList(var2);
            }

            this.k.add(var1);
         }

      }
   }

   public final void e(int var1) {
      this.j |= var1;
   }

   public final void f() {
      this.d = -1;
      this.g = -1;
   }

   final void g() {
      List var1 = this.k;
      if (var1 != null) {
         var1.clear();
      }

      this.j &= -1025;
   }

   final void h() {
      this.j &= -33;
   }

   public final void i() {
      this.j &= -257;
   }

   public final void j(int var1, boolean var2) {
      if (this.d == -1) {
         this.d = this.c;
      }

      int var4 = this.g;
      int var3 = var4;
      if (var4 == -1) {
         var3 = this.c;
         this.g = var3;
      }

      if (var2) {
         this.g = var3 + var1;
      }

      this.c += var1;
      if (this.a.getLayoutParams() != null) {
         ((ly)this.a.getLayoutParams()).e = true;
      }

   }

   final void k() {
      int var1 = RecyclerView.W;
      this.j = 0;
      this.c = -1;
      this.d = -1;
      this.e = -1L;
      this.g = -1;
      this.t = 0;
      this.h = null;
      this.i = null;
      this.g();
      this.o = 0;
      this.p = -1;
      RecyclerView.t(this);
   }

   public final void l(int var1, int var2) {
      this.j = var1 & var2 | this.j & ~var2;
   }

   public final void m(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.t - 1;
      } else {
         var2 = this.t + 1;
      }

      this.t = var2;
      if (var2 < 0) {
         this.t = 0;
         var2 = RecyclerView.W;
         StringBuilder var3 = new StringBuilder();
         var3.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
         var3.append(this);
         Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(this.toString()));
      } else {
         label34: {
            if (!var1 && var2 == 1) {
               var2 = this.j | 16;
            } else {
               if (!var1 || var2 != 0) {
                  break label34;
               }

               var2 = this.j & -17;
            }

            this.j = var2;
         }
      }

      var2 = RecyclerView.W;
   }

   final void n(mc var1, boolean var2) {
      this.m = var1;
      this.n = var2;
   }

   final void o() {
      this.m.m(this);
   }

   public final boolean p(int var1) {
      return (var1 & this.j) != 0;
   }

   final boolean q() {
      return this.a.getParent() != null && this.a.getParent() != this.q;
   }

   public final boolean r() {
      return (this.j & 1) != 0;
   }

   public final boolean s() {
      return (this.j & 4) != 0;
   }

   public final boolean t() {
      return (this.j & 16) == 0 && !cfx.r(this.a);
   }

   public final String toString() {
      String var1;
      if (this.getClass().isAnonymousClass()) {
         var1 = "ViewHolder";
      } else {
         var1 = this.getClass().getSimpleName();
      }

      StringBuilder var2 = new StringBuilder();
      var2.append(var1);
      var2.append("{");
      var2.append(Integer.toHexString(this.hashCode()));
      var2.append(" position=");
      var2.append(this.c);
      var2.append(" id=");
      var2.append(this.e);
      var2.append(", oldPos=");
      var2.append(this.d);
      var2.append(", pLpos:");
      var2.append(this.g);
      var2 = new StringBuilder(var2.toString());
      if (this.v()) {
         var2.append(" scrap ");
         if (!this.n) {
            var1 = "[attachedScrap]";
         } else {
            var1 = "[changeScrap]";
         }

         var2.append(var1);
      }

      if (this.s()) {
         var2.append(" invalid");
      }

      if (!this.r()) {
         var2.append(" unbound");
      }

      if (this.y()) {
         var2.append(" update");
      }

      if (this.u()) {
         var2.append(" removed");
      }

      if (this.z()) {
         var2.append(" ignored");
      }

      if (this.w()) {
         var2.append(" tmpDetached");
      }

      if (!this.t()) {
         StringBuilder var3 = new StringBuilder();
         var3.append(" not recyclable(");
         var3.append(this.t);
         var3.append(")");
         var2.append(var3.toString());
      }

      if ((this.j & 512) != 0 || this.s()) {
         var2.append(" undefined adapter position");
      }

      if (this.a.getParent() == null) {
         var2.append(" no parent");
      }

      var2.append("}");
      return var2.toString();
   }

   public final boolean u() {
      return (this.j & 8) != 0;
   }

   final boolean v() {
      return this.m != null;
   }

   public final boolean w() {
      return (this.j & 256) != 0;
   }

   public final boolean x() {
      return (this.j & 2) != 0;
   }

   final boolean y() {
      return (this.j & 2) != 0;
   }

   public final boolean z() {
      return (this.j & 128) != 0;
   }
}
