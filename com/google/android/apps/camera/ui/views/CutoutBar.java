package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CutoutBar extends View {
   public static final .pds a = .pds.h("com.google.android.apps.camera.ui.views.CutoutBar");
   public final .flm b;
   public final int c;
   public float d = 0.0F;
   public float e = 0.0F;
   public float f = 0.0F;

   public CutoutBar(Context var1, AttributeSet var2) {
      super(var1, var2);
      .flx var4 = ((.efu)var1).a();
      int var3 = (Integer)var4.a(.fln.a).get();
      this.c = var3;
      this.b = .fln.a(var4, var3);
   }

   protected final void onDraw(Canvas var1) {
      float var2 = this.d;
      float var4 = this.e;
      float var3 = this.f;
      Paint var5 = new Paint();
      var5.setColor(-16777216);
      var5.setAntiAlias(true);
      var1.drawCircle(var2, var4, var3, var5);
   }
}
