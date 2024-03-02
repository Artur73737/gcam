package androidx.wear.widget.drawer;

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

public class PageIndicatorView extends View implements .cvl {
   public int a;
   public int b;
   public boolean c;
   private final Paint d;
   private final Paint e;
   private final Paint f;
   private final Paint g;
   private int h;
   private float i;
   private float j;
   private int k;
   private int l;
   private boolean m;
   private int n;
   private float o;
   private float p;
   private float q;
   private int r;
   private int s;
   private int t;
   private int u;

   public PageIndicatorView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PageIndicatorView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PageIndicatorView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      TypedArray var6 = this.getContext().obtainStyledAttributes(var2, .cwg.f, var3, 2132084965);
      this.h = var6.getDimensionPixelOffset(25, 0);
      this.i = var6.getDimension(19, 0.0F);
      this.j = var6.getDimension(20, 0.0F);
      this.k = var6.getColor(13, 0);
      this.l = var6.getColor(14, 0);
      this.a = var6.getInt(16, 0);
      this.b = var6.getInt(17, 0);
      this.n = var6.getInt(15, 0);
      this.m = var6.getBoolean(18, false);
      this.o = var6.getDimension(22, 0.0F);
      this.p = var6.getDimension(23, 0.0F);
      this.q = var6.getDimension(24, 0.0F);
      this.r = var6.getColor(21, 0);
      var6.recycle();
      Paint var7 = new Paint(1);
      this.d = var7;
      var7.setColor(this.k);
      var7.setStyle(Style.FILL);
      Paint var4 = new Paint(1);
      this.f = var4;
      var4.setColor(this.l);
      var4.setStyle(Style.FILL);
      Paint var5 = new Paint(1);
      this.e = var5;
      Paint var8 = new Paint(1);
      this.g = var8;
      this.u = 0;
      if (this.isInEditMode()) {
         this.s = 5;
         this.t = 2;
         this.m = false;
      }

      if (this.m) {
         this.c = false;
         this.animate().alpha(0.0F).setStartDelay(2000L).setDuration((long)this.b).start();
      } else {
         this.animate().cancel();
         this.setAlpha(1.0F);
      }

      d(var7, var5, this.i, this.q, this.k, this.r);
      d(var4, var8, this.j, this.q, this.l, this.r);
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
      if (this.u != var1) {
         this.u = var1;
         if (this.m && var1 == 0) {
            if (this.c) {
               this.c((long)this.a);
               return;
            }

            this.c = true;
            this.animate().cancel();
            this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.n).setListener(new .cxe(this)).start();
         }
      }

   }

   public final void b(int var1, float var2) {
      if (this.m && this.u == 1) {
         if (var2 != 0.0F) {
            if (!this.c) {
               this.c = true;
               this.animate().cancel();
               this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.n).start();
               return;
            }
         } else if (this.c) {
            this.c(0L);
         }
      }

   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.s > 1) {
         float var3 = (float)this.getPaddingLeft();
         float var4 = (float)this.h;
         float var2 = (float)this.getHeight();
         var1.save();
         var1.translate(var3 + var4 / 2.0F, var2 / 2.0F);

         for(int var5 = 0; var5 < this.s; ++var5) {
            if (var5 == this.t) {
               var2 = this.j;
               var3 = this.q;
               var1.drawCircle(this.o, this.p, var2 + var3, this.g);
               var1.drawCircle(0.0F, 0.0F, this.j, this.f);
            } else {
               var2 = this.i;
               var3 = this.q;
               var1.drawCircle(this.o, this.p, var2 + var3, this.e);
               var1.drawCircle(0.0F, 0.0F, this.i, this.d);
            }

            var1.translate((float)this.h, 0.0F);
         }

         var1.restore();
      }

   }

   protected final void onMeasure(int var1, int var2) {
      int var5;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var5 = MeasureSpec.getSize(var1);
      } else {
         var5 = this.s * this.h + this.getPaddingLeft() + this.getPaddingRight();
      }

      int var6;
      if (MeasureSpec.getMode(var2) == 1073741824) {
         var6 = MeasureSpec.getSize(var2);
      } else {
         float var4 = this.i;
         float var3 = this.q;
         var3 = Math.max(var4 + var3, this.j + var3);
         var6 = (int)Math.ceil((double)(var3 + var3));
         var3 = this.p;
         var4 = (float)var6;
         var6 = this.getPaddingTop();
         var6 = (int)(var4 + var3) + var6 + this.getPaddingBottom();
      }

      this.setMeasuredDimension(resolveSizeAndState(var5, var1, 0), resolveSizeAndState(var6, var2, 0));
   }
}
