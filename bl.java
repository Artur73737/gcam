import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// $FF: synthetic class
public final class bl implements Runnable {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public bl(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public bl(Object var1, int var2, byte[] var3) {
      this.b = var2;
      this.a = var1;
   }

   public final void run() {
      int var1 = this.b;
      Object var4 = null;
      kj var14;
      ActionBarOverlayLayout var28;
      fd var32;
      bv var35;
      switch(var1) {
      case 0:
         var35 = (bv)this.a;
         df var26 = var35.Y;
         Bundle var27 = var35.i;
         var26.b.h(var27);
         var35.i = null;
         return;
      case 1:
         cx.b((List)this.a, 4);
         return;
      case 2:
         Object var23 = this.a;
         var35 = (bv)var23;
         if (var35.R != null && var35.i().s) {
            if (var35.A == null) {
               var35.i().s = false;
               return;
            }

            if (Looper.myLooper() != var35.A.d.getLooper()) {
               var35.A.d.postAtFrontOfQueue(new bl(var23, 3, (byte[])null));
               return;
            }

            var35.m(true);
            return;
         }

         return;
      case 3:
         ((bv)this.a).m(false);
         return;
      case 4:
         ((dl)this.a).c();
         return;
      case 5:
         ((cp)this.a).ab(true);
         return;
      case 6:
         Context var22 = (Context)this.a;
         ComponentName var25 = new ComponentName(var22, "android.support.v7.app.AppLocalesMetadataHolderService");
         if (var22.getPackageManager().getComponentEnabledSetting(var25) != 1) {
            Iterator var7 = el.d.iterator();

            while(var7.hasNext()) {
               el var8 = (el)((WeakReference)var7.next()).get();
               if (var8 != null) {
                  Context var31 = var8.a();
                  if (var31 != null) {
                     var4 = var31.getSystemService("locale");
                     break;
                  }
               }
            }

            ceg var33;
            if (var4 != null) {
               var33 = ceg.b(ej.a(var4));
            } else {
               var33 = ceg.a;
            }

            if (var33.b.a.isEmpty()) {
               String var34 = c.aw(var22);
               Object var29 = var22.getSystemService("locale");
               if (var29 != null) {
                  ej.b(var29, ei.a(var34));
               }
            }

            var22.getPackageManager().setComponentEnabledSetting(var25, 1, 1);
         }

         el.c = true;
         return;
      case 7:
         var32 = (fd)this.a;
         if ((var32.H & 1) != 0) {
            var32.z(0);
         }

         var32 = (fd)this.a;
         if ((var32.H & 4096) != 0) {
            var32.z(108);
         }

         var32 = (fd)this.a;
         var32.G = false;
         var32.H = 0;
         return;
      case 8:
         var32 = (fd)this.a;
         var32.q.showAtLocation(var32.p, 55, 0, 0);
         ((fd)this.a).A();
         if (((fd)this.a).J()) {
            ((fd)this.a).p.setAlpha(0.0F);
            var32 = (fd)this.a;
            dmx var18 = cgm.k(var32.p);
            var18.b(1.0F);
            var32.K = var18;
            ((fd)this.a).K.d(new en(this));
            return;
         }

         ((fd)this.a).p.setAlpha(1.0F);
         ((fd)this.a).p.setVisibility(0);
         return;
      case 9:
         Object var20 = this.a;
         Menu var16 = ((fj)var20).v();
         Menu var30;
         if (!(var16 instanceof gv)) {
            var30 = null;
         } else {
            var30 = var16;
         }

         if (var30 != null) {
            ((gv)var30).s();
         }

         boolean var10 = false;

         try {
            var10 = true;
            var16.clear();
            if (((fj)var20).a.onCreatePanelMenu(0, var16) && ((fj)var20).a.onPreparePanel(0, (View)null, var16)) {
               var10 = false;
            } else {
               var16.clear();
               var10 = false;
            }
         } finally {
            if (var10) {
               if (var30 != null) {
                  ((gv)var30).r();
               }

            }
         }

         if (var30 != null) {
            ((gv)var30).r();
         }

         return;
      case 10:
         ((ActionBarOverlayLayout)this.a).b();
         var28 = (ActionBarOverlayLayout)this.a;
         var28.i = var28.c.animate().translationY(0.0F).setListener(((ActionBarOverlayLayout)this.a).j);
         return;
      case 11:
         ((ActionBarOverlayLayout)this.a).b();
         var28 = (ActionBarOverlayLayout)this.a;
         var28.i = var28.c.animate().translationY((float)(-((ActionBarOverlayLayout)this.a).c.getHeight())).setListener(((ActionBarOverlayLayout)this.a).j);
         return;
      case 12:
         var14 = (kj)this.a;
         var14.b = null;
         var14.drawableStateChanged();
         return;
      case 13:
         km var24 = (km)this.a;
         switch(var24.q) {
         case 1:
            var24.p.cancel();
         case 2:
            var24.q = 3;
            ValueAnimator var15 = var24.p;
            var15.setFloatValues(new float[]{(Float)var15.getAnimatedValue(), 0.0F});
            var24.p.setDuration(500L);
            var24.p.start();
            return;
         default:
            return;
         }
      case 14:
         ViewParent var21 = ((kn)this.a).c.getParent();
         if (var21 != null) {
            var21.requestDisallowInterceptTouchEvent(true);
         }

         return;
      case 15:
         kn var6 = (kn)this.a;
         var6.d();
         View var5 = var6.c;
         if (var5.isEnabled() && !var5.isLongClickable() && var6.b()) {
            var5.getParent().requestDisallowInterceptTouchEvent(true);
            long var2 = SystemClock.uptimeMillis();
            MotionEvent var19 = MotionEvent.obtain(var2, var2, 3, 0.0F, 0.0F, 0);
            var5.onTouchEvent(var19);
            var19.recycle();
            var6.d = true;
            return;
         }

         return;
      case 16:
         ((le)this.a).q();
         return;
      case 17:
         var14 = ((le)this.a).e;
         if (var14 != null && cga.e(var14) && ((le)this.a).e.getCount() > ((le)this.a).e.getChildCount()) {
            var1 = ((le)this.a).e.getChildCount();
            le var17 = (le)this.a;
            if (var1 <= var17.k) {
               var17.q.setInputMethodMode(2);
               ((le)this.a).s();
            }
         }

         return;
      case 18:
         RecyclerView var13 = (RecyclerView)this.a;
         if (var13.u && !var13.isLayoutRequested()) {
            var13 = (RecyclerView)this.a;
            if (!var13.s) {
               var13.requestLayout();
               return;
            }

            if (var13.w) {
               var13.v = true;
               return;
            }

            var13.w();
            return;
         }

         return;
      case 19:
         lu var12 = ((RecyclerView)this.a).F;
         if (var12 != null) {
            var12.d();
         }

         ((RecyclerView)this.a).P = false;
         return;
      default:
         ((StaggeredGridLayoutManager)this.a).J();
      }
   }
}
