import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserver.AmbientLifecycleCallback.-CC;
import java.util.Arrays;
import java.util.Locale;

public final class cvt extends et {
   public int a;
   public int b;
   public final cvs c;
   public int d;
   public boolean e;
   public -CC f;
   private final ViewPager2 g;
   private final RecyclerView h;
   private final LinearLayoutManager i;
   private int j;
   private boolean k;
   private boolean l;

   public cvt(ViewPager2 var1) {
      this.g = var1;
      RecyclerView var2 = var1.e;
      this.h = var2;
      this.i = (LinearLayoutManager)var2.n;
      this.c = new cvs();
      this.v();
   }

   private final void u(int var1, float var2, int var3) {
      -CC var4 = this.f;
      if (var4 != null) {
         var4.b(var1, var2, var3);
      }

   }

   private final void v() {
      this.a = 0;
      this.b = 0;
      this.c.a();
      this.j = -1;
      this.d = -1;
      this.k = false;
      this.l = false;
      this.e = false;
   }

   private final boolean w() {
      return this.a == 1;
   }

   public final void e(RecyclerView var1, int var2, int var3) {
      this.l = true;
      this.s();
      cvs var5;
      if (this.k) {
         label51: {
            label50: {
               this.k = false;
               if (var3 <= 0) {
                  if (var3 != 0) {
                     break label50;
                  }

                  boolean var4;
                  if (var2 >= 0) {
                     var4 = false;
                  } else {
                     var4 = true;
                  }

                  if (var4 != this.g.g()) {
                     break label50;
                  }
               }

               var5 = this.c;
               if (var5.c != 0) {
                  var2 = var5.a + 1;
                  break label51;
               }
            }

            var2 = this.c.a;
         }

         this.d = var2;
         if (this.j != var2) {
            this.q(var2);
         }
      } else if (this.a == 0) {
         var3 = this.c.a;
         var2 = var3;
         if (var3 == -1) {
            var2 = 0;
         }

         this.q(var2);
      }

      var5 = this.c;
      var3 = var5.a;
      var2 = var3;
      if (var3 == -1) {
         var2 = 0;
      }

      this.u(var2, var5.b, var5.c);
      var5 = this.c;
      var2 = var5.a;
      var3 = this.d;
      if ((var2 == var3 || var3 == -1) && var5.c == 0 && this.b != 1) {
         this.r(0);
         this.v();
      }

   }

   public final void f(int var1) {
      if ((this.a != 1 || this.b != 1) && var1 == 1) {
         this.a = 1;
         var1 = this.d;
         if (var1 != -1) {
            this.j = var1;
            this.d = -1;
         } else if (this.j == -1) {
            this.j = this.i.I();
         }

         this.r(1);
      } else if (this.w() && var1 == 2) {
         if (this.l) {
            this.r(2);
            this.k = true;
         }

      } else {
         int var2;
         cvs var4;
         if (this.w() && var1 == 0) {
            label59: {
               this.s();
               if (!this.l) {
                  var2 = this.c.a;
                  if (var2 != -1) {
                     this.u(var2, 0.0F, 0);
                  }
               } else {
                  var4 = this.c;
                  if (var4.c != 0) {
                     break label59;
                  }

                  int var3 = this.j;
                  var2 = var4.a;
                  if (var3 != var2) {
                     this.q(var2);
                  }
               }

               this.r(0);
               this.v();
            }
         }

         if (this.a == 2 && var1 == 0 && this.e) {
            this.s();
            var4 = this.c;
            if (var4.c == 0) {
               var1 = this.d;
               var2 = var4.a;
               if (var1 != var2) {
                  var1 = var2;
                  if (var2 == -1) {
                     var1 = 0;
                  }

                  this.q(var1);
               }

               this.r(0);
               this.v();
            }
         }

      }
   }

   public final void q(int var1) {
      -CC var2 = this.f;
      if (var2 != null) {
         var2.c(var1);
      }

   }

