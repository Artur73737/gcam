import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class dd extends de {
   public dd() {
   }

   private static boolean t(Transition var0) {
      return !r(var0.getTargetIds()) || !r(var0.getTargetNames()) || !r(var0.getTargetTypes());
   }

   public final Object a(Object var1) {
      return var1 != null ? ((Transition)var1).clone() : null;
   }

   public final Object b(Object var1, Object var2, Object var3) {
      Transition var4 = (Transition)var1;
      Transition var5 = (Transition)var2;
      Transition var7 = (Transition)var3;
      if (var4 != null && var5 != null) {
         var1 = (new TransitionSet()).addTransition(var4).addTransition(var5).setOrdering(1);
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
         TransitionSet var6 = new TransitionSet();
         if (var1 != null) {
            var6.addTransition((Transition)var1);
         }

         var6.addTransition(var7);
         return var6;
      } else {
         return var1;
      }
   }

   public final Object c(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         TransitionSet var2 = new TransitionSet();
         var2.addTransition((Transition)var1);
         return var2;
      }
   }

   public final void d(Object var1, View var2) {
      ((Transition)var1).addTarget(var2);
   }

   public final void e(Object var1, ArrayList var2) {
      Transition var7 = (Transition)var1;
      if (var7 != null) {
         boolean var6 = var7 instanceof TransitionSet;
         byte var4 = 0;
         int var3 = 0;
         if (var6) {
            TransitionSet var8 = (TransitionSet)var7;

            for(int var9 = var8.getTransitionCount(); var3 < var9; ++var3) {
               this.e(var8.getTransitionAt(var3), var2);
            }
         } else if (!t(var7) && r(var7.getTargets())) {
            int var5 = var2.size();

            for(var3 = var4; var3 < var5; ++var3) {
               var7.addTarget((View)var2.get(var3));
            }
         }

      }
   }

   public final void f(ViewGroup var1, Object var2) {
      TransitionManager.beginDelayedTransition(var1, (Transition)var2);
   }

   public final void g(Object var1, ArrayList var2, ArrayList var3) {
      Transition var8 = (Transition)var1;
      boolean var6 = var8 instanceof TransitionSet;
      int var5 = 0;
      int var4 = 0;
      if (var6) {
         TransitionSet var9 = (TransitionSet)var8;

         for(var5 = var9.getTransitionCount(); var4 < var5; ++var4) {
            this.g(var9.getTransitionAt(var4), var2, var3);
         }
      } else if (!t(var8)) {
         List var7 = var8.getTargets();
         if (var7 != null && var7.size() == var2.size() && var7.containsAll(var2)) {
            if (var3 == null) {
               var4 = 0;
            } else {
               var4 = var3.size();
            }

            while(var5 < var4) {
               var8.addTarget((View)var3.get(var5));
               ++var5;
            }

            for(var4 = var2.size() - 1; var4 >= 0; --var4) {
               var8.removeTarget((View)var2.get(var4));
            }
         }
      }

   }

   public final void h(Object var1, View var2, ArrayList var3) {
      ((Transition)var1).addListener(new cz(var2, var3));
   }

   public final void i(Object var1, Rect var2) {
      ((Transition)var1).setEpicenterCallback(new dc(var2));
   }

   public final void j(Object var1, View var2) {
      if (var2 != null) {
         Transition var3 = (Transition)var1;
         Rect var4 = new Rect();
         s(var2, var4);
         var3.setEpicenterCallback(new cy(var4));
      }

   }

   public final void k(Object var1, View var2, ArrayList var3) {
      TransitionSet var6 = (TransitionSet)var1;
      List var7 = var6.getTargets();
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
      TransitionSet var4 = (TransitionSet)var1;
      if (var4 != null) {
         var4.getTargets().clear();
         var4.getTargets().addAll(var3);
         this.g(var4, var2, var3);
      }

   }

   public final boolean m(Object var1) {
      return var1 instanceof Transition;
   }

   public final Object n(Object var1, Object var2) {
      TransitionSet var3 = new TransitionSet();
      if (var1 != null) {
         var3.addTransition((Transition)var1);
      }

      var3.addTransition((Transition)var2);
      return var3;
   }

   public final void o(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5) {
      ((Transition)var1).addListener(new da(this, var2, var3, var4, var5));
   }

   public final void p(Object var1, hei var2, Runnable var3) {
      ((Transition)var1).addListener(new db(var3));
   }
}
