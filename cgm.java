import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class cgm {
   public static final int[] a;
   private static WeakHashMap b;
   private static final cfv c;

   static {
      new AtomicInteger(1);
      b = null;
      a = new int[]{2131427346, 2131427347, 2131427358, 2131427369, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427377, 2131427348, 2131427349, 2131427350, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427357, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427368, 2131427370, 2131427371};
      c = new cfv();
   }

   public static cfe a(View var0) {
      AccessibilityDelegate var1 = cgj.a(var0);
      if (var1 == null) {
         return null;
      } else {
         return var1 instanceof cfc ? ((cfc)var1).a : new cfe(var1);
      }
   }

   public static cho b(View var0, cho var1) {
      WindowInsets var2 = var1.e();
      if (var2 != null) {
         WindowInsets var3 = cgb.a(var0, var2);
         if (!var3.equals(var2)) {
            return cho.n(var3, var0);
         }
      }

      return var1;
   }

   public static cho c(View var0, cho var1) {
      WindowInsets var3 = var1.e();
      if (var3 != null) {
         WindowInsets var2 = cgb.b(var0, var3);
         if (!var2.equals(var3)) {
            return cho.n(var2, var0);
         }
      }

      return var1;
   }

   public static List d(View var0) {
      ArrayList var2 = (ArrayList)var0.getTag(2131428297);
      ArrayList var1 = var2;
      if (var2 == null) {
         var1 = new ArrayList();
         var0.setTag(2131428297, var1);
      }

      return var1;
   }

   public static void e(View var0, chr var1) {
      cfe var3 = a(var0);
      cfe var2 = var3;
      if (var3 == null) {
         var2 = new cfe();
      }

      g(var0, var2);
      m(var1.a(), var0);
      d(var0).add(var1);
      j(var0);
   }

   public static void f(View var0, int var1) {
      m(var1, var0);
      j(var0);
   }

   public static void g(View var0, cfe var1) {
      cfe var2 = var1;
      if (var1 == null) {
         var2 = var1;
         if (cgj.a(var0) instanceof cfc) {
            var2 = new cfe();
         }
      }

      AccessibilityDelegate var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.A;
      }

      var0.setAccessibilityDelegate(var3);
   }

   public static void h(View var0, CharSequence var1) {
      cgi.f(var0, var1);
      cfv var5;
      if (var1 != null) {
         var5 = c;
         WeakHashMap var4 = var5.a;
         boolean var3 = var0.isShown();
         boolean var2 = false;
         if (var3 && var0.getWindowVisibility() == 0) {
            var2 = true;
         }

         var4.put(var0, var2);
         var0.addOnAttachStateChangeListener(var5);
         if (cga.e(var0)) {
            var5.a(var0);
         }

      } else {
         var5 = c;
         var5.a.remove(var0);
         var0.removeOnAttachStateChangeListener(var5);
         cfx.k(var0.getViewTreeObserver(), var5);
      }
   }

   public static void i(View var0, chr var1, cic var2) {
      if (var2 == null) {
         f(var0, var1.a());
      } else {
         e(var0, new chr((Object)null, var1.O, (CharSequence)null, var2, var1.P));
      }
   }

   static void j(View var0) {
      if (((AccessibilityManager)var0.getContext().getSystemService("accessibility")).isEnabled()) {
         boolean var1;
         if (cgi.a(var0) != null && var0.isShown() && var0.getWindowVisibility() == 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         ViewParent var3;
         if (cga.a(var0) == 0 && !var1) {
            if (var0.getParent() != null) {
               var3 = var0.getParent();

               try {
                  cga.b(var3, var0, var0, 0);
               } catch (AbstractMethodError var5) {
                  Log.e("ViewCompat", String.valueOf(var0.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), var5);
               }
            }
         } else {
            short var2;
            if (!var1) {
               var2 = 2048;
            } else {
               var2 = 32;
            }

            AccessibilityEvent var4 = AccessibilityEvent.obtain();
            var4.setEventType(var2);
            cga.d(var4, 0);
            if (var1) {
               var4.getText().add(cgi.a(var0));
               if (cfx.a(var0) == 0) {
                  cfx.o(var0, 1);
               }

               for(var3 = var0.getParent(); var3 instanceof View; var3 = var3.getParent()) {
                  if (cfx.a((View)var3) == 4) {
                     cfx.o(var0, 2);
                     break;
                  }
               }
            }

            var0.sendAccessibilityEventUnchecked(var4);
         }
      }
   }

   public static dmx k(View var0) {
      if (b == null) {
         b = new WeakHashMap();
      }

      dmx var2 = (dmx)b.get(var0);
      dmx var1 = var2;
      if (var2 == null) {
         var1 = new dmx(var0);
         b.put(var0, var1);
      }

      return var1;
   }

   public static eze l(View var0) {
      return new eze(cgg.d(var0), (byte[])null);
   }

   private static void m(int var0, View var1) {
      List var3 = d(var1);

      for(int var2 = 0; var2 < var3.size(); ++var2) {
         if (((chr)var3.get(var2)).a() == var0) {
            var3.remove(var2);
            return;
         }
      }

   }
}