   public final void r(int var1) {
      if (this.a != 3 || this.b != 0) {
         if (this.b != var1) {
            this.b = var1;
            -CC var2 = this.f;
            if (var2 != null) {
               var2.a(var1);
            }

         }
      }
   }

   public final void s() {
      cvs var11 = this.c;
      int var2 = this.i.I();
      var11.a = var2;
      if (var2 == -1) {
         var11.a();
      } else {
         View var10 = this.i.N(var2);
         if (var10 == null) {
            var11.a();
         } else {
            int var9 = LinearLayoutManager.bg(var10);
            int var8 = LinearLayoutManager.bi(var10);
            int var7 = LinearLayoutManager.bk(var10);
            int var6 = LinearLayoutManager.bd(var10);
            LayoutParams var12 = var10.getLayoutParams();
            int var5 = var9;
            int var4 = var8;
            var2 = var7;
            int var3 = var6;
            if (var12 instanceof MarginLayoutParams) {
               MarginLayoutParams var18 = (MarginLayoutParams)var12;
               var5 = var9 + var18.leftMargin;
               var4 = var8 + var18.rightMargin;
               var2 = var7 + var18.topMargin;
               var3 = var6 + var18.bottomMargin;
            }

            var7 = var10.getHeight();
            var6 = var10.getWidth();
            if (this.i.k == 0) {
               var4 += var6 + var5;
               var5 = var10.getLeft() - var5 - this.h.getPaddingLeft();
               var2 = var5;
               var3 = var4;
               if (this.g.g()) {
                  var2 = -var5;
                  var3 = var4;
               }
            } else {
               var3 += var7 + var2;
               var2 = var10.getTop() - var2 - this.h.getPaddingTop();
            }

            var2 = -var2;
            var11.c = var2;
            if (var2 >= 0) {
               float var1;
               if (var3 == 0) {
                  var1 = 0.0F;
               } else {
                  var1 = (float)var2 / (float)var3;
               }

               var11.b = var1;
            } else {
               LinearLayoutManager var13;
               label92: {
                  MarginLayoutParams var16 = cvp.a;
                  var13 = this.i;
                  var4 = var13.am();
                  if (var4 != 0) {
                     var5 = var13.k ^ 1;
                     int[][] var19 = new int[var4][2];

                     for(var2 = 0; var2 < var4; ++var2) {
                        View var14 = var13.ay(var2);
                        if (var14 == null) {
                           throw new IllegalStateException("null view contained in the view hierarchy");
                        }

                        LayoutParams var17 = var14.getLayoutParams();
                        if (var17 instanceof MarginLayoutParams) {
                           var16 = (MarginLayoutParams)var17;
                        } else {
                           var16 = cvp.a;
                        }

                        int[] var15 = var19[var2];
                        if (var5 != 0) {
                           var3 = var14.getLeft() - var16.leftMargin;
                        } else {
                           var3 = var14.getTop() - var16.topMargin;
                        }

                        var15[0] = var3;
                        var15 = var19[var2];
                        if (var5 != 0) {
                           var3 = var14.getRight() + var16.rightMargin;
                        } else {
                           var3 = var14.getBottom() + var16.bottomMargin;
                        }

                        var15[1] = var3;
                     }

                     Arrays.sort(var19, new bce(9));

                     for(var2 = 1; var2 < var4; ++var2) {
                        if (var19[var2 - 1][1] != var19[var2][0]) {
                           break label92;
                        }
                     }

                     int[] var20 = var19[0];
                     var3 = var20[1];
                     var2 = var20[0];
                     if (var2 > 0 || var19[var4 - 1][1] < var3 - var2) {
                        break label92;
                     }
                  }

                  if (var13.am() > 1) {
                     throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", var11.c));
                  }
               }

               var3 = var13.am();

               for(var2 = 0; var2 < var3; ++var2) {
                  if (cvp.a(var13.ay(var2))) {
                     throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                  }
               }

               throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", var11.c));
            }
         }
      }
   }

   public final boolean t() {
      return this.b == 0;
   }
}
