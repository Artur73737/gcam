package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@Deprecated
public class PageIndicatorView extends View implements .cvl {
   public int a;
   public int b;
   public boolean c;
   private int d;
   private float e;
   private float f;
   private int g;
   private int h;
   private boolean i;
   private int j;
   private float k;
   private float l;
   private float m;
   private int n;
   private int o;
   private int p;
   private int q;
   private final Paint r;
   private final Paint s;
   private final Paint t;
   private final Paint u;

   public PageIndicatorView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PageIndicatorView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PageIndicatorView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      TypedArray var6 = this.getContext().obtainStyledAttributes(var2, .ny.e, var3, 2132083185);
      this.d = var6.getDimensionPixelOffset(12, 0);
      this.e = var6.getDimension(6, 0.0F);
      this.f = var6.getDimension(7, 0.0F);
      this.g = var6.getColor(0, 0);
      this.h = var6.getColor(1, 0);
      this.a = var6.getInt(3, 0);
      this.b = var6.getInt(4, 0);
      this.j = var6.getInt(2, 0);
      this.i = var6.getBoolean(5, false);
      this.k = var6.getDimension(9, 0.0F);
      this.l = var6.getDimension(10, 0.0F);
      this.m = var6.getDimension(11, 0.0F);
      this.n = var6.getColor(8, 0);
      var6.recycle();
      Paint var8 = new Paint(1);
      this.r = var8;
      var8.setColor(this.g);
      var8.setStyle(Style.FILL);
      Paint var5 = new Paint(1);
      this.t = var5;
      var5.setColor(this.h);
      var5.setStyle(Style.FILL);
      Paint var4 = new Paint(1);
      this.s = var4;
      Paint var7 = new Paint(1);
      this.u = var7;
      this.q = 0;
      if (this.isInEditMode()) {
         this.o = 5;
         this.p = 2;
         this.i = false;
      }

      if (this.i) {
         this.c = false;
         this.animate().alpha(0.0F).setStartDelay(2000L).setDuration((long)this.b).start();
      } else {
         this.animate().cancel();
         this.setAlpha(1.0F);
      }

      d(var8, var4, this.e, this.m, this.g, this.n);
      d(var5, var7, this.f, this.m, this.h, this.n);
   }

   private final void c(long var1) {
      this.c = false;
      this.animate().cancel();
      this.animate().alpha(0.0F).setStartDelay(var1).setDuration((long)this.b).start();
   }

   private static final void d(Paint var0, Paint var1, float var2, float var3, int var4, int var5) {
      var3 += var2;
      var2 /= var3;
      TileMode var6 = TileMode.CLAMP;
      var1.setShader(new RadialGradient(0.0F, 0.0F, var3, new int[]{var5, var5, 0}, new float[]{0.0F, var2, 1.0F}, var6));
      var0.setColor(var4);
      var0.setStyle(Style.FILL);
   }

   public final void a(int var1) {
      if (this.q != var1) {
         this.q = var1;
         if (this.i && var1 == 0) {
            if (this.c) {
               this.c((long)this.a);
               return;
            }

            this.c = true;
            this.animate().cancel();
            this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.j).setListener(new .oj(this)).start();
         }
      }

   }

   public final void b(int var1, float var2) {
      if (this.i && this.q == 1) {
         if (var2 != 0.0F) {
            if (!this.c) {
               this.c = true;
               this.animate().cancel();
               this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.j).start();
               return;
            }
         } else if (this.c) {
            this.c(0L);
         }
      }

   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.o > 1) {
         float var4 = (float)this.getPaddingLeft();
         float var2 = (float)this.d;
         float var3 = (float)this.getHeight();
         var1.save();
         var1.translate(var4 + var2 / 2.0F, var3 / 2.0F);

         for(int var5 = 0; var5 < this.o; ++var5) {
            if (var5 == this.p) {
               var2 = this.f;
               var3 = this.m;
               var1.drawCircle(this.k, this.l, var2 + var3, this.u);
               var1.drawCircle(0.0F, 0.0F, this.f, this.t);
            } else {
               var3 = this.e;
               var2 = this.m;
               var1.drawCircle(this.k, this.l, var3 + var2, this.s);
               var1.drawCircle(0.0F, 0.0F, this.e, this.r);
            }

            var1.translate((float)this.d, 0.0F);
         }

         var1.restore();
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var5;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var5 = MeasureSpec.getSize(var1);
      } else {
         var5 = this.o * this.d + this.getPaddingLeft() + this.getPaddingRight();
      }

      int var6;
      if (MeasureSpec.getMode(var2) == 1073741824) {
         var6 = MeasureSpec.getSize(var2);
      } else {
         float var3 = this.e;
         float var4 = this.m;
         var3 = Math.max(var3 + var4, this.f + var4);
         var6 = (int)Math.ceil((double)(var3 + var3));
         var3 = this.l;
         var4 = (float)var6;
         var6 = this.getPaddingTop();
         var6 = (int)(var4 + var3) + var6 + this.getPaddingBottom();
      }

      this.setMeasuredDimension(resolveSizeAndState(var5, var1, 0), resolveSizeAndState(var6, var2, 0));
   }
}
