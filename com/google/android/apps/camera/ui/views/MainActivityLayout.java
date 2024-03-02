package com.google.android.apps.camera.ui.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.View.MeasureSpec;
import android.view.WindowInsets.Type;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivityLayout extends GcaLayout implements .hgy, .hgt {
   private static final .pds p = .pds.h("com.google.android.apps.camera.ui.views.MainActivityLayout");
   public .otw g;
   public AtomicReference h;
   public .mdq i;
   public .flx j;
   public .hfx k;
   public .mve l;
   public .mdh m;
   public .mdq n;
   public .jtg o;
   private final Set q = .pgn.B();
   private final Map r = new LinkedHashMap();
   private final Map s = new LinkedHashMap();
   private boolean t;
   private boolean u;
   private .ktb v;
   private View w;

   public MainActivityLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.g = .ote.a;
      this.w = null;
      ((.kpu)((.gss)var1).b(.kpu.class)).b(this);
      this.k.e(this);
   }

   public static final .ktb o(.ktb var0, .kge var1, .kfv var2) {
      if (var2 == .kfv.d) {
         return var0;
      } else {
         .kge var3 = .kge.a;
         switch(var1.ordinal()) {
         case 1:
         case 2:
            return var0;
         case 3:
            return .ktb.a;
         case 4:
            if (!.ktb.d(var0)) {
               return .ktb.a;
            }
         case 0:
            switch(var2.ordinal()) {
            case 0:
               return .ktb.a;
            case 1:
               return .ktb.c;
            case 2:
               return .ktb.b;
            case 3:
               return var0;
            default:
               throw new IllegalArgumentException("Unexpected LayoutTransform: ".concat(String.valueOf(String.valueOf(var2))));
            }
         default:
            throw new IllegalArgumentException("Unexpected CameraLayoutDecision: ".concat(String.valueOf(String.valueOf(var1))));
         }
      }
   }

   private final .kgj r() {
      .kgj var1;
      if (this.h.get() == null) {
         var1 = .kgj.a;
      } else {
         var1 = ((.kgk)this.h.get()).a;
      }

      return var1;
   }

   private final .ktb s(Context var1, Display var2, .kge var3, int var4, int var5) {
      if (var3.equals(.kge.c)) {
         return .ktb.a;
      } else {
         int var7 = var1.getResources().getDisplayMetrics().heightPixels;
         int var8 = var1.getResources().getDisplayMetrics().widthPixels;
         int var6 = var7;
         if (((Activity)var1).isInMultiWindowMode()) {
            var6 = var7 - this.getRootWindowInsets().getInsets(Type.statusBars()).top;
         }

         boolean var11 = true;
         boolean var10;
         if (var6 > var8 && var5 > var4) {
            var10 = var11;
         } else if (var6 < var8 && var5 < var4) {
            var10 = var11;
         } else {
            var10 = false;
         }

         .ktb var9 = .ktb.b(var2, var1);
         if (this.v == null) {
            this.v = var9;
         }

         if (var10) {
            this.v = var9;
            return var9;
         } else {
            return this.v;
         }
      }
   }

   private final void t(Size var1) {
      this.n(var1, (Integer)null);
   }

   private final void u() {
      this.u = true;
      this.post(new .kgy(this, 15));
   }

   private final boolean v(.kgj var1) {
      if (this.h.get() != null && ((.kgk)this.h.get()).a.equals(var1) && !this.u) {
         return false;
      } else {
         this.u = false;
         boolean var2 = var1.a();
         Object var6 = null;
         if (!var2) {
            .kgh var8;
            if (this.h.get() == null) {
               var8 = .kgh.a;
            } else {
               var8 = ((.kgk)this.h.get()).b;
            }

            .kgo var9;
            if (this.h.get() == null) {
               var9 = null;
            } else {
               var9 = ((.kgk)this.h.get()).d;
            }

            this.h.set(.kgk.a(var1, var8, (.kgp)null, var9));
            this.u();
            return false;
         } else {
            Trace.beginSection("updateLayoutBoxes");
            .kgh var5 = .kgf.a(var1, var1.i.equals(.kge.c), this.getContext(), new .fik(this, 8));
            if (var5.r) {
               this.u();
            }

            .kgp var3;
            if (this.w != null) {
               if (var1.i.equals(.kge.c)) {
                  var3 = .kgp.a(new Size(var5.e.width(), var5.e.height()), new Rect(), new Rect(), 17);
               } else {
                  var3 = .kgp.a(new Size(var5.e.width(), var5.e.height()), new Rect(), new Rect(var5.e.left, var5.e.top, var5.b.getWidth() - var5.e.right, var5.b.getHeight() - var5.e.bottom), 51);
               }
            } else {
               var3 = null;
            }

            .kgh var4 = var5;
            if (this.h.get() != null) {
               var4 = var5;
               if (var5.equals(((.kgk)this.h.get()).b)) {
                  var4 = ((.kgk)this.h.get()).b;
               }
            }

            .kgp var10 = var3;
            if (this.h.get() != null) {
               var10 = var3;
               if (Objects.equals(var3, ((.kgk)this.h.get()).c)) {
                  var10 = ((.kgk)this.h.get()).c;
               }
            }

            .kgo var7;
            if (this.h.get() == null) {
               var7 = (.kgo)var6;
            } else {
               var7 = ((.kgk)this.h.get()).d;
            }

            this.h.set(.kgk.a(var1, var4, var10, var7));
            Trace.endSection();
            return true;
         }
      }
   }

   private static final void w(.kge var0, .ktb var1, .kfw var2, .kfv var3) {
      var1 = o(var1, var0, var3);
      var2.onLayoutUpdated(var1);
      var2.onLayoutUpdated(var0, var1);
   }

   public final .kgk a() {
      return (.kgk)this.h.get();
   }

   public final void d(.kfw var1) {
      this.e(var1, .kfv.a);
   }

   public final WindowInsets dispatchApplyWindowInsets(WindowInsets var1) {
      try {
         Trace.beginSection("MAL.dispatchApplyWindowInsets");
         var1 = super.dispatchApplyWindowInsets(var1);
      } finally {
         Trace.endSection();
      }

      return var1;
   }

   public final void dispatchConfigurationChanged(Configuration var1) {
      Trace.beginSection("MAL.dispatchConfigurationChanged");
      .rjf.j(this.getContext());
      super.dispatchConfigurationChanged(var1);
      .rjf.k();
      Trace.endSection();
   }

   public final void e(.kfw var1, .kfv var2) {
      .mbx.a();
      this.r.put(var1, var2);
      w(this.r().i, this.r().g, var1, var2);
   }

   public final void f(.kfw var1) {
      this.g(var1, .kfv.a);
   }

   public final void fy() {
      this.requestLayout();
   }

   public final void g(.kfw var1, .kfv var2) {
      .mbx.a();
      this.r.put(var1, var2);
   }

   public final void h() {
      View var1 = this.w;
      if (var1 != null) {
         var1.setPadding(0, 0, 0, 0);
         this.w = null;
         this.requestLayout();
         this.invalidate();
      }

   }

   public final void i(View var1) {
      this.w = var1;
      if (this.h.get() != null) {
         .kgi var3 = this.r().b();
         var3.e(.ksm.a);
         .kgj var2 = var3.a();
         AtomicReference var4 = this.h;
         var4.set(.kgk.a(var2, ((.kgk)var4.get()).b, (.kgp)null, ((.kgk)this.h.get()).d));
      }

      this.requestLayout();
      this.invalidate();
   }

   public final void j(View var1) {
      this.k(var1, .kfv.a);
   }

   public final void k(View var1, .kfv var2) {
      .mbx.a();
      Map var3 = this.s;
      .onk.p(var1);
      var3.put(var1, var2);
   }

   public final void l(int var1, int var2, Integer var3) {
      this.n(new Size(var1, var2), var3);
   }

   public final void m() {
      Size var1 = this.r().b;
      if (var1 == null) {
         this.t((Size)null);
      } else {
         this.t(new Size(Math.max(var1.getWidth(), var1.getHeight()), Math.min(var1.getWidth(), var1.getHeight())));
      }
   }

   public final void n(Size var1, Integer var2) {
      if (this.getDisplay() == null) {
         ((.pdq)p.c().I(4527)).q("Display is null; not setting preview size.");
         this.post(new .jda(this, var1, var2, 15, (short[])null));
      } else {
         .kgj var4 = this.r();
         Size var3 = var4.b;
         .ktb var8;
         if (var3 != null) {
            var8 = this.s(this.getContext(), this.getDisplay(), var4.i, var3.getWidth(), var3.getHeight());
         } else {
            var8 = var4.g;
         }

         .kgi var5 = var4.b();
         var5.b(var4.i);
         var5.f(var8);
         var5.b = var1;
         Integer var6 = var2;
         if (var2 == null) {
            var6 = var4.e;
         }

         var5.c = var6;
         var5.d();
         if (this.v(var5.a())) {
            this.requestLayout();
            this.invalidate();
         }

         if (this.g.h()) {
            ViewfinderCover var7 = ((.gyu)((AmbientModeSupport$AmbientController)this.g.c()).a).R;
            if (!var7.l) {
               var7.l = true;
               var7.requestLayout();
               return;
            }
         }

      }
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      this.f((RotatingGcaLayout)this.findViewById(2131428129));
      this.k(this.findViewById(2131428578), .kfv.b);
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      Iterator var6 = this.q.iterator();
      boolean var5 = false;

      while(true) {
         .kfq var7;
         do {
            do {
               if (!var6.hasNext()) {
                  if (!var5 && !super.onInterceptTouchEvent(var1)) {
                     return false;
                  }

                  return true;
               }

               var7 = (.kfq)var6.next();
            } while(!var7.a(var1));
         } while(!var7.b(new .nom(var1, this.getRootView())));

         float var2 = var1.getX();
         float var3 = var1.getY();
         boolean var4;
         if (this.h.get() == null) {
            var4 = false;
         } else {
            Rect var8 = ((.kgk)this.h.get()).b.i;
            if (var2 > (float)var8.left && var2 < (float)var8.right && var3 > (float)var8.top && var3 < (float)var8.bottom) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         var5 |= var4 ^ true;
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (this.t) {
         this.t = false;
      }

      super.onLayout(var1, var2, var3, var4, var5);
      .rjf.k();
   }

   public final void onMeasure(int var1, int var2) {
      Trace.beginSection("MAL.onMeasurePrologue");
      Context var11 = this.getContext();
      .rjf.j(var11);
      Size var7 = new Size(MeasureSpec.getSize(var1), MeasureSpec.getSize(var2));
      .kge var8 = .kfq.m(this.getContext(), this.getDisplay(), this.j, (.ksm)this.i.eZ(), (.kej)this.m.eZ(), this.l);
      .ktb var9 = this.s(var11, this.getDisplay(), var8, var7.getWidth(), var7.getHeight());
      .kge var6 = var8;
      if (var8.equals(.kge.d)) {
         var6 = var8;
         if (!var9.equals(.ktb.b)) {
            var6 = var8;
            if (!var9.equals(.ktb.c)) {
               var6 = .kfq.n(this.getContext(), this.getDisplay(), this.l);
            }
         }
      }

      boolean var4;
      boolean var5;
      Integer var10;
      .kgj var12;
      Size var15;
      label108: {
         var12 = this.r();
         var15 = var12.c;
         var10 = var12.e;
         var4 = this.f;
         var5 = false;
         if (var4) {
            if (var6.equals(.kge.b)) {
               var4 = true;
               break label108;
            }

            if (var6.equals(.kge.c)) {
               var4 = true;
               break label108;
            }
         }

         var4 = false;
      }

      if ((Boolean)this.e.eZ() != var4) {
         this.e.a(var4);
      }

      if (!this.t) {
         if (!var12.i.equals(var6)) {
            var4 = true;
         } else {
            var4 = false;
         }
      } else {
         var4 = true;
      }

      this.t = var4;
      .jtg var13 = this.o;
      int var3;
      if (!.kfq.o(var6)) {
         var4 = var5;
      } else {
         label97: {
            var3 = var11.getResources().getIdentifier(tRYpVduhjf.sEhIq, "integer", "android");
            if (var3 > 0) {
               var4 = var5;
               if (var11.getResources().getInteger(var3) == 2) {
                  break label97;
               }
            }

            var4 = true;
         }
      }

      var13.e();
      WindowInsetsController var22 = var13.b.getInsetsController();
      if (var13.e() != var4 && !var13.c && var22 != null) {
         if (var4) {
            var22.hide(Type.navigationBars());
         } else {
            var22.show(Type.navigationBars());
         }
      }

      this.o.a();
      .kgi var23 = var12.b();
      var23.f(var9);
      var23.a = var7;
      var23.e((.ksm)this.i.eZ());
      var23.c(.ktc.e(this));
      if (var15 != null) {
         var7 = var15;
      }

      var23.b = var7;
      var23.b(var6);
      if (var10 != null) {
         var3 = var10;
      } else {
         var3 = 90;
      }

      var23.c = var3;
      .kgj var14 = var23.a();
      .onk.k(var14.a());
      if (this.v(var14)) {
         var4 = ((Activity)this.getContext()).isInMultiWindowMode();
         if ((Boolean)((.mcy)this.n).d != var4) {
            this.n.a(var4);
         }

         .kgj var17 = this.r();
         .ktb var16 = var17.g;
         .kge var25 = var17.i;
         var16.name();
         Iterator var18;
         Entry var19;
         if ((Boolean)this.e.eZ()) {
            if (this.t) {
               var18 = this.s.keySet().iterator();

               while(var18.hasNext()) {
                  View var20 = (View)var18.next();
                  if (var20.getRotation() != 0.0F) {
                     .jbc.aB(var20, .ktb.a);
                  }
               }
            }
         } else {
            Iterator var24 = this.s.entrySet().iterator();

            while(var24.hasNext()) {
               var19 = (Entry)var24.next();
               View var26 = (View)var19.getKey();
               .ktb var21 = o(var16, var25, (.kfv)var19.getValue());
               if (var26.getRotation() != (float)var21.e) {
                  .jbc.aB((View)var19.getKey(), var21);
               }
            }
         }

         var9.name();
         var6.name();
         var18 = this.r.entrySet().iterator();

         while(var18.hasNext()) {
            var19 = (Entry)var18.next();
            w(var6, var9, (.kfw)var19.getKey(), (.kfv)var19.getValue());
         }
      }

      Trace.endSection();
      super.onMeasure(var1, var2);
   }

   public final void p(.kfq var1) {
      .mbx.a();
      this.q.add(var1);
   }

   public final void q(.kfq var1) {
      .mbx.a();
      this.q.remove(var1);
   }
}
