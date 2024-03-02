import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;
import com.google.android.material.appbar.XD.SSYOSt;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cht {
   public final AccessibilityNodeInfo a;
   public int b = -1;
   public int c = -1;

   private cht(AccessibilityNodeInfo var1) {
      this.a = var1;
   }

   private final List I(String var1) {
      ArrayList var3 = chs.a(this.a).getIntegerArrayList(var1);
      ArrayList var2 = var3;
      if (var3 == null) {
         var2 = new ArrayList();
         chs.a(this.a).putIntegerArrayList(var1, var2);
      }

      return var2;
   }

   public static cht b(AccessibilityNodeInfo var0) {
      return new cht(var0);
   }

   static String e(int var0) {
      switch(var0) {
      case 1:
         return "ACTION_FOCUS";
      case 2:
         return "ACTION_CLEAR_FOCUS";
      case 4:
         return "ACTION_SELECT";
      case 8:
         return "ACTION_CLEAR_SELECTION";
      case 16:
         return "ACTION_CLICK";
      case 32:
         return "ACTION_LONG_CLICK";
      case 64:
         return "ACTION_ACCESSIBILITY_FOCUS";
      case 128:
         return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
      case 256:
         return RbaSbznIXS.qcTcUd;
      case 512:
         return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
      case 1024:
         return "ACTION_NEXT_HTML_ELEMENT";
      case 2048:
         return "ACTION_PREVIOUS_HTML_ELEMENT";
      case 4096:
         return "ACTION_SCROLL_FORWARD";
      case 8192:
         return "ACTION_SCROLL_BACKWARD";
      case 16384:
         return "ACTION_COPY";
      case 32768:
         return "ACTION_PASTE";
      case 65536:
         return "ACTION_CUT";
      case 131072:
         return "ACTION_SET_SELECTION";
      case 262144:
         return "ACTION_EXPAND";
      case 524288:
         return "ACTION_COLLAPSE";
      case 2097152:
         return "ACTION_SET_TEXT";
      case 16908342:
         return "ACTION_SHOW_ON_SCREEN";
      case 16908343:
         return "ACTION_SCROLL_TO_POSITION";
      case 16908344:
         return "ACTION_SCROLL_UP";
      case 16908345:
         return "ACTION_SCROLL_LEFT";
      case 16908346:
         return "ACTION_SCROLL_DOWN";
      case 16908347:
         return "ACTION_SCROLL_RIGHT";
      case 16908348:
         return "ACTION_CONTEXT_CLICK";
      case 16908349:
         return "ACTION_SET_PROGRESS";
      case 16908354:
         return "ACTION_MOVE_WINDOW";
      case 16908356:
         return "ACTION_SHOW_TOOLTIP";
      case 16908357:
         return "ACTION_HIDE_TOOLTIP";
      case 16908358:
         return "ACTION_PAGE_UP";
      case 16908359:
         return "ACTION_PAGE_DOWN";
      case 16908360:
         return "ACTION_PAGE_LEFT";
      case 16908361:
         return "ACTION_PAGE_RIGHT";
      case 16908362:
         return "ACTION_PRESS_AND_HOLD";
      case 16908372:
         return "ACTION_IME_ENTER";
      case 16908373:
         return "ACTION_DRAG_START";
      case 16908374:
         return "ACTION_DRAG_DROP";
      case 16908375:
         return "ACTION_DRAG_CANCEL";
      default:
         return var0 == 16908382 ? "ACTION_SCROLL_IN_DIRECTION" : "ACTION_UNKNOWN";
      }
   }

   public final boolean A() {
      return this.a.isClickable();
   }

   public final boolean B() {
      return this.a.isFocusable();
   }

   public final boolean C() {
      return this.a.isFocused();
   }

   public final boolean D() {
      return this.a.isLongClickable();
   }

   public final boolean E() {
      return this.a.isPassword();
   }

   public final boolean F() {
      return this.a.isScrollable();
   }

   public final void G(chr var1) {
      this.a.removeAction((AccessibilityAction)var1.N);
   }

   public final void H() {
      Bundle var1 = this.a();
      if (var1 != null) {
         String var2 = SSYOSt.ZNuNhtI;
         var1.putInt(var2, var1.getInt(var2, 0) & -67108865 | 67108864);
      }

   }

   public final Bundle a() {
      return chs.a(this.a);
   }

   public final CharSequence c() {
      return this.a.getClassName();
   }

   public final CharSequence d() {
      if (this.I("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
         return this.a.getText();
      } else {
         List var4 = this.I("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
         List var5 = this.I("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
         List var6 = this.I("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
         List var3 = this.I(diyLl.yBbFIPrKx);
         CharSequence var7 = this.a.getText();
         int var2 = this.a.getText().length();
         int var1 = 0;

         SpannableString var8;
         for(var8 = new SpannableString(TextUtils.substring(var7, 0, var2)); var1 < var4.size(); ++var1) {
            var8.setSpan(new chp((Integer)var3.get(var1), this, this.a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (Integer)var4.get(var1), (Integer)var5.get(var1), (Integer)var6.get(var1));
         }

         return var8;
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!(var1 instanceof cht)) {
         return false;
      } else {
         cht var2 = (cht)var1;
         AccessibilityNodeInfo var3 = this.a;
         if (var3 == null) {
            if (var2.a != null) {
               return false;
            }
         } else if (!var3.equals(var2.a)) {
            return false;
         }

         if (this.c != var2.c) {
            return false;
         } else {
            return this.b == var2.b;
         }
      }
   }

   public final List f() {
      List var4 = this.a.getActionList();
      if (var4 == null) {
         return Collections.emptyList();
      } else {
         ArrayList var3 = new ArrayList();
         int var2 = var4.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            var3.add(new chr(var4.get(var1), 0, (CharSequence)null, (cic)null, (Class)null));
         }

         return var3;
      }
   }

   public final void g(int var1) {
      this.a.addAction(var1);
   }

   public final void h(chr var1) {
      this.a.addAction((AccessibilityAction)var1.N);
   }

   public final int hashCode() {
      AccessibilityNodeInfo var1 = this.a;
      return var1 == null ? 0 : var1.hashCode();
   }

   public final void i(boolean var1) {
      this.a.setAccessibilityFocused(var1);
   }

   public final void j(boolean var1) {
      this.a.setCheckable(var1);
   }

   public final void k(boolean var1) {
      this.a.setChecked(var1);
   }

   public final void l(CharSequence var1) {
      this.a.setClassName(var1);
   }

   public final void m(boolean var1) {
      this.a.setClickable(var1);
   }

   public final void n(Object var1) {
      this.a.setCollectionInfo((CollectionInfo)((dmx)var1).a);
   }

   public final void o(Object var1) {
      this.a.setCollectionItemInfo((CollectionItemInfo)((eze)var1).a);
   }

   public final void p(boolean var1) {
      this.a.setDismissable(var1);
   }

   public final void q(boolean var1) {
      this.a.setHeading(var1);
   }

   public final void r(boolean var1) {
      this.a.setLongClickable(var1);
   }

   public final void s(int var1) {
      this.a.setMovementGranularities(var1);
   }

   public final void t(CharSequence var1) {
      this.a.setPaneTitle(var1);
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(super.toString());
      Rect var2 = new Rect();
      this.a.getBoundsInParent(var2);
      StringBuilder var4 = new StringBuilder();
      var4.append("; boundsInParent: ");
      var4.append(var2);
      var3.append("; boundsInParent: ".concat(var2.toString()));
      this.a.getBoundsInScreen(var2);
      var4 = new StringBuilder();
      var4.append("; boundsInScreen: ");
      var4.append(var2);
      var3.append("; boundsInScreen: ".concat(var2.toString()));
      var3.append("; packageName: ");
      var3.append(this.a.getPackageName());
      var3.append("; className: ");
      var3.append(this.c());
      var3.append("; text: ");
      var3.append(this.d());
      var3.append("; contentDescription: ");
      var3.append(this.a.getContentDescription());
      var3.append("; viewId: ");
      var3.append(this.a.getViewIdResourceName());
      var3.append("; uniqueId: ");
      int var1 = cdz.a;
      var3.append(this.a.getUniqueId());
      var3.append("; checkable: ");
      var3.append(this.z());
      var3.append(yGCWWDnsImN.BBNZYtJS);
      var3.append(this.a.isChecked());
      var3.append("; focusable: ");
      var3.append(this.B());
      var3.append("; focused: ");
      var3.append(this.C());
      var3.append("; selected: ");
      var3.append(this.a.isSelected());
      var3.append("; clickable: ");
      var3.append(this.A());
      var3.append("; longClickable: ");
      var3.append(this.D());
      var3.append(PUdPFKr.TzegUV);
      var3.append(this.a.isEnabled());
      var3.append("; password: ");
      var3.append(this.E());
      StringBuilder var6 = new StringBuilder();
      var6.append("; scrollable: ");
      var6.append(this.F());
      var3.append(var6.toString());
      var3.append("; [");
      List var8 = this.f();

      for(var1 = 0; var1 < var8.size(); ++var1) {
         chr var5 = (chr)var8.get(var1);
         String var7 = e(var5.a());
         if (var7.equals("ACTION_UNKNOWN") && var5.b() != null) {
            var7 = var5.b().toString();
         }

         var3.append(var7);
         if (var1 != var8.size() - 1) {
            var3.append(", ");
         }
      }

      var3.append("]");
      return var3.toString();
   }

   public final void u(CharSequence var1) {
      chs.a(this.a).putCharSequence("AccessibilityNodeInfo.roleDescription", var1);
   }

   public final void v(boolean var1) {
      this.a.setScreenReaderFocusable(var1);
   }

   public final void w(boolean var1) {
      this.a.setScrollable(var1);
   }

   public final void x(CharSequence var1) {
      int var2 = cdz.a;
      this.a.setStateDescription(var1);
   }

   public final void y(CharSequence var1) {
      this.a.setText(var1);
   }

   public final boolean z() {
      return this.a.isCheckable();
   }
}
