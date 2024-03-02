package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public final class WearChipButton extends .ldv {
   private int A;
   private Drawable B;
   private Drawable C;
   private Drawable D;
   private Drawable E;
   private int F;
   private boolean G;
   private boolean H;
   private Transition I;
   private boolean J;
   private final int K;
   public TextView j;
   public CompoundButton k;
   public boolean l;
   private final int m;
   private final .cap n;
   private final OnPreDrawListener o;
   private .lea p;
   private TextView q;
   private FrameLayout r;
   private View s;
   private ImageView t;
   private CharSequence u;
   private int v;
   private ColorStateList w;
   private int x;
   private int y;
   private int z;

   public WearChipButton(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public WearChipButton(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970483);
   }

   public WearChipButton(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      .cap var1732 = new .cap();
      this.n = var1732;
      this.o = new .ldx(this, 0);
      this.p = .lea.a;
      this.F = 0;
      this.G = true;
      this.H = true;
      TypedArray var8 = this.getContext().getTheme().obtainStyledAttributes(var2, .lds.b, var3, 2132084109);

      int var5;
      try {
         var5 = var8.getInt(6, 0);
      } finally {
         var8.recycle();
      }

      byte var1740;
      if (var5 == 1) {
         var1740 = 2;
      } else {
         var1740 = 1;
      }

      this.K = var1740;
      Resources var1747 = this.getResources();
      if (!this.l()) {
         var5 = 2131167426;
      } else {
         var5 = 2131167139;
      }

      int var6 = var1747.getDimensionPixelSize(var5);
      this.m = var6;
      this.z = var6;
      this.A = var6;
      LayoutInflater.from(this.getContext()).inflate(2131624257, this, true);
      this.f = (ImageView)this.findViewById(2131428476);
      this.q = (TextView)this.findViewById(2131428477);
      this.j = (TextView)this.findViewById(2131428478);
      this.r = (FrameLayout)this.findViewById(2131428480);
      this.s = this.findViewById(2131428481);
      if (!this.l()) {
         var1732.e(this);
         var1732.p(2131428273, this.m(2131167426));
         var1732.q(2131427658, this.m(2131167425));
         var1732.p(2131428367, this.m(2131167427));
         var1732.q(2131427477, this.m(2131167424));
         var1732.o(2131428477);
         var1732.o(2131428478);
         var1732.g(2131428477, 3, 2131428367, 3);
         var1732.g(2131428477, 4, 2131428478, 3);
         var1732.g(2131428478, 3, 2131428477, 4);
         var1732.g(2131428478, 4, 2131427477, 4);
         var1732.b(2131428477).d.Y = 2;
         var1732.c(this);
      }

      this.setTransitionName("WearChipButton:Transition");
      this.I = TransitionInflater.from(this.getContext()).inflateTransition(2132213760);
      this.J = true;
      super.d(var2, var3);
      var8 = this.getContext().getTheme().obtainStyledAttributes(var2, .lds.b, var3, 2132084109);

      label15191: {
         Throwable var10000;
         label15198: {
            boolean var10001;
            Resources var1733;
            label15189: {
               label15188: {
                  try {
                     var1733 = this.getContext().getResources();
                     if (!this.l()) {
                        break label15188;
                     }
                  } catch (Throwable var1731) {
                     var10000 = var1731;
                     var10001 = false;
                     break label15198;
                  }

                  var3 = 2131493043;
                  break label15189;
               }

               var3 = 2131493050;
            }

            label15181: {
               label15180: {
                  try {
                     this.x = var1733.getInteger(var3);
                     var1733 = this.getContext().getResources();
                     if (!this.l()) {
                        break label15180;
                     }
                  } catch (Throwable var1730) {
                     var10000 = var1730;
                     var10001 = false;
                     break label15198;
                  }

                  var3 = 2131493044;
                  break label15181;
               }

               var3 = 2131493051;
            }

            try {
               this.y = var1733.getInteger(var3);
               if (var8.hasValue(7)) {
                  this.i(var8.getString(7));
               }
            } catch (Throwable var1729) {
               var10000 = var1729;
               var10001 = false;
               break label15198;
            }

            var1740 = 8;

            try {
               if (var8.hasValue(8)) {
                  var3 = var8.getResourceId(8, 0);
                  this.q.setTextAppearance(var3);
                  this.q.setMaxLines(this.x);
               }
            } catch (Throwable var1728) {
               var10000 = var1728;
               var10001 = false;
               break label15198;
            }

            TextView var9;
            ColorStateList var1734;
            ColorStateList var1735;
            label15199: {
               try {
                  if (!var8.hasValue(9)) {
                     break label15199;
                  }

                  var1734 = var8.getColorStateList(9);
                  var9 = this.q;
               } catch (Throwable var1727) {
                  var10000 = var1727;
                  var10001 = false;
                  break label15198;
               }

               var1735 = var1734;
               if (var1734 == null) {
                  try {
                     var1735 = ColorStateList.valueOf(-1);
                  } catch (Throwable var1726) {
                     var10000 = var1726;
                     var10001 = false;
                     break label15198;
                  }
               }

               try {
                  var9.setTextColor(var1735);
               } catch (Throwable var1725) {
                  var10000 = var1725;
                  var10001 = false;
                  break label15198;
               }
            }

            try {
               var3 = var8.getInt(10, 0);
            } catch (Throwable var1724) {
               var10000 = var1724;
               var10001 = false;
               break label15198;
            }

            byte var1743;
            if (var3 >= 0) {
               try {
                  .mzx.dL();
               } catch (Throwable var1723) {
                  var10000 = var1723;
                  var10001 = false;
                  break label15198;
               }

               if (var3 < 2) {
                  int var7;
                  .cad var1737;
                  try {
                     var7 = .mzx.dL()[var3];
                     var1737 = (.cad)this.q.getLayoutParams();
                  } catch (Throwable var1722) {
                     var10000 = var1722;
                     var10001 = false;
                     break label15198;
                  }

                  float var4;
                  if (var7 == 1) {
                     var4 = 0.0F;
                  } else {
                     var4 = 0.5F;
                  }

                  TextView var1739;
                  try {
                     var1737.G = var4;
                     this.q.setLayoutParams(var1737);
                     var1739 = this.q;
                  } catch (Throwable var1721) {
                     var10000 = var1721;
                     var10001 = false;
                     break label15198;
                  }

                  if (var7 == 1) {
                     var3 = 8388611;
                  } else {
                     var3 = 1;
                  }

                  try {
                     var1739.setGravity(var3);
                     var1739 = this.q;
                  } catch (Throwable var1720) {
                     var10000 = var1720;
                     var10001 = false;
                     break label15198;
                  }

                  if (var7 == 1) {
                     var1743 = 5;
                  } else {
                     var1743 = 4;
                  }

                  try {
                     var1739.setTextAlignment(var1743);
                  } catch (Throwable var1719) {
                     var10000 = var1719;
                     var10001 = false;
                     break label15198;
                  }
               }
            }

            try {
               if (var8.hasValue(11)) {
                  var3 = var8.getInt(11, this.x);
                  this.x = var3;
                  this.y = var3;
                  this.q.setMaxLines(var3);
               }
            } catch (Throwable var1718) {
               var10000 = var1718;
               var10001 = false;
               break label15198;
            }

            try {
               if (var8.hasValue(12)) {
                  this.j(var8.getString(12));
               }
            } catch (Throwable var1717) {
               var10000 = var1717;
               var10001 = false;
               break label15198;
            }

            try {
               if (var8.hasValue(13)) {
                  var3 = var8.getResourceId(13, 0);
                  this.j.setTextAppearance(var3);
               }
            } catch (Throwable var1716) {
               var10000 = var1716;
               var10001 = false;
               break label15198;
            }

            label15201: {
               try {
                  if (!var8.hasValue(14)) {
                     break label15201;
                  }

                  var1734 = var8.getColorStateList(14);
                  var9 = this.j;
               } catch (Throwable var1715) {
                  var10000 = var1715;
                  var10001 = false;
                  break label15198;
               }

               var1735 = var1734;
               if (var1734 == null) {
                  try {
                     var1735 = ColorStateList.valueOf(-1);
                  } catch (Throwable var1714) {
                     var10000 = var1714;
                     var10001 = false;
                     break label15198;
                  }
               }

               try {
                  var9.setTextColor(var1735);
               } catch (Throwable var1713) {
                  var10000 = var1713;
                  var10001 = false;
                  break label15198;
               }
            }

            try {
               if (!var8.getBoolean(15, true)) {
                  this.j.setVisibility(8);
               }
            } catch (Throwable var1712) {
               var10000 = var1712;
               var10001 = false;
               break label15198;
            }

            try {
               var3 = this.m(2131167149);
               if (var8.hasValue(18)) {
                  var3 = var8.getDimensionPixelSize(18, var3);
                  LayoutParams var1741 = this.f.getLayoutParams();
                  var1741.width = var3;
                  var1741.height = var3;
                  this.f.setLayoutParams(var1741);
               }
            } catch (Throwable var1711) {
               var10000 = var1711;
               var10001 = false;
               break label15198;
            }

            try {
               if (var8.hasValue(5)) {
                  this.z = var8.getDimensionPixelSize(5, var6);
               }
            } catch (Throwable var1710) {
               var10000 = var1710;
               var10001 = false;
               break label15198;
            }

            try {
               if (var8.hasValue(4)) {
                  this.A = var8.getDimensionPixelSize(4, var6);
               }
            } catch (Throwable var1709) {
               var10000 = var1709;
               var10001 = false;
               break label15198;
            }

            label15104: {
               label15103: {
                  try {
                     if (!this.l()) {
                        break label15103;
                     }
                  } catch (Throwable var1708) {
                     var10000 = var1708;
                     var10001 = false;
                     break label15198;
                  }

                  var1743 = 1;
                  break label15104;
               }

               var1743 = 2;
            }

            .lea var1736;
            try {
               var3 = var8.getInt(16, var1743);
               this.j.setMaxLines(var3);
               var1736 = .lea.a;
               var3 = var8.getInt(2, 0);
            } catch (Throwable var1707) {
               var10000 = var1707;
               var10001 = false;
               break label15198;
            }

            .lea var1742 = var1736;
            if (var3 >= 0) {
               var1742 = var1736;

               try {
                  if (var3 < .lea.values().length) {
                     var1742 = .lea.values()[var3];
                  }
               } catch (Throwable var1706) {
                  var10000 = var1706;
                  var10001 = false;
                  break label15198;
               }
            }

            label15202: {
               try {
                  if (this.p == var1742) {
                     break label15202;
                  }
               } catch (Throwable var1705) {
                  var10000 = var1705;
                  var10001 = false;
                  break label15198;
               }

               label15083: {
                  try {
                     this.k();
                     this.r.removeAllViews();
                     this.k = null;
                     this.t = null;
                     this.p = var1742;
                     if (var1742.f == 0) {
                        break label15083;
                     }

                     LayoutInflater.from(this.getContext()).inflate(var1742.f, this.r, true);
                     if (var1742 == .lea.e) {
                        ImageView var1738 = (ImageView)this.r.findViewById(2131428475);
                        this.t = var1738;
                        var1738.setImageResource(this.v);
                        this.t.setImageTintList(this.w);
                        break label15083;
                     }
                  } catch (Throwable var1704) {
                     var10000 = var1704;
                     var10001 = false;
                     break label15198;
                  }

                  try {
                     this.k = (CompoundButton)this.r.findViewById(2131428479);
                  } catch (Throwable var1702) {
                     var10000 = var1702;
                     var10001 = false;
                     break label15198;
                  }
               }

               boolean var1748;
               label15074: {
                  label15073: {
                     label15072: {
                        try {
                           if (var1742 != .lea.e) {
                              if (this.k != null) {
                                 break label15073;
                              }
                              break label15072;
                           }
                        } catch (Throwable var1703) {
                           var10000 = var1703;
                           var10001 = false;
                           break label15198;
                        }

                        var1748 = true;
                        break label15074;
                     }

                     var1748 = false;
                     break label15074;
                  }

                  var1748 = true;
               }

               FrameLayout var1744;
               try {
                  var1744 = this.r;
               } catch (Throwable var1701) {
                  var10000 = var1701;
                  var10001 = false;
                  break label15198;
               }

               if (var1748) {
                  var1740 = 0;
               }

               try {
                  var1744.setVisibility(var1740);
               } catch (Throwable var1700) {
                  var10000 = var1700;
                  var10001 = false;
                  break label15198;
               }

               if (var1748) {
                  try {
                     var3 = this.getResources().getDimensionPixelSize(2131167154);
                  } catch (Throwable var1699) {
                     var10000 = var1699;
                     var10001 = false;
                     break label15198;
                  }
               } else {
                  var3 = 0;
               }

               try {
                  s(this.q, var3);
                  s(this.j, var3);
                  this.h();
                  this.o();
                  this.p();
                  this.r.setForeground((Drawable)null);
               } catch (Throwable var1698) {
                  var10000 = var1698;
                  var10001 = false;
                  break label15198;
               }
            }

            ImageView var1745;
            label15050: {
               try {
                  if (!var8.hasValue(0)) {
                     break label15050;
                  }

                  this.v = var8.getResourceId(0, 0);
                  var1745 = this.t;
               } catch (Throwable var1697) {
                  var10000 = var1697;
                  var10001 = false;
                  break label15198;
               }

               if (var1745 != null) {
                  try {
                     this.k();
                     var1745.setImageResource(this.v);
                  } catch (Throwable var1696) {
                     var10000 = var1696;
                     var10001 = false;
                     break label15198;
                  }
               }
            }

            try {
               if (var8.hasValue(17)) {
                  this.u = var8.getString(17);
                  this.p();
               }
            } catch (Throwable var1695) {
               var10000 = var1695;
               var10001 = false;
               break label15198;
            }

            label15038: {
               try {
                  if (!var8.hasValue(1)) {
                     break label15038;
                  }

                  var1734 = var8.getColorStateList(1);
                  this.w = var1734;
                  if (this.p != .lea.e) {
                     break label15038;
                  }

                  var1745 = this.t;
               } catch (Throwable var1694) {
                  var10000 = var1694;
                  var10001 = false;
                  break label15198;
               }

               if (var1745 != null) {
                  try {
                     var1745.setImageTintList(var1734);
                  } catch (Throwable var1693) {
                     var10000 = var1693;
                     var10001 = false;
                     break label15198;
                  }
               }
            }

            label15028:
            try {
               this.H = var8.getBoolean(3, this.H);
               break label15191;
            } catch (Throwable var1692) {
               var10000 = var1692;
               var10001 = false;
               break label15028;
            }
         }

         Throwable var1746 = var10000;
         this.J = false;
         var8.recycle();
         throw var1746;
      }

      this.J = false;
      var8.recycle();
      this.h();
      this.r(this.q);
      this.r(this.j);
      .cgm.g(this, new .ldy(this, this));
      .cgm.g(this.r, new .ldz(this, this));
   }

   private final int m(int var1) {
      return this.getResources().getDimensionPixelSize(var1);
   }

   private static int n(boolean var0) {
      return var0 ? 255 : 0;
   }

   private final void o() {
      Drawable var5 = this.B;
      if (var5 != null && this.D != null && this.C != null && this.E != null) {
         int var1 = this.F;
         boolean var4 = true;
         boolean var6;
         if (var1 == 1) {
            var6 = true;
         } else {
            var6 = false;
         }

         boolean var2;
         if (this.k == null) {
            var2 = true;
         } else {
            var2 = false;
         }

         boolean var3;
         if (var2 && !var6) {
            var3 = true;
         } else {
            var3 = false;
         }

         var5.setAlpha(n(var3));
         var5 = this.C;
         if (var2 && var6) {
            var3 = true;
         } else {
            var3 = false;
         }

         var5.setAlpha(n(var3));
         var5 = this.D;
         if (!var2 && !var6) {
            var3 = true;
         } else {
            var3 = false;
         }

         var5.setAlpha(n(var3));
         var5 = this.E;
         if (!var2 && var6) {
            var3 = var4;
         } else {
            var3 = false;
         }

         var5.setAlpha(n(var3));
      }
   }

   private final void p() {
      CharSequence var2 = this.u;
      CharSequence var1 = var2;
      if (var2 == null) {
         var1 = this.g();
      }

      this.s.setContentDescription(this.g());
      this.r.setContentDescription(var1);
      ImageView var3 = this.t;
      if (var3 != null) {
         var3.setContentDescription(var1);
         this.t.setImportantForAccessibility(2);
      }

      CompoundButton var4 = this.k;
      if (var4 != null) {
         var4.setContentDescription(var1);
         this.k.setImportantForAccessibility(2);
      }

      this.r.setImportantForAccessibility(2);
   }

   private final void q() {
      if (!this.J) {
         this.n.e(this);
         if (this.f.getVisibility() == 0 && this.q.getVisibility() == 8 && this.j.getVisibility() == 8 && this.p == .lea.a) {
            this.n.p(2131428273, this.z);
            this.n.q(2131427658, this.z);
            this.n.g(2131428476, 7, 2131427658, 6);
         } else {
            this.n.p(2131428273, this.A);
            this.n.q(2131427658, this.A);
            this.n.d(2131428476, 7);
         }

         if (this.l()) {
            int var1;
            if (this.j.getVisibility() == 0) {
               var1 = 2131428369;
            } else {
               var1 = 0;
            }

            this.n.g(2131428477, 3, var1, 3);
            this.n.g(2131428477, 4, var1, 4);
         }

         this.n.c(this);
      }
   }

   private final void r(View var1) {
      if (!this.J) {
         MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
         if (var3 != null) {
            int var2;
            if (this.f.getVisibility() == 0) {
               var2 = this.getResources().getDimensionPixelSize(2131167137);
            } else {
               var2 = 0;
            }

            var3.setMarginStart(var2);
            var1.setLayoutParams(var3);
         }
      }
   }

   private static final void s(TextView var0, int var1) {
      LayoutParams var2 = var0.getLayoutParams();
      if (var2 instanceof MarginLayoutParams) {
         ((MarginLayoutParams)var2).setMarginEnd(var1);
      }

   }

   protected final void c(ColorStateList var1) {
      Drawable var3 = this.getBackground();
      Drawable var2 = this.B;
      if (var2 != null && this.D != null && this.C != null && this.E != null) {
         var2.mutate().setTintList(var1);
         this.C.mutate().setTintList(var1);
         this.D.mutate().setTintList(var1);
         this.E.mutate().setTintList(var1);
      } else {
         if (var3 != null) {
            var3.mutate().setTintList(var1);
         }

      }
   }

   public final void f(int var1) {
      if (var1 != 0) {
         this.k();
         this.f.setImageResource(var1);
         this.f.setVisibility(0);
         this.f.setDuplicateParentStateEnabled(true);
         this.h();
      }

   }

   public final CharSequence g() {
      Object var1;
      if (this.q.getVisibility() == 0) {
         var1 = this.q.getText();
      } else {
         var1 = "";
      }

      return (CharSequence)var1;
   }

   public final void h() {
      this.r(this.q);
      this.r(this.j);
      this.q();
   }

   public final void i(CharSequence var1) {
      if (this.q != null) {
         this.k();
         if (TextUtils.isEmpty(var1)) {
            this.q.setVisibility(8);
         } else {
            this.q.setVisibility(0);
            ContentChangeTransition.c(this.q, var1);
            this.q();
         }

         this.p();
      }
   }

   public final void j(CharSequence var1) {
      this.k();
      if (TextUtils.isEmpty(var1)) {
         this.j.setVisibility(8);
         this.q.setMaxLines(this.x);
      } else {
         this.j.setVisibility(0);
         ContentChangeTransition.c(this.j, var1);
         this.q.setMaxLines(this.y);
      }

      this.q();
   }

   public final void k() {
      if (this.H && !this.J && this.l && (this.q.getVisibility() != 8 || this.j.getVisibility() != 8)) {
         TransitionManager.beginDelayedTransition(this, this.I);
      }
   }

   final boolean l() {
      return this.K == 1;
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.getRootView().getViewTreeObserver().addOnPreDrawListener(this.o);
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      TransitionManager.endTransitions(this);
      this.l = false;
      this.getRootView().getViewTreeObserver().removeOnPreDrawListener(this.o);
   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (!this.l()) {
         int var5 = this.getMinHeight();
         int var4 = this.getMeasuredHeight();
         int var3 = 0;
         boolean var6 = true;
         if (var5 != 0 && var4 >= var5 && this.q.getLineCount() + this.j.getLineCount() == 2) {
            var6 = false;
         }

         if (this.G != var6) {
            this.G = var6;
            if (var6) {
               var3 = this.m(2131167427);
               var4 = this.m(2131167424);
            } else {
               var4 = 0;
            }

            this.n.e(this);
            this.n.p(2131428367, var3);
            this.n.q(2131427477, var4);
            this.n.c(this);
            this.measure(var1, var2);
            return;
         }
      }

   }

   public final void onRtlPropertiesChanged(int var1) {
      if (this.F != var1) {
         this.F = var1;
         this.o();
      }

   }

   public final void setBackground(Drawable var1) {
      if (this.getBackground() != var1) {
         this.k();
         super.setBackground(var1);
         if (var1 instanceof LayerDrawable) {
            LayerDrawable var2 = (LayerDrawable)var1;
            this.B = var2.findDrawableByLayerId(2131428482);
            this.C = var2.findDrawableByLayerId(2131428483);
            this.D = var2.findDrawableByLayerId(2131428473);
            this.E = var2.findDrawableByLayerId(2131428474);
         } else {
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
         }

         this.o();
      }

   }

   public final void setChecked(boolean var1) {
      super.setChecked(var1);
      CompoundButton var2 = this.k;
      if (var2 != null) {
         var2.setChecked(var1);
      }

   }

   public final void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if (this.p == .lea.e) {
         this.r.setEnabled(this.isEnabled());
         ImageView var2 = this.t;
         if (var2 != null) {
            var2.setEnabled(this.isEnabled());
         }
      } else {
         this.r.setEnabled(this.isEnabled());
      }

      this.s.setEnabled(var1);
   }
}
