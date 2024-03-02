package com.google.android.apps.camera.ui.modeswitcher;

import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Map.Entry;

public class ModeSwitcher extends HorizontalScrollView implements .kjn, .kfw {
   public static final .pds a = .pds.h("com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher");
   public .kjf b;
   public GestureDetector c;
   public boolean d = false;
   public boolean e = false;
   public boolean f;
   public .kjq g;
   public .kjm h;
   public .ksm i;
   public .ksm j;
   public .kjl k = null;
   public .jqs l;
   private final Rect m = new Rect();
   private .kge n;

   public ModeSwitcher(Context var1) {
      super(var1);
      this.n = .kge.b;
      this.f = false;
      this.g = null;
      this.h = new .kji(1);
      this.i = .ksm.b;
      this.j = .ksm.a;
      this.j(var1);
   }

   public ModeSwitcher(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.n = .kge.b;
      this.f = false;
      this.g = null;
      this.h = new .kji(1);
      this.i = .ksm.b;
      this.j = .ksm.a;
      this.j(var1);
   }

   public ModeSwitcher(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.n = .kge.b;
      this.f = false;
      this.g = null;
      this.h = new .kji(1);
      this.i = .ksm.b;
      this.j = .ksm.a;
      this.j(var1);
   }

   public ModeSwitcher(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.n = .kge.b;
      this.f = false;
      this.g = null;
      this.h = new .kji(1);
      this.i = .ksm.b;
      this.j = .ksm.a;
      this.j(var1);
   }

   public static float a(float var0, float var1, float var2) {
      boolean var3;
      if (var1 <= var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.F(var3, "value=%s min=%s max=%s", var0, var1, var2);
      return Math.max(var1, Math.min(var0, var2));
   }

   private final void j(Context var1) {
      .mbx.a();
      .kjf var2 = new .kjf(var1);
      .jbc.at(var2);
      this.addView(var2);
      this.b = var2;
      var2.setOrientation(0);
      this.b.o = .otw.j(new AmbientModeSupport$AmbientController(this, (byte[])null));
      this.b.setGravity(16);
      this.b.setBackgroundColor(0);
      this.setHorizontalScrollBarEnabled(false);
      this.setOverScrollMode(2);
      .kjh var4 = new .kjh(this);
      GestureDetector var3 = new GestureDetector(var1, var4);
      this.c = var3;
      var3.setIsLongpressEnabled(false);
      this.setOnTouchListener(var4);
      this.setFadingEdgeLength(this.getResources().getDimensionPixelSize(2131166360));
      if (var1 instanceof .efu) {
         this.f = ((.efu)var1).a().m(.fmd.cq);
      }

   }

   public final .ksm b() {
      .kjf var3 = this.b;
      int var1 = this.getScrollX();
      int var2 = this.getWidth() / 2;
      .mbx.a();
      .ksm var5;
      if (var3.b.isEmpty()) {
         var5 = .ksm.b;
      } else {
         .pbn var4 = .pbn.a;
         var5 = (.ksm)((Entry)(new .owh(new .gvn(var1 + var2, 2), var4)).e(var3.b.entrySet())).getKey();
      }

      return var5;
   }

   public final void c(.ksm var1) {
      .mbx.a();
      boolean var2;
      if (var1 != .ksm.a) {
         var2 = true;
      } else {
         var2 = false;
      }

      .onk.x(var2, "Cannot append UNINITIALIZED mode");
      .kjf var4 = this.b;
      .mbx.a();
      TextView var3 = var4.a(var1);
      var4.d(var3, var1);
      this.h(var3, var1);
   }

   public final void d(boolean var1, boolean var2) {
      .mbx.a();
      this.b.e(var1, var2);
   }

   public final void e(int var1, boolean var2) {
      var1 -= this.getWidth() / 2;
      if (var2) {
         this.smoothScrollTo(var1, 0);
         this.post(new .kis(this, var1, 2));
      } else {
         this.scrollTo(var1, 0);
         this.post(new .kis(this, var1, 3));
      }
   }

   public final void f(.ksm var1, boolean var2) {
      .mbx.a();
      var1.getClass();
      boolean var3;
      if (var1 != .ksm.a) {
         var3 = true;
      } else {
         var3 = false;
      }

      .onk.x(var3, "Cannot setActiveMode to UNINITIALIZED");
      .onk.I(this.d, "must call finalizeModeSetup before setActiveMode");
      this.b.c(var1, var2);
      this.i = var1;
   }

   public final void g(.ksm var1) {
      Trace.beginSection("ModeSwitcher#setActiveModeAndNL");
      boolean var2;
      if (var1 != .ksm.a) {
         var2 = true;
      } else {
         var2 = false;
      }

      .onk.w(var2);
      this.f(var1, true);
      .kjq var3 = this.g;
      if (var3 != null) {
         .kjl var4 = (.kjl)var3;
         var4.e();
         var4.h = false;
         if (var4.g.h()) {
            ((.kjq)var4.g.c()).g(var1);
         }

         var4.n(var1);
      }

      Trace.endSection();
   }

   public final void h(TextView var1, .ksm var2) {
      var1.setOnClickListener(new .imx(this, var2, 7, (byte[])null));
   }

   public final void i(.ksm var1, boolean var2) {
      Throwable var10000;
      boolean var10001;
      label453: {
         .kjf var3;
         label449: {
            label454: {
               var3 = this.b;
               synchronized(var3){}
               if (var2) {
                  try {
                     if (var3.d.contains(var1)) {
                        break label454;
                     }
                  } catch (Throwable var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label453;
                  }
               }

               if (var2) {
                  break label449;
               }

               try {
                  if (var3.d.contains(var1)) {
                     break label449;
                  }
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break label453;
               }
            }

            try {
               return;
            } catch (Throwable var54) {
               var10000 = var54;
               var10001 = false;
               break label453;
            }
         }

         if (var2) {
            try {
               var3.d.add(var1);
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label453;
            }
         } else {
            try {
               var3.d.remove(var1);
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label453;
            }
         }

         try {
            var3.f = true;
         } catch (Throwable var55) {
            var10000 = var55;
            var10001 = false;
            break label453;
         }

         var3.requestLayout();
         return;
      }

      while(true) {
         Throwable var60 = var10000;

         try {
            throw var60;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean isEnabled() {
      return this.e;
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      return !this.e ? true : super.onInterceptTouchEvent(var1);
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.e) {
         this.m.right = this.getWidth();
         this.m.bottom = this.getHeight();
         this.setSystemGestureExclusionRects(.oyz.m(this.m));
      } else {
         var2 = .oyz.d;
         this.setSystemGestureExclusionRects(.pby.a);
      }
   }

   public final void onLayoutUpdated(.kge var1, .ktb var2) {
      if (this.n != var1) {
         this.n = var1;
         this.setHorizontalFadingEdgeEnabled(.kfq.o(var1));
      }

   }

   // $FF: synthetic method
   public final void onLayoutUpdated(.ktb var1) {
   }

   public final void setEnabled(boolean var1) {
      .mbx.a();
      if (this.d) {
         if (var1 && this.e) {
            ((.pdq)a.c().I(4385)).q("ModeSwitcher WAS ALREADY ENABLED!");
         } else if (!var1 && !this.e) {
            ((.pdq)a.c().I(4384)).q("ModeSwitcher WAS ALREADY DISABLED!");
         }

         this.b.setEnabled(var1);
         this.e = var1;
      }
   }

   public final void setVisibility(int var1) {
      super.setVisibility(var1);
      this.b.setVisibility(var1);
   }
}
