package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.LinearLayout.LayoutParams;
import androidx.wear.ambient.AmbientDelegate;

public class ListMenuItemView extends LinearLayout implements SelectionBoundsAdjuster, .hj {
   public .gx a;
   public ImageView b;
   public boolean c;
   public boolean d;
   public boolean e;
   private ImageView f;
   private RadioButton g;
   private TextView h;
   private CheckBox i;
   private TextView j;
   private ImageView k;
   private LinearLayout l;
   private Drawable m;
   private int n;
   private Context o;
   private Drawable p;
   private LayoutInflater q;

   public ListMenuItemView(Context var1, AttributeSet var2) {
      this(var1, var2, 2130969647);
   }

   public ListMenuItemView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2);
      AmbientDelegate var5 = AmbientDelegate.E(this.getContext(), var2, .fq.r, var3, 0);
      this.m = var5.v(5);
      this.n = var5.t(1, -1);
      this.c = var5.A(7, false);
      this.o = var1;
      this.p = var5.v(8);
      TypedArray var4 = var1.getTheme().obtainStyledAttributes((AttributeSet)null, new int[]{16843049}, 2130969188, 0);
      this.d = var4.hasValue(0);
      var5.z();
      var4.recycle();
   }

   private final LayoutInflater b() {
      if (this.q == null) {
         this.q = LayoutInflater.from(this.getContext());
      }

      return this.q;
   }

   private final void c(View var1) {
      this.d(var1, -1);
   }

   private final void d(View var1, int var2) {
      LinearLayout var3 = this.l;
      if (var3 != null) {
         var3.addView(var1, var2);
      } else {
         this.addView(var1, var2);
      }
   }

   public final .gx a() {
      return this.a;
   }

   public final void adjustListItemSelectionBounds(Rect var1) {
      ImageView var2 = this.b;
      if (var2 != null && var2.getVisibility() == 0) {
         LayoutParams var3 = (LayoutParams)this.b.getLayoutParams();
         var1.top += this.b.getHeight() + var3.topMargin + var3.bottomMargin;
      }

   }

   public final boolean e() {
      return false;
   }

   public final void f(.gx var1) {
      this.a = var1;
      boolean var6 = var1.isVisible();
      byte var5 = 0;
      byte var3;
      if (!var6) {
         var3 = 8;
      } else {
         var3 = 0;
      }

      this.setVisibility(var3);
      CharSequence var7 = var1.f(this);
      if (var7 != null) {
         this.h.setText(var7);
         if (this.h.getVisibility() != 0) {
            this.h.setVisibility(0);
         }
      } else if (this.h.getVisibility() != 8) {
         this.h.setVisibility(8);
      }

      var6 = var1.isCheckable();
      if (var6 || this.g != null || this.i != null) {
         Object var8;
         Object var9;
         RadioButton var11;
         Object var12;
         if (this.a.p()) {
            if (this.g == null) {
               var11 = (RadioButton)this.b().inflate(2131623953, this, false);
               this.g = var11;
               this.c(var11);
            }

            var12 = this.g;
            var9 = this.i;
            var8 = var9;
         } else {
            if (this.i == null) {
               CheckBox var13 = (CheckBox)this.b().inflate(2131623950, this, false);
               this.i = var13;
               this.c(var13);
            }

            var12 = this.i;
            var8 = this.g;
            var9 = var12;
         }

         if (var6) {
            ((CompoundButton)var12).setChecked(this.a.isChecked());
            if (((CompoundButton)var12).getVisibility() != 0) {
               ((CompoundButton)var12).setVisibility(0);
            }

            if (var8 != null && ((CompoundButton)var8).getVisibility() != 8) {
               ((CompoundButton)var8).setVisibility(8);
            }
         } else {
            if (var9 != null) {
               ((CheckBox)var9).setVisibility(8);
            }

            var11 = this.g;
            if (var11 != null) {
               var11.setVisibility(8);
            }
         }
      }

      var6 = var1.t();
      var1.e();
      if (var6 && this.a.t()) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      if (var3 == 0) {
         TextView var14 = this.j;
         .gx var19 = this.a;
         char var2 = var19.e();
         String var15;
         if (var2 == 0) {
            var15 = "";
         } else {
            Resources var17 = var19.j.a.getResources();
            StringBuilder var10 = new StringBuilder();
            if (ViewConfiguration.get(var19.j.a).hasPermanentMenuKey()) {
               var10.append(var17.getString(2132017169));
            }

            int var4;
            if (var19.j.x()) {
               var4 = var19.i;
            } else {
               var4 = var19.g;
            }

            .gx.g(var10, var4, 65536, var17.getString(2132017165));
            .gx.g(var10, var4, 4096, var17.getString(2132017161));
            .gx.g(var10, var4, 2, var17.getString(2132017160));
            .gx.g(var10, var4, 1, var17.getString(2132017166));
            .gx.g(var10, var4, 4, var17.getString(2132017168));
            .gx.g(var10, var4, 8, var17.getString(2132017164));
            switch(var2) {
            case '\b':
               var10.append(var17.getString(2132017162));
               break;
            case '\n':
               var10.append(var17.getString(2132017163));
               break;
            case ' ':
               var10.append(var17.getString(2132017167));
               break;
            default:
               var10.append(var2);
            }

            var15 = var10.toString();
         }

         var14.setText(var15);
      }

      if (this.j.getVisibility() != var3) {
         this.j.setVisibility(var3);
      }

      Drawable var20 = var1.getIcon();
      .gv var16 = this.a.j;
      var6 = this.e;
      if (var6 || this.c) {
         ImageView var18 = this.f;
         if (var18 != null || var20 != null || this.c) {
            if (var18 == null) {
               var18 = (ImageView)this.b().inflate(2131623951, this, false);
               this.f = var18;
               this.d(var18, 0);
            }

            if (var20 == null && !this.c) {
               this.f.setVisibility(8);
            } else {
               var18 = this.f;
               if (!var6) {
                  var20 = null;
               }

               var18.setImageDrawable(var20);
               if (this.f.getVisibility() != 0) {
                  this.f.setVisibility(0);
               }
            }
         }
      }

      this.setEnabled(var1.isEnabled());
      var6 = var1.hasSubMenu();
      ImageView var21 = this.k;
      if (var21 != null) {
         if (!var6) {
            var3 = 8;
         } else {
            var3 = var5;
         }

         var21.setVisibility(var3);
      }

      this.setContentDescription(var1.l);
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      .cfx.m(this, this.m);
      TextView var2 = (TextView)this.findViewById(2131428337);
      this.h = var2;
      int var1 = this.n;
      if (var1 != -1) {
         var2.setTextAppearance(this.o, var1);
      }

      this.j = (TextView)this.findViewById(2131428192);
      ImageView var3 = (ImageView)this.findViewById(2131428284);
      this.k = var3;
      if (var3 != null) {
         var3.setImageDrawable(this.p);
      }

      this.b = (ImageView)this.findViewById(2131427728);
      this.l = (LinearLayout)this.findViewById(2131427575);
   }

   protected final void onMeasure(int var1, int var2) {
      if (this.f != null && this.c) {
         android.view.ViewGroup.LayoutParams var4 = this.getLayoutParams();
         LayoutParams var3 = (LayoutParams)this.f.getLayoutParams();
         if (var4.height > 0 && var3.width <= 0) {
            var3.width = var4.height;
         }
      }

      super.onMeasure(var1, var2);
   }
}
