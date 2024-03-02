import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.View.OnApplyWindowInsetsListener;

public final class cgd {
   public static float a(View var0) {
      return var0.getElevation();
   }

   public static float b(View var0) {
      return var0.getTranslationZ();
   }

   public static float c(View var0) {
      return var0.getZ();
   }

   public static ColorStateList d(View var0) {
      return var0.getBackgroundTintList();
   }

   public static Mode e(View var0) {
      return var0.getBackgroundTintMode();
   }

   public static cho f(View var0, cho var1, Rect var2) {
      WindowInsets var3 = var1.e();
      if (var3 != null) {
         return cho.n(var0.computeSystemWindowInsets(var3, var2), var0);
      } else {
         var2.setEmpty();
         return var1;
      }
   }

   public static cho g(View var0) {
      Object var2;
      cho var9;
      IllegalAccessException var10000;
      label55: {
         boolean var1 = chd.d;
         var2 = null;
         if (var1) {
            if (!var0.isAttachedToWindow()) {
               var9 = (cho)var2;
               return var9;
            }

            View var3 = var0.getRootView();

            Object var4;
            boolean var10001;
            try {
               var4 = chd.a.get(var3);
            } catch (IllegalAccessException var8) {
               var10000 = var8;
               var10001 = false;
               break label55;
            }

            if (var4 != null) {
               Rect var11;
               Rect var13;
               try {
                  var11 = (Rect)chd.b.get(var4);
                  var13 = (Rect)chd.c.get(var4);
               } catch (IllegalAccessException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label55;
               }

               if (var11 != null && var13 != null) {
                  cho var12;
                  try {
                     chf var5 = new chf();
                     var5.b(cdi.b(var11));
                     var5.c(cdi.b(var13));
                     var12 = var5.a();
                     var12.p(var12);
                     var12.o(var0.getRootView());
                  } catch (IllegalAccessException var6) {
                     var10000 = var6;
                     var10001 = false;
                     break label55;
                  }

                  var9 = var12;
                  return var9;
               }
            }
         }

         var9 = (cho)var2;
         return var9;
      }

      IllegalAccessException var10 = var10000;
      Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. ".concat(String.valueOf(var10.getMessage())), var10);
      var9 = (cho)var2;
      return var9;
   }

   public static String h(View var0) {
      return var0.getTransitionName();
   }

   static void i(WindowInsets var0, View var1) {
      OnApplyWindowInsetsListener var2 = (OnApplyWindowInsetsListener)var1.getTag(2131428310);
      if (var2 != null) {
         var2.onApplyWindowInsets(var1, var0);
      }

   }

   public static void j(View var0, ColorStateList var1) {
      var0.setBackgroundTintList(var1);
   }

   public static void k(View var0, Mode var1) {
      var0.setBackgroundTintMode(var1);
   }

   public static void l(View var0, float var1) {
      var0.setElevation(var1);
   }

   static void m(View var0, boolean var1) {
      var0.setNestedScrollingEnabled(var1);
   }

   public static void n(View var0, cfs var1) {
      if (var1 == null) {
         var0.setOnApplyWindowInsetsListener((OnApplyWindowInsetsListener)var0.getTag(2131428310));
      } else {
         var0.setOnApplyWindowInsetsListener(new cgc(var0, var1));
      }
   }

   public static void o(View var0, String var1) {
      var0.setTransitionName(var1);
   }

   public static void p(View var0, float var1) {
      var0.setTranslationZ(var1);
   }

   public static void q(View var0, float var1) {
      var0.setZ(var1);
   }

   static void r(View var0) {
      var0.stopNestedScroll();
   }

   static boolean s(View var0, float var1, float var2, boolean var3) {
      return var0.dispatchNestedFling(var1, var2, var3);
   }

   static boolean t(View var0, float var1, float var2) {
      return var0.dispatchNestedPreFling(var1, var2);
   }

   static boolean u(View var0, int var1, int var2, int[] var3, int[] var4) {
      return var0.dispatchNestedPreScroll(var1, var2, var3, var4);
   }

   static boolean v(View var0, int var1, int var2, int var3, int var4, int[] var5) {
      return var0.dispatchNestedScroll(var1, var2, var3, var4, var5);
   }

   static boolean w(View var0) {
      return var0.hasNestedScrollingParent();
   }

   static boolean x(View var0) {
      return var0.isImportantForAccessibility();
   }

   public static boolean y(View var0) {
      return var0.isNestedScrollingEnabled();
   }

   static boolean z(View var0, int var1) {
      return var0.startNestedScroll(var1);
   }
}
