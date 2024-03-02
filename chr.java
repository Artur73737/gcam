import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public final class chr {
   public static final chr A;
   public static final chr B;
   public static final chr C;
   public static final chr D;
   public static final chr E;
   public static final chr F;
   public static final chr G;
   public static final chr H;
   public static final chr I;
   public static final chr J;
   public static final chr K;
   public static final chr L;
   public static final chr M;
   public static final chr a = new chr(1, (CharSequence)null);
   public static final chr b = new chr(2, (CharSequence)null);
   public static final chr c = new chr(4, (CharSequence)null);
   public static final chr d = new chr(8, (CharSequence)null);
   public static final chr e = new chr(16, (CharSequence)null);
   public static final chr f = new chr(32, (CharSequence)null);
   public static final chr g = new chr(64, (CharSequence)null);
   public static final chr h = new chr(128, (CharSequence)null);
   public static final chr i = new chr(256, chv.class);
   public static final chr j = new chr(512, chv.class);
   public static final chr k = new chr(1024, chw.class);
   public static final chr l = new chr(2048, chw.class);
   public static final chr m = new chr(4096, (CharSequence)null);
   public static final chr n = new chr(8192, (CharSequence)null);
   public static final chr o = new chr(16384, (CharSequence)null);
   public static final chr p = new chr(32768, (CharSequence)null);
   public static final chr q = new chr(65536, (CharSequence)null);
   public static final chr r = new chr(131072, cia.class);
   public static final chr s = new chr(262144, (CharSequence)null);
   public static final chr t = new chr(524288, (CharSequence)null);
   public static final chr u = new chr(1048576, (CharSequence)null);
   public static final chr v = new chr(2097152, cib.class);
   public static final chr w;
   public static final chr x;
   public static final chr y;
   public static final chr z;
   final Object N;
   public final int O;
   public final Class P;
   public final cic Q;

   static {
      w = new chr(AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence)null, (cic)null, (Class)null);
      x = new chr(AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence)null, (cic)null, chy.class);
      y = new chr(AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence)null, (cic)null, (Class)null);
      z = new chr(AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence)null, (cic)null, (Class)null);
      A = new chr(AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence)null, (cic)null, (Class)null);
      B = new chr(AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence)null, (cic)null, (Class)null);
      C = new chr(AccessibilityAction.ACTION_PAGE_UP, 16908358, (CharSequence)null, (cic)null, (Class)null);
      D = new chr(AccessibilityAction.ACTION_PAGE_DOWN, 16908359, (CharSequence)null, (cic)null, (Class)null);
      E = new chr(AccessibilityAction.ACTION_PAGE_LEFT, 16908360, (CharSequence)null, (cic)null, (Class)null);
      F = new chr(AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, (CharSequence)null, (cic)null, (Class)null);
      G = new chr(AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence)null, (cic)null, (Class)null);
      H = new chr(AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence)null, (cic)null, chz.class);
      I = new chr(AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence)null, (cic)null, chx.class);
      J = new chr(AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (CharSequence)null, (cic)null, (Class)null);
      K = new chr(AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (CharSequence)null, (cic)null, (Class)null);
      L = new chr(AccessibilityAction.ACTION_PRESS_AND_HOLD, 16908362, (CharSequence)null, (cic)null, (Class)null);
      new chr(AccessibilityAction.ACTION_IME_ENTER, 16908372, (CharSequence)null, (cic)null, (Class)null);
      new chr(AccessibilityAction.ACTION_DRAG_START, 16908373, (CharSequence)null, (cic)null, (Class)null);
      new chr(AccessibilityAction.ACTION_DRAG_DROP, 16908374, (CharSequence)null, (cic)null, (Class)null);
      new chr(AccessibilityAction.ACTION_DRAG_CANCEL, 16908375, (CharSequence)null, (cic)null, (Class)null);
      new chr(AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, 16908376, (CharSequence)null, (cic)null, (Class)null);
      int var0 = cdz.a;
      M = new chr(AccessibilityAction.ACTION_SCROLL_IN_DIRECTION, 16908382, (CharSequence)null, (cic)null, (Class)null);
   }

   public chr(int var1, CharSequence var2) {
      this((Object)null, var1, var2, (cic)null, (Class)null);
   }

   private chr(int var1, Class var2) {
      this((Object)null, var1, (CharSequence)null, (cic)null, var2);
   }

   public chr(Object var1, int var2, CharSequence var3, cic var4, Class var5) {
      this.O = var2;
      this.Q = var4;
      Object var6 = var1;
      if (var1 == null) {
         var6 = new AccessibilityAction(var2, var3);
      }

      this.N = var6;
      this.P = var5;
   }

   public final int a() {
      return ((AccessibilityAction)this.N).getId();
   }

   public final CharSequence b() {
      return ((AccessibilityAction)this.N).getLabel();
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof chr)) {
         return false;
      } else {
         chr var2 = (chr)var1;
         return this.N.equals(var2.N);
      }
   }

   public final int hashCode() {
      return this.N.hashCode();
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("AccessibilityActionCompat: ");
      String var1 = cht.e(this.O);
      if (var1.equals("ACTION_UNKNOWN") && this.b() != null) {
         var1 = this.b().toString();
      }

      var2.append(var1);
      return var2.toString();
   }
}
