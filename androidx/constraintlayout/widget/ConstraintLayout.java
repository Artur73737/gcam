package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
   private static final boolean DEBUG = false;
   private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
   public static final int DESIGN_INFO_ID = 0;
   private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
   private static final String TAG = "ConstraintLayout";
   private static final boolean USE_CONSTRAINTS_HELPER = true;
   public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
   private static .cav sSharedValues = null;
   SparseArray mChildrenByIds = new SparseArray();
   private ArrayList mConstraintHelpers = new ArrayList(4);
   protected .cai mConstraintLayoutSpec = null;
   private .cap mConstraintSet = null;
   private int mConstraintSetId = -1;
   private HashMap mDesignIds = new HashMap();
   protected boolean mDirtyHierarchy = true;
   private int mLastMeasureHeight = -1;
   int mLastMeasureHeightMode = 0;
   int mLastMeasureHeightSize = -1;
   private int mLastMeasureWidth = -1;
   int mLastMeasureWidthMode = 0;
   int mLastMeasureWidthSize = -1;
   protected .bzg mLayoutWidget = new .bzg();
   private int mMaxHeight = Integer.MAX_VALUE;
   private int mMaxWidth = Integer.MAX_VALUE;
   .cae mMeasurer = new .cae(this, this);
   private .byw mMetrics;
   private int mMinHeight = 0;
   private int mMinWidth = 0;
   private ArrayList mModifiers;
   private int mOnMeasureHeightMeasureSpec = 0;
   private int mOnMeasureWidthMeasureSpec = 0;
   private int mOptimizationLevel = 257;
   private SparseArray mTempMapIdToWidget = new SparseArray();

   public ConstraintLayout(Context var1) {
      super(var1);
      this.init((AttributeSet)null, 0, 0);
   }

   public ConstraintLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.init(var2, 0, 0);
   }

   public ConstraintLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.init(var2, var3, 0);
   }

   public ConstraintLayout(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.init(var2, var3, var4);
   }

   // $FF: synthetic method
   public static .byw access$000(ConstraintLayout var0) {
      return var0.mMetrics;
   }

   // $FF: synthetic method
   public static int access$100(ConstraintLayout var0) {
      return var0.mOptimizationLevel;
   }

   // $FF: synthetic method
   public static ArrayList access$200(ConstraintLayout var0) {
      return var0.mConstraintHelpers;
   }

   private int getPaddingWidth() {
      int var1 = Math.max(0, this.getPaddingLeft());
      int var2 = Math.max(0, this.getPaddingRight());
      int var3 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
      return var3 > 0 ? var3 : var1 + var2;
   }

   public static .cav getSharedValues() {
      if (sSharedValues == null) {
         sSharedValues = new .cav();
      }

      return sSharedValues;
   }

   private .bzf getTargetWidget(int var1) {
      if (var1 == 0) {
         return this.mLayoutWidget;
      } else {
         View var2 = (View)this.mChildrenByIds.get(var1);
         if (var2 == null) {
            View var3 = this.findViewById(var1);
            var2 = var3;
            if (var3 != null) {
               var2 = var3;
               if (var3 != this) {
                  var2 = var3;
                  if (var3.getParent() == this) {
                     this.onViewAdded(var3);
                     var2 = var3;
                  }
               }
            }
         }

         if (var2 == this) {
            return this.mLayoutWidget;
         } else {
            return var2 == null ? null : ((.cad)var2.getLayoutParams()).av;
         }
      }
   }

   private void init(AttributeSet var1, int var2, int var3) {
      .bzg var5 = this.mLayoutWidget;
      var5.ah = this;
      .cae var6 = this.mMeasurer;
      var5.aI = var6;
      var5.a.g = var6;
      this.mChildrenByIds.put(this.getId(), this);
      this.mConstraintSet = null;
      if (var1 != null) {
         TypedArray var9 = this.getContext().obtainStyledAttributes(var1, .cau.b, var2, var3);
         var3 = var9.getIndexCount();

         for(var2 = 0; var2 < var3; ++var2) {
            int var4 = var9.getIndex(var2);
            if (var4 == 16) {
               this.mMinWidth = var9.getDimensionPixelOffset(16, this.mMinWidth);
            } else if (var4 == 17) {
               this.mMinHeight = var9.getDimensionPixelOffset(17, this.mMinHeight);
            } else if (var4 == 14) {
               this.mMaxWidth = var9.getDimensionPixelOffset(14, this.mMaxWidth);
            } else if (var4 == 15) {
               this.mMaxHeight = var9.getDimensionPixelOffset(15, this.mMaxHeight);
            } else if (var4 == 113) {
               this.mOptimizationLevel = var9.getInt(113, this.mOptimizationLevel);
            } else if (var4 == 56) {
               var4 = var9.getResourceId(56, 0);
               if (var4 != 0) {
                  try {
                     this.parseLayoutDescription(var4);
                  } catch (NotFoundException var8) {
                     this.mConstraintLayoutSpec = null;
                  }
               }
            } else if (var4 == 34) {
               var4 = var9.getResourceId(34, 0);

               try {
                  .cap var10 = new .cap();
                  this.mConstraintSet = var10;
                  var10.k(this.getContext(), var4);
               } catch (NotFoundException var7) {
                  this.mConstraintSet = null;
               }

               this.mConstraintSetId = var4;
            }
         }

         var9.recycle();
      }

      this.mLayoutWidget.W(this.mOptimizationLevel);
   }

   private void markHierarchyDirty() {
      this.mDirtyHierarchy = true;
      this.mLastMeasureWidth = -1;
      this.mLastMeasureHeight = -1;
      this.mLastMeasureWidthSize = -1;
      this.mLastMeasureHeightSize = -1;
      this.mLastMeasureWidthMode = 0;
      this.mLastMeasureHeightMode = 0;
   }

   private void setChildrenConstraints() {
      boolean var7 = this.isInEditMode();
      int var3 = this.getChildCount();

      int var1;
      .bzf var8;
      for(var1 = 0; var1 < var3; ++var1) {
         var8 = this.getViewWidget(this.getChildAt(var1));
         if (var8 != null) {
            var8.v();
         }
      }

      int var2;
      if (var7) {
         for(var1 = 0; var1 < var3; ++var1) {
            View var10 = this.getChildAt(var1);

            String var9;
            boolean var10001;
            try {
               var9 = this.getResources().getResourceName(var10.getId());
               this.setDesignInformation(0, var9, var10.getId());
               var2 = var9.indexOf(47);
            } catch (NotFoundException var15) {
               var10001 = false;
               continue;
            }

            String var16 = var9;
            if (var2 != -1) {
               try {
                  var16 = var9.substring(var2 + 1);
               } catch (NotFoundException var14) {
                  var10001 = false;
                  continue;
               }
            }

            try {
               this.getTargetWidget(var10.getId()).aj = var16;
            } catch (NotFoundException var13) {
               var10001 = false;
            }
         }
      }

      View var17;
      if (this.mConstraintSetId != -1) {
         for(var1 = 0; var1 < var3; ++var1) {
            var17 = this.getChildAt(var1);
            if (var17.getId() == this.mConstraintSetId && var17 instanceof .caq) {
               .caq var19 = (.caq)var17;
               throw null;
            }
         }
      }

      .cap var21 = this.mConstraintSet;
      if (var21 != null) {
         var21.w(this);
      }

      this.mLayoutWidget.aK.clear();
      int var4 = this.mConstraintHelpers.size();
      if (var4 > 0) {
         for(var1 = 0; var1 < var4; ++var1) {
            .cab var18 = (.cab)this.mConstraintHelpers.get(var1);
            if (var18.isInEditMode()) {
               var18.e(var18.f);
            }

            .bzj var23 = var18.i;
            if (var23 != null) {
               var23.at = 0;
               Arrays.fill(var23.as, (Object)null);

               for(var2 = 0; var2 < var18.d; ++var2) {
                  int var5 = var18.c[var2];
                  var17 = this.getViewById(var5);
                  if (var17 == null) {
                     String var24 = (String)var18.h.get(var5);
                     var5 = var18.d(this, var24);
                     if (var5 != 0) {
                        var18.c[var2] = var5;
                        var18.h.put(var5, var24);
                        var17 = this.getViewById(var5);
                     }
                  }

                  if (var17 != null) {
                     .bzj var25 = var18.i;
                     var8 = this.getViewWidget(var17);
                     if (var8 != var25 && var8 != null) {
                        var5 = var25.at;
                        .bzf[] var11 = var25.as;
                        int var6 = var11.length;
                        if (var5 + 1 > var6) {
                           var25.as = (.bzf[])Arrays.copyOf(var11, var6 + var6);
                        }

                        var11 = var25.as;
                        var5 = var25.at;
                        var11[var5] = var8;
                        var25.at = var5 + 1;
                     }
                  }
               }

               var23 = var18.i;
            }
         }

         var1 = 0;
      } else {
         var1 = 0;
      }

      while(var1 < var3) {
         var17 = this.getChildAt(var1);
         if (var17 instanceof .cas) {
            .cas var28 = (.cas)var17;
            throw null;
         }

         ++var1;
      }

      this.mTempMapIdToWidget.clear();
      this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
      this.mTempMapIdToWidget.put(this.getId(), this.mLayoutWidget);

      for(var1 = 0; var1 < var3; ++var1) {
         View var20 = this.getChildAt(var1);
         var8 = this.getViewWidget(var20);
         this.mTempMapIdToWidget.put(var20.getId(), var8);
      }

      for(var1 = 0; var1 < var3; ++var1) {
         var17 = this.getChildAt(var1);
         .bzf var27 = this.getViewWidget(var17);
         if (var27 != null) {
            .cad var22 = (.cad)var17.getLayoutParams();
            .bzg var12 = this.mLayoutWidget;
            var12.aK.add(var27);
            .bzf var26 = var27.V;
            if (var26 != null) {
               ((.bzm)var26).aa(var27);
            }

            var27.V = var12;
            this.applyConstraintsFromLayoutParams(var7, var17, var27, var22, this.mTempMapIdToWidget);
         }
      }

   }

   private void setWidgetBaseline(.bzf var1, .cad var2, SparseArray var3, int var4, .bzd var5) {
      View var6 = (View)this.mChildrenByIds.get(var4);
      .bzf var7 = (.bzf)var3.get(var4);
      if (var7 != null && var6 != null && var6.getLayoutParams() instanceof .cad) {
         var2.ag = true;
         if (var5 == .bzd.f) {
            .cad var8 = (.cad)var6.getLayoutParams();
            var8.ag = true;
            var8.av.G = true;
         }

         var1.m(.bzd.f).j(var7.m(var5), var2.D, var2.C);
         var1.G = true;
         var1.m(.bzd.c).d();
         var1.m(.bzd.e).d();
      }

   }

   private boolean updateHierarchy() {
      int var2 = this.getChildCount();
      boolean var3 = false;

      for(int var1 = 0; var1 < var2; ++var1) {
         if (this.getChildAt(var1).isLayoutRequested()) {
            var3 = true;
            break;
         }
      }

      if (var3) {
         this.setChildrenConstraints();
      }

      return var3;
   }

   public void addValueModifier(.caf var1) {
      if (this.mModifiers == null) {
         this.mModifiers = new ArrayList();
      }

      this.mModifiers.add(var1);
   }

   protected void applyConstraintsFromLayoutParams(boolean var1, View var2, .bzf var3, .cad var4, SparseArray var5) {
      var4.a();
      var4.aw = false;
      var3.ai = var2.getVisibility();
      boolean var15 = var4.aj;
      var3.ah = var2;
      if (var2 instanceof .cab) {
         ((.cab)var2).b(var3, this.mLayoutWidget.c);
      }

      float var6;
      int var8;
      int var9;
      if (var4.ah) {
         .bzi var20 = (.bzi)var3;
         var8 = var4.as;
         var9 = var4.at;
         var6 = var4.au;
         if (var6 != -1.0F) {
            if (var6 > -1.0F) {
               var20.a = var6;
               var20.b = -1;
               var20.c = -1;
               return;
            }
         } else if (var8 != -1) {
            if (var8 >= 0) {
               var20.a = -1.0F;
               var20.b = var8;
               var20.c = -1;
               return;
            }
         } else if (var9 != -1 && var9 >= 0) {
            var20.a = -1.0F;
            var20.b = -1;
            var20.c = var9;
            return;
         }
      } else {
         int var12 = var4.al;
         int var13 = var4.am;
         int var14 = var4.an;
         int var11 = var4.ao;
         var9 = var4.ap;
         int var10 = var4.aq;
         var6 = var4.ar;
         var8 = var4.p;
         .bzf var21;
         if (var8 != -1) {
            var21 = (.bzf)var5.get(var8);
            if (var21 != null) {
               var6 = var4.r;
               var8 = var4.q;
               var3.u(.bzd.g, var21, .bzd.g, var8, 0);
               var3.F = var6;
            }
         } else {
            if (var12 != -1) {
               var21 = (.bzf)var5.get(var12);
               if (var21 != null) {
                  var3.u(.bzd.b, var21, .bzd.b, var4.leftMargin, var9);
               }
            } else if (var13 != -1) {
               var21 = (.bzf)var5.get(var13);
               if (var21 != null) {
                  var3.u(.bzd.b, var21, .bzd.d, var4.leftMargin, var9);
               }
            }

            if (var14 != -1) {
               var21 = (.bzf)var5.get(var14);
               if (var21 != null) {
                  var3.u(.bzd.d, var21, .bzd.b, var4.rightMargin, var10);
               }
            } else if (var11 != -1) {
               var21 = (.bzf)var5.get(var11);
               if (var21 != null) {
                  var3.u(.bzd.d, var21, .bzd.d, var4.rightMargin, var10);
               }
            }

            var8 = var4.i;
            if (var8 != -1) {
               var21 = (.bzf)var5.get(var8);
               if (var21 != null) {
                  var3.u(.bzd.c, var21, .bzd.c, var4.topMargin, var4.x);
               }
            } else {
               var8 = var4.j;
               if (var8 != -1) {
                  var21 = (.bzf)var5.get(var8);
                  if (var21 != null) {
                     var3.u(.bzd.c, var21, .bzd.e, var4.topMargin, var4.x);
                  }
               }
            }

            var8 = var4.k;
            if (var8 != -1) {
               var21 = (.bzf)var5.get(var8);
               if (var21 != null) {
                  var3.u(.bzd.e, var21, .bzd.c, var4.bottomMargin, var4.z);
               }
            } else {
               var8 = var4.l;
               if (var8 != -1) {
                  var21 = (.bzf)var5.get(var8);
                  if (var21 != null) {
                     var3.u(.bzd.e, var21, .bzd.e, var4.bottomMargin, var4.z);
                  }
               }
            }

            var8 = var4.m;
            if (var8 != -1) {
               this.setWidgetBaseline(var3, var4, var5, var8, .bzd.f);
            } else {
               var8 = var4.n;
               if (var8 != -1) {
                  this.setWidgetBaseline(var3, var4, var5, var8, .bzd.c);
               } else {
                  var8 = var4.o;
                  if (var8 != -1) {
                     this.setWidgetBaseline(var3, var4, var5, var8, .bzd.e);
                  }
               }
            }

            if (var6 >= 0.0F) {
               var3.af = var6;
            }

            var6 = var4.H;
            if (var6 >= 0.0F) {
               var3.ag = var6;
            }
         }

         if (var1) {
            label253: {
               var9 = var4.X;
               var8 = var9;
               if (var9 == -1) {
                  if (var4.Y == -1) {
                     break label253;
                  }

                  var8 = -1;
               }

               var9 = var4.Y;
               var3.aa = var8;
               var3.ab = var9;
            }
         }

         if (!var4.ae) {
            if (var4.width == -1) {
               if (var4.aa) {
                  var3.Q(3);
               } else {
                  var3.Q(4);
               }

               var3.m(.bzd.b).g = var4.leftMargin;
               var3.m(.bzd.d).g = var4.rightMargin;
            } else {
               var3.Q(3);
               var3.F(0);
            }
         } else {
            var3.Q(1);
            var3.F(var4.width);
            if (var4.width == -2) {
               var3.Q(2);
            }
         }

         if (!var4.af) {
            if (var4.height == -1) {
               if (var4.ab) {
                  var3.R(3);
               } else {
                  var3.R(4);
               }

               var3.m(.bzd.c).g = var4.topMargin;
               var3.m(.bzd.e).g = var4.bottomMargin;
            } else {
               var3.R(3);
               var3.A(0);
            }
         } else {
            var3.R(1);
            var3.A(var4.height);
            if (var4.height == -2) {
               var3.R(2);
            }
         }

         String var22 = var4.I;
         if (var22 != null && var22.length() != 0) {
            var11 = var22.length();
            var9 = var22.indexOf(44);
            String var23;
            byte var25;
            if (var9 > 0 && var9 < var11 - 1) {
               var23 = var22.substring(0, var9);
               byte var26;
               if (var23.equalsIgnoreCase("W")) {
                  var26 = 0;
               } else if (var23.equalsIgnoreCase("H")) {
                  var26 = 1;
               } else {
                  var26 = -1;
               }

               var10 = var9 + 1;
               var25 = var26;
               var8 = var10;
            } else {
               var25 = -1;
               var8 = 0;
            }

            label258: {
               var10 = var22.indexOf(58);
               boolean var10001;
               if (var10 >= 0 && var10 < var11 - 1) {
                  label219: {
                     var23 = var22.substring(var8, var10);
                     var22 = var22.substring(var10 + 1);
                     if (var23.length() > 0 && var22.length() > 0) {
                        float var7;
                        try {
                           var7 = Float.parseFloat(var23);
                           var6 = Float.parseFloat(var22);
                        } catch (NumberFormatException var19) {
                           var10001 = false;
                           break label219;
                        }

                        if (var7 > 0.0F && var6 > 0.0F) {
                           if (var25 == 1) {
                              try {
                                 var6 = Math.abs(var6 / var7);
                                 break label258;
                              } catch (NumberFormatException var16) {
                                 var10001 = false;
                                 break label219;
                              }
                           } else {
                              try {
                                 var6 = Math.abs(var7 / var6);
                                 break label258;
                              } catch (NumberFormatException var17) {
                                 var10001 = false;
                                 break label219;
                              }
                           }
                        }
                     }

                     var6 = 0.0F;
                     break label258;
                  }
               } else {
                  var23 = var22.substring(var8);
                  if (var23.length() <= 0) {
                     var6 = 0.0F;
                     break label258;
                  }

                  try {
                     var6 = Float.parseFloat(var23);
                     break label258;
                  } catch (NumberFormatException var18) {
                     var10001 = false;
                  }
               }

               var6 = 0.0F;
            }

            if (var6 > 0.0F) {
               var3.Y = var6;
               var3.Z = var25;
            }
         } else {
            var3.Y = 0.0F;
         }

         var6 = var4.L;
         float[] var24 = var3.am;
         var24[0] = var6;
         var24[1] = var4.M;
         var3.ak = var4.N;
         var3.al = var4.O;
         var8 = var4.ad;
         if (var8 >= 0 && var8 <= 3) {
            var3.s = var8;
         }

         var10 = var4.P;
         var8 = var4.R;
         var9 = var4.T;
         var6 = var4.V;
         var3.t = var10;
         var3.w = var8;
         var8 = var9;
         if (var9 == Integer.MAX_VALUE) {
            var8 = 0;
         }

         var3.x = var8;
         var3.y = var6;
         if (var6 > 0.0F && var6 < 1.0F && var10 == 0) {
            var3.t = 2;
         }

         var10 = var4.Q;
         var8 = var4.S;
         var9 = var4.U;
         var6 = var4.W;
         var3.u = var10;
         var3.z = var8;
         var8 = var9;
         if (var9 == Integer.MAX_VALUE) {
            var8 = 0;
         }

         var3.A = var8;
         var3.B = var6;
         if (var6 > 0.0F && var6 < 1.0F && var10 == 0) {
            var3.u = 2;
            return;
         }
      }

   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof .cad;
   }

   protected void dispatchDraw(Canvas var1) {
      ArrayList var14 = this.mConstraintHelpers;
      int var8;
      int var9;
      if (var14 != null) {
         var9 = var14.size();
         if (var9 > 0) {
            for(var8 = 0; var8 < var9; ++var8) {
               .cab var15 = (.cab)this.mConstraintHelpers.get(var8);
            }
         }
      }

      super.dispatchDraw(var1);
      if (this.isInEditMode()) {
         float var2 = (float)this.getWidth();
         float var3 = (float)this.getHeight();
         var9 = this.getChildCount();

         for(var8 = 0; var8 < var9; ++var8) {
            View var16 = this.getChildAt(var8);
            if (var16.getVisibility() != 8) {
               Object var17 = var16.getTag();
               if (var17 != null && var17 instanceof String) {
                  String[] var18 = ((String)var17).split(",");
                  if (var18.length == 4) {
                     int var12 = Integer.parseInt(var18[0]);
                     int var10 = Integer.parseInt(var18[1]);
                     int var13 = Integer.parseInt(var18[2]);
                     int var11 = Integer.parseInt(var18[3]);
                     float var6 = (float)var12 / 1080.0F;
                     float var7 = (float)var10 / 1920.0F;
                     float var5 = (float)var13 / 1080.0F;
                     float var4 = (float)var11 / 1920.0F;
                     Paint var19 = new Paint();
                     var19.setColor(-65536);
                     var11 = (int)(var7 * var3);
                     var10 = (int)(var6 * var2);
                     var6 = (float)((int)(var5 * var2) + var10);
                     var7 = (float)var10;
                     var5 = (float)var11;
                     var1.drawLine(var7, var5, var6, var5, var19);
                     var4 = (float)(var11 + (int)(var4 * var3));
                     var1.drawLine(var6, var5, var6, var4, var19);
                     var1.drawLine(var6, var4, var7, var4, var19);
                     var1.drawLine(var7, var4, var7, var5, var19);
                     var19.setColor(-16711936);
                     var1.drawLine(var7, var5, var6, var4, var19);
                     var1.drawLine(var7, var4, var6, var5, var19);
                  }
               }
            }
         }
      }

   }

   protected boolean dynamicUpdateConstraints(int var1, int var2) {
      if (this.mModifiers == null) {
         return false;
      } else {
         MeasureSpec.getSize(var1);
         MeasureSpec.getSize(var2);
         ArrayList var6 = this.mModifiers;
         int var3 = var6.size();
         var1 = 0;

         boolean var5;
         for(var5 = false; var1 < var3; ++var1) {
            .caf var7 = (.caf)var6.get(var1);
            ArrayList var8 = this.mLayoutWidget.aK;
            int var4 = var8.size();

            for(var2 = 0; var2 < var4; ++var2) {
               View var9 = (View)((.bzf)var8.get(var2)).ah;
               var9.getId();
               .cad var10 = (.cad)var9.getLayoutParams();
               var5 |= var7.a();
            }
         }

         return var5;
      }
   }

   public void fillMetrics(.byw var1) {
      this.mMetrics = var1;
      this.mLayoutWidget.c(var1);
   }

   public void forceLayout() {
      this.markHierarchyDirty();
      super.forceLayout();
   }

   public .cad generateDefaultLayoutParams() {
      return new .cad(-2, -2);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return new .cad(var1);
   }

   public .cad generateLayoutParams(AttributeSet var1) {
      return new .cad(this.getContext(), var1);
   }

   public Object getDesignInformation(int var1, Object var2) {
      if (var1 == 0 && var2 instanceof String) {
         String var3 = (String)var2;
         HashMap var4 = this.mDesignIds;
         if (var4 != null && var4.containsKey(var3)) {
            return this.mDesignIds.get(var3);
         }
      }

      return null;
   }

   public int getMaxHeight() {
      return this.mMaxHeight;
   }

   public int getMaxWidth() {
      return this.mMaxWidth;
   }

   public int getMinHeight() {
      return this.mMinHeight;
   }

   public int getMinWidth() {
      return this.mMinWidth;
   }

   public int getOptimizationLevel() {
      return this.mLayoutWidget.az;
   }

   public String getSceneString() {
      StringBuilder var4 = new StringBuilder();
      int var1;
      String var5;
      if (this.mLayoutWidget.m == null) {
         var1 = this.getId();
         if (var1 != -1) {
            var5 = this.getContext().getResources().getResourceEntryName(var1);
            this.mLayoutWidget.m = var5;
         } else {
            this.mLayoutWidget.m = "parent";
         }
      }

      .bzg var6 = this.mLayoutWidget;
      if (var6.aj == null) {
         var6.aj = var6.m;
         var5 = var6.aj;
      }

      ArrayList var8 = var6.aK;
      int var2 = var8.size();

      for(var1 = 0; var1 < var2; ++var1) {
         .bzf var9 = (.bzf)var8.get(var1);
         Object var7 = var9.ah;
         if (var7 != null) {
            if (var9.m == null) {
               int var3 = ((View)var7).getId();
               if (var3 != -1) {
                  var9.m = this.getContext().getResources().getResourceEntryName(var3);
               }
            }

            if (var9.aj == null) {
               var9.aj = var9.m;
               String var10 = var9.aj;
            }
         }
      }

      this.mLayoutWidget.t(var4);
      return var4.toString();
   }

   public View getViewById(int var1) {
      return (View)this.mChildrenByIds.get(var1);
   }

   public final .bzf getViewWidget(View var1) {
      if (var1 == this) {
         return this.mLayoutWidget;
      } else {
         if (var1 != null) {
            if (var1.getLayoutParams() instanceof .cad) {
               return ((.cad)var1.getLayoutParams()).av;
            }

            var1.setLayoutParams(this.generateLayoutParams(var1.getLayoutParams()));
            if (var1.getLayoutParams() instanceof .cad) {
               return ((.cad)var1.getLayoutParams()).av;
            }
         }

         return null;
      }
   }

   protected boolean isRtl() {
      return (this.getContext().getApplicationInfo().flags & 4194304) != 0 && this.getLayoutDirection() == 1;
   }

   public void loadLayoutDescription(int var1) {
      if (var1 != 0) {
         try {
            .cai var2 = new .cai(this.getContext(), this, var1);
            this.mConstraintLayoutSpec = var2;
            return;
         } catch (NotFoundException var3) {
         }
      }

      this.mConstraintLayoutSpec = null;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      .byw var8 = this.mMetrics;
      if (var8 != null) {
         ++var8.D;
      }

      var4 = this.getChildCount();
      var1 = this.isInEditMode();
      byte var11 = 0;

      for(var2 = 0; var2 < var4; ++var2) {
         View var12 = this.getChildAt(var2);
         .cad var9 = (.cad)var12.getLayoutParams();
         .bzf var10 = var9.av;
         boolean var7;
         if (var12.getVisibility() == 8 && !var9.ah && !var9.ai) {
            var7 = var9.ak;
            if (!var1) {
               continue;
            }
         }

         var7 = var9.aj;
         int var6 = var10.k();
         var5 = var10.l();
         var12.layout(var6, var5, var10.j() + var6, var10.h() + var5);
         if (var12 instanceof .cas) {
            .cas var13 = (.cas)var12;
            throw null;
         }
      }

      var4 = this.mConstraintHelpers.size();
      if (var4 > 0) {
         for(var2 = var11; var2 < var4; ++var2) {
            .cab var14 = (.cab)this.mConstraintHelpers.get(var2);
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      long var5;
      .byw var8;
      if (this.mMetrics != null) {
         var5 = System.nanoTime();
         this.mMetrics.G = (long)this.getChildCount();
         var8 = this.mMetrics;
         ++var8.H;
      } else {
         var5 = 0L;
      }

      boolean var7 = this.mDirtyHierarchy | this.dynamicUpdateConstraints(var1, var2);
      this.mDirtyHierarchy = var7;
      int var3;
      int var4;
      if (!var7) {
         var4 = this.getChildCount();

         for(var3 = 0; var3 < var4; ++var3) {
            if (this.getChildAt(var3).isLayoutRequested()) {
               this.mDirtyHierarchy = true;
               break;
            }
         }
      }

      this.mOnMeasureWidthMeasureSpec = var1;
      this.mOnMeasureHeightMeasureSpec = var2;
      this.mLayoutWidget.c = this.isRtl();
      .bzg var9;
      if (this.mDirtyHierarchy) {
         this.mDirtyHierarchy = false;
         if (this.updateHierarchy()) {
            var9 = this.mLayoutWidget;
            var9.aJ.j(var9);
         }
      }

      this.mLayoutWidget.c(this.mMetrics);
      this.resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, var1, var2);
      var4 = this.mLayoutWidget.j();
      var3 = this.mLayoutWidget.h();
      var9 = this.mLayoutWidget;
      this.resolveMeasuredDimension(var1, var2, var4, var3, var9.aA, var9.aB);
      var8 = this.mMetrics;
      if (var8 != null) {
         var8.F += System.nanoTime() - var5;
      }

   }

   public void onViewAdded(View var1) {
      super.onViewAdded(var1);
      boolean var2 = var1 instanceof Guideline;
      .bzf var3 = this.getViewWidget(var1);
      if (var2 && !(var3 instanceof .bzi)) {
         .cad var4 = (.cad)var1.getLayoutParams();
         var4.av = new .bzi();
         var4.ah = true;
         ((.bzi)var4.av).c(var4.Z);
      }

      if (var1 instanceof .cab) {
         .cab var5 = (.cab)var1;
         var5.h();
         ((.cad)var1.getLayoutParams()).ai = true;
         if (!this.mConstraintHelpers.contains(var5)) {
            this.mConstraintHelpers.add(var5);
         }
      }

      this.mChildrenByIds.put(var1.getId(), var1);
      this.mDirtyHierarchy = true;
   }

   public void onViewRemoved(View var1) {
      super.onViewRemoved(var1);
      this.mChildrenByIds.remove(var1.getId());
      .bzf var2 = this.getViewWidget(var1);
      this.mLayoutWidget.aa(var2);
      this.mConstraintHelpers.remove(var1);
      this.mDirtyHierarchy = true;
   }

   protected void parseLayoutDescription(int var1) {
      this.mConstraintLayoutSpec = new .cai(this.getContext(), this, var1);
   }

   void removeValueModifier(.caf var1) {
      if (var1 != null) {
         this.mModifiers.remove(var1);
      }
   }

   public void requestLayout() {
      this.markHierarchyDirty();
      super.requestLayout();
   }

   protected void resolveMeasuredDimension(int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      .cae var8 = this.mMeasurer;
      int var7 = var8.e;
      var1 = resolveSizeAndState(var3 + var8.d, var1, 0);
      var3 = resolveSizeAndState(var4 + var7, var2, 0);
      var2 = Math.min(this.mMaxWidth, var1 & 16777215);
      var3 = Math.min(this.mMaxHeight, var3 & 16777215);
      var1 = var2;
      if (var5) {
         var1 = var2 | 16777216;
      }

      var2 = var3;
      if (var6) {
         var2 = var3 | 16777216;
      }

      this.setMeasuredDimension(var1, var2);
      this.mLastMeasureWidth = var1;
      this.mLastMeasureHeight = var2;
   }

   protected void resolveSystem(.bzg var1, int var2, int var3, int var4) {
      int var6 = MeasureSpec.getMode(var3);
      int var9 = MeasureSpec.getSize(var3);
      int var7 = MeasureSpec.getMode(var4);
      int var8 = MeasureSpec.getSize(var4);
      int var5 = Math.max(0, this.getPaddingTop());
      int var12 = Math.max(0, this.getPaddingBottom());
      int var10 = var5 + var12;
      int var11 = this.getPaddingWidth();
      .cae var22 = this.mMeasurer;
      var22.b = var5;
      var22.c = var12;
      var22.d = var11;
      var22.e = var10;
      var22.f = var3;
      var22.g = var4;
      var3 = Math.max(0, this.getPaddingStart());
      var4 = Math.max(0, this.getPaddingEnd());
      if (var3 <= 0 && var4 <= 0) {
         var3 = Math.max(0, this.getPaddingLeft());
      } else if (this.isRtl()) {
         var3 = var4;
      }

      var9 -= var11;
      var12 = var8 - var10;
      this.setSelfDimensionBehaviour(var1, var6, var9, var7, var12);
      var1.at = var3;
      var1.au = var5;
      .ve var24 = var1.aJ;
      .cae var23 = var1.aI;
      int var13 = var1.aK.size();
      boolean var21 = .bzk.b(var2, 128);
      var8 = var1.j();
      var10 = var1.h();
      boolean var30;
      if (!var21) {
         if (.bzk.b(var2, 64)) {
            var30 = true;
         } else {
            var30 = false;
         }
      } else {
         var30 = true;
      }

      boolean var31 = var30;
      boolean var33;
      .bzf var38;
      if (var30) {
         var4 = 0;

         while(true) {
            var31 = var30;
            if (var4 >= var13) {
               break;
            }

            var38 = (.bzf)var1.aK.get(var4);
            var5 = var38.O();
            var3 = var38.P();
            if (var5 == 3 && var3 == 3 && var38.Y > 0.0F) {
               var31 = true;
            } else {
               var31 = false;
            }

            var33 = var31;
            if (var38.K()) {
               if (var31) {
                  var31 = false;
                  break;
               }

               var33 = false;
            }

            if ((!var38.L() || !var33) && !(var38 instanceof .bzl)) {
               if (!var38.K() && !var38.L()) {
                  ++var4;
                  continue;
               }

               var31 = false;
               break;
            }

            var31 = false;
            break;
         }
      }

      .byw var39;
      if (var31) {
         var39 = .byv.b;
         if (var39 != null) {
            ++var39.e;
         }
      }

      boolean var32;
      label505: {
         var2 = var8;
         if (var6 == 1073741824) {
            if (var7 == 1073741824) {
               var32 = true;
               var8 = 1073741824;
               var7 = 1073741824;
               break label505;
            }

            var5 = 1073741824;
         } else {
            var5 = var6;
         }

         if (var21) {
            var32 = true;
            var8 = var5;
         } else {
            var32 = false;
            var8 = var5;
         }
      }

      boolean var35 = var32 & var31;
      boolean var20;
      if (var35) {
         var4 = Math.min(var1.E[0], var9);
         var3 = Math.min(var1.E[1], var12);
         if (var8 == 1073741824) {
            var33 = false;
         } else {
            var33 = true;
         }

         if (var8 == 1073741824 && var1.j() != var4) {
            var1.F(var4);
            var1.U();
         }

         boolean var34;
         if (var7 == 1073741824) {
            var34 = false;
         } else {
            var34 = true;
         }

         if (var7 == 1073741824 && var1.h() != var3) {
            var1.A(var3);
            var1.U();
         }

         .bzq var25;
         ArrayList var40;
         .bzg var41;
         if (var8 == 1073741824 && var7 == 1073741824) {
            var25 = var1.a;
            if (var25.b || var25.c) {
               ArrayList var50 = var25.a.aK;
               var4 = var50.size();

               for(var3 = 0; var3 < var4; ++var3) {
                  var38 = (.bzf)var50.get(var3);
                  var38.s();
                  var38.e = false;
                  var38.h.g();
                  var38.i.g();
               }

               var25.a.s();
               var41 = var25.a;
               var41.e = false;
               var41.h.g();
               var25.a.i.g();
               var25.c = false;
            }

            var25.d(var25.d);
            var41 = var25.a;
            var41.aa = 0;
            var41.ab = 0;
            var7 = var41.N(0);
            var8 = var25.a.N(1);
            if (var25.b) {
               var25.b();
            }

            label469: {
               label468: {
                  var41 = var25.a;
                  var12 = var41.k();
                  var9 = var41.l();
                  var41.h.h.c(var12);
                  var25.a.i.h.c(var9);
                  var25.c();
                  var3 = var8;
                  if (var7 != 2) {
                     var4 = var8;
                     if (var8 != 2) {
                        break label468;
                     }

                     var3 = 2;
                  }

                  var4 = var3;
                  if (var21) {
                     var40 = var25.e;
                     var8 = var40.size();
                     var4 = 0;

                     do {
                        if (var4 >= var8) {
                           if (var7 == 2) {
                              var25.a.Q(1);
                              var41 = var25.a;
                              var41.F(var25.a(var41, 0));
                              var41 = var25.a;
                              var41.h.e.c(var41.j());
                              var4 = 2;
                           } else {
                              var4 = var7;
                           }

                           var7 = var4;
                           var8 = var3;
                           if (var3 == 2) {
                              var25.a.R(1);
                              var41 = var25.a;
                              var41.A(var25.a(var41, 1));
                              var41 = var25.a;
                              var41.i.e.c(var41.h());
                              var8 = var3;
                              var7 = var4;
                           }
                           break label469;
                        }

                        var20 = ((.bzz)var40.get(var4)).e();
                        ++var4;
                     } while(var20);

                     var8 = var3;
                     break label469;
                  }
               }

               var8 = var4;
            }

            var41 = var25.a;
            var3 = var41.ar[0];
            if (var3 != 1 && var3 != 4) {
               var31 = false;
            } else {
               var3 = var41.j() + var12;
               var41.h.i.c(var3);
               var25.a.h.e.c(var3 - var12);
               var25.c();
               var41 = var25.a;
               var3 = var41.ar[1];
               if (var3 == 1 || var3 == 4) {
                  var3 = var41.h() + var9;
                  var41.i.i.c(var3);
                  var25.a.i.e.c(var3 - var9);
               }

               var25.c();
               var31 = true;
            }

            var40 = var25.e;
            var9 = var40.size();
            var4 = 0;

            while(true) {
               .bzz var53;
               if (var4 >= var9) {
                  var40 = var25.e;
                  var9 = var40.size();
                  var4 = 0;

                  while(true) {
                     if (var4 >= var9) {
                        var20 = true;
                        break;
                     }

                     var53 = (.bzz)var40.get(var4);
                     if (var31 || var53.d != var25.a) {
                        if (!var53.h.i) {
                           var20 = false;
                           break;
                        }

                        if (!var53.i.i && !(var53 instanceof .bzu)) {
                           var20 = false;
                           break;
                        }

                        if (!var53.e.i && !(var53 instanceof .bzo) && !(var53 instanceof .bzu)) {
                           var20 = false;
                           break;
                        }
                     }

                     ++var4;
                  }

                  var25.a.Q(var7);
                  var25.a.R(var8);
                  var3 = var2;
                  var2 = 2;
                  break;
               }

               var53 = (.bzz)var40.get(var4);
               if (var53.d != var25.a || var53.g) {
                  var53.c();
               }

               ++var4;
            }
         } else {
            var25 = var1.a;
            if (var25.b) {
               var40 = var25.a.aK;
               var3 = var40.size();

               for(var4 = 0; var4 < var3; ++var4) {
                  .bzf var27 = (.bzf)var40.get(var4);
                  var27.s();
                  var27.e = false;
                  .bzw var26 = var27.h;
                  var26.e.i = false;
                  var26.g = false;
                  var26.g();
                  .bzx var49 = var27.i;
                  var49.e.i = false;
                  var49.g = false;
                  var49.g();
               }

               var25.a.s();
               var41 = var25.a;
               var41.e = false;
               .bzw var44 = var41.h;
               var44.e.i = false;
               var44.g = false;
               var44.g();
               .bzx var45 = var25.a.i;
               var45.e.i = false;
               var45.g = false;
               var45.g();
               var25.b();
               var3 = var2;
            } else {
               var3 = var2;
            }

            var25.d(var25.d);
            var41 = var25.a;
            var41.aa = 0;
            var41.ab = 0;
            var41.h.h.c(0);
            var25.a.i.h.c(0);
            if (var8 == 1073741824) {
               var20 = var1.X(var21, 0);
               var2 = 1;
            } else {
               var2 = 0;
               var20 = true;
            }

            if (var7 == 1073741824) {
               var20 &= var1.X(var21, 1);
               ++var2;
            }
         }

         var21 = var20;
         var7 = var2;
         var4 = var3;
         if (var20) {
            var1.G(var33 ^ true, var34 ^ true);
            var21 = var20;
            var7 = var2;
            var4 = var3;
         }
      } else {
         var21 = false;
         var7 = 0;
         var4 = var2;
      }

      if (!var21 || var7 != 2) {
         var6 = var1.az;
         .byw var47;
         if (var13 > 0) {
            var9 = var1.aK.size();
            var21 = var1.Y(64);
            var22 = var1.aI;
            var7 = 0;

            label409:
            while(true) {
               if (var7 >= var9) {
                  var3 = var22.a.getChildCount();

                  for(var2 = 0; var2 < var3; ++var2) {
                     View var48 = var22.a.getChildAt(var2);
                     if (var48 instanceof .cas) {
                        .cas var28 = (.cas)var48;
                        ConstraintLayout var29 = var22.a;
                        throw null;
                     }
                  }

                  var3 = access$200(var22.a).size();
                  if (var3 <= 0) {
                     break;
                  }

                  var2 = 0;

                  while(true) {
                     if (var2 >= var3) {
                        break label409;
                     }

                     .cab var10000 = (.cab)access$200(var22.a).get(var2);
                     ConstraintLayout var51 = var22.a;
                     ++var2;
                  }
               }

               .bzf var55 = (.bzf)var1.aK.get(var7);
               if (!(var55 instanceof .bzi) && !(var55 instanceof .bzb)) {
                  label567: {
                     var20 = var55.H;
                     if (var21) {
                        .bzw var46 = var55.h;
                        if (var46 != null) {
                           .bzx var54 = var55.i;
                           if (var54 != null && var46.e.i && var54.e.i) {
                              break label567;
                           }
                        }
                     }

                     var2 = var55.N(0);
                     var5 = var55.N(1);
                     if (var2 == 3) {
                        if (var55.t != 1 && var5 == 3) {
                           if (var55.u != 1) {
                              var31 = true;
                              var2 = 3;
                              var5 = 3;
                           } else {
                              var31 = false;
                              var2 = 3;
                              var5 = 3;
                           }
                        } else {
                           var31 = false;
                           var2 = 3;
                        }
                     } else {
                        var31 = false;
                     }

                     if (!var31) {
                        label568: {
                           if (var1.Y(1) && !(var55 instanceof .bzl)) {
                              if (var2 == 3 && var55.t == 0 && var5 != 3 && !var55.K()) {
                                 var31 = true;
                              } else {
                                 var31 = false;
                              }

                              boolean var37 = var31;
                              if (var5 == 3) {
                                 var37 = var31;
                                 if (var55.u == 0) {
                                    var37 = var31;
                                    if (var2 != 3) {
                                       var37 = var31;
                                       if (!var55.K()) {
                                          var37 = true;
                                       }
                                    }
                                 }
                              }

                              if ((var2 == 3 || var5 == 3) && var55.Y > 0.0F || var37) {
                                 break label568;
                              }
                           }

                           var24.k(var22, var55, 0);
                           var47 = var1.d;
                           if (var47 != null) {
                              ++var47.c;
                           }
                        }
                     }
                  }
               }

               ++var7;
            }
         }

         if (var1.d != null) {
            System.nanoTime();
         }

         var24.j(var1);
         var12 = ((ArrayList)var24.a).size();
         if (var13 > 0) {
            var24.l(var1, 0, var4, var10);
         }

         var8 = var10;
         if (var12 <= 0) {
            var7 = var6;
         } else {
            var13 = var1.O();
            int var14 = var1.P();
            var3 = Math.max(var1.j(), ((.bzf)var24.b).ad);
            var2 = Math.max(var1.h(), ((.bzf)var24.b).ae);
            var7 = 0;
            var5 = 0;

            int var15;
            int var16;
            for(var9 = var4; var7 < var12; ++var7) {
               .bzf var52 = (.bzf)((ArrayList)var24.a).get(var7);
               if (var52 instanceof .bzl) {
                  var16 = var52.j();
                  var10 = var52.h();
                  byte var43 = var24.k(var23, var52, 1);
                  var39 = var1.d;
                  if (var39 != null) {
                     ++var39.d;
                  }

                  var6 = var52.j();
                  var15 = var52.h();
                  if (var6 != var16) {
                     var52.F(var6);
                     var5 = var3;
                     if (var13 == 2) {
                        var5 = var3;
                        if (var52.i() > var3) {
                           var5 = Math.max(var3, var52.i() + var52.m(.bzd.d).b());
                        }
                     }

                     var6 = 1;
                     var3 = var5;
                  } else {
                     var6 = var5 | var43;
                  }

                  var5 = var2;
                  if (var15 != var10) {
                     var52.A(var15);
                     var5 = var2;
                     if (var14 == 2) {
                        var5 = var2;
                        if (var52.g() > var2) {
                           var5 = Math.max(var2, var52.g() + var52.m(.bzd.e).b());
                        }
                     }

                     var6 = 1;
                  }

                  .bzl var56 = (.bzl)var52;
                  var2 = var5;
                  var5 = var6;
               }
            }

            var10 = var6;
            byte var36 = 0;
            var6 = var5;
            var33 = var35;
            var4 = var12;
            var11 = var36;
            var22 = var23;

            while(true) {
               var7 = var10;
               if (var11 >= 2) {
                  break;
               }

               for(var12 = 0; var12 < var4; ++var12) {
                  .bzf var42 = (.bzf)((ArrayList)var24.a).get(var12);
                  if ((!(var42 instanceof .bzj) || var42 instanceof .bzl) && !(var42 instanceof .bzi) && var42.ai != 8 && (!var33 || !var42.h.e.i || !var42.i.e.i) && !(var42 instanceof .bzl)) {
                     int var17 = var42.j();
                     var16 = var42.h();
                     var15 = var42.ac;
                     var36 = 1;
                     if (var11 == 1) {
                        var36 = 2;
                     }

                     var7 = var6 | var24.k(var22, var42, var36);
                     var47 = var1.d;
                     if (var47 != null) {
                        ++var47.d;
                     }

                     int var19 = var42.j();
                     int var18 = var42.h();
                     var6 = var3;
                     if (var19 != var17) {
                        var42.F(var19);
                        var6 = var3;
                        if (var13 == 2) {
                           var6 = var3;
                           if (var42.i() > var3) {
                              var6 = Math.max(var3, var42.i() + var42.m(.bzd.d).b());
                           }
                        }

                        var7 = 1;
                     }

                     if (var18 != var16) {
                        var42.A(var18);
                        var3 = var2;
                        if (var14 == 2) {
                           var3 = var2;
                           if (var42.g() > var2) {
                              var3 = Math.max(var2, var42.g() + var42.m(.bzd.e).b());
                           }
                        }

                        var7 = 1;
                        var2 = var3;
                     }

                     if (var42.G && var15 != var42.ac) {
                        var36 = 1;
                        var3 = var6;
                        var6 = var36;
                     } else {
                        var3 = var6;
                        var6 = var7;
                     }
                  }
               }

               var7 = var10;
               if (var6 == 0) {
                  break;
               }

               ++var11;
               var24.l(var1, var11, var9, var8);
               var6 = 0;
            }
         }

         var1.W(var7);
      }

      if (var1.d != null) {
         System.nanoTime();
      }

   }

   public void setConstraintSet(.cap var1) {
      this.mConstraintSet = var1;
   }

   public void setDesignInformation(int var1, Object var2, Object var3) {
      if (var1 == 0 && var2 instanceof String && var3 instanceof Integer) {
         if (this.mDesignIds == null) {
            this.mDesignIds = new HashMap();
         }

         String var4 = (String)var2;
         var1 = var4.indexOf("/");
         String var5 = var4;
         if (var1 != -1) {
            var5 = var4.substring(var1 + 1);
         }

         var1 = (Integer)var3;
         this.mDesignIds.put(var5, var1);
      }

   }

   public void setId(int var1) {
      this.mChildrenByIds.remove(this.getId());
      super.setId(var1);
      this.mChildrenByIds.put(this.getId(), this);
   }

   public void setMaxHeight(int var1) {
      if (var1 != this.mMaxHeight) {
         this.mMaxHeight = var1;
         this.requestLayout();
      }
   }

   public void setMaxWidth(int var1) {
      if (var1 != this.mMaxWidth) {
         this.mMaxWidth = var1;
         this.requestLayout();
      }
   }

   public void setMinHeight(int var1) {
      if (var1 != this.mMinHeight) {
         this.mMinHeight = var1;
         this.requestLayout();
      }
   }

   public void setMinWidth(int var1) {
      if (var1 != this.mMinWidth) {
         this.mMinWidth = var1;
         this.requestLayout();
      }
   }

   public void setOnConstraintsChanged(.car var1) {
      .cai var2 = this.mConstraintLayoutSpec;
      if (var2 != null) {
         var2.e = var1;
      }

   }

   public void setOptimizationLevel(int var1) {
      this.mOptimizationLevel = var1;
      this.mLayoutWidget.W(var1);
   }

   protected void setSelfDimensionBehaviour(.bzg var1, int var2, int var3, int var4, int var5) {
      .cae var10 = this.mMeasurer;
      int var9 = var10.e;
      int var8 = var10.d;
      int var6 = this.getChildCount();
      byte var7 = 2;
      byte var11;
      switch(var2) {
      case Integer.MIN_VALUE:
         if (var6 == 0) {
            var3 = Math.max(0, this.mMinWidth);
            var11 = 2;
            var6 = 0;
         } else {
            var11 = 2;
         }
         break;
      case 0:
         if (var6 == 0) {
            var3 = Math.max(0, this.mMinWidth);
            var11 = 2;
            var6 = 0;
         } else {
            var11 = 2;
            var3 = 0;
         }
         break;
      case 1073741824:
         var3 = Math.min(this.mMaxWidth - var8, var3);
         var11 = 1;
         break;
      default:
         var11 = 1;
         var3 = 0;
      }

      byte var12;
      switch(var4) {
      case Integer.MIN_VALUE:
         if (var6 == 0) {
            var5 = Math.max(0, this.mMinHeight);
            var12 = var7;
         } else {
            var12 = var7;
         }
         break;
      case 0:
         if (var6 == 0) {
            var5 = Math.max(0, this.mMinHeight);
            var12 = var7;
         } else {
            var5 = 0;
            var12 = var7;
         }
         break;
      case 1073741824:
         var5 = Math.min(this.mMaxHeight - var9, var5);
         var12 = 1;
         break;
      default:
         var5 = 0;
         var12 = 1;
      }

      if (var3 != var1.j() || var5 != var1.h()) {
         var1.a.c = true;
      }

      var1.aa = 0;
      var1.ab = 0;
      var6 = this.mMaxWidth;
      int[] var13 = var1.E;
      var13[0] = var6 - var8;
      var13[1] = this.mMaxHeight - var9;
      var1.E(0);
      var1.D(0);
      var1.Q(var11);
      var1.F(var3);
      var1.R(var12);
      var1.A(var5);
      var1.E(this.mMinWidth - var8);
      var1.D(this.mMinHeight - var9);
   }

   public void setState(int var1, int var2, int var3) {
      .cai var8 = this.mConstraintLayoutSpec;
      if (var8 != null) {
         float var5 = (float)var2;
         float var4 = (float)var3;
         var2 = var8.b;
         if (var2 == var1) {
            .cag var6;
            if (var1 == -1) {
               var6 = (.cag)var8.d.valueAt(0);
            } else {
               var6 = (.cag)var8.d.get(var2);
            }

            var1 = var8.c;
            if (var1 == -1 || !((.cah)var6.b.get(var1)).a(var5, var4)) {
               var1 = var6.a(var5, var4);
               if (var8.c != var1) {
                  .cap var7;
                  if (var1 == -1) {
                     var7 = null;
                  } else {
                     var7 = ((.cah)var6.b.get(var1)).f;
                  }

                  if (var1 == -1) {
                     var2 = var6.c;
                  } else {
                     var2 = ((.cah)var6.b.get(var1)).e;
                  }

                  if (var7 != null) {
                     var8.c = var1;
                     if (var8.e != null) {
                        throw null;
                     }

                     var7.c(var8.a);
                     if (var8.e != null) {
                        throw null;
                     }
                  }
               }
            }
         } else {
            var8.b = var1;
            .cag var10 = (.cag)var8.d.get(var1);
            var2 = var10.a(var5, var4);
            .cap var9;
            if (var2 == -1) {
               var9 = var10.d;
            } else {
               var9 = ((.cah)var10.b.get(var2)).f;
            }

            if (var2 == -1) {
               var3 = var10.c;
            } else {
               var3 = ((.cah)var10.b.get(var2)).e;
            }

            if (var9 == null) {
               StringBuilder var11 = new StringBuilder();
               var11.append("NO Constraint set found ! id=");
               var11.append(var1);
               var11.append(", dim =");
               var11.append(var5);
               var11.append(", ");
               var11.append(var4);
               return;
            }

            var8.c = var2;
            if (var8.e != null) {
               throw null;
            }

            var9.c(var8.a);
            if (var8.e != null) {
               throw null;
            }
         }
      }

   }

   public boolean shouldDelayChildPressedState() {
      return false;
   }
}
