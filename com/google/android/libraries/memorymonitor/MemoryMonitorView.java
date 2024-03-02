package com.google.android.libraries.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;

public class MemoryMonitorView extends View {
   public static final float a;
   private static final Runtime h;
   public final long b;
   public final long c;
   public final long d;
   public final float e;
   public final .nav f = new .nav();
   public volatile .nau g = new .nau();
   private final Resources i;
   private int j;
   private int k;
   private final Paint l;
   private final Paint m;
   private final Paint n;
   private float o;
   private final float p;
   private final float q;
   private final GestureDetector r;
   private final .nax s;

   static {
      Runtime var0 = Runtime.getRuntime();
      h = var0;
      a = (float)b((double)var0.maxMemory());
   }

   public MemoryMonitorView(Context var1, AttributeSet var2) {
      super(var1, var2);
      .nax var6 = new .nax(this);
      this.s = var6;
      Resources var4 = var1.getResources();
      this.i = var4;
      this.j = a(var1, 45);
      this.k = a(var1, 140);
      this.l = new Paint();
      Paint var5 = new Paint();
      this.m = var5;
      var5.setStrokeWidth((float)a(var1, 1));
      this.p = (float)a(var1, 2);
      float var3 = (float)a(var1, 7);
      this.q = var3;
      var5 = new Paint();
      this.n = var5;
      var5.setColor(-16777216);
      var5.setTextSize(var3);
      ActivityManager var7 = (ActivityManager)this.getContext().getSystemService("activity");
      this.b = (long)var7.getMemoryClass();
      this.c = (long)var7.getLargeMemoryClass();
      this.d = h.maxMemory();
      this.e = (float)(var4.getDisplayMetrics().heightPixels / 2);
      this.r = new GestureDetector(var1, var6);
   }

   public static int a(Context var0, int var1) {
      float var2 = var0.getResources().getDisplayMetrics().density;
      return Math.round((float)var1 * var2);
   }

   public static long b(double var0) {
      return Math.round(var0 / 1048576.0D);
   }

   private final float c(long var1) {
      long var5 = this.d;
      if (var5 == 0L) {
         return 0.0F;
      } else {
         float var3 = (float)var1;
         float var4 = this.o;
         return var3 / (float)var5 * var4;
      }
   }

   private final float d(long var1, int var3, int var4, Canvas var5, int var6) {
      this.l.setColor(var6);
      float var7 = this.c(var1);
      var6 = this.getWidth();
      float var9 = (float)this.getHeight() - (float)var3 - var7;
      float var8 = (float)this.getWidth();
      float var10 = (float)(var6 * var4) / 3.0F;
      RectF var12 = new RectF(var10, var9, var8 / 3.0F + var10, var9 + var7);
      var8 = this.p;
      var5.drawRoundRect(var12, var8, var8, this.l);
      var8 = (float)(this.getHeight() - var3);
      float var11 = var7 / 2.0F;
      var9 = this.q / 2.0F;
      var1 = b((double)var1);
      StringBuilder var14 = new StringBuilder();
      var14.append(var1);
      var14.append("M");
      String var13 = var14.toString();
      var10 = (float)(var4 * this.getWidth());
      Paint var15 = this.n;
      var5.drawText(var13, var10 / 3.0F, var8 - var7 + var11 + var9, var15);
      return var7;
   }

   private final void e(int var1, Canvas var2, int var3) {
      this.d(0L, 0, var1, var2, var3);
   }

   public final void onConfigurationChanged(Configuration var1) {
      this.j = a(this.getContext(), 45);
      this.k = a(this.getContext(), 140);
   }

   public final void onDraw(Canvas var1) {
      this.l.setColor(-7829368);
      this.o = (float)this.getHeight() * 0.5F;
      RectF var8 = new RectF(0.0F, (float)this.getHeight() - this.o, (float)this.getWidth(), (float)this.getHeight());
      float var2 = this.p;
      var1.drawRoundRect(var8, var2, var2, this.l);
      .nau var10 = this.g;
      long var4 = this.f.c;
      long var6 = var10.c;
      var2 = this.d(-var4, 0, 0, var1, -16711936);
      if (var4 > 0L) {
         this.d(var4, (int)(var2 + 0.0F), 0, var1, -2998243);
      }

      var4 = var10.a;
      this.e(1, var1, -256);
      var4 = var10.b;
      this.e(2, var1, -13068292);
      var2 = (float)this.getHeight();
      var4 = var10.d;
      var2 -= this.c(0L);
      this.m.setColor(-16777216);
      float var3 = (float)this.getWidth();
      Paint var9 = this.m;
      var1.drawLine(0.0F, var2, var3 / 3.0F, var2, var9);
      var2 = (float)this.getHeight();
      var4 = var10.e;
      var2 -= this.c(0L);
      this.m.setColor(-2998243);
      var3 = (float)this.getWidth();
      Paint var11 = this.m;
      var1.drawLine(0.0F, var2, var3 / 3.0F, var2, var11);
   }

   protected final void onMeasure(int var1, int var2) {
      int var4 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var3 = MeasureSpec.getMode(var2);
      var2 = MeasureSpec.getSize(var2);
      if (var4 != 1073741824) {
         if (var4 == Integer.MIN_VALUE) {
            var1 = Math.min(this.j, var1);
         } else {
            var1 = this.j;
         }
      }

      if (var3 != 1073741824) {
         if (var3 == Integer.MIN_VALUE) {
            var2 = Math.min(this.k, var2);
         } else {
            var2 = this.k;
         }
      }

      this.setMeasuredDimension(var1, var2);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (var1.getAction() == 1) {
         .nax var15 = this.s;
         int var4 = .nax.d;
         float var2 = var15.b;
         long var5;
         long var7;
         if (var2 != var15.a) {
            var15.a("Inflating heap utilization to %.2f%% (%.2f MB)", var2 * 100.0F, var15.b * a);
            .nav var16 = var15.c.f;
            var2 = var15.b;
            float var3 = .nav.a();

            for(var7 = var16.c + (long)((var2 - var3) * (float)var16.a); var16.c > var7 && !var16.b.isEmpty(); var16.c -= (long)((byte[])var16.b.pop()).length) {
            }

            while(true) {
               var5 = var16.c;
               if (var5 >= var7) {
                  break;
               }

               var4 = (int)Math.min(var7 - var5, 1048576L);
               var16.b.push(new byte[var4]);
               var16.c += (long)var4;
            }
         } else {
            .nau var17 = var15.c.g;
            var5 = var17.d;
            var5 = b(0.0D);
            var7 = var17.e;
            long var13 = b(0.0D);
            var7 = b((double)var15.c.d);
            MemoryMonitorView var18 = var15.c;
            long var11 = var18.b;
            long var9 = var18.c;
            StringBuilder var19 = new StringBuilder();
            var19.append("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: ");
            var19.append(var5);
            var19.append("MB\nRed line: Max Dalvik heap memory: ");
            var19.append(var13);
            var19.append("MB\nGrey background bounds: large heap size: ");
            var19.append(var7);
            var19.append("MB (should be the same as the red line)\nDefault heap: ");
            var19.append(var11);
            var19.append(" MB; large heap: ");
            var19.append(var9);
            var19.append(" MB");
            var15.a(var19.toString());
         }
      }

      return this.r.onTouchEvent(var1);
   }
}
