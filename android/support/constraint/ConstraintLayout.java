package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class ConstraintLayout extends ViewGroup {
   final SparseArray a = new SparseArray();
   final .an b = new .an();
   public .ae c = null;
   private final ArrayList d = new ArrayList(100);
   private int e = 0;
   private int f = 0;
   private int g = Integer.MAX_VALUE;
   private int h = Integer.MAX_VALUE;
   private boolean i = true;
   private int j = 2;

   public ConstraintLayout(Context var1) {
      super(var1);
      this.e((AttributeSet)null);
   }

   public ConstraintLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.e(var2);
   }

   public ConstraintLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.e(var2);
   }

   public static final .ac b() {
      return new .ac();
   }

   private final .am c(int var1) {
      if (var1 == 0) {
         return this.b;
      } else {
         View var2 = (View)this.a.get(var1);
         if (var2 == this) {
            return this.b;
         } else {
            return var2 == null ? null : ((.ac)var2.getLayoutParams()).Y;
         }
      }
   }

   private final .am d(View var1) {
      if (var1 == this) {
         return this.b;
      } else {
         return var1 == null ? null : ((.ac)var1.getLayoutParams()).Y;
      }
   }

   private final void e(AttributeSet var1) {
      this.b.J = this;
      this.a.put(this.getId(), this);
      this.c = null;
      if (var1 != null) {
         TypedArray var5 = this.getContext().obtainStyledAttributes(var1, .af.a);
         int var3 = var5.getIndexCount();

         for(int var2 = 0; var2 < var3; ++var2) {
            int var4 = var5.getIndex(var2);
            if (var4 == 16) {
               this.e = var5.getDimensionPixelOffset(16, this.e);
            } else if (var4 == 17) {
               this.f = var5.getDimensionPixelOffset(17, this.f);
            } else if (var4 == 14) {
               this.g = var5.getDimensionPixelOffset(14, this.g);
            } else if (var4 == 15) {
               this.h = var5.getDimensionPixelOffset(15, this.h);
            } else if (var4 == 113) {
               this.j = var5.getInt(113, this.j);
            } else if (var4 == 34) {
               var4 = var5.getResourceId(34, 0);
               .ae var6 = new .ae();
               this.c = var6;
               var6.e(this.getContext(), var4);
            }
         }

         var5.recycle();
      }

      this.b.ai = this.j;
   }

   protected final void a() {
      this.b.D();
   }

   protected final boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .ac;
   }

   protected final LayoutParams generateLayoutParams(LayoutParams var1) {
      return new .ac(var1);
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var3 = this.getChildCount();
      var1 = this.isInEditMode();

      for(var2 = 0; var2 < var3; ++var2) {
         View var6 = this.getChildAt(var2);
         .ac var7 = (.ac)var6.getLayoutParams();
         if (var6.getVisibility() != 8 || var7.Q || var1) {
            .am var8 = var7.Y;
            var4 = var8.b();
            var5 = var8.c();
            var6.layout(var4, var5, var8.h() + var4, var8.d() + var5);
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var11 = this.getPaddingLeft();
      int var12 = this.getPaddingTop();
      .an var16 = this.b;
      var16.w = var11;
      var16.x = var12;
      int var13 = MeasureSpec.getMode(var1);
      int var6 = MeasureSpec.getSize(var1);
      int var10 = MeasureSpec.getMode(var2);
      int var8 = MeasureSpec.getSize(var2);
      int var7 = this.getPaddingTop();
      int var9 = this.getPaddingBottom();
      int var14 = this.getPaddingLeft();
      int var5 = this.getPaddingRight();
      this.getLayoutParams();
      byte var24;
      switch(var13) {
      case Integer.MIN_VALUE:
         var24 = 2;
         break;
      case 0:
         var24 = 2;
         var6 = 0;
         break;
      case 1073741824:
         var6 = Math.min(this.g, var6) - (var14 + var5);
         var24 = 1;
         break;
      default:
         var24 = 1;
         var6 = 0;
      }

      byte var25;
      switch(var10) {
      case Integer.MIN_VALUE:
         var25 = 2;
         break;
      case 0:
         var25 = 2;
         var8 = 0;
         break;
      case 1073741824:
         var8 = Math.min(this.h, var8) - (var7 + var9);
         var25 = 1;
         break;
      default:
         var25 = 1;
         var8 = 0;
      }

      this.b.m(0);
      this.b.l(0);
      this.b.v(var24);
      this.b.p(var6);
      this.b.w(var25);
      this.b.j(var8);
      this.b.m(this.e - this.getPaddingLeft() - this.getPaddingRight());
      this.b.l(this.f - this.getPaddingTop() - this.getPaddingBottom());
      View var18;
      .ac var32;
      .am var39;
      if (this.i) {
         this.i = false;
         var6 = this.getChildCount();

         label451:
         for(var5 = 0; var5 < var6; ++var5) {
            if (this.getChildAt(var5).isLayoutRequested()) {
               this.d.clear();
               .ae var31 = this.c;
               if (var31 != null) {
                  var31.a(this);
               }

               var7 = this.getChildCount();
               this.b.al.clear();
               var6 = 0;

               while(true) {
                  if (var6 >= var7) {
                     break label451;
                  }

                  var18 = this.getChildAt(var6);
                  .am var17 = this.d(var18);
                  if (var17 != null) {
                     var32 = (.ac)var18.getLayoutParams();
                     var17.i();
                     var17.K = var18.getVisibility();
                     var17.J = var18;
                     .an var37 = this.b;
                     var37.al.add(var17);
                     .am var19 = var17.r;
                     if (var19 != null) {
                        ((.ar)var19).F(var17);
                     }

                     var17.r = var37;
                     if (!var32.O || !var32.N) {
                        this.d.add(var17);
                     }

                     float var3;
                     if (var32.Q) {
                        .ao var33 = (.ao)var17;
                        var5 = var32.a;
                        if (var5 != -1 && var5 >= 0) {
                           var33.af = -1.0F;
                           var33.ag = var5;
                           var33.ah = -1;
                        }

                        var5 = var32.b;
                        if (var5 != -1 && var5 >= 0) {
                           var33.af = -1.0F;
                           var33.ag = -1;
                           var33.ah = var5;
                        }

                        var3 = var32.c;
                        if (var3 != -1.0F && var3 > -1.0F) {
                           var33.af = var3;
                           var33.ag = -1;
                           var33.ah = -1;
                        }
                     } else if (var32.R != -1 || var32.S != -1 || var32.T != -1 || var32.U != -1 || var32.h != -1 || var32.i != -1 || var32.j != -1 || var32.k != -1 || var32.l != -1 || var32.K != -1 || var32.L != -1 || var32.width == -1 || var32.height == -1) {
                        var14 = var32.R;
                        var10 = var32.S;
                        var9 = var32.T;
                        var13 = var32.U;
                        var5 = var32.V;
                        var8 = var32.W;
                        var3 = var32.X;
                        if (var14 != -1) {
                           var39 = this.c(var14);
                           if (var39 != null) {
                              var17.u(2, var39, 2, var32.leftMargin, var5);
                           }
                        } else if (var10 != -1) {
                           var39 = this.c(var10);
                           if (var39 != null) {
                              var17.u(2, var39, 4, var32.leftMargin, var5);
                           }
                        }

                        if (var9 != -1) {
                           var39 = this.c(var9);
                           if (var39 != null) {
                              var17.u(4, var39, 2, var32.rightMargin, var8);
                           }
                        } else if (var13 != -1) {
                           var39 = this.c(var13);
                           if (var39 != null) {
                              var17.u(4, var39, 4, var32.rightMargin, var8);
                           }
                        }

                        var5 = var32.h;
                        if (var5 != -1) {
                           var39 = this.c(var5);
                           if (var39 != null) {
                              var17.u(3, var39, 3, var32.topMargin, var32.r);
                           }
                        } else {
                           var5 = var32.i;
                           if (var5 != -1) {
                              var39 = this.c(var5);
                              if (var39 != null) {
                                 var17.u(3, var39, 5, var32.topMargin, var32.r);
                              }
                           }
                        }

                        var5 = var32.j;
                        if (var5 != -1) {
                           var39 = this.c(var5);
                           if (var39 != null) {
                              var17.u(5, var39, 3, var32.bottomMargin, var32.t);
                           }
                        } else {
                           var5 = var32.k;
                           if (var5 != -1) {
                              var39 = this.c(var5);
                              if (var39 != null) {
                                 var17.u(5, var39, 5, var32.bottomMargin, var32.t);
                              }
                           }
                        }

                        var5 = var32.l;
                        if (var5 != -1) {
                           View var40 = (View)this.a.get(var5);
                           var39 = this.c(var32.l);
                           if (var39 != null && var40 != null && var40.getLayoutParams() instanceof .ac) {
                              .ac var41 = (.ac)var40.getLayoutParams();
                              var32.P = true;
                              var41.P = true;
                              var17.t(6).d(var39.t(6), 0, -1, 2, 0, true);
                              var17.t(3).b();
                              var17.t(5).b();
                           }
                        }

                        if (var3 >= 0.0F && var3 != 0.5F) {
                           var17.H = var3;
                        }

                        var3 = var32.x;
                        if (var3 >= 0.0F && var3 != 0.5F) {
                           var17.I = var3;
                        }

                        if (this.isInEditMode()) {
                           label427: {
                              var8 = var32.K;
                              var5 = var8;
                              if (var8 == -1) {
                                 if (var32.L == -1) {
                                    break label427;
                                 }

                                 var5 = -1;
                              }

                              var8 = var32.L;
                              var17.w = var5;
                              var17.x = var8;
                           }
                        }

                        if (!var32.N) {
                           if (var32.width == -1) {
                              var17.v(4);
                              var17.t(2).c = var32.leftMargin;
                              var17.t(4).c = var32.rightMargin;
                           } else {
                              var17.v(3);
                              var17.p(0);
                           }
                        } else {
                           var17.v(1);
                           var17.p(var32.width);
                        }

                        if (!var32.O) {
                           if (var32.height == -1) {
                              var17.w(4);
                              var17.t(3).c = var32.topMargin;
                              var17.t(5).c = var32.bottomMargin;
                           } else {
                              var17.w(3);
                              var17.j(0);
                           }
                        } else {
                           var17.w(1);
                           var17.j(var32.height);
                        }

                        String var43 = var32.y;
                        if (var43 != null) {
                           if (var43.length() == 0) {
                              var17.u = 0.0F;
                           } else {
                              var9 = var43.length();
                              var8 = var43.indexOf(44);
                              byte var27;
                              String var42;
                              if (var8 > 0 && var8 < var9 - 1) {
                                 var42 = var43.substring(0, var8);
                                 if (var42.equalsIgnoreCase("W")) {
                                    var27 = 0;
                                 } else if (var42.equalsIgnoreCase("H")) {
                                    var27 = 1;
                                 } else {
                                    var27 = -1;
                                 }

                                 ++var8;
                              } else {
                                 var8 = 0;
                                 var27 = -1;
                              }

                              label412: {
                                 label489: {
                                    var10 = var43.indexOf(58);
                                    boolean var10001;
                                    if (var10 >= 0 && var10 < var9 - 1) {
                                       label463: {
                                          var42 = var43.substring(var8, var10);
                                          var43 = var43.substring(var10 + 1);
                                          if (var42.length() <= 0 || var43.length() <= 0) {
                                             break label489;
                                          }

                                          float var4;
                                          try {
                                             var4 = Float.parseFloat(var42);
                                             var3 = Float.parseFloat(var43);
                                          } catch (NumberFormatException var23) {
                                             var10001 = false;
                                             break label463;
                                          }

                                          if (!(var4 > 0.0F) || !(var3 > 0.0F)) {
                                             break label489;
                                          }

                                          if (var27 == 1) {
                                             try {
                                                var3 = Math.abs(var3 / var4);
                                                break label412;
                                             } catch (NumberFormatException var20) {
                                                var10001 = false;
                                             }
                                          } else {
                                             try {
                                                var3 = Math.abs(var4 / var3);
                                                break label412;
                                             } catch (NumberFormatException var21) {
                                                var10001 = false;
                                             }
                                          }
                                       }
                                    } else {
                                       var43 = var43.substring(var8);
                                       if (var43.length() <= 0) {
                                          var3 = 0.0F;
                                          break label412;
                                       }

                                       try {
                                          var3 = Float.parseFloat(var43);
                                          break label412;
                                       } catch (NumberFormatException var22) {
                                          var10001 = false;
                                       }
                                    }

                                    var3 = 0.0F;
                                    break label412;
                                 }

                                 var3 = 0.0F;
                              }

                              if (var3 > 0.0F) {
                                 var17.u = var3;
                                 var17.v = var27;
                              }
                           }
                        }

                        var17.Z = var32.A;
                        var17.aa = var32.B;
                        var17.V = var32.C;
                        var17.W = var32.D;
                        var5 = var32.E;
                        var8 = var32.G;
                        var9 = var32.I;
                        var17.c = var5;
                        var17.e = var8;
                        var17.f = var9;
                        var9 = var32.F;
                        var5 = var32.H;
                        var8 = var32.J;
                        var17.d = var9;
                        var17.g = var5;
                        var17.h = var8;
                     }
                  }

                  ++var6;
               }
            }
         }
      }

      var14 = this.getPaddingTop() + this.getPaddingBottom();
      int var15 = this.getPaddingLeft() + this.getPaddingRight();
      var13 = this.getChildCount();

      boolean var30;
      for(var7 = 0; var7 < var13; ++var7) {
         View var34 = this.getChildAt(var7);
         if (var34.getVisibility() != 8) {
            var32 = (.ac)var34.getLayoutParams();
            var39 = var32.Y;
            if (!var32.Q) {
               var8 = var32.width;
               var6 = var32.height;
               boolean var26;
               boolean var28;
               if (!var32.N && !var32.O && var32.E != 1 && var32.width != -1 && (var32.O || var32.F != 1 && var32.height != -1)) {
                  var5 = var6;
                  var26 = false;
                  var28 = false;
               } else {
                  if (var8 != 0 && var8 != -1) {
                     var8 = getChildMeasureSpec(var1, var15, var8);
                     var30 = false;
                  } else {
                     var8 = getChildMeasureSpec(var1, var15, -2);
                     var30 = true;
                  }

                  if (var6 != 0 && var6 != -1) {
                     var9 = getChildMeasureSpec(var2, var14, var6);
                     var26 = false;
                  } else {
                     var9 = getChildMeasureSpec(var2, var14, -2);
                     var26 = true;
                  }

                  var34.measure(var8, var9);
                  var8 = var34.getMeasuredWidth();
                  var10 = var34.getMeasuredHeight();
                  var28 = var26;
                  var26 = var30;
                  var5 = var10;
               }

               var39.p(var8);
               var39.j(var5);
               if (var26) {
                  var39.F = var8;
               }

               if (var28) {
                  var39.G = var5;
               }

               if (var32.P) {
                  var5 = var34.getBaseline();
                  if (var5 != -1) {
                     var39.C = var5;
                  }
               }
            }
         }
      }

      if (this.getChildCount() > 0) {
         this.a();
      }

      var9 = this.d.size();
      var12 += this.getPaddingBottom();
      var11 += this.getPaddingRight();
      if (var9 > 0) {
         var16 = this.b;
         var13 = var16.ad;
         var14 = var16.ae;
         var6 = 0;
         var8 = 0;

         for(var30 = false; var8 < var9; ++var8) {
            .am var35 = (.am)this.d.get(var8);
            if (!(var35 instanceof .ao)) {
               Object var36 = var35.J;
               if (var36 != null) {
                  var18 = (View)var36;
                  if (var18.getVisibility() != 8) {
                     .ac var38 = (.ac)var18.getLayoutParams();
                     if (var38.width == -2) {
                        var7 = getChildMeasureSpec(var1, var11, var38.width);
                     } else {
                        var7 = MeasureSpec.makeMeasureSpec(var35.h(), 1073741824);
                     }

                     if (var38.height == -2) {
                        var10 = getChildMeasureSpec(var2, var12, var38.height);
                     } else {
                        var10 = MeasureSpec.makeMeasureSpec(var35.d(), 1073741824);
                     }

                     var18.measure(var7, var10);
                     var10 = var18.getMeasuredWidth();
                     var7 = var18.getMeasuredHeight();
                     if (var10 != var35.h()) {
                        var35.p(var10);
                        if (var13 == 2 && var35.g() > this.b.h()) {
                           var5 = var35.g();
                           var10 = var35.t(4).a();
                           this.b.p(Math.max(this.e, var5 + var10));
                           var30 = true;
                        } else {
                           var30 = true;
                        }
                     }

                     if (var7 != var35.d()) {
                        var35.j(var7);
                        if (var14 == 2 && var35.a() > this.b.d()) {
                           var5 = var35.a();
                           var7 = var35.t(5).a();
                           this.b.j(Math.max(this.f, var5 + var7));
                           var30 = true;
                        } else {
                           var30 = true;
                        }
                     }

                     boolean var29;
                     if (var38.P) {
                        var10 = var18.getBaseline();
                        var29 = var30;
                        if (var10 != -1) {
                           var29 = var30;
                           if (var10 != var35.C) {
                              var35.C = var10;
                              var29 = true;
                           }
                        }
                     } else {
                        var29 = var30;
                     }

                     var6 = combineMeasuredStates(var6, var18.getMeasuredState());
                     var30 = var29;
                  }
               }
            }
         }

         if (var30) {
            this.a();
         }

         var5 = var6;
      } else {
         var5 = 0;
      }

      var7 = this.b.h();
      var6 = this.b.d();
      var1 = resolveSizeAndState(var7 + var11, var1, var5);
      var5 = resolveSizeAndState(var6 + var12, var2, var5 << 16);
      var2 = Math.min(this.g, var1);
      var1 = Math.min(this.h, var5);
      var2 &= 16777215;
      var5 = var1 & 16777215;
      var16 = this.b;
      var1 = var2;
      if (var16.aj) {
         var1 = var2 | 16777216;
      }

      var2 = var5;
      if (var16.ak) {
         var2 = var5 | 16777216;
      }

      this.setMeasuredDimension(var1, var2);
   }

   public final void onViewAdded(View var1) {
      super.onViewAdded(var1);
      boolean var2 = var1 instanceof Guideline;
      .am var3 = this.d(var1);
      if (var2 && !(var3 instanceof .ao)) {
         .ac var4 = (.ac)var1.getLayoutParams();
         var4.Y = new .ao();
         var4.Q = true;
         ((.ao)var4.Y).A(var4.M);
         var3 = var4.Y;
      }

      this.a.put(var1.getId(), var1);
      this.i = true;
   }

   public final void onViewRemoved(View var1) {
      super.onViewRemoved(var1);
      this.a.remove(var1.getId());
      this.b.F(this.d(var1));
      this.i = true;
   }

   public final void requestLayout() {
      super.requestLayout();
      this.i = true;
   }

   public final void setId(int var1) {
      this.a.remove(this.getId());
      super.setId(var1);
      this.a.put(this.getId(), this);
   }
}
