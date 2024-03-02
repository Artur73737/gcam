package com.google.android.apps.camera.ui.gridlines;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Map;

public class GridLinesUi extends View {
   private static final .keq c = new .keo();
   private static final .keq d = new .ker(new float[]{0.0F, 1.0F}, false, true);
   private static final .keq e = new .ker(new float[]{0.33333334F, 0.6666666F}, false, false);
   private static final .keq f = new .ker(new float[]{0.25F, 0.5F, 0.75F}, true, false);
   private static final .keq g = new .ker(new float[]{0.38196602F, 0.618034F}, false, false);
   public final Map a;
   public final .nwy b;

   public GridLinesUi(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = .oze.q(.ket.a, d, .ket.b, e, .ket.c, f, .ket.d, g);
      Paint var3 = new Paint();
      var3.setStrokeWidth((float)var1.getResources().getDimensionPixelSize(2131165807));
      var3.setColor(a(var1.getResources()));
      Paint var5 = new Paint();
      var5.setStrokeWidth((float)var1.getResources().getDimensionPixelSize(2131165807));
      var5.setColor(a(var1.getResources()));
      .nwy var4 = new .nwy(this, var3, var5);
      this.b = var4;
      var4.e(c);
   }

   private static int a(Resources var0) {
      return var0.getColor(2131100955, (Theme)null);
   }

   public final void onDraw(Canvas var1) {
      .nwy var2 = this.b;
      if (!((.keq)var2.h).g) {
         Object var4 = var2.b;
         RectF var3 = (RectF)var2.e;
         ((.kep)var4).b(var1, var3);
         var4 = var2.d;
         var3 = (RectF)var2.e;
         ((.kep)var4).b(var1, var3);
         var4 = var2.c;
         var3 = (RectF)var2.e;
         ((.kep)var4).b(var1, var3);
         Object var6 = var2.f;
         RectF var7 = (RectF)var2.e;
         ((.kep)var6).b(var1, var7);
         var6 = var2.a;
         var7 = (RectF)var2.e;
         ((.kep)var6).b(var1, var7);
         var6 = var2.g;
         RectF var5 = (RectF)var2.e;
         ((.kep)var6).b(var1, var5);
      }
   }

   protected final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      .nwy var6 = this.b;
      ((RectF)var6.e).set((float)var2, (float)var3, (float)var4, (float)var5);
      var6.f();
      ((View)var6.i).invalidate();
   }
}
