import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public abstract class de {
   private static boolean g(List var0, View var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         if (var0.get(var3) == var1) {
            return true;
         }
      }

      return false;
   }

   protected static void q(List var0, View var1) {
      int var4 = var0.size();
      if (!g(var0, var1, var4)) {
         if (cgd.h(var1) != null) {
            var0.add(var1);
         }

         for(int var2 = var4; var2 < var0.size(); ++var2) {
            var1 = (View)var0.get(var2);
            if (var1 instanceof ViewGroup) {
               ViewGroup var7 = (ViewGroup)var1;
               int var5 = var7.getChildCount();

               for(int var3 = 0; var3 < var5; ++var3) {
                  View var6 = var7.getChildAt(var3);
                  if (!g(var0, var6, var4) && cgd.h(var6) != null) {
                     var0.add(var6);
                  }
               }
            }
         }

      }
   }

   protected static boolean r(List var0) {
      return var0 == null || var0.isEmpty();
   }

   protected static final void s(View var0, Rect var1) {
      if (cga.e(var0)) {
         RectF var5 = new RectF();
         var5.set(0.0F, 0.0F, (float)var0.getWidth(), (float)var0.getHeight());
         var0.getMatrix().mapRect(var5);
         var5.offset((float)var0.getLeft(), (float)var0.getTop());

         View var6;
         for(ViewParent var4 = var0.getParent(); var4 instanceof View; var4 = var6.getParent()) {
            var6 = (View)var4;
            int var3 = -var6.getScrollX();
            int var2 = -var6.getScrollY();
            var5.offset((float)var3, (float)var2);
            var6.getMatrix().mapRect(var5);
            var5.offset((float)var6.getLeft(), (float)var6.getTop());
         }

         int[] var7 = new int[2];
         var0.getRootView().getLocationOnScreen(var7);
         var5.offset((float)var7[0], (float)var7[1]);
         var1.set(Math.round(var5.left), Math.round(var5.top), Math.round(var5.right), Math.round(var5.bottom));
      }
   }

   public abstract Object a(Object var1);

   public abstract Object b(Object var1, Object var2, Object var3);

   public abstract Object c(Object var1);

   public abstract void d(Object var1, View var2);

   public abstract void e(Object var1, ArrayList var2);

   public abstract void f(ViewGroup var1, Object var2);

   public abstract void h(Object var1, View var2, ArrayList var3);

   public abstract void i(Object var1, Rect var2);

   public abstract void j(Object var1, View var2);

   public abstract void k(Object var1, View var2, ArrayList var3);

   public abstract void l(Object var1, ArrayList var2, ArrayList var3);

   public abstract boolean m(Object var1);

   public abstract Object n(Object var1, Object var2);

   public abstract void o(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5);

   public void p(Object var1, hei var2, Runnable var3) {
      throw null;
   }
}
