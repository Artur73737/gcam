import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class cin extends cfe {
   public final void a(View var1, AccessibilityEvent var2) {
      super.a(var1, var2);
      NestedScrollView var4 = (NestedScrollView)var1;
      var2.setClassName(ScrollView.class.getName());
      boolean var3;
      if (var4.b() > 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      var2.setScrollable(var3);
      var2.setScrollX(var4.getScrollX());
      var2.setScrollY(var4.getScrollY());
      chu.c(var2, var4.getScrollX());
      chu.d(var2, var4.b());
   }

   public final void b(View var1, cht var2) {
      super.b(var1, var2);
      NestedScrollView var4 = (NestedScrollView)var1;
      var2.l(ScrollView.class.getName());
      if (var4.isEnabled()) {
         int var3 = var4.b();
         if (var3 > 0) {
            var2.w(true);
            if (var4.getScrollY() > 0) {
               var2.h(chr.n);
               var2.h(chr.y);
            }

            if (var4.getScrollY() < var3) {
               var2.h(chr.m);
               var2.h(chr.A);
            }
         }
      }

   }

   public final boolean h(View var1, int var2, Bundle var3) {
      if (super.h(var1, var2, var3)) {
         return true;
      } else {
         NestedScrollView var7 = (NestedScrollView)var1;
         if (!var7.isEnabled()) {
            return false;
         } else {
            int var5 = var7.getHeight();
            Rect var6 = new Rect();
            int var4 = var5;
            if (var7.getMatrix().isIdentity()) {
               var4 = var5;
               if (var7.getGlobalVisibleRect(var6)) {
                  var4 = var6.height();
               }
            }

            switch(var2) {
            case 4096:
            case 16908346:
               var5 = var7.getPaddingBottom();
               var2 = var7.getPaddingTop();
               var2 = Math.min(var7.getScrollY() + (var4 - var5 - var2), var7.b());
               if (var2 != var7.getScrollY()) {
                  var7.u(var2);
                  return true;
               }

               return false;
            case 8192:
            case 16908344:
               var5 = var7.getPaddingBottom();
               var2 = var7.getPaddingTop();
               var2 = Math.max(var7.getScrollY() - (var4 - var5 - var2), 0);
               if (var2 != var7.getScrollY()) {
                  var7.u(var2);
                  return true;
               }

               return false;
            default:
               return false;
            }
         }
      }
   }
}
