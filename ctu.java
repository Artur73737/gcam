import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class ctu implements OnPreDrawListener, OnAttachStateChangeListener {
   final ctr a;
   final ViewGroup b;

   public ctu(ctr var1, ViewGroup var2) {
      this.a = var1;
      this.b = var2;
   }

   private final void a() {
      this.b.getViewTreeObserver().removeOnPreDrawListener(this);
      this.b.removeOnAttachStateChangeListener(this);
   }

   public final boolean onPreDraw() {
      this.a();
      if (!ctv.a.remove(this.b)) {
         return true;
      } else {
         xh var9 = ctv.a();
         ArrayList var8 = (ArrayList)var9.get(this.b);
         ArrayList var7;
         if (var8 == null) {
            var8 = new ArrayList();
            var9.put(this.b, var8);
            var7 = null;
         } else if (var8.size() > 0) {
            var7 = new ArrayList(var8);
         } else {
            var7 = null;
         }

         var8.add(this.a);
         this.a.x(new ctt(this, var9));
         this.a.o(this.b, false);
         int var1;
         int var2;
         if (var7 != null) {
            var2 = var7.size();

            for(var1 = 0; var1 < var2; ++var1) {
               ((ctr)var7.get(var1)).s(this.b);
            }
         }

         ctr var10 = this.a;
         ViewGroup var22 = this.b;
         var10.g = new ArrayList();
         var10.h = new ArrayList();
         dub var13 = var10.p;
         dub var19 = var10.q;
         xh var12 = new xh((xo)var13.a);
         xh var11 = new xh((xo)var19.a);
         var1 = 0;

         while(true) {
            int[] var20 = var10.f;
            Object var14;
            View var21;
            cuc var27;
            Object var37;
            if (var1 >= 4) {
               for(var1 = 0; var1 < var12.d; ++var1) {
                  var27 = (cuc)var12.g(var1);
                  if (var10.w(var27.b)) {
                     var10.g.add(var27);
                     var10.h.add((Object)null);
                  }
               }

               for(var1 = 0; var1 < var11.d; ++var1) {
                  var27 = (cuc)var11.g(var1);
                  if (var10.w(var27.b)) {
                     var10.h.add(var27);
                     var10.g.add((Object)null);
                  }
               }

               xh var30 = ctr.g();
               var1 = var30.d;
               cul var28 = cug.a(var22);
               --var1;

               for(; var1 >= 0; --var1) {
                  Animator var26 = (Animator)var30.d(var1);
                  if (var26 != null) {
                     fjo var36 = (fjo)var30.get(var26);
                     if (var36 != null && var36.b != null && var28.equals(var36.c)) {
                        var14 = var36.e;
                        var37 = var36.b;
                        var21 = (View)var37;
                        cuc var29 = var10.k(var21, true);
                        var27 = var10.j(var21, true);
                        if (var29 == null && var27 == null) {
                           var27 = (cuc)((xo)var10.q.a).get(var37);
                        }

                        if ((var29 != null || var27 != null) && ((ctr)var36.d).v((cuc)var14, var27)) {
                           if (!var26.isRunning() && !var26.isStarted()) {
                              var30.remove(var26);
                           } else {
                              var26.cancel();
                           }
                        }
                     }
                  }
               }

               var10.I(var22, var10.p, var10.q, var10.g, var10.h);
               var10.t();
               return true;
            }

            int var3;
            cuc var16;
            View var17;
            dub var25;
            cuc var38;
            label176:
            switch(var20[var1]) {
            case 1:
               var25 = var19;
               var2 = var12.d - 1;

               while(true) {
                  var19 = var25;
                  if (var2 < 0) {
                     break label176;
                  }

                  var21 = (View)var12.d(var2);
                  if (var21 != null && var10.w(var21)) {
                     cuc var33 = (cuc)var11.remove(var21);
                     if (var33 != null && var10.w(var33.b)) {
                        var27 = (cuc)var12.e(var2);
                        var10.g.add(var27);
                        var10.h.add(var33);
                     }
                  }

                  --var2;
               }
            case 2:
               var25 = var19;
               Object var23 = var13.c;
               var14 = var19.c;
               xo var35 = (xo)var23;
               var3 = var35.d;
               var2 = 0;

               while(true) {
                  var19 = var25;
                  if (var2 >= var3) {
                     break label176;
                  }

                  var21 = (View)var35.g(var2);
                  if (var21 != null && var10.w(var21)) {
                     var37 = var35.d(var2);
                     var17 = (View)((xo)var14).get(var37);
                     if (var17 != null && var10.w(var17)) {
                        var16 = (cuc)var12.get(var21);
                        var38 = (cuc)var11.get(var17);
                        if (var16 != null && var38 != null) {
                           var10.g.add(var16);
                           var10.h.add(var38);
                           var12.remove(var21);
                           var11.remove(var17);
                        }
                     }
                  }

                  ++var2;
               }
            case 3:
               Object var32 = var13.d;
               var25 = var19;
               var14 = var19.d;
               SparseArray var34 = (SparseArray)var32;
               var3 = var34.size();
               var2 = 0;

               while(true) {
                  var19 = var25;
                  if (var2 >= var3) {
                     break label176;
                  }

                  var21 = (View)var34.valueAt(var2);
                  if (var21 != null && var10.w(var21)) {
                     int var4 = var34.keyAt(var2);
                     var17 = (View)((SparseArray)var14).get(var4);
                     if (var17 != null && var10.w(var17)) {
                        var16 = (cuc)var12.get(var21);
                        var38 = (cuc)var11.get(var17);
                        if (var16 != null && var38 != null) {
                           var10.g.add(var16);
                           var10.h.add(var38);
                           var12.remove(var21);
                           var11.remove(var17);
                        }
                     }
                  }

                  ++var2;
               }
            case 4:
               var14 = var13.b;
               Object var24 = var19.b;
               xl var31 = (xl)var14;
               var3 = var31.b();

               for(var2 = 0; var2 < var3; ++var2) {
                  var17 = (View)var31.e(var2);
                  if (var17 != null && var10.w(var17)) {
                     long var5 = var31.c(var2);
                     View var18 = (View)((xl)var24).d(var5);
                     if (var18 != null && var10.w(var18)) {
                        var16 = (cuc)var12.get(var17);
                        cuc var15 = (cuc)var11.get(var18);
                        if (var16 != null && var15 != null) {
                           var10.g.add(var16);
                           var10.h.add(var15);
                           var12.remove(var17);
                           var11.remove(var18);
                        }
                     }
                  }
               }
            }

            ++var1;
         }
      }
   }

   public final void onViewAttachedToWindow(View var1) {
   }

   public final void onViewDetachedFromWindow(View var1) {
      this.a();
      ctv.a.remove(this.b);
      ArrayList var4 = (ArrayList)ctv.a().get(this.b);
      if (var4 != null && var4.size() > 0) {
         int var3 = var4.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            ((ctr)var4.get(var2)).s(this.b);
         }
      }

      this.a.p(true);
   }
}
