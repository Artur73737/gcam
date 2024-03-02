package androidx.wear.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.StaticLayout.Builder;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class CurvedTextView extends View {
   public boolean a;
   public float b;
   public int c;
   public float d;
   public String e;
   public int f;
   private final Path g;
   private final Path h;
   private final TextPaint i;
   private final Rect j;
   private final Rect k;
   private String l;
   private float m;
   private float n;
   private int o;
   private float p;
   private float q;
   private float r;
   private float s;
   private Typeface t;
   private boolean u;
   private TruncateAt v;
   private boolean w;

   public CurvedTextView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public CurvedTextView(Context var1, AttributeSet var2) {
      this(var1, var2, 16842884);
   }

   public CurvedTextView(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public CurvedTextView(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.g = new Path();
      this.h = new Path();
      TextPaint var9 = new TextPaint();
      this.i = var9;
      this.j = new Rect();
      this.k = new Rect();
      this.a = true;
      this.l = "";
      this.m = 0.0F;
      this.n = 0.0F;
      this.b = 359.9F;
      this.o = -1;
      this.p = 0.0F;
      this.e = "";
      this.s = 24.0F;
      this.t = null;
      this.u = true;
      this.f = -1;
      this.v = null;
      this.w = false;
      var9.setAntiAlias(true);
      .cwu var8 = new .cwu();
      var8.a = ColorStateList.valueOf(-1);
      Theme var7 = var1.getTheme();
      TypedArray var10 = var7.obtainStyledAttributes(var2, .cwg.h, var3, var4);
      int var6 = var10.getResourceId(0, -1);
      var10.recycle();
      TypedArray var16;
      if (var6 != -1) {
         var16 = var7.obtainStyledAttributes(var6, .cwg.g);
      } else {
         var16 = null;
      }

      if (var16 != null) {
         e(var16, var8, true);
         var16.recycle();
      }

      TypedArray var12 = var1.obtainStyledAttributes(var2, .cwg.e, var3, var4);
      e(var12, var8, false);
      if (var12.hasValue(6)) {
         this.e = var12.getString(6);
      }

      label51: {
         TruncateAt var11;
         switch(var12.getInt(5, 0)) {
         case 1:
            var11 = TruncateAt.START;
            break;
         case 2:
            var11 = TruncateAt.MIDDLE;
            break;
         case 3:
            var11 = TruncateAt.END;
            break;
         default:
            this.v = null;
            break label51;
         }

         this.v = var11;
      }

      float var5 = var12.getFloat(15, 359.9F);
      this.r = var5;
      this.r = Math.min(var5, 359.9F);
      var5 = var12.getFloat(16, 0.0F);
      this.q = var5;
      if (var5 > this.r) {
         throw new IllegalArgumentException("MinSweepDegrees cannot be bigger than MaxSweepDegrees");
      } else {
         this.c = var12.getInt(13, -1);
         this.d = var12.getFloat(12, -1.0F) % 360.0F;
         this.u = var12.getBoolean(14, true);
         var12.recycle();
         ColorStateList var13 = var8.a;
         if (var13 != null) {
            this.f = var13.getDefaultColor();
         }

         var5 = var8.b;
         if (var5 != -1.0F) {
            this.s = var5;
         }

         String var14 = var8.c;
         var6 = var8.e;
         var3 = var8.f;
         var4 = var8.g;
         Typeface var15 = this.t;
         if (var15 == null && var14 != null) {
            this.d(Typeface.create(var14, 0), var3, var4);
         } else if (var15 != null) {
            this.d(var15, var3, var4);
         } else {
            switch(var6) {
            case 1:
               this.d(Typeface.SANS_SERIF, var3, var4);
               break;
            case 2:
               this.d(Typeface.SERIF, var3, var4);
               break;
            case 3:
               this.d(Typeface.MONOSPACE, var3, var4);
               break;
            default:
               this.d((Typeface)null, var3, var4);
            }
         }

         var9.setLetterSpacing(var8.h);
         var9.setFontFeatureSettings(var8.i);
         var9.setFontVariationSettings(var8.j);
         var9.setTextSize(this.s);
      }
   }

   private final void d(Typeface var1, int var2, int var3) {
      boolean var6 = true;
      boolean var5 = true;
      if (var3 >= 0) {
         var3 = Math.min(1000, var3);
         if ((var2 & 2) == 0) {
            var5 = false;
         }

         var1 = Typeface.create(var1, var3, var5);
         this.t = var1;
         this.i.setTypeface(var1);
      } else {
         float var4 = 0.0F;
         if (var2 > 0) {
            if (var1 == null) {
               var1 = Typeface.defaultFromStyle(var2);
            } else {
               var1 = Typeface.create(var1, var2);
            }

            if (!var1.equals(this.i.getTypeface())) {
               this.i.setTypeface(var1);
               this.t = var1;
            }

            if (var1 != null) {
               var3 = var1.getStyle();
            } else {
               var3 = 0;
            }

            var2 &= ~var3;
            TextPaint var7 = this.i;
            if (1 != (var2 & 1)) {
               var5 = false;
            } else {
               var5 = var6;
            }

            var7.setFakeBoldText(var5);
            var7 = this.i;
            if ((var2 & 2) != 0) {
               var4 = -0.25F;
            }

            var7.setTextSkewX(var4);
         } else {
            this.i.setFakeBoldText(false);
            this.i.setTextSkewX(0.0F);
            if (var1 != null && !var1.equals(this.i.getTypeface()) || var1 == null && this.i.getTypeface() != null) {
               this.i.setTypeface(var1);
               this.t = var1;
            }
         }

         this.b();
      }
   }

   private static final void e(TypedArray var0, .cwu var1, boolean var2) {
      byte var4 = 3;
      byte var3;
      int[] var7;
      if (var2 != 0) {
         var7 = .cwg.a;
         var3 = 3;
      } else {
         var7 = .cwg.a;
         var3 = 4;
      }

      if (var0.hasValue(var3)) {
         var1.a = var0.getColorStateList(var3);
      }

      int var6 = var2 ^ 1;
      var1.b = (float)var0.getDimensionPixelSize(var6, (int)var1.b);
      byte var5 = 2;
      if (1 != var2) {
         var3 = var4;
      } else {
         var3 = 2;
      }

      var1.f = var0.getInt(var3, var1.f);
      if (1 != var2) {
         var3 = var5;
      } else {
         var3 = 1;
      }

      int var8 = var0.getInt(var3, var1.e);
      var1.e = var8;
      if (var8 != -1 && !var1.d) {
         var1.c = null;
      }

      var4 = 10;
      if (1 != var2) {
         var3 = 7;
      } else {
         var3 = 10;
      }

      if (var0.hasValue(var3)) {
         var1.c = var0.getString(var3);
         var1.d = (boolean)var6;
      }

      var5 = 11;
      if (1 != var2) {
         var3 = 11;
      } else {
         var3 = 14;
      }

      var1.g = var0.getInt(var3, var1.g);
      if (1 != var2) {
         var3 = 8;
      } else {
         var3 = var5;
      }

      var1.h = var0.getFloat(var3, var1.h);
      if (1 != var2) {
         var3 = 9;
      } else {
         var3 = 12;
      }

      if (var0.hasValue(var3)) {
         var1.i = var0.getString(var3);
      }

      if (1 != var2) {
         var3 = var4;
      } else {
         var3 = 13;
      }

      if (var0.hasValue(var3)) {
         var1.j = var0.getString(var3);
      }

   }

   public final int a() {
      return Math.round(this.i.getFontMetrics().descent - this.i.getFontMetrics().ascent);
   }

   public final void b() {
      this.a = true;
      this.requestLayout();
      this.postInvalidate();
   }

   public final boolean c(float var1, float var2) {
      float var3 = (float)Math.min(this.getWidth(), this.getHeight());
      int var6;
      if (this.u) {
         var6 = this.getPaddingTop();
      } else {
         var6 = this.getPaddingBottom();
      }

      var3 /= 2.0F;
      float var4 = this.i.getFontMetrics().descent;
      var3 -= (float)var6;
      var4 = var3 - var4 + this.i.getFontMetrics().ascent;
      var1 -= (float)(this.getWidth() / 2);
      var2 -= (float)(this.getHeight() / 2);
      float var5 = var1 * var1 + var2 * var2;
      if (!(var5 < var4 * var4) && !(var5 > var3 * var3)) {
         return (float)Math.toDegrees(Math.atan2((double)Math.abs(var1), (double)(-var2))) < this.b / 2.0F;
      } else {
         return false;
      }
   }

   public final void draw(Canvas var1) {
      var1.save();
      Drawable var35 = this.getBackground();
      float var22;
      float var23;
      float var24;
      if (this.a || this.getTextAlignment() != this.o) {
         this.a = false;
         this.o = this.getTextAlignment();
         var22 = this.n;
         var23 = this.r;
         double var2;
         double var4;
         int var30;
         if (var22 <= var23) {
            this.l = this.e;
         } else {
            var2 = (double)(var23 / 180.0F);
            Double.isNaN(var2);
            var4 = (double)this.m;
            int var32 = this.getPaddingLeft();
            Double.isNaN(var4);
            var30 = (int)(var2 * 3.141592653589793D * var4);
            int var31 = this.getPaddingRight();
            String var34 = this.e;
            Builder var36 = Builder.obtain(var34, 0, var34.length(), this.i, var30 - var32 - var31);
            var36.setEllipsize(this.v);
            var36.setMaxLines(1);
            StaticLayout var37 = var36.build();
            if (this.v == null) {
               var34 = this.e.substring(0, var37.getLineEnd(0));
            } else {
               var32 = var37.getEllipsisCount(0);
               if (var32 == 0) {
                  var34 = this.e;
               } else {
                  var31 = var37.getEllipsisStart(0);
                  char[] var38 = this.e.toCharArray();
                  var38[var31] = 8230;

                  for(var30 = var31 + 1; var30 < var31 + var32; ++var30) {
                     if (var30 >= 0 && var30 < this.e.length()) {
                        var38[var30] = '\ufeff';
                     }
                  }

                  var34 = new String(var38);
               }
            }

            this.l = var34;
            this.n = this.r;
         }

         boolean var33 = this.u;
         var22 = 1.0F;
         if (!var33) {
            var24 = -1.0F;
         } else {
            var24 = 1.0F;
         }

         var30 = this.getTextAlignment();
         float var25 = 0.0F;
         switch(var30) {
         case 2:
         case 5:
            var22 = 0.0F;
         case 3:
         case 6:
            break;
         case 4:
         default:
            var22 = 0.5F;
         }

         switch(this.c) {
         case 0:
            var23 = 0.5F;
            break;
         case 1:
         default:
            var23 = 0.0F;
            break;
         case 2:
            var23 = -0.5F;
         }

         float var26 = this.d;
         if (var26 != -1.0F) {
            var25 = var26;
         }

         var26 = this.b;
         this.p = var25 + var23 * var24 * var26;
         var23 = -var24;
         var25 = this.n;
         var2 = (double)((float)this.getPaddingLeft() / this.m);
         Double.isNaN(var2);
         var2 /= 3.141592653589793D;
         var4 = (double)(var22 * (var26 - var25));
         Double.isNaN(var4);
         float var27 = (float)(var4 + var2 * 180.0D);
         var25 = 0.5F * var23 * var26 - 90.0F;
         var22 = (float)this.getWidth();
         var26 = (float)this.getHeight();
         this.g.reset();
         Path var39 = this.g;
         var26 /= 2.0F;
         var22 /= 2.0F;
         float var28 = this.m;
         var39.addArc(var22 - var28, var26 - var28, var22 + var28, var26 + var28, var25 + var27 * var24, var24 * this.n);
         if (var35 != null) {
            this.h.reset();
            var27 = this.m - this.i.getFontMetrics().descent * var24;
            float var29 = this.m - this.i.getFontMetrics().ascent * var24;
            this.h.arcTo(var22 - var29, var26 - var29, var22 + var29, var26 + var29, var25, var24 * this.b, false);
            var39 = this.h;
            var28 = this.b;
            var39.arcTo(var22 - var27, var26 - var27, var22 + var27, var26 + var27, var25 + var24 * var28, var23 * var28, false);
            this.h.close();
            var2 = (double)var22;
            var4 = (double)var25;
            Double.isNaN(var4);
            double var16 = var4 * 3.141592653589793D / 180.0D;
            double var12 = (double)var29;
            var4 = Math.cos(var16);
            Double.isNaN(var12);
            double var14 = (double)var27;
            double var6 = Math.cos(var16);
            Double.isNaN(var14);
            double var8 = (double)var26;
            double var10 = Math.sin(var16);
            Double.isNaN(var12);
            var16 = Math.sin(var16);
            Double.isNaN(var14);
            double var18 = (double)(var25 + var24 * this.b);
            Double.isNaN(var18);
            double var20 = var18 * 3.141592653589793D / 180.0D;
            var18 = Math.cos(var20);
            Double.isNaN(var12);
            var20 = Math.cos(var20);
            Double.isNaN(var14);
            var23 = Math.max(var27, var29);
            this.k.top = (int)(var26 - var23);
            Rect var40 = this.k;
            Double.isNaN(var8);
            Double.isNaN(var8);
            var40.bottom = (int)Math.max((float)(var8 + var10 * var12), (float)(var8 + var16 * var14));
            var40 = this.k;
            var25 = this.b;
            Double.isNaN(var2);
            var24 = (float)(var2 + var12 * var18);
            Double.isNaN(var2);
            var27 = (float)(var2 + var4 * var12);
            Double.isNaN(var2);
            var26 = (float)(var2 + var6 * var14);
            Double.isNaN(var2);
            var28 = (float)(var2 + var14 * var20);
            if (var25 >= 180.0F) {
               var30 = (int)(var22 - var23);
            } else {
               var30 = (int)Math.min(var27, Math.min(var26, Math.min(var24, var28)));
            }

            var40.left = var30;
            var40 = this.k;
            if (this.b >= 180.0F) {
               var30 = (int)(var22 + var23);
            } else {
               var30 = (int)Math.max(var27, Math.max(var26, Math.max(var24, var28)));
            }

            var40.right = var30;
         }
      }

      var22 = this.p;
      var23 = (float)this.getWidth();
      var24 = (float)this.getHeight();
      var1.rotate(var22, var23 / 2.0F, var24 / 2.0F);
      if (var35 != null) {
         var1.clipPath(this.h);
         this.getBackground().setBounds(this.k);
      }

      super.draw(var1);
      var1.restore();
   }

   protected final void onDraw(Canvas var1) {
      this.i.setColor(this.f);
      this.i.setStyle(Style.FILL);
      var1.drawTextOnPath(this.l, this.g, 0.0F, 0.0F, this.i);
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setText(this.e);
   }

   protected final void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      TextPaint var6 = this.i;
      String var5 = this.e;
      var6.getTextBounds(var5, 0, var5.length(), this.j);
      float var4 = (float)Math.min(this.getMeasuredWidth(), this.getMeasuredHeight());
      float var3;
      if (this.u) {
         var3 = this.i.getFontMetrics().ascent - (float)this.getPaddingTop();
      } else {
         var3 = -this.i.getFontMetrics().descent - (float)this.getPaddingBottom();
      }

      this.m = var4 / 2.0F + var3;
      var3 = Math.min(((float)this.j.width() + (float)this.getPaddingLeft() + (float)this.getPaddingRight()) / this.m / 3.1415927F * 180.0F, 359.9F);
      this.n = var3;
      this.b = Math.max(Math.min(this.r, var3), this.q);
   }

   public final void onPopulateAccessibilityEvent(AccessibilityEvent var1) {
      super.onPopulateAccessibilityEvent(var1);
      var1.getText().add(this.e);
   }

   protected final void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      this.b();
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (!this.w && var1.getAction() != 0) {
         return false;
      } else {
         float var20 = var1.getX();
         float var21 = (float)(this.getWidth() / 2);
         float var19 = var1.getY();
         float var18 = (float)(this.getHeight() / 2);
         double var12 = -Math.toRadians((double)this.p);
         double var4 = (double)(var20 - var21);
         double var6 = Math.cos(var12);
         Double.isNaN(var4);
         double var8 = (double)(var19 - var18);
         double var2 = Math.sin(var12);
         Double.isNaN(var8);
         int var22 = this.getWidth() / 2;
         double var10 = Math.sin(var12);
         Double.isNaN(var4);
         var12 = Math.cos(var12);
         Double.isNaN(var8);
         int var23 = this.getHeight() / 2;
         boolean var24 = this.w;
         double var16 = (double)var23;
         Double.isNaN(var16);
         double var14 = (double)var22;
         Double.isNaN(var14);
         var18 = (float)(var6 * var4 - var2 * var8 + var14);
         var19 = (float)(var4 * var10 + var8 * var12 + var16);
         if (!var24 && this.c(var18, var19)) {
            this.w = true;
         }

         if (!this.w) {
            return false;
         } else {
            if (var1.getAction() == 1 || var1.getAction() == 3) {
               this.w = false;
            }

            var1.offsetLocation(var18 - var1.getX(), var19 - var1.getY());
            return super.onTouchEvent(var1);
         }
      }
   }
}
