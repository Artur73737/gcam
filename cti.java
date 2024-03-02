import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class cti extends de {
   private static boolean t(ctr var0) {
      return !r(var0.c) || !r((List)null) || !r((List)null);
   }

   public final Object a(Object var1) {
      return var1 != null ? ((ctr)var1).h() : null;
   }

   public final Object b(Object var1, Object var2, Object var3) {
      ctr var4 = (ctr)var1;
      ctr var5 = (ctr)var2;
      ctr var7 = (ctr)var3;
      if (var4 != null && var5 != null) {
         var1 = new cty();
         ((cty)var1).J(var4);
         ((cty)var1).J(var5);
         ((cty)var1).K();
      } else {
         var1 = var4;
         if (var4 == null) {
            if (var5 != null) {
               var1 = var5;
            } else {
               var1 = null;
            }
         }
      }

      if (var7 != null) {
         cty var6 = new cty();
         if (var1 != null) {
            var6.J((ctr)var1);
         }

         var6.J(var7);
         return var6;
      } else {
         return var1;
      }
   }

   public final Object c(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         cty var2 = new cty();
         var2.J((ctr)var1);
         return var2;
      }
   }

   public final void d(Object var1, View var2) {
      ((ctr)var1).y(var2);
   }

   public final void e(Object var1, ArrayList var2) {
      ctr var7 = (ctr)var1;
      if (var7 != null) {
         boolean var6 = var7 instanceof cty;
         int var3 = 0;
         byte var4 = 0;
         if (var6) {
            cty var8 = (cty)var7;
            int var5 = var8.e();

            for(var3 = var4; var3 < var5; ++var3) {
               this.e(var8.f(var3), var2);
            }
         } else if (!t(var7) && r(var7.d)) {
            for(int var9 = var2.size(); var3 < var9; ++var3) {
               var7.y((View)var2.get(var3));
            }
         }

      }
   }

   public final void f(ViewGroup var1, Object var2) {
      ctr var6 = (ctr)var2;
      if (!ctv.a.contains(var1) && cga.f(var1)) {
         ctv.a.add(var1);
         ctr var5 = var6.h();
         ArrayList var7 = (ArrayList)ctv.a().get(var1);
         if (var7 != null && var7.size() > 0) {
            int var4 = var7.size();

            for(int var3 = 0; var3 < var4; ++var3) {
               ((ctr)var7.get(var3)).r(var1);
            }
         }

         if (var5 != null) {
            var5.o(var1, true);
         }

         if ((css)var1.getTag(2131428375) != null) {
            throw null;
         }

         var1.setTag(2131428375, (Object)null);
         if (var5 != null) {
            ctu var8 = new ctu(var5, var1);
            var1.addOnAttachStateChangeListener(var8);
            var1.getViewTreeObserver().addOnPreDrawListener(var8);
            return;
         }
      }

   }

   public final void g(Object var1, ArrayList var2, ArrayList var3) {
      ctr var8 = (ctr)var1;
      boolean var6 = var8 instanceof cty;
      int var5 = 0;
      int var4 = 0;
      if (var6) {
         cty var9 = (cty)var8;

         for(var5 = var9.e(); var4 < var5; ++var4) {
            this.g(var9.f(var4), var2, var3);
         }
      } else if (!t(var8)) {
         ArrayList var7 = var8.d;
         if (var7.size() == var2.size() && var7.containsAll(var2)) {
            if (var3 == null) {
               var4 = 0;
            } else {
               var4 = var3.size();
            }

            while(var5 < var4) {
               var8.y((View)var3.get(var5));
               ++var5;
            }

            for(var4 = var2.size() - 1; var4 >= 0; --var4) {
               var8.B((View)var2.get(var4));
            }
         }
      }

   }

   public final void h(Object var1, View var2, ArrayList var3) {
      ((ctr)var1).x(new cte(var2, var3));
   }

   public final void i(Object var1, Rect var2) {
      ((ctr)var1).G(new ctj());
   }

   public final void j(Object var1, View var2) {
      if (var2 != null) {
         ctr var3 = (ctr)var1;
         s(var2, new Rect());
         var3.G(new ctj());
      }

   }

   public final void k(Object var1, View var2, ArrayList var3) {
      cty var6 = (cty)var1;
      ArrayList var7 = var6.d;
      var7.clear();
      int var5 = var3.size();

      for(int var4 = 0; var4 < var5; ++var4) {
         q(var7, (View)var3.get(var4));
      }

      var7.add(var2);
      var3.add(var2);
      this.e(var6, var3);
   }

   public final void l(Object var1, ArrayList var2, ArrayList var3) {
      cty var4 = (cty)var1;
      if (var4 != null) {
         var4.d.clear();
         var4.d.addAll(var3);
         this.g(var4, var2, var3);
      }

   }

   public final boolean m(Object var1) {
      return var1 instanceof ctr;
   }

   public final Object n(Object var1, Object var2) {
      cty var3 = new cty();
      if (var1 != null) {
         var3.J((ctr)var1);
      }

      var3.J((ctr)var2);
      return var3;
   }

   public final void o(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5) {
      ((ctr)var1).x(new ctf(this, var2, var3, var4, var5));
   }

   public final void p(Object var1, hei var2, Runnable var3) {
      ctr var4 = (ctr)var1;
      var2.a(new ctg(var4, 0));
      var4.x(new cth(var3));
   }
}
