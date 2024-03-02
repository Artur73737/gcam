package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import j$.util.Objects;

@Deprecated
public class ActionPage extends ViewGroup {
   private final .nz a;
   private .oe b;
   private int c;
   private float d;
   private final Point e;
   private int f;
   private int g;
   private boolean h;
   private int i;
   private boolean j;

   public ActionPage(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionPage(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ActionPage(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 2132084145);
   }

   public ActionPage(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.e = new Point();
      this.b = new .oe(var1);
      .nz var13 = new .nz(var1);
      this.a = var13;
      var13.a(17);
      var13.b(2);
      TypedArray var14 = var1.obtainStyledAttributes(var2, .ny.b, var3, var4);
      float var6 = 1.0F;
      String var18 = null;
      int var10 = 0;
      float var5 = 0.0F;
      var4 = 1;

      int var11;
      for(var3 = 0; var10 < var14.getIndexCount(); var3 = var11) {
         int var12 = var14.getIndex(var10);
         float var7;
         float var8;
         int var9;
         .oe var19;
         String var20;
         if (var12 == 7) {
            var19 = this.b;
            var19.b = var14.getColorStateList(7);
            var19.a.getPaint().setColor(var19.b.getDefaultColor());
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 4) {
            var19 = this.b;
            Drawable var15 = var14.getDrawable(4);
            Drawable var16 = var19.c;
            if (var16 != null) {
               var16.setCallback((Callback)null);
            }

            if (var19.c != var15) {
               var19.c = var15;
               var19.requestLayout();
               var19.invalidate();
            }

            var15 = var19.c;
            if (var15 != null) {
               var15.setCallback(var19);
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            } else {
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            }
         } else if (var12 == 14) {
            var19 = this.b;
            var19.e = var14.getInt(14, 0);
            if (var19.c != null) {
               var19.invalidate();
               var19.requestLayout();
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            } else {
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            }
         } else if (var12 == 13) {
            this.b.b(var14.getColor(13, -1));
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 17) {
            this.b.a(var14.getDimension(17, 0.0F));
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 5) {
            .nz var21 = this.a;
            CharSequence var23 = var14.getText(5);
            if (var23 == null) {
               throw new RuntimeException("Can not set ActionLabel text to null");
            }

            if (!Objects.equals(var21.c, var23)) {
               var21.a = null;
               var21.c = var23;
               var21.requestLayout();
               var21.invalidate();
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            } else {
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            }
         } else if (var12 == 16) {
            var13 = this.a;
            var7 = TypedValue.applyDimension(0, var14.getDimension(16, 10.0F), var13.getContext().getResources().getDisplayMetrics());
            if (var7 != var13.f) {
               var13.a = null;
               var13.f = var7;
               var13.requestLayout();
               var13.invalidate();
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            } else {
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            }
         } else if (var12 == 15) {
            var13 = this.a;
            var7 = TypedValue.applyDimension(0, var14.getDimension(15, 60.0F), var13.getContext().getResources().getDisplayMetrics());
            if (var7 != var13.g) {
               var13.a = null;
               var13.g = var7;
               var13.requestLayout();
               var13.invalidate();
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            } else {
               var7 = var6;
               var8 = var5;
               var20 = var18;
               var9 = var4;
               var11 = var3;
            }
         } else if (var12 == 2) {
            var13 = this.a;
            ColorStateList var22 = var14.getColorStateList(2);
            if (var22 == null) {
               throw null;
            }

            var13.b = var22;
            var13.e();
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 6) {
            this.a.b(var14.getInt(6, 2));
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 10) {
            var20 = var14.getString(10);
            var7 = var6;
            var8 = var5;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 0) {
            var9 = var14.getInt(0, var4);
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var11 = var3;
         } else if (var12 == 1) {
            var11 = var14.getInt(1, var3);
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
         } else if (var12 == 3) {
            this.a.a(var14.getInt(3, 17));
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 8) {
            var8 = var14.getDimension(8, var5);
            var7 = var6;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else if (var12 == 9) {
            var7 = var14.getDimension(9, var6);
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
         } else {
            var7 = var6;
            var8 = var5;
            var20 = var18;
            var9 = var4;
            var11 = var3;
            if (var12 == 12) {
               this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(var1, var14.getResourceId(12, 0)));
               var11 = var3;
               var9 = var4;
               var20 = var18;
               var8 = var5;
               var7 = var6;
            }
         }

         ++var10;
         var6 = var7;
         var5 = var8;
         var18 = var20;
         var4 = var9;
      }

      var14.recycle();
      .nz var17 = this.a;
      if (var17.e != var5 || var17.d != var6) {
         var17.e = var5;
         var17.d = var6;
         if (var17.a != null) {
            var17.a = null;
            var17.requestLayout();
            var17.invalidate();
         }
      }

      this.a.d(var18, var4, var3);
      this.addView(this.a);
      this.addView(this.b);
   }

   public final WindowInsets onApplyWindowInsets(WindowInsets var1) {
      this.j = true;
      if (this.h != var1.isRound()) {
         this.h = var1.isRound();
         this.requestLayout();
      }

      int var2 = var1.getSystemWindowInsetBottom();
      if (this.i != var2) {
         this.i = var2;
         this.requestLayout();
      }

      if (this.h) {
         this.i = (int)Math.max((float)this.i, (float)this.getMeasuredHeight() * 0.09375F);
      }

      return var1;
   }

   protected final void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (!this.j) {
         this.requestApplyInsets();
      }

   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      .oe var14 = this.b;
      float var13 = (float)this.e.x;
      float var7 = this.d;
      float var10 = (float)this.e.y;
      float var9 = this.d;
      float var6 = (float)this.e.x;
      float var8 = this.d;
      float var11 = (float)this.e.y;
      float var12 = this.d;
      var14.layout((int)(var13 - var7), (int)(var10 - var9), (int)(var6 + var8), (int)(var11 + var12));
      var5 = this.f;
      .nz var15 = this.a;
      var3 = this.b.getBottom();
      var2 = (int)((float)(var4 - var2 - var5) / 2.0F);
      var15.layout(var2, var3, this.f + var2, this.b.getBottom() + this.g);
   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      var1 = this.getMeasuredHeight();
      var2 = this.getMeasuredWidth();
      .oe var4 = this.b;
      int var3;
      if (var4.e == 1 && var4.c != null) {
         var4.measure(0, 0);
         var3 = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
         this.c = var3;
         this.d = (float)var3 / 2.0F;
      } else {
         var3 = (int)((float)Math.min(var2, var1) * 0.45F);
         this.c = var3;
         this.d = (float)var3 / 2.0F;
         this.b.measure(MeasureSpec.makeMeasureSpec(var3, 1073741824), MeasureSpec.makeMeasureSpec(this.c, 1073741824));
      }

      if (this.h) {
         this.e.set(var2 / 2, var1 / 2);
         this.f = (int)((float)var2 * 0.625F);
         this.i = (int)((float)var1 * 0.09375F);
      } else {
         this.e.set(var2 / 2, (int)((float)var1 * 0.43F));
         this.f = (int)((float)var2 * 0.892F);
      }

      this.g = (int)((float)var1 - ((float)this.e.y + this.d) - (float)this.i);
      this.a.measure(MeasureSpec.makeMeasureSpec(this.f, 1073741824), MeasureSpec.makeMeasureSpec(this.g, 1073741824));
   }

   public final void setEnabled(boolean var1) {
      super.setEnabled(var1);
      .oe var2 = this.b;
      if (var2 != null) {
         var2.setEnabled(var1);
      }

   }

   public final void setOnClickListener(OnClickListener var1) {
      .oe var2 = this.b;
      if (var2 != null) {
         var2.setOnClickListener(var1);
      }

   }

   public final void setStateListAnimator(StateListAnimator var1) {
      .oe var2 = this.b;
      if (var2 != null) {
         var2.setStateListAnimator(var1);
      }

   }
}
