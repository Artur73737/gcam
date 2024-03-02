package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ContentFrameLayout extends FrameLayout {
   public TypedValue b;
   public TypedValue c;
   public TypedValue d;
   public TypedValue e;
   public TypedValue f;
   public TypedValue g;
   public final Rect h;
   public AmbientMode$AmbientController i;

   public ContentFrameLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ContentFrameLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ContentFrameLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.h = new Rect();
   }

   protected final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      AmbientMode$AmbientController var1 = this.i;
      if (var1 != null) {
         Object var3 = var1.a;
         .fd var5 = (.fd)var3;
         .jv var2 = var5.n;
         if (var2 != null) {
            var2.a();
         }

         if (var5.q != null) {
            var5.j.getDecorView().removeCallbacks(var5.r);
            if (var5.q.isShowing()) {
               try {
                  ((.fd)var3).q.dismiss();
               } catch (IllegalArgumentException var4) {
               }
            }

            var5.q = null;
         }

         var5.A();
         .gv var6 = var5.M(0).h;
         if (var6 != null) {
            var6.close();
         }
      }

   }

   protected final void onMeasure(int var1, int var2) {
      DisplayMetrics var11 = this.getContext().getResources().getDisplayMetrics();
      int var3 = var11.widthPixels;
      int var4 = var11.heightPixels;
      int var8 = MeasureSpec.getMode(var1);
      boolean var7 = true;
      boolean var14;
      if (var3 < var4) {
         var14 = true;
      } else {
         var14 = false;
      }

      int var6;
      int var9;
      TypedValue var10;
      boolean var13;
      label94: {
         var9 = MeasureSpec.getMode(var2);
         if (var8 == Integer.MIN_VALUE) {
            if (var14) {
               var10 = this.e;
            } else {
               var10 = this.d;
            }

            if (var10 != null && var10.type != 0) {
               if (var10.type == 5) {
                  var3 = (int)var10.getDimension(var11);
               } else if (var10.type == 6) {
                  var3 = (int)var10.getFraction((float)var11.widthPixels, (float)var11.widthPixels);
               } else {
                  var3 = 0;
               }

               if (var3 > 0) {
                  var6 = MeasureSpec.makeMeasureSpec(Math.min(var3 - (this.h.left + this.h.right), MeasureSpec.getSize(var1)), 1073741824);
                  var13 = true;
               } else {
                  var13 = false;
                  var6 = var1;
               }
               break label94;
            }
         }

         var13 = false;
         var6 = var1;
      }

      int var5 = var2;
      if (var9 == Integer.MIN_VALUE) {
         if (var14) {
            var10 = this.f;
         } else {
            var10 = this.g;
         }

         var5 = var2;
         if (var10 != null) {
            var5 = var2;
            if (var10.type != 0) {
               if (var10.type == 5) {
                  var1 = (int)var10.getDimension(var11);
               } else if (var10.type == 6) {
                  var1 = (int)var10.getFraction((float)var11.heightPixels, (float)var11.heightPixels);
               } else {
                  var1 = 0;
               }

               var5 = var2;
               if (var1 > 0) {
                  var5 = MeasureSpec.makeMeasureSpec(Math.min(var1 - (this.h.top + this.h.bottom), MeasureSpec.getSize(var2)), 1073741824);
               }
            }
         }
      }

      boolean var12;
      label86: {
         super.onMeasure(var6, var5);
         var9 = this.getMeasuredWidth();
         var6 = MeasureSpec.makeMeasureSpec(var9, 1073741824);
         if (!var13 && var8 == Integer.MIN_VALUE) {
            if (var14) {
               var10 = this.c;
            } else {
               var10 = this.b;
            }

            if (var10 != null && var10.type != 0) {
               if (var10.type == 5) {
                  var1 = (int)var10.getDimension(var11);
               } else if (var10.type == 6) {
                  var1 = (int)var10.getFraction((float)var11.widthPixels, (float)var11.widthPixels);
               } else {
                  var1 = 0;
               }

               var2 = var1;
               if (var1 > 0) {
                  var2 = var1 - (this.h.left + this.h.right);
               }

               if (var9 < var2) {
                  var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
                  var12 = var7;
               } else {
                  var12 = false;
                  var2 = var6;
               }
               break label86;
            }
         }

         var12 = false;
         var2 = var6;
      }

      if (var12) {
         super.onMeasure(var2, var5);
      }

   }
}
