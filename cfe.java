import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class cfe {
   private static final AccessibilityDelegate a = new AccessibilityDelegate();
   public final AccessibilityDelegate A;
   private final AccessibilityDelegate b;

   public cfe() {
      this(a);
   }

   public cfe(AccessibilityDelegate var1) {
      this.b = var1;
      this.A = new cfc(this);
   }

   static List S(View var0) {
      List var1 = (List)var0.getTag(2131428297);
      List var2 = var1;
      if (var1 == null) {
         var2 = Collections.emptyList();
      }

      return var2;
   }

   public void a(View var1, AccessibilityEvent var2) {
      this.b.onInitializeAccessibilityEvent(var1, var2);
   }

   public void b(View var1, cht var2) {
      this.b.onInitializeAccessibilityNodeInfo(var1, var2.a);
   }

   public void c(View var1, AccessibilityEvent var2) {
      this.b.onPopulateAccessibilityEvent(var1, var2);
   }

   public void d(View var1, int var2) {
      this.b.sendAccessibilityEvent(var1, var2);
   }

   public void e(View var1, AccessibilityEvent var2) {
      this.b.sendAccessibilityEventUnchecked(var1, var2);
   }

   public boolean f(View var1, AccessibilityEvent var2) {
      return this.b.dispatchPopulateAccessibilityEvent(var1, var2);
   }

   public boolean g(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return this.b.onRequestSendAccessibilityEvent(var1, var2, var3);
   }

   public boolean h(View var1, int var2, Bundle var3) {
      List var8 = S(var1);
      boolean var7 = false;
      int var4 = 0;

      boolean var5;
      while(true) {
         if (var4 < var8.size()) {
            chr var9 = (chr)var8.get(var4);
            if (var9.a() != var2) {
               ++var4;
               continue;
            }

            if (var9.Q != null) {
               Class var16 = var9.P;
               if (var16 != null) {
                  try {
                     cch var18 = (cch)var16.getDeclaredConstructor().newInstance();
                  } catch (Exception var11) {
                     var16 = var9.P;
                     String var17;
                     if (var16 == null) {
                        var17 = "null";
                     } else {
                        var17 = var16.getName();
                     }

                     Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(var17)), var11);
                  }
               }

               var5 = var9.Q.a(var1);
               break;
            }
         }

         var5 = false;
         break;
      }

      boolean var6 = var5;
      if (!var5) {
         var6 = cfd.b(this.b, var1, var2, var3);
      }

      if (!var6 && var2 == 2131427345 && var3 != null) {
         var2 = var3.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
         SparseArray var12 = (SparseArray)var1.getTag(2131428298);
         if (var12 != null) {
            WeakReference var13 = (WeakReference)var12.get(var2);
            if (var13 != null) {
               ClickableSpan var19 = (ClickableSpan)var13.get();
               if (var19 != null) {
                  CharSequence var14 = var1.createAccessibilityNodeInfo().getText();
                  ClickableSpan[] var15;
                  if (var14 instanceof Spanned) {
                     var15 = (ClickableSpan[])((Spanned)var14).getSpans(0, var14.length(), ClickableSpan.class);
                  } else {
                     var15 = null;
                  }

                  for(var2 = 0; var15 != null && var2 < var15.length; ++var2) {
                     if (var19.equals(var15[var2])) {
                        var19.onClick(var1);
                        var5 = true;
                        return var5;
                     }
                  }
               }
            }
         }

         var5 = var7;
         return var5;
      } else {
         return var6;
      }
   }

   public eze i(View var1) {
      AccessibilityNodeProvider var2 = cfd.a(this.b, var1);
      return var2 != null ? new eze(var2, (byte[])null) : null;
   }
}
