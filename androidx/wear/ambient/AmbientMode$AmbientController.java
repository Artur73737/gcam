package androidx.wear.ambient;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AmbientMode$AmbientController {
   public final Object a;

   public AmbientMode$AmbientController() {
   }

   public AmbientMode$AmbientController(Object var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public AmbientMode$AmbientController(Object var1, byte[] var2) {
      this.a = var1;
   }

   public final File A(.oag var1) {
      var1.getClass();
      Object var4 = this.a;
      long var2 = var1.a;
      StringBuilder var5 = new StringBuilder();
      var5.append("resource_");
      var5.append(var2);
      String var6 = var5.toString();
      File var8 = .qwl.f((File)var4, var6);
      var2 = var1.k;
      StringBuilder var7 = new StringBuilder();
      var7.append("annotachment_");
      var7.append(var2);
      return .qwl.f(var8, var7.toString());
   }

   public final void B(.ljq var1) {
      ((.lms)this.a).i(var1);
   }

   public final boolean C() {
      WearInlineSlider var3 = (WearInlineSlider)this.a;
      float var1 = var3.d;
      float var2 = var3.b;
      if (var1 == var2) {
         return false;
      } else {
         WearInlineSlider.k(var3, .mzx.dI(var1 - var3.a, var2, var3.c));
         return true;
      }
   }

   public final boolean D() {
      WearInlineSlider var3 = (WearInlineSlider)this.a;
      float var2 = var3.d;
      float var1 = var3.c;
      if (var2 == var1) {
         return false;
      } else {
         WearInlineSlider.k(var3, .mzx.dI(var2 + var3.a, var3.b, var1));
         return true;
      }
   }

   public final long a() {
      return ((.bes)this.a).a();
   }

   public final void b(float var1, float var2) {
      ((.bes)this.a).b().g(var1, var2);
   }

   public final void c(float var1, float var2) {
      .bes var6 = (.bes)this.a;
      .bcw var5 = var6.b();
      long var3 = .et.k(.bcl.c(this.a()) - (var1 + 0.0F), .bcl.a(this.a()) - (var2 + 0.0F));
      if (.bcl.c(var3) >= 0.0F && .bcl.a(var3) >= 0.0F) {
         var6.c(var3);
         var5.g(0.0F, 0.0F);
      } else {
         throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
      }
   }

   public final void d(float var1, float var2) {
      ((.bes)this.a).b().m(0.0F, 0.0F, var1, var2);
   }

   public final void e() {
      Object var6 = this.a;
      Object var4 = .azp.b;
      synchronized(var4){}

      Throwable var10000;
      label337: {
         ArrayList var5;
         Iterator var8;
         boolean var10001;
         try {
            List var7 = .azp.e;
            var7.getClass();
            var5 = new ArrayList(.pwm.aL(var7));
            var8 = var7.iterator();
         } catch (Throwable var38) {
            var10000 = var38;
            var10001 = false;
            break label337;
         }

         boolean var2 = false;

         while(true) {
            Object var40;
            try {
               if (!var8.hasNext()) {
                  break;
               }

               var40 = var8.next();
            } catch (Throwable var36) {
               var10000 = var36;
               var10001 = false;
               break label337;
            }

            boolean var1;
            boolean var3;
            label324: {
               label323: {
                  var3 = true;
                  if (!var2) {
                     try {
                        if (.c.E(var40, var6)) {
                           break label323;
                        }
                     } catch (Throwable var37) {
                        var10000 = var37;
                        var10001 = false;
                        break label337;
                     }
                  }

                  var1 = var2;
                  break label324;
               }

               var1 = true;
               var3 = false;
            }

            var2 = var1;
            if (var3) {
               try {
                  var5.add(var40);
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label337;
               }

               var2 = var1;
            }
         }

         label309:
         try {
            .azp.e = var5;
            return;
         } catch (Throwable var34) {
            var10000 = var34;
            var10001 = false;
            break label309;
         }
      }

      Throwable var39 = var10000;
      throw var39;
   }

   public final void f(int var1, double var2, double var4) {
      Object var10 = this.a;
      synchronized(var10){}

      label1001: {
         Throwable var10000;
         boolean var10001;
         label1002: {
            Iterator var11;
            try {
               var11 = ((.fpn)this.a).b.iterator();
            } catch (Throwable var122) {
               var10000 = var122;
               var10001 = false;
               break label1002;
            }

            while(true) {
               .fpm var12;
               try {
                  if (!var11.hasNext()) {
                     break;
                  }

                  var12 = (.fpm)var11.next();
               } catch (Throwable var123) {
                  var10000 = var123;
                  var10001 = false;
                  break label1002;
               }

               double var6 = var2 / var4;

               .fpl var9;
               Integer var13;
               try {
                  Map var8 = var12.b;
                  var13 = var1;
                  var9 = (.fpl)var8.get(var13);
               } catch (Throwable var121) {
                  var10000 = var121;
                  var10001 = false;
                  break label1002;
               }

               .fpl var124 = var9;
               if (var9 == null) {
                  try {
                     var124 = new .fpl();
                     var12.b.put(var13, var124);
                  } catch (Throwable var120) {
                     var10000 = var120;
                     var10001 = false;
                     break label1002;
                  }
               }

               if (var6 < 1.5D) {
                  try {
                     ++var124.a;
                  } catch (Throwable var119) {
                     var10000 = var119;
                     var10001 = false;
                     break label1002;
                  }
               } else if (var6 < 2.5D) {
                  try {
                     ++var124.b;
                  } catch (Throwable var118) {
                     var10000 = var118;
                     var10001 = false;
                     break label1002;
                  }
               } else if (var6 < 5.0D) {
                  try {
                     ++var124.c;
                  } catch (Throwable var117) {
                     var10000 = var117;
                     var10001 = false;
                     break label1002;
                  }
               } else {
                  try {
                     ++var124.d;
                  } catch (Throwable var116) {
                     var10000 = var116;
                     var10001 = false;
                     break label1002;
                  }
               }
            }

            label968:
            try {
               break label1001;
            } catch (Throwable var115) {
               var10000 = var115;
               var10001 = false;
               break label968;
            }
         }

         while(true) {
            Throwable var126 = var10000;

            try {
               throw var126;
            } catch (Throwable var114) {
               var10000 = var114;
               var10001 = false;
               continue;
            }
         }
      }

      .pdq var127 = (.pdq).fpn.a.c().I(1040);
      .ksm var125 = ((.fpn)this.a).d;
      String var128;
      switch(var1) {
      case 0:
         var128 = String.format("abs Δ(result sensor timestamp) = %.2f ms > %.2f ms", var2, var4);
         break;
      case 1:
         var128 = String.format("rel Δ(result sensor timestamp) = %.2f > %.2f", var2, var4);
         break;
      case 2:
         var128 = String.format("result sensor delay = %.2f > %.2f", var2, var4);
         break;
      case 3:
         var128 = String.format("abs Δ(surface sensor timestamp) = %.2f ms > %.2f ms", var2, var4);
         break;
      case 4:
         var128 = String.format("rel Δ(surface sensor timestamp) = %.2f > %.2f", var2, var4);
         break;
      case 5:
         var128 = String.format("abs pipeline latency = %.2f ms > %.2f ms", var2, var4);
         break;
      default:
         var128 = String.format("rel pipeline latency = %.2f > %.2f", var2, var4);
      }

      var127.B("%s > %s", var125, var128);
   }

   public final void g() {
      // $FF: Couldn't be decompiled
   }

   public final void h(.fes param1) {
      // $FF: Couldn't be decompiled
   }

   public final void i(.fes var1, boolean var2) {
      .fao var3 = (.fao)this.a;
      .fak var4 = (.fak)var3.c.eZ();
      .fes var5 = .fes.a;
      .fak var6;
      switch(var1.ordinal()) {
      case 0:
         var6 = .fak.b;
         break;
      case 1:
         var6 = .fak.d;
         break;
      case 2:
         var6 = .fak.e;
         break;
      case 3:
         var6 = .fak.c;
         break;
      default:
         throw new UnsupportedOperationException("Unsupported option: ".concat(String.valueOf(String.valueOf(var1))));
      }

      var3.d(var4, var6, var2);
   }

   public final boolean isAmbient() {
      AmbientDelegate var1 = ((AmbientMode)this.a).a;
      return var1 == null ? false : var1.h();
   }

   public final float j() {
      return (float)((.ajz)this.a).e() + (float)((.ajz)this.a).f() / 100000.0F;
   }

   public final void k(.tc var1) {
      if (!var1.a) {
         Object var3 = this.a;
         List var2 = ((.wl)var3).a;
         synchronized(var2){}

         try {
            ((.wl)var3).a.remove(var1);
         } finally {
            ;
         }

      }
   }

   public final .mn l(int var1) {
      RecyclerView var7 = (RecyclerView)this.a;
      int var3 = var7.h.c();
      int var2 = 0;
      .mn var4 = null;

      .mn var5;
      while(true) {
         var5 = var4;
         if (var2 >= var3) {
            break;
         }

         var5 = RecyclerView.h(var7.h.f(var2));
         .mn var6 = var4;
         if (var5 != null) {
            var6 = var4;
            if (!var5.u()) {
               var6 = var4;
               if (var5.c == var1) {
                  if (!var7.h.k(var5.a)) {
                     break;
                  }

                  var6 = var5;
               }
            }
         }

         ++var2;
         var4 = var6;
      }

      if (var5 == null) {
         return null;
      } else {
         return ((RecyclerView)this.a).h.k(var5.a) ? null : var5;
      }
   }

   public final void m(.ig var1) {
      switch(var1.a) {
      case 1:
         ((RecyclerView)this.a).n.w(var1.b, var1.d);
         return;
      case 2:
         ((RecyclerView)this.a).n.y(var1.b, var1.d);
         return;
      case 3:
      default:
         return;
      case 4:
         .lx var4 = ((RecyclerView)this.a).n;
         int var3 = var1.b;
         int var2 = var1.d;
         Object var5 = var1.c;
         var4.z(var3, var2);
      }
   }

   public final void n(int var1, int var2, Object var3) {
      RecyclerView var7 = (RecyclerView)this.a;
      int var5 = var7.h.c();

      int var4;
      for(var4 = 0; var4 < var5; ++var4) {
         View var9 = var7.h.f(var4);
         .mn var8 = RecyclerView.h(var9);
         if (var8 != null && !var8.z()) {
            int var6 = var8.c;
            if (var6 >= var1 && var6 < var1 + var2) {
               var8.e(2);
               var8.d(var3);
               ((.ly)var9.getLayoutParams()).e = true;
            }
         }
      }

      .mc var11 = var7.f;

      for(var4 = var11.c.size() - 1; var4 >= 0; --var4) {
         .mn var10 = (.mn)var11.c.get(var4);
         if (var10 != null) {
            var5 = var10.c;
            if (var5 >= var1 && var5 < var2 + var1) {
               var10.e(2);
               var11.i(var4);
            }
         }
      }

      ((RecyclerView)this.a).O = true;
   }

   public final void o(int var1, int var2) {
      RecyclerView var5 = (RecyclerView)this.a;
      int var4 = var5.h.c();

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         .mn var6 = RecyclerView.h(var5.h.f(var3));
         if (var6 != null && !var6.z() && var6.c >= var1) {
            var6.j(var2, false);
            var5.M.f = true;
         }
      }

      .mc var8 = var5.f;
      var4 = var8.c.size();

      for(var3 = 0; var3 < var4; ++var3) {
         .mn var7 = (.mn)var8.c.get(var3);
         if (var7 != null && var7.c >= var1) {
            var7.j(var2, false);
         }
      }

      var5.requestLayout();
      ((RecyclerView)this.a).N = true;
   }

   public final void p(int var1, int var2) {
      ((RecyclerView)this.a).O(var1, var2, true);
      RecyclerView var3 = (RecyclerView)this.a;
      var3.N = true;
      .mk var4 = var3.M;
      var4.c += var2;
   }

   public final int q() {
      return ((RecyclerView)this.a).getChildCount();
   }

   public final int r(View var1) {
      return ((RecyclerView)this.a).indexOfChild(var1);
   }

   public final View s(int var1) {
      return ((RecyclerView)this.a).getChildAt(var1);
   }

   public final void setAmbientOffloadEnabled(boolean var1) {
      AmbientDelegate var2 = ((AmbientMode)this.a).a;
      if (var2 != null) {
         var2.setAmbientOffloadEnabled(var1);
      }

   }

   public final void t(View var1) {
      .mn var3 = RecyclerView.h(var1);
      if (var3 != null) {
         Object var4 = this.a;
         int var2 = var3.o;
         ((RecyclerView)var4).at(var3, var2);
         var3.o = 0;
      }

   }

   public final void u(int var1) {
      View var2 = ((RecyclerView)this.a).getChildAt(var1);
      if (var2 != null) {
         ((RecyclerView)this.a).y(var2);
         var2.clearAnimation();
      }

      ((RecyclerView)this.a).removeViewAt(var1);
   }

   public final void v(.mn var1, .lt var2, .lt var3) {
      Object var4 = this.a;
      var1.m(false);
      RecyclerView var5 = (RecyclerView)var4;
      if (var5.F.m(var1, var2, var3)) {
         var5.U();
      }

   }

   public final void w(.mn var1, .lt var2, .lt var3) {
      ((RecyclerView)this.a).f.m(var1);
      RecyclerView var4 = (RecyclerView)this.a;
      var4.q(var1);
      var1.m(false);
      if (var4.F.o(var1, var2, var3)) {
         var4.U();
      }

   }

   public final void x(.mn var1) {
      RecyclerView var2 = (RecyclerView)this.a;
      var2.n.aP(var1.a, var2.f);
   }

   public final void y(Drawable var1) {
      if (var1 != null) {
         FloatingActionButton.d((FloatingActionButton)this.a, var1);
      }

   }

   public final boolean z() {
      return ((FloatingActionButton)this.a).b;
   }
}
