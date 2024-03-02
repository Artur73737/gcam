import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bol extends cfe implements cll {
   public static final int[] a = new int[]{2131427346, 2131427347, 2131427358, 2131427369, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427377, 2131427348, 2131427349, 2131427350, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427357, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427368, 2131427370, 2131427371};
   private final xj B;
   private final rdb C;
   private final xh D;
   private final xj E;
   private Map F;
   private final qvt G;
   private final dmw H;
   private final eze I;
   public final boa b;
   public int c;
   public final AccessibilityManager d;
   public final AccessibilityStateChangeListener e;
   public final TouchExplorationStateChangeListener f;
   public List g;
   public final Handler h;
   public int i;
   public final xp j;
   public final xp k;
   public int l;
   public Integer m;
   public boolean n;
   public boh o;
   public final xj p;
   public final HashMap q;
   public final HashMap r;
   public final String s;
   public final String t;
   public final Map u;
   public boolean v;
   public final Runnable w;
   public final List x;
   public bbf y;
   public ebt z;

   public bol(boa var1) {
      this.b = var1;
      this.c = Integer.MIN_VALUE;
      Object var2 = var1.getContext().getSystemService("accessibility");
      var2.getClass();
      AccessibilityManager var3 = (AccessibilityManager)var2;
      this.d = var3;
      this.e = new bob(this);
      this.f = new kfc(this, 1);
      this.g = var3.getEnabledAccessibilityServiceList(-1);
      this.h = new Handler(Looper.getMainLooper());
      this.I = new eze(new bog(this), (byte[])null);
      this.i = Integer.MIN_VALUE;
      this.j = new xp();
      this.k = new xp();
      this.l = -1;
      this.B = new xj();
      this.C = quy.B(-1, 0, 6);
      this.n = true;
      this.D = new xh();
      this.E = new xj();
      this.F = qtg.a;
      this.p = new xj();
      this.q = new HashMap();
      this.r = new HashMap();
      this.s = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
      this.t = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
      this.H = new dmw((char[])null);
      this.u = new LinkedHashMap();
      this.y = new bbf(var1.I.L(), qtg.a);
      var1.addOnAttachStateChangeListener(new bpz(this, 1));
      this.w = new boc(this);
      this.x = new ArrayList();
      this.G = new bkh(this, 9);
   }

   public static final boolean G(brj var0, float var1) {
      boolean var3 = true;
      boolean var2;
      if (var1 < 0.0F) {
         var2 = var3;
         if (((Number)var0.a.a()).floatValue() > 0.0F) {
            return var2;
         }
      }

      if (var1 > 0.0F) {
         if (!(((Number)var0.a.a()).floatValue() < ((Number)var0.b.a()).floatValue())) {
            return false;
         }

         var2 = var3;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static final boolean H(brj var0) {
      boolean var1;
      if (((Number)var0.a.a()).floatValue() > 0.0F) {
         var1 = true;
      } else {
         if (((Number)var0.a.a()).floatValue() < ((Number)var0.b.a()).floatValue()) {
            return false;
         }

         var1 = false;
      }

      return var1;
   }

   public static final boolean I(brj var0) {
      boolean var1;
      if (((Number)var0.a.a()).floatValue() < ((Number)var0.b.a()).floatValue()) {
         var1 = true;
      } else {
         if (((Number)var0.a.a()).floatValue() > 0.0F) {
            return false;
         }

         var1 = false;
      }

      return var1;
   }

   public static final boolean K(bro var0) {
      brv var4 = (brv)la.l(var0.c, brp.y);
      bri var3 = (bri)la.l(var0.c, brp.q);
      Boolean var5 = (Boolean)la.l(var0.c, brp.x);
      boolean var2 = true;
      boolean var1;
      if (var4 != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var5 != null) {
         var5;
         if (var3 == null || !c.n(var3.a, 4)) {
            var1 = var2;
         }
      }

      return var1;
   }

   public static final bry L(brl var0) {
      return (bry)la.l(var0, brp.v);
   }

   // $FF: synthetic method
   public static void M(bol var0, int var1, int var2, Integer var3, int var4) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      var0.P(var1, var2, var3, (List)null);
   }

   public static final CharSequence N(CharSequence var0) {
      if (var0 != null && var0.length() != 0) {
         int var2 = var0.length();
         int var1 = 100000;
         if (var2 > 100000) {
            if (Character.isHighSurrogate(var0.charAt(99999)) && Character.isLowSurrogate(var0.charAt(100000))) {
               var1 = 99999;
            }

            var0 = var0.subSequence(0, var1);
            var0.getClass();
            return var0;
         }
      }

      return var0;
   }

   public static final String O(bro var0) {
      if (!var0.c.d(brp.a)) {
         bry var2;
         if (var0.c.d(brk.h)) {
            var2 = L(var0.c);
            return var2 != null ? var2.a : null;
         } else {
            List var1 = (List)la.l(var0.c, brp.s);
            if (var1 != null) {
               var2 = (bry)pwm.aw(var1);
               if (var2 != null) {
                  return var2.a;
               }
            }

            return null;
         }
      } else {
         return ei.f((List)var0.c.a(brp.a), ",");
      }
   }

   private final List T(boolean var1, List var2) {
      LinkedHashMap var12 = new LinkedHashMap();
      ArrayList var14 = new ArrayList();
      int var8 = var2.size();

      int var7;
      for(var7 = 0; var7 < var8; ++var7) {
         this.U((bro)var2.get(var7), var1, var14, var12);
      }

      ArrayList var13 = new ArrayList();
      int var10 = pwm.al(var14);
      if (var10 >= 0) {
         var7 = 0;

         while(true) {
            label66: {
               Object var17 = var14.get(var7);
               var17.getClass();
               bro var18 = (bro)var17;
               if (var7 != 0) {
                  float var3 = var18.c().c;
                  float var5 = var18.c().e;
                  int var11 = pwm.al(var13);
                  var8 = var7;
                  if (var11 >= 0) {
                     int var9 = 0;

                     while(true) {
                        bcj var15 = (bcj)((qsg)var13.get(var9)).a;
                        float var4 = var15.c;
                        float var6 = var15.e;
                        if (!(var3 >= var5) && !(var4 >= var6) && Math.max(var3, var4) < Math.min(var5, var15.e)) {
                           var13.set(var9, new qsg(new bcj(Math.max(var15.b, 0.0F), Math.max(var15.c, var3), Math.min(var15.d, Float.POSITIVE_INFINITY), Math.min(var15.e, var5)), ((qsg)var13.get(var9)).b));
                           ((List)((qsg)var13.get(var9)).b).add(var18);
                           break label66;
                        }

                        var8 = var7;
                        if (var9 == var11) {
                           break;
                        }

                        ++var9;
                     }
                  }
               } else {
                  var8 = 0;
               }

               var13.add(new qsg(var18.c(), pwm.ao(var18)));
               var7 = var8;
            }

            if (var7 == var10) {
               break;
            }

            ++var7;
         }
      }

      pwm.aq(var13, bce.f);
      var14 = new ArrayList();
      var8 = var13.size();

      for(var7 = 0; var7 < var8; ++var7) {
         qsg var16 = (qsg)var13.get(var7);
         List var21 = (List)var16.b;
         bce var19;
         if (var1) {
            var19 = bce.e;
         } else {
            var19 = bce.d;
         }

         pwm.aq(var21, new ajf(new bok(var19, bmd.c), 5));
         var14.addAll((Collection)var16.b);
      }

      pwm.aq(var14, new ajf(bpf.b, 4, (byte[])null));

      for(var7 = 0; var7 <= pwm.al(var14); var7 += var8) {
         Integer var20 = ((bro)var14.get(var7)).e;
         var2 = (List)var12.get(var20);
         if (var2 != null) {
            var14.remove(var7);
            var14.addAll(var7, var2);
         }

         var2 = (List)var12.get(var20);
         if (var2 != null) {
            var8 = var2.size();
         } else {
            var8 = 1;
         }
      }

      return var14;
   }

   private final void U(bro var1, boolean var2, ArrayList var3, Map var4) {
      boolean var7 = (Boolean)var1.e().b(brp.l, ara.u);
      if (var7 || this.E(var1)) {
         if (this.s().keySet().contains(var1.e)) {
            var3.add(var1);
         }

         if (var7) {
            var4.put(var1.e, this.T(var2, pwm.aE(var1.g())));
            return;
         }
      }

      List var8 = var1.g();
      int var6 = var8.size();

      for(int var5 = 0; var5 < var6; ++var5) {
         this.U((bro)var8.get(var5), var2, var3, var4);
      }

   }

   public static final float j(float var0, float var1) {
      float var2;
      if (Math.signum(var0) == Math.signum(var1)) {
         var2 = var1;
         if (Math.abs(var0) < Math.abs(var1)) {
            return var0;
         }
      } else {
         var2 = 0.0F;
      }

      return var2;
   }

   public final boolean A(boolean var1, int var2, long var3) {
      Collection var8 = this.s().values();
      var8.getClass();
      boolean var6 = c.o(var3, bci.c);
      boolean var5 = false;
      if (!var6) {
         if (Float.isNaN(bci.b(var3)) || Float.isNaN(bci.c(var3))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
         }

         bru var7;
         if (var1) {
            var7 = brp.p;
         } else {
            var7 = brp.o;
         }

         if (var8.isEmpty()) {
            var1 = var5;
         } else {
            Iterator var11 = var8.iterator();

            while(true) {
               if (!var11.hasNext()) {
                  var1 = var5;
                  break;
               }

               bpe var9 = (bpe)var11.next();
               Rect var10 = (Rect)var9.a;
               bcj var13 = new bcj((float)var10.left, (float)var10.top, (float)var10.right, (float)var10.bottom);
               if (bci.b(var3) >= var13.b && bci.b(var3) < var13.d && bci.c(var3) >= var13.c && bci.c(var3) < var13.e) {
                  brj var12 = (brj)la.l(((bro)var9.b).e(), var7);
                  if (var12 != null) {
                     if (var2 < 0) {
                        if (((Number)var12.a.a()).floatValue() > 0.0F) {
                           var1 = true;
                           break;
                        }
                     } else if (((Number)var12.a.a()).floatValue() < ((Number)var12.b.a()).floatValue()) {
                        var1 = true;
                        break;
                     }
                  }
               }
            }
         }
      } else {
         var1 = var5;
      }

      return var1;
   }

   public final boolean B(int var1) {
      return this.i == var1;
   }

   public final boolean C() {
      return this.D();
   }

   public final boolean D() {
      if (this.d.isEnabled()) {
         List var1 = this.g;
         var1.getClass();
         if (!var1.isEmpty()) {
            return true;
         }
      }

      return false;
   }

   public final boolean E(bro var1) {
      String var4 = bom.c(var1);
      boolean var3 = false;
      boolean var2;
      if (var4 == null && this.n(var1) == null && this.r(var1) == null) {
         if (K(var1)) {
            var2 = true;
         } else {
            var2 = false;
         }
      } else {
         var2 = true;
      }

      if (!var1.c.b) {
         if (!var1.j()) {
            return var3;
         }

         if (!var2) {
            return false;
         }
      }

      var3 = true;
      return var3;
   }

   public final boolean F() {
      boolean var3 = this.d.isEnabled();
      boolean var2 = false;
      boolean var1 = var2;
      if (var3) {
         var1 = var2;
         if (this.d.isTouchExplorationEnabled()) {
            var1 = true;
         }
      }

      return var1;
   }

   public final boolean J(bro var1, int var2, int var3, boolean var4) {
      if (var1.c.d(brk.g) && bom.e(var1)) {
         return (Boolean)((qvy)((brc)var1.c.a(brk.g)).a).a(var2, var3, var4);
      } else {
         boolean var5 = false;
         if (var2 == var3 && var3 == this.l) {
            return false;
         } else {
            String var9 = O(var1);
            if (var9 == null) {
               return false;
            } else {
               if (var2 >= 0 && var2 == var3) {
                  if (var3 > var9.length()) {
                     var2 = -1;
                  }
               } else {
                  var2 = -1;
               }

               this.l = var2;
               boolean var10;
               if (var9.length() > 0) {
                  var10 = true;
               } else {
                  var10 = var5;
               }

               var3 = this.m(var1.e);
               Integer var6;
               if (var10) {
                  var6 = this.l;
               } else {
                  var6 = null;
               }

               Integer var7;
               if (var10) {
                  var7 = this.l;
               } else {
                  var7 = null;
               }

               Integer var8;
               if (var10) {
                  var8 = var9.length();
               } else {
                  var8 = null;
               }

               this.Q(this.p(var3, var6, var7, var8, var9));
               this.x(var1.e);
               return true;
            }
         }
      }
   }

   public final void P(int var1, int var2, Integer var3, List var4) {
      if (var1 != Integer.MIN_VALUE && this.C()) {
         AccessibilityEvent var5 = this.o(var1, var2);
         if (var3 != null) {
            var5.setContentChangeTypes(var3);
         }

         if (var4 != null) {
            var5.setContentDescription(ei.f(var4, ","));
         }

         this.Q(var5);
      }
   }

   public final void Q(AccessibilityEvent var1) {
      if (this.D()) {
         this.b.getParent().requestSendAccessibilityEvent(this.b, var1);
      }
   }

   public final void R(bro var1, bbf var2) {
      LinkedHashSet var6 = new LinkedHashSet();
      List var8 = var1.h();
      int var5 = var8.size();
      byte var4 = 0;

      int var3;
      for(var3 = 0; var3 < var5; ++var3) {
         bro var7 = (bro)var8.get(var3);
         if (this.s().containsKey(var7.e)) {
            if (!((Set)var2.a).contains(var7.e)) {
               this.v(var1.b);
               return;
            }

            var6.add(var7.e);
         }
      }

      Iterator var10 = ((Set)var2.a).iterator();

      do {
         if (!var10.hasNext()) {
            List var12 = var1.h();
            var5 = var12.size();

            for(var3 = var4; var3 < var5; ++var3) {
               bro var11 = (bro)var12.get(var3);
               if (this.s().containsKey(var11.e)) {
                  Object var9 = this.u.get(var11.e);
                  var9.getClass();
                  this.R(var11, (bbf)var9);
               }
            }

            return;
         }
      } while(var6.contains(((Number)var10.next()).intValue()));

      this.v(var1.b);
   }

   public final eze i(View var1) {
      var1.getClass();
      return this.I;
   }

   public final int k(bro var1) {
      if (!var1.c.d(brp.a) && var1.c.d(brp.w)) {
         bsr var2 = (bsr)var1.c.a(brp.w);
         return bsr.a(0L);
      } else {
         return this.l;
      }
   }

   public final int l(bro var1) {
      if (!var1.c.d(brp.a) && var1.c.d(brp.w)) {
         bsr var2 = (bsr)var1.c.a(brp.w);
         return bsr.d(0L);
      } else {
         return this.l;
      }
   }

   public final int m(int var1) {
      int var2 = var1;
      if (var1 == this.b.I.L().e) {
         var2 = -1;
      }

      return var2;
   }

   public final SpannableString n(bro var1) {
      fwf var4 = this.b.w();
      bry var2 = L(var1.c);
      Object var3 = null;
      SpannableString var8;
      if (var2 != null) {
         var8 = btf.p(var2, this.b.d, var4, this.H);
      } else {
         var8 = null;
      }

      SpannableString var7;
      label20: {
         var8 = (SpannableString)N(var8);
         List var5 = (List)la.l(var1.c, brp.s);
         if (var5 != null) {
            bry var6 = (bry)pwm.aw(var5);
            if (var6 != null) {
               var7 = btf.p(var6, this.b.d, var4, this.H);
               break label20;
            }
         }

         var7 = (SpannableString)var3;
      }

      var7 = (SpannableString)N(var7);
      return var8 == null ? var7 : var8;
   }

   public final AccessibilityEvent o(int var1, int var2) {
      AccessibilityEvent var3 = AccessibilityEvent.obtain(var2);
      var3.getClass();
      var3.setEnabled(true);
      var3.setClassName("android.view.View");
      var3.setPackageName(this.b.getContext().getPackageName());
      var3.setSource(this.b, var1);
      if (this.D()) {
         bpe var4 = (bpe)this.s().get(var1);
         if (var4 != null) {
            var3.setPassword(((bro)var4.b).e().d(brp.z));
         }
      }

      return var3;
   }

   // $FF: synthetic method
   public final void onCreate(cmc var1) {
   }

   // $FF: synthetic method
   public final void onDestroy(cmc var1) {
   }

   // $FF: synthetic method
   public final void onPause(cmc var1) {
   }

   // $FF: synthetic method
   public final void onResume(cmc var1) {
   }

   public final void onStart(cmc var1) {
      this.u(true);
   }

   public final void onStop(cmc var1) {
      this.u(false);
   }

   public final AccessibilityEvent p(int var1, Integer var2, Integer var3, Integer var4, CharSequence var5) {
      AccessibilityEvent var6 = this.o(var1, 8192);
      if (var2 != null) {
         var6.setFromIndex(var2.intValue());
      }

      if (var3 != null) {
         var6.setToIndex(var3.intValue());
      }

      if (var4 != null) {
         var6.setItemCount(var4.intValue());
      }

      if (var5 != null) {
         var6.getText().add(var5);
      }

      return var6;
   }

   public final Object q(que param1) {
      // $FF: Couldn't be decompiled
   }

   public final String r(bro var1) {
      Object var6 = la.l(var1.c, brp.b);
      brv var8 = (brv)la.l(var1.c, brp.y);
      bri var7 = (bri)la.l(var1.c, brp.q);
      Object var5 = var6;
      if (var8 != null) {
         switch(var8.ordinal()) {
         case 0:
            var5 = var6;
            if (var7 != null) {
               var5 = var6;
               if (c.n(var7.a, 2)) {
                  var5 = var6;
                  if (var6 == null) {
                     var5 = this.b.getContext().getResources().getString(2132018061);
                  }
               }
            }
            break;
         case 1:
            var5 = var6;
            if (var7 != null) {
               var5 = var6;
               if (c.n(var7.a, 2)) {
                  var5 = var6;
                  if (var6 == null) {
                     var5 = this.b.getContext().getResources().getString(2132018057);
                  }
               }
            }
            break;
         case 2:
            var5 = var6;
            if (var6 == null) {
               var5 = this.b.getContext().getResources().getString(2132017691);
            }
            break;
         default:
            var5 = var6;
         }
      }

      Boolean var10 = (Boolean)la.l(var1.c, brp.x);
      var6 = var5;
      if (var10 != null) {
         label64: {
            boolean var4 = var10;
            if (var7 != null) {
               var6 = var5;
               if (c.n(var7.a, 4)) {
                  break label64;
               }
            }

            var6 = var5;
            if (var5 == null) {
               if (var4) {
                  var6 = this.b.getContext().getResources().getString(2132018363);
               } else {
                  var6 = this.b.getContext().getResources().getString(2132018044);
               }
            }
         }
      }

      brh var11 = (brh)la.l(var1.c, brp.c);
      Object var9 = var6;
      if (var11 != null) {
         if (var11 != brh.a) {
            var9 = var6;
            if (var6 == null) {
               float var2;
               if (((Number)qxo.a()).floatValue() - ((Number)qxo.b()).floatValue() == 0.0F) {
                  var2 = 0.0F;
               } else {
                  var2 = -((Number)qxo.b()).floatValue() / (((Number)qxo.a()).floatValue() - ((Number)qxo.b()).floatValue());
               }

               var2 = qxb.j(var2, 0.0F, 1.0F);
               int var3;
               if (var2 == 0.0F) {
                  var3 = 0;
               } else if (var2 == 1.0F) {
                  var3 = 100;
               } else {
                  var3 = qxb.m(qxg.e(var2 * 100.0F), 1, 99);
               }

               var9 = this.b.getContext().getResources().getString(2132018545, new Object[]{var3});
            }
         } else {
            var9 = var6;
            if (var6 == null) {
               var9 = this.b.getContext().getResources().getString(2132017682);
            }
         }
      }

      return (String)var9;
   }

   public final Map s() {
      if (this.n) {
         this.n = false;
         eze var6 = this.b.I;
         var6.getClass();
         bro var8 = var6.L();
         LinkedHashMap var7 = new LinkedHashMap();
         if (var8.b.d() && var8.b.ad()) {
            bcj var9 = var8.b();
            bom.d(new Region(qxg.e(var9.b), qxg.e(var9.c), qxg.e(var9.d), qxg.e(var9.e)), var8, var7, var8, new Region());
         }

         this.F = var7;
         if (this.D()) {
            this.q.clear();
            this.r.clear();
            bpe var10 = (bpe)this.s().get(-1);
            Object var11;
            if (var10 != null) {
               var11 = var10.b;
            } else {
               var11 = null;
            }

            var11.getClass();
            var8 = (bro)var11;
            bxy var14 = var8.b.j;
            bxy var12 = bxy.b;
            int var1 = 1;
            boolean var5;
            if (var14 == var12) {
               var5 = true;
            } else {
               var5 = false;
            }

            List var15 = this.T(var5, pwm.ao(var8));
            int var2 = pwm.al(var15);
            if (var2 > 0) {
               while(true) {
                  int var3 = ((bro)var15.get(var1 - 1)).e;
                  int var4 = ((bro)var15.get(var1)).e;
                  Integer var13 = var3;
                  Integer var16 = var4;
                  this.q.put(var13, var16);
                  this.r.put(var16, var13);
                  if (var1 == var2) {
                     break;
                  }

                  ++var1;
               }
            }
         }
      }

      return this.F;
   }

   public final void t(int var1, AccessibilityNodeInfo var2, String var3, Bundle var4) {
      Map var18 = this.s();
      Integer var19 = var1;
      bpe var31 = (bpe)var18.get(var19);
      if (var31 != null) {
         bro var32 = (bro)var31.b;
         String var20 = O(var32);
         Integer var23;
         if (c.E(var3, this.s)) {
            var23 = (Integer)this.q.get(var19);
            if (var23 != null) {
               var2.getExtras().putInt(var3, var23);
               return;
            }
         } else if (c.E(var3, this.t)) {
            var23 = (Integer)this.r.get(var19);
            if (var23 != null) {
               var2.getExtras().putInt(var3, var23);
               return;
            }
         } else {
            if (var32.c.d(brk.a) && var4 != null && c.E(var3, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
               int var11 = var4.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
               int var10 = var4.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
               if (var10 > 0 && var11 >= 0) {
                  if (var20 != null) {
                     var1 = var20.length();
                  } else {
                     var1 = Integer.MAX_VALUE;
                  }

                  if (var11 < var1) {
                     ArrayList var25 = new ArrayList();
                     if (c.E((Boolean)((qvt)((brc)var32.c.a(brk.a)).a).eo(var25), true)) {
                        bsq var34 = (bsq)var25.get(0);
                        ArrayList var33 = new ArrayList();
                        var1 = 0;

                        while(true) {
                           if (var1 >= var10) {
                              var2.getExtras().putParcelableArray(var3, (Parcelable[])var33.toArray(new RectF[0]));
                              break;
                           }

                           int var12 = var34.a.a.a();
                           int var9 = var11 + var1;
                           if (var9 >= var12) {
                              var33.add((Object)null);
                           } else {
                              bsc var26 = var34.b;
                              StringBuilder var22;
                              if (var9 < 0 || var9 >= var26.a().a.length()) {
                                 var22 = new StringBuilder();
                                 var22.append("offset(");
                                 var22.append(var9);
                                 var22.append(") is out of bounds [0, ");
                                 var22.append(var26.a().a());
                                 var22.append(')');
                                 throw new IllegalArgumentException(var22.toString());
                              }

                              var12 = la.h(var26.g, var9);
                              bse var27 = (bse)var26.g.get(var12);
                              brw var21 = var27.g;
                              var12 = var27.d(var9);
                              if (var12 < 0 || var12 >= var21.c.length()) {
                                 var22 = new StringBuilder();
                                 var22.append("offset(");
                                 var22.append(var12);
                                 var22.append(") is out of bounds [0,");
                                 var22.append(var21.c.length());
                                 var22.append(')');
                                 throw new IllegalArgumentException(var22.toString());
                              }

                              btk var35 = var21.b;
                              var9 = var35.g(var12);
                              float var8 = var35.b(var9);
                              float var7 = var35.a(var9);
                              var9 = var35.h(var9);
                              boolean var17 = var35.b.isRtlCharAt(var12);
                              boolean var30;
                              if (var9 == 1) {
                                 var30 = true;
                              } else {
                                 var30 = false;
                              }

                              float var5;
                              float var6;
                              if (var30 && !var17) {
                                 var6 = var35.c(var12, false);
                                 var5 = var35.c(var12 + 1, true);
                              } else if (var30) {
                                 var5 = var35.d(var12, false);
                                 var6 = var35.d(var12 + 1, true);
                              } else if (var17) {
                                 var5 = var35.c(var12, false);
                                 var6 = var35.c(var12 + 1, true);
                              } else {
                                 var6 = var35.d(var12, false);
                                 var5 = var35.d(var12 + 1, true);
                              }

                              bcj var28;
                              label101: {
                                 RectF var36 = new RectF(var6, var8, var5, var7);
                                 var28 = var27.f(new bcj(var36.left, var36.top, var36.right, var36.bottom)).g(var32.a());
                                 bcj var37 = var32.b();
                                 if (!(var28.d <= var37.b)) {
                                    if (var37.d <= var28.b) {
                                       var28 = null;
                                       break label101;
                                    }

                                    if (!(var28.e <= var37.c)) {
                                       if (var37.e <= var28.c) {
                                          var28 = null;
                                       } else {
                                          var28 = var28.e(var37);
                                       }
                                       break label101;
                                    }
                                 }

                                 var28 = null;
                              }

                              RectF var29;
                              if (var28 != null) {
                                 long var15 = this.b.b(es.i(var28.b, var28.c));
                                 long var13 = this.b.b(es.i(var28.d, var28.e));
                                 var29 = new RectF(bci.b(var15), bci.c(var15), bci.b(var13), bci.c(var13));
                              } else {
                                 var29 = null;
                              }

                              var33.add(var29);
                           }

                           ++var1;
                        }
                     }

                     return;
                  }
               }

               Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
               return;
            }

            if (var32.c.d(brp.r) && var4 != null && c.E(var3, "androidx.compose.ui.semantics.testTag")) {
               String var24 = (String)la.l(var32.c, brp.r);
               if (var24 != null) {
                  var2.getExtras().putCharSequence(var3, var24);
                  return;
               }
            } else if (c.E(var3, "androidx.compose.ui.semantics.id")) {
               var2.getExtras().putInt(var3, var32.e);
               return;
            }
         }

      }
   }

   public final void u(boolean var1) {
      if (var1) {
         this.b.I.L();
      } else {
         this.b.I.L();
      }

      ebt var5 = this.z;
      if (var5 != null) {
         var1 = this.D.isEmpty();
         byte var3 = 0;
         List var6;
         ArrayList var7;
         if (!var1) {
            var6 = pwm.aD(this.D.values());
            var7 = new ArrayList(var6.size());
            if (var6.size() > 0) {
               ccg var9 = (ccg)var6.get(0);
               throw null;
            }

            cif.a((ContentCaptureSession)var5.b, var7);
            this.D.clear();
         }

         if (!this.E.isEmpty()) {
            var6 = pwm.aD(this.E);
            var7 = new ArrayList(var6.size());
            int var4 = var6.size();

            int var2;
            for(var2 = 0; var2 < var4; ++var2) {
               var7.add((long)(Integer)var6.get(var2));
            }

            long[] var10 = new long[var7.size()];
            Iterator var11 = var7.iterator();

            for(var2 = var3; var11.hasNext(); ++var2) {
               var10[var2] = ((Number)var11.next()).longValue();
            }

            Object var12 = var5.b;
            AutofillId var8 = (AutofillId)cgm.l((View)var5.a).a;
            cie.f((ContentCaptureSession)var12, var8, var10);
            this.E.clear();
            return;
         }
      }

   }

   public final void v(bmd var1) {
      if (this.B.add(var1)) {
         this.C.u(qsn.a);
      }

   }

   public final void w(int var1, int var2, String var3) {
      AccessibilityEvent var4 = this.o(this.m(var1), 32);
      var4.setContentChangeTypes(var2);
      if (var3 != null) {
         var4.getText().add(var3);
      }

      this.Q(var4);
   }

   public final void x(int var1) {
      boh var3 = this.o;
      if (var3 != null) {
         if (var1 != var3.a.e) {
            return;
         }

         if (SystemClock.uptimeMillis() - var3.f <= 1000L) {
            AccessibilityEvent var2 = this.o(this.m(var3.a.e), 131072);
            var2.setFromIndex(var3.d);
            var2.setToIndex(var3.e);
            var2.setAction(var3.b);
            var2.setMovementGranularity(var3.c);
            var2.getText().add(O(var3.a));
            this.Q(var2);
         }
      }

      this.o = null;
   }

   public final void y(bpy var1) {
      if (var1.w()) {
         this.b.j.d(var1, this.G, new us(var1, this, 13));
      }
   }

   public final void z(int var1) {
      int var2 = this.c;
      if (var2 != var1) {
         this.c = var1;
         M(this, var1, 128, (Integer)null, 12);
         M(this, var2, 256, (Integer)null, 12);
      }
   }
}
