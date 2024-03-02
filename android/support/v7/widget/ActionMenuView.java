package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ActionMenuView extends LinearLayoutCompat implements .gu, .hk {
   public .gv a;
   public boolean b;
   public .ib c;
   public .gt d;
   public AmbientMode$AmbientController e;
   private Context i;
   private int j;
   private .hh k;
   private boolean l;
   private int m;
   private int n;
   private int o;

   public ActionMenuView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionMenuView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.t();
      float var3 = var1.getResources().getDisplayMetrics().density;
      this.n = (int)(56.0F * var3);
      this.o = (int)(var3 * 4.0F);
      this.i = var1;
      this.j = 0;
   }

   public static final .ie n() {
      .ie var0 = new .ie();
      var0.gravity = 16;
      return var0;
   }

   public static final .ie o(LayoutParams var0) {
      if (var0 != null) {
         .ie var1;
         if (var0 instanceof .ie) {
            var1 = new .ie((.ie)var0);
         } else {
            var1 = new .ie(var0);
         }

         if (var1.gravity <= 0) {
            var1.gravity = 16;
         }

         return var1;
      } else {
         return n();
      }
   }

   public final void a(.gv var1) {
      this.a = var1;
   }

   public final boolean b(.gx var1) {
      return this.a.z(var1, 0);
   }

   public final .ie c(AttributeSet var1) {
      return new .ie(this.getContext(), var1);
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .ie;
   }

   public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      return false;
   }

   public final Menu g() {
      if (this.a == null) {
         Context var1 = this.getContext();
         .gv var2 = new .gv(var1);
         this.a = var2;
         var2.p(new .if(this, 0));
         .ib var4 = new .ib(var1);
         this.c = var4;
         var4.p();
         .ib var3 = this.c;
         .hh var6 = this.k;
         Object var5 = var6;
         if (var6 == null) {
            var5 = new .id();
         }

         var3.e = (.hh)var5;
         this.a.h(this.c, this.i);
         this.c.j(this);
      }

      return this.a;
   }

   public final void h() {
      .ib var1 = this.c;
      if (var1 != null) {
         var1.n();
      }

   }

   public final void i(.hh var1, .gt var2) {
      this.k = var1;
      this.d = var2;
   }

   public final void j(int var1) {
      if (this.j != var1) {
         this.j = var1;
         if (var1 == 0) {
            this.i = this.getContext();
            return;
         }

         this.i = new ContextThemeWrapper(this.getContext(), var1);
      }

   }

   public final void k(.ib var1) {
      this.c = var1;
      var1.j(this);
   }

   protected final boolean l(int var1) {
      boolean var2 = false;
      if (var1 == 0) {
         return false;
      } else {
         View var3 = this.getChildAt(var1 - 1);
         View var4 = this.getChildAt(var1);
         if (var1 < this.getChildCount() && var3 instanceof .ic) {
            var2 = ((.ic)var3).c();
         }

         return var1 > 0 && var4 instanceof .ic ? ((.ic)var4).d() | var2 : var2;
      }
   }

   public final boolean m() {
      .ib var1 = this.c;
      return var1 != null && var1.l();
   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      .ib var2 = this.c;
      if (var2 != null) {
         var2.i();
         if (this.c.l()) {
            this.c.k();
            this.c.m();
         }
      }

   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.h();
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (!this.l) {
         super.onLayout(var1, var2, var3, var4, var5);
      } else {
         int var11 = this.getChildCount();
         int var14 = super.h;
         int var13 = var4 - var2;
         int var7 = var13 - this.getPaddingRight() - this.getPaddingLeft();
         var1 = .nv.a(this);
         int var6 = 0;
         byte var8 = 0;
         var4 = 0;

         while(true) {
            int var12 = (var5 - var3) / 2;
            View var15;
            .ie var16;
            int var17;
            if (var6 >= var11) {
               if (var11 == 1) {
                  if (var8 == 0) {
                     var15 = this.getChildAt(0);
                     var3 = var15.getMeasuredWidth();
                     var2 = var15.getMeasuredHeight();
                     var6 = var13 / 2;
                     var5 = var3 / 2;
                     var4 = var12 - var2 / 2;
                     var5 = var6 - var5;
                     var15.layout(var5, var4, var3 + var5, var2 + var4);
                     return;
                  }

                  var2 = 1;
               } else {
                  var2 = var11;
               }

               var3 = var4 - (var8 ^ 1);
               if (var3 > 0) {
                  var3 = var7 / var3;
               } else {
                  var3 = 0;
               }

               var6 = Math.max(0, var3);
               if (var1) {
                  var5 = this.getWidth() - this.getPaddingRight();

                  for(var3 = 0; var3 < var2; var5 = var4) {
                     View var20 = this.getChildAt(var3);
                     .ie var19 = (.ie)var20.getLayoutParams();
                     var4 = var5;
                     if (var20.getVisibility() != 8) {
                        var4 = var5;
                        if (!var19.a) {
                           var5 -= var19.rightMargin;
                           var4 = var20.getMeasuredWidth();
                           var7 = var20.getMeasuredHeight();
                           var17 = var12 - var7 / 2;
                           var20.layout(var5 - var4, var17, var5, var7 + var17);
                           var4 = var5 - (var4 + var19.leftMargin + var6);
                        }
                     }

                     ++var3;
                  }
               } else {
                  var5 = this.getPaddingLeft();

                  for(var3 = 0; var3 < var2; var5 = var4) {
                     var15 = this.getChildAt(var3);
                     var16 = (.ie)var15.getLayoutParams();
                     var4 = var5;
                     if (var15.getVisibility() != 8) {
                        var4 = var5;
                        if (!var16.a) {
                           var7 = var5 + var16.leftMargin;
                           var4 = var15.getMeasuredWidth();
                           var5 = var15.getMeasuredHeight();
                           var17 = var12 - var5 / 2;
                           var15.layout(var7, var17, var7 + var4, var5 + var17);
                           var4 = var7 + var4 + var16.rightMargin + var6;
                        }
                     }

                     ++var3;
                  }
               }

               return;
            }

            var15 = this.getChildAt(var6);
            var2 = var7;
            byte var9 = var8;
            int var10 = var4;
            if (var15.getVisibility() != 8) {
               var16 = (.ie)var15.getLayoutParams();
               if (var16.a) {
                  var17 = var15.getMeasuredWidth();
                  var2 = var17;
                  if (this.l(var6)) {
                     var2 = var17 + var14;
                  }

                  var10 = var15.getMeasuredHeight();
                  int var18;
                  if (var1) {
                     var17 = this.getPaddingLeft() + var16.leftMargin;
                     var18 = var17 + var2;
                  } else {
                     var18 = this.getWidth() - this.getPaddingRight() - var16.rightMargin;
                     var17 = var18 - var2;
                  }

                  var12 -= var10 / 2;
                  var15.layout(var17, var12, var18, var10 + var12);
                  var2 = var7 - var2;
                  var9 = 1;
                  var10 = var4;
               } else {
                  var2 = var7 - (var15.getMeasuredWidth() + var16.leftMargin + var16.rightMargin);
                  this.l(var6);
                  var10 = var4 + 1;
                  var9 = var8;
               }
            }

            ++var6;
            var7 = var2;
            var8 = var9;
            var4 = var10;
         }
      }
   }

   protected final void onMeasure(int var1, int var2) {
      boolean var25 = this.l;
      boolean var24;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var24 = true;
      } else {
         var24 = false;
      }

      this.l = var24;
      if (var25 != var24) {
         this.m = 0;
      }

      int var6 = MeasureSpec.getSize(var1);
      if (this.l) {
         .gv var34 = this.a;
         if (var34 != null && var6 != this.m) {
            this.m = var6;
            var34.l(true);
         }
      }

      int var7 = this.getChildCount();
      .ie var46;
      if (this.l) {
         if (var7 > 0) {
            int var20 = MeasureSpec.getMode(var2);
            int var8 = MeasureSpec.getSize(var1);
            var6 = MeasureSpec.getSize(var2);
            var7 = this.getPaddingLeft();
            var1 = this.getPaddingRight();
            int var15 = this.getPaddingTop() + this.getPaddingBottom();
            int var21 = getChildMeasureSpec(var2, var15, -2);
            int var11 = var8 - (var7 + var1);
            var2 = this.n;
            var1 = var11 / var2;
            if (var1 == 0) {
               this.setMeasuredDimension(var11, 0);
               return;
            }

            int var23 = var2 + var11 % var2 / var1;
            int var22 = this.getChildCount();
            var8 = 0;
            var2 = 0;
            int var14 = 0;
            boolean var13 = false;
            long var26 = 0L;
            int var12 = 0;

            int var9;
            int var10;
            int var17;
            int var18;
            long var28;
            .ie var35;
            for(var7 = 0; var14 < var22; ++var14) {
               View var37 = this.getChildAt(var14);
               if (var37.getVisibility() != 8) {
                  var25 = var37 instanceof ActionMenuItemView;
                  if (var25) {
                     var9 = this.o;
                     var37.setPadding(var9, 0, var9, 0);
                  }

                  .ie var36 = (.ie)var37.getLayoutParams();
                  var36.f = false;
                  var36.c = 0;
                  var36.b = 0;
                  var36.d = false;
                  var36.leftMargin = 0;
                  var36.rightMargin = 0;
                  if (var25 && ((ActionMenuItemView)var37).b()) {
                     var24 = true;
                  } else {
                     var24 = false;
                  }

                  var36.e = var24;
                  if (!var36.a) {
                     var9 = var1;
                  } else {
                     var9 = 1;
                  }

                  var35 = (.ie)var37.getLayoutParams();
                  var17 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var21) - var15, MeasureSpec.getMode(var21));
                  ActionMenuItemView var45;
                  if (var25) {
                     var45 = (ActionMenuItemView)var37;
                  } else {
                     var45 = null;
                  }

                  boolean var16;
                  if (var45 != null && var45.b()) {
                     var16 = true;
                  } else {
                     var16 = false;
                  }

                  if (var9 <= 0 || var16 && var9 < 2) {
                     var9 = 0;
                  } else {
                     var37.measure(MeasureSpec.makeMeasureSpec(var9 * var23, Integer.MIN_VALUE), var17);
                     var18 = var37.getMeasuredWidth();
                     var9 = var18 / var23;
                     var10 = var9;
                     if (var18 % var23 != 0) {
                        var10 = var9 + 1;
                     }

                     var9 = var10;
                     if (var16) {
                        var9 = var10;
                        if (var10 < 2) {
                           var9 = 2;
                        }
                     }
                  }

                  if (!var35.a && var16) {
                     var24 = true;
                  } else {
                     var24 = false;
                  }

                  var35.d = var24;
                  var35.b = var9;
                  var37.measure(MeasureSpec.makeMeasureSpec(var9 * var23, 1073741824), var17);
                  var12 = Math.max(var12, var9);
                  var10 = var2;
                  if (var36.d) {
                     var10 = var2 + 1;
                  }

                  var13 |= var36.a;
                  var1 -= var9;
                  var7 = Math.max(var7, var37.getMeasuredHeight());
                  var28 = var26;
                  if (var9 == 1) {
                     var28 = var26 | (long)(1 << var14);
                  }

                  ++var8;
                  var26 = var28;
                  var2 = var10;
               }
            }

            var15 = var7;
            boolean var43;
            if (var13 && var8 == 2) {
               var43 = true;
               var7 = 2;
            } else {
               var43 = false;
               var7 = var8;
            }

            boolean var40 = false;
            var14 = var2;
            var10 = var1;
            boolean var39 = var40;
            var1 = var15;

            boolean var38;
            while(true) {
               if (var14 <= 0 || var10 <= 0) {
                  var38 = var39;
                  var2 = var1;
                  break;
               }

               var15 = Integer.MAX_VALUE;
               var17 = 0;
               int var44 = 0;

               long var30;
               for(var30 = 0L; var44 < var22; var30 = var28) {
                  var46 = (.ie)this.getChildAt(var44).getLayoutParams();
                  if (!var46.d) {
                     var18 = var15;
                     var2 = var17;
                     var28 = var30;
                  } else {
                     int var19 = var46.b;
                     if (var19 < var15) {
                        var28 = 1L << var44;
                        var2 = 1;
                        var18 = var19;
                     } else {
                        var18 = var15;
                        var2 = var17;
                        var28 = var30;
                        if (var19 == var15) {
                           var2 = var17 + 1;
                           var28 = var30 | 1L << var44;
                           var18 = var15;
                        }
                     }
                  }

                  ++var44;
                  var15 = var18;
                  var17 = var2;
               }

               var2 = var1;
               var38 = var39;
               var26 |= var30;
               if (var17 > var10) {
                  break;
               }

               var1 = 0;

               for(var8 = var10; var1 < var22; var26 = var28) {
                  View var47 = this.getChildAt(var1);
                  var46 = (.ie)var47.getLayoutParams();
                  long var32 = (long)(1 << var1);
                  if ((var30 & var32) == 0L) {
                     var10 = var8;
                     var28 = var26;
                     if (var46.b == var15 + 1) {
                        var28 = var26 | var32;
                        var10 = var8;
                     }
                  } else {
                     var10 = var8;
                     if (var43) {
                        var10 = var8;
                        if (var46.e) {
                           var10 = var8;
                           if (var8 == 1) {
                              var8 = this.o;
                              var47.setPadding(var8 + var23, 0, var8, 0);
                              var10 = 1;
                           }
                        }
                     }

                     ++var46.b;
                     var46.f = true;
                     --var10;
                     var28 = var26;
                  }

                  ++var1;
                  var8 = var10;
               }

               var1 = var2;
               var39 = true;
               var10 = var8;
            }

            if (!var13 && var7 == 1) {
               var40 = true;
               var7 = 1;
            } else {
               var40 = false;
            }

            View var48;
            if (var10 > 0 && var26 != 0L && (var10 < var7 - 1 || var40 || var12 > 1)) {
               float var5 = (float)Long.bitCount(var26);
               float var4 = var5;
               if (!var40) {
                  float var3 = var5;
                  if ((var26 & 1L) != 0L) {
                     var3 = var5;
                     if (!((.ie)this.getChildAt(0).getLayoutParams()).e) {
                        var3 = var5 - 0.5F;
                     }
                  }

                  var7 = var22 - 1;
                  var4 = var3;
                  if ((var26 & (long)(1 << var7)) != 0L) {
                     var4 = var3;
                     if (!((.ie)this.getChildAt(var7).getLayoutParams()).e) {
                        var4 = var3 - 0.5F;
                     }
                  }
               }

               if (var4 > 0.0F) {
                  var9 = (int)((float)(var10 * var23) / var4);
               } else {
                  var9 = 0;
               }

               byte var42 = 0;
               boolean var41 = var38;

               for(var1 = var42; var1 < var22; var41 = var40) {
                  if ((var26 & (long)(1 << var1)) != 0L) {
                     var48 = this.getChildAt(var1);
                     var35 = (.ie)var48.getLayoutParams();
                     if (var48 instanceof ActionMenuItemView) {
                        var35.c = var9;
                        var35.f = true;
                        if (var1 == 0) {
                           if (!var35.e) {
                              var35.leftMargin = -var9 / 2;
                           }

                           var1 = 0;
                        }

                        var40 = true;
                        var10 = var1;
                     } else if (var35.a) {
                        var35.c = var9;
                        var35.f = true;
                        var35.rightMargin = -var9 / 2;
                        var40 = true;
                        var10 = var1;
                     } else {
                        if (var1 != 0) {
                           var35.leftMargin = var9 / 2;
                        }

                        var10 = var1;
                        var40 = var41;
                        if (var1 != var22 - 1) {
                           var35.rightMargin = var9 / 2;
                           var10 = var1;
                           var40 = var41;
                        }
                     }
                  } else {
                     var40 = var41;
                     var10 = var1;
                  }

                  var1 = var10 + 1;
               }

               var38 = var41;
            }

            if (var38) {
               for(var1 = 0; var1 < var22; ++var1) {
                  var48 = this.getChildAt(var1);
                  var35 = (.ie)var48.getLayoutParams();
                  if (var35.f) {
                     var48.measure(MeasureSpec.makeMeasureSpec(var35.b * var23 + var35.c, 1073741824), var21);
                  }
               }
            }

            if (var20 == 1073741824) {
               var2 = var6;
            }

            this.setMeasuredDimension(var11, var2);
            return;
         }

         var6 = 0;
      } else {
         var6 = 0;
      }

      while(var6 < var7) {
         var46 = (.ie)this.getChildAt(var6).getLayoutParams();
         var46.rightMargin = 0;
         var46.leftMargin = 0;
         ++var6;
      }

      super.onMeasure(var1, var2);
   }
}
