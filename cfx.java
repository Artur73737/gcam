import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeProvider;

public final class cfx {
   public static int a(View var0) {
      return var0.getImportantForAccessibility();
   }

   public static int b(View var0) {
      return var0.getMinimumHeight();
   }

   public static int c(View var0) {
      return var0.getMinimumWidth();
   }

   public static int d(View var0) {
      return var0.getWindowSystemUiVisibility();
   }

   public static ViewParent e(View var0) {
      return var0.getParentForAccessibility();
   }

   static AccessibilityNodeProvider f(View var0) {
      return var0.getAccessibilityNodeProvider();
   }

   public static void g(View var0) {
      var0.postInvalidateOnAnimation();
   }

   static void h(View var0, int var1, int var2, int var3, int var4) {
      var0.postInvalidateOnAnimation(var1, var2, var3, var4);
   }

   public static void i(View var0, Runnable var1) {
      var0.postOnAnimation(var1);
   }

   public static void j(View var0, Runnable var1, long var2) {
      var0.postOnAnimationDelayed(var1, var2);
   }

   static void k(ViewTreeObserver var0, OnGlobalLayoutListener var1) {
      var0.removeOnGlobalLayoutListener(var1);
   }

   static void l(View var0) {
      var0.requestFitSystemWindows();
   }

   public static void m(View var0, Drawable var1) {
      var0.setBackground(var1);
   }

   public static void n(View var0, boolean var1) {
      var0.setHasTransientState(var1);
   }

   public static void o(View var0, int var1) {
      var0.setImportantForAccessibility(var1);
   }

   public static boolean p(View var0) {
      return var0.getFitsSystemWindows();
   }

   public static boolean q(View var0) {
      return var0.hasOverlappingRendering();
   }

   public static boolean r(View var0) {
      return var0.hasTransientState();
   }

   static boolean s(View var0, int var1, Bundle var2) {
      return var0.performAccessibilityAction(var1, var2);
   }
}
