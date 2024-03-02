package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ActionMenuItemView extends .jq implements OnClickListener, .hj, .ic {
   public .gx a;
   public .gu b;
   public AmbientMode$AmbientController c;
   private CharSequence d;
   private Drawable e;
   private .kn f;
   private boolean g;
   private int h;
   private int i;
   private int j;

   public ActionMenuItemView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionMenuItemView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ActionMenuItemView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      Resources var4 = var1.getResources();
      this.g = this.i();
      TypedArray var5 = var1.obtainStyledAttributes(var2, .fq.c, var3, 0);
      this.h = var5.getDimensionPixelSize(0, 0);
      var5.recycle();
      this.j = (int)(var4.getDisplayMetrics().density * 32.0F + 0.5F);
      this.setOnClickListener(this);
      this.i = -1;
      this.setSaveEnabled(false);
   }

   private final void h() {
      boolean var2 = TextUtils.isEmpty(this.d);
      boolean var1 = true;
      if (this.e != null) {
         if ((this.a.n & 4) == 4) {
            if (!this.g) {
               var1 = false;
            }
         } else {
            var1 = false;
         }
      }

      var1 &= var2 ^ true;
      Object var4 = null;
      CharSequence var3;
      if (var1) {
         var3 = this.d;
      } else {
         var3 = null;
      }

      this.setText(var3);
      var3 = this.a.l;
      if (TextUtils.isEmpty(var3)) {
         if (var1) {
            var3 = null;
         } else {
            var3 = this.a.d;
         }

         this.setContentDescription(var3);
      } else {
         this.setContentDescription(var3);
      }

      var3 = this.a.m;
      if (TextUtils.isEmpty(var3)) {
         if (var1) {
            var3 = (CharSequence)var4;
         } else {
            var3 = this.a.d;
         }

         .ns.a(this, var3);
      } else {
         .ns.a(this, var3);
      }
   }

   private final boolean i() {
      Configuration var3 = this.getContext().getResources().getConfiguration();
      int var1 = var3.screenWidthDp;
      int var2 = var3.screenHeightDp;
      return var1 >= 480 || var3.orientation == 2;
   }

   public final .gx a() {
      return this.a;
   }

   public final boolean b() {
      return !TextUtils.isEmpty(this.getText());
   }

   public final boolean c() {
      return this.b();
   }

   public final boolean d() {
      return this.b() && this.a.getIcon() == null;
   }

   public final boolean e() {
      return true;
   }

   public final void f(.gx var1) {
      this.a = var1;
      Drawable var8 = var1.getIcon();
      this.e = var8;
      byte var7 = 0;
      if (var8 != null) {
         int var4 = var8.getIntrinsicWidth();
         int var5 = var8.getIntrinsicHeight();
         int var6 = this.j;
         float var2;
         float var3;
         if (var4 > var6) {
            var2 = (float)var5;
            var3 = (float)var4;
            var5 = (int)(var2 * ((float)var6 / var3));
            var4 = var6;
         }

         if (var5 > var6) {
            var3 = (float)var4;
            var2 = (float)var5;
            var4 = (int)(var3 * ((float)var6 / var2));
         } else {
            var6 = var5;
         }

         var8.setBounds(0, 0, var4, var6);
      }

      this.setCompoundDrawables(var8, (Drawable)null, (Drawable)null, (Drawable)null);
      this.h();
      this.d = var1.f(this);
      this.h();
      this.setId(var1.a);
      byte var9;
      if (!var1.isVisible()) {
         var9 = 8;
      } else {
         var9 = var7;
      }

      this.setVisibility(var9);
      this.setEnabled(var1.isEnabled());
      if (var1.hasSubMenu() && this.f == null) {
         this.f = new .gk(this);
      }

   }

   public final CharSequence getAccessibilityClassName() {
      return Button.class.getName();
   }

   public final void onClick(View var1) {
      .gu var2 = this.b;
      if (var2 != null) {
         var2.b(this.a);
      }

   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.g = this.i();
      this.h();
   }

   protected final void onMeasure(int var1, int var2) {
      boolean var5 = this.b();
      int var3;
      if (var5) {
         var3 = this.i;
         if (var3 >= 0) {
            super.setPadding(var3, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
         }
      }

      super.onMeasure(var1, var2);
      var3 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var4 = this.getMeasuredWidth();
      if (var3 == Integer.MIN_VALUE) {
         var1 = Math.min(var1, this.h);
      } else {
         var1 = this.h;
      }

      if (var3 != 1073741824 && this.h > 0 && var4 < var1) {
         super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), var2);
      }

      if (!var5 && this.e != null) {
         super.setPadding((this.getMeasuredWidth() - this.e.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
      }

   }

   public final void onRestoreInstanceState(Parcelable var1) {
      super.onRestoreInstanceState((Parcelable)null);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (this.a.hasSubMenu()) {
         .kn var2 = this.f;
         if (var2 != null && var2.onTouch(this, var1)) {
            return true;
         }
      }

      return super.onTouchEvent(var1);
   }

   public final void setPadding(int var1, int var2, int var3, int var4) {
      this.i = var1;
      super.setPadding(var1, var2, var3, var4);
   }
}
