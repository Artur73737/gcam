package com.google.android.apps.camera.ui.hotshot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.hardware.camera2.params.Face;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class HotshotView extends .fro {
   public static final .pds a;
   private static final int k;
   private static final int l;
   private final .kum A = new .kum(3);
   private List B;
   private .div C;
   private volatile Map D;
   private volatile List E;
   private volatile .kfk F;
   public final RectF c = new RectF();
   public .kfh d;
   public boolean e;
   public float f;
   public .kfp g;
   public .mdq h;
   public volatile List i;
   public boolean j;
   private final Paint m = new Paint();
   private final Paint n = new Paint();
   private final Paint o = new Paint();
   private final Paint p = new Paint();
   private final Paint q = new Paint();
   private final Paint r = new Paint();
   private final Paint s = new Paint();
   private final Paint t = new Paint();
   private final Paint u = new Paint();
   private final Paint v = new Paint();
   private final Paint w = new Paint();
   private final Paint x = new Paint();
   private final .dje y = new .dje();
   private final .dje z = new .dje();

   static {
      a = .pds.h(DeBfHrQZSt.XuUjDbKtd);
      k = Color.argb(255, 232, 200, 107);
      l = Color.argb(128, 220, 54, 46);
   }

   public HotshotView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.d = .kfh.f;
      this.e = true;
      this.f = 1.0F;
      this.g = .kfp.a;
      this.h = new .mcy(new .kfm[0]);
      int var3 = .oyz.d;
      this.i = .pby.a;
      this.D = new HashMap();
      this.E = .pby.a;
      this.F = .kfk.a(.pby.a);
      this.j = false;
      this.b();
   }

   private final PointF c(float var1, float var2) {
      float[] var3 = new float[]{var1, var2};
      this.a().mapPoints(var3);
      return new PointF(var3[0], var3[1]);
   }

   private final RectF d(.kfl var1) {
      .kum var2 = (.kum)this.D.get(var1.a().a());
      RectF var3;
      if (var2 != null) {
         var3 = var2.a();
      } else {
         var3 = var1.a().b();
      }

      return var3;
   }

   private final RectF e(RectF var1, boolean var2) {
      var1 = new RectF(var1);
      this.a().mapRect(var1);
      if (var2) {
         var1.intersect(super.b.b());
      }

      return var1;
   }

   private final void f(Canvas var1) {
      if (!this.E.isEmpty()) {
         .pdh var4 = ((.oyz)this.E).u();

         while(var4.hasNext()) {
            .kew var6 = (.kew)var4.next();
            RectF var3 = this.e(l(var6.b(), 0.8F), true);
            RectF var5 = this.e(var6.b(), true);
            Paint var7;
            if (this.i(var5, var3)) {
               var7 = this.p;
            } else {
               var7 = this.m;
            }

            var1.drawRect(var5, var7);
            String var8;
            if (this.g.equals(.kfp.c)) {
               var8 = var6.e();
               if (!var6.e().equals(var6.c().D)) {
                  var8 = String.format(Locale.ROOT, "%s(%s)", var6.e(), var6.c().D);
               }

               var1.drawText(var8, var5.left, var5.bottom, this.u);
            }

            if (this.g.equals(.kfp.c)) {
               var8 = var6.e();
            } else {
               var8 = var6.c().D;
            }

            var1.drawText(var8, var5.left, var5.bottom, this.u);
            j(this.c(var6.b().centerX(), var6.b().centerY()), this.r, var1);
            if (var6.c().equals(.key.b)) {
               Face var9 = (Face)var6.d().get();
               var3 = this.k(var9.getBounds());
               RectF var10 = this.e(m(var9.getBounds()), true);
               if (this.i(var10, var3)) {
                  var7 = this.p;
               } else {
                  var7 = this.o;
               }

               var1.drawRect(var10, var7);
               float var2 = (float)var9.getBounds().centerX();
               j(this.c(var2, (float)var9.getBounds().centerY()), this.r, var1);
               var2 = (float)var9.getLeftEyePosition().x;
               j(this.c(var2, (float)var9.getLeftEyePosition().y), this.r, var1);
               var2 = (float)var9.getRightEyePosition().x;
               j(this.c(var2, (float)var9.getRightEyePosition().y), this.r, var1);
               var2 = (float)var9.getMouthPosition().x;
               j(this.c(var2, (float)var9.getMouthPosition().y), this.r, var1);
            }
         }

      }
   }

   private final void g(Canvas var1, float var2, float var3, float var4, boolean var5, boolean var6) {
      this.h(var4);
      .dje var8 = this.y;
      byte var7 = 0;
      .dje var9;
      if (var6) {
         var9 = this.z;
         var8 = var9;
         if ((int)var9.b.d == 0) {
            var8 = var9;
            if (!var9.p()) {
               this.z.k();
               var8 = var9;
            }
         }
      } else {
         this.z.i();
         this.z.m(0);
      }

      var9 = this.y;
      if (!var5) {
         if (var6) {
            var7 = 40;
         } else {
            var7 = 20;
         }
      }

      var9.m(var7);
      var1.save();
      var1.translate(var2 - (float)this.y.getBounds().width() / 2.0F, var3 - (float)this.y.getBounds().height() / 2.0F);
      var8.draw(var1);
      var1.restore();
   }

   private final void h(float var1) {
      if (this.C != null) {
         float var2 = var1 / 300.0F / this.getResources().getDisplayMetrics().density;
         Rect var4 = this.C.g;
         .dje var5 = this.y;
         var1 = (float)var4.width();
         float var3 = (float)var4.height();
         var5.setBounds(new Rect(0, 0, (int)(var1 * var2), (int)(var3 * var2)));
         this.y.c = var2;
         this.z.c = var2;
      }
   }

   private final boolean i(RectF var1, RectF var2) {
      if (var2.left != var1.left && var2.top != var1.top && var2.right != var1.right && var2.bottom != var1.bottom) {
         float var5 = var2.width() / var2.height();
         float var4 = var1.width() / var1.height();
         float var3 = Math.abs(var2.left - var1.left);
         float var6 = Math.abs(var2.top - var1.top);
         float var7 = Math.abs(var2.right - var1.right);
         float var8 = Math.abs(var2.bottom - var1.bottom);
         if (!(Math.abs(var3 - var7) > 2.0F) && !(Math.abs(var6 - var8) > 2.0F)) {
            boolean var9 = this.j;
            var3 = 1.0F;
            if (var9 && Math.abs(var5 - 0.75F) <= 0.025F) {
               var3 = 0.75F;
            }

            return Math.abs(var4 - var3) > 0.025F;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private static final void j(PointF var0, Paint var1, Canvas var2) {
      var2.drawLine(var0.x - 20.0F, var0.y, var0.x + 20.0F, var0.y, var1);
      var2.drawLine(var0.x, var0.y - 20.0F, var0.x, var0.y + 20.0F, var1);
   }

   private final RectF k(Rect var1) {
      return this.e(new RectF(var1), true);
   }

   private static final RectF l(RectF var0, float var1) {
      RectF var3 = new RectF(var0);
      if (var1 != 1.0F) {
         float var2 = var0.width() / 2.0F * var1;
         var1 = var0.height() / 2.0F * var1;
         var3.left = var0.centerX() - var2;
         var3.top = var0.centerY() - var1;
         var3.right = var0.centerX() + var2;
         var3.bottom = var0.centerY() + var1;
      }

      return var3;
   }

   private static final RectF m(Rect var0) {
      return l(new RectF(var0), 1.6F);
   }

   public final void b() {
      ArrayList var1;
      if (this.g.equals(.kfp.b)) {
         this.m.setAntiAlias(true);
         this.m.setStyle(Style.STROKE);
         this.m.setStrokeWidth(6.0F);
         this.m.setColor(-1);
         this.o.setAntiAlias(true);
         this.o.setStyle(Style.STROKE);
         this.o.setStrokeWidth(6.0F);
         this.o.setColor(-256);
         this.p.setAntiAlias(true);
         this.p.setStyle(Style.STROKE);
         this.p.setStrokeWidth(10.0F);
         this.p.setColor(-65536);
         this.r.setAntiAlias(true);
         this.r.setStyle(Style.STROKE);
         this.r.setStrokeWidth(5.0F);
         this.r.setColor(-16776961);
         var1 = new ArrayList();
         this.B = var1;
         var1.add(.kfn.a(.kfh.a, new Paint()));
         .kfh var2 = .kfh.b;
         if (var2.m != 2.14748365E9F) {
            this.B.add(.kfn.a(var2, new Paint()));
         }

         var2 = .kfh.c;
         if (var2.m != 2.14748365E9F) {
            this.B.add(.kfn.a(var2, new Paint()));
         }

         var2 = .kfh.d;
         if (var2.m != 2.14748365E9F) {
            this.B.add(.kfn.a(var2, new Paint()));
         }

         Collection$_EL.forEach(this.B, .ilu.j);
         this.u.setAntiAlias(true);
         this.u.setStyle(Style.FILL);
         this.u.setStrokeWidth(1.0F);
         this.u.setColor(this.m.getColor());
         this.u.setTextSize(40.0F);
         this.u.setTextAlign(Align.LEFT);
         this.u.setShadowLayer((float).ktc.b(2.0F), 0.0F, (float).ktc.b(1.0F), -16777216);
      } else if (!this.g.equals(.kfp.c) && !this.g.equals(.kfp.d)) {
         this.m.setAntiAlias(true);
         this.m.setStyle(Style.STROKE);
         this.m.setStrokeWidth(6.0F);
         this.m.setColor(-1);
         this.p.setAntiAlias(true);
         this.p.setStyle(Style.STROKE);
         this.p.setStrokeWidth(6.0F);
         this.p.setColor(-65536);
         this.q.setAntiAlias(true);
         this.q.setStyle(Style.STROKE);
         this.q.setStrokeWidth(6.0F);
         this.q.setColor(k);
         this.q.setAntiAlias(true);
         this.n.setStyle(Style.STROKE);
         this.n.setStrokeWidth(2.0F);
         this.n.setColor(-16777216);
         var1 = new ArrayList();
         this.B = var1;
         var1.add(.kfn.a(.kfh.b, new Paint()));
         Collection$_EL.forEach(this.B, .ilu.k);
         this.s.setAntiAlias(true);
         this.s.setStyle(Style.STROKE);
         this.s.setStrokeWidth(2.0F);
         this.s.setColor(-16777216);
      } else {
         this.t.setAntiAlias(true);
         this.t.setStyle(Style.STROKE);
         this.t.setStrokeWidth(6.0F);
         this.t.setColor(-1);
         this.v.setAntiAlias(true);
         this.v.setStyle(Style.STROKE);
         this.v.setStrokeWidth(6.0F);
         this.v.setColor(-65536);
         this.w.setAntiAlias(true);
         this.w.setStyle(Style.STROKE);
         this.w.setStrokeWidth(6.0F);
         this.w.setColor(k);
         this.w.setAntiAlias(true);
         this.u.setAntiAlias(true);
         this.u.setStyle(Style.FILL);
         this.u.setStrokeWidth(1.0F);
         this.u.setColor(this.m.getColor());
         this.u.setTextSize(40.0F);
         this.u.setTextAlign(Align.LEFT);
         this.u.setShadowLayer((float).ktc.b(2.0F), 0.0F, (float).ktc.b(1.0F), -16777216);
         this.x.setStyle(Style.STROKE);
         this.x.setStrokeWidth(36.0F);
         this.x.setColor(l);
      }
   }

   protected final void onDraw(Canvas var1) {
      .kfp var9 = .kfp.a;
      float var2;
      float var3;
      int var6;
      RectF var18;
      switch(this.g.ordinal()) {
      case 1:
         this.f(var1);
         var2 = this.c.centerX();
         var3 = this.c.centerY();
         Collection$_EL.forEach(this.B, new .kfj(this, var1, var2, var3));
         return;
      case 2:
         this.f(var1);
         return;
      case 3:
         .oyz var11 = this.F.a;
         .oze var14 = .oze.m(this.D);
         this.D.clear();
         .pby var12 = (.pby)var11;
         int var7 = var12.c;

         for(var6 = 0; var6 < var7; ++var6) {
            .kfl var13 = (.kfl)var11.get(var6);
            .kum var10 = (.kum)var14.get(var13.a().a());
            .kum var15 = var10;
            if (var10 == null) {
               var15 = new .kum(3);
            }

            var15.b(var13.a().b());
            this.D.put(var13.a().a(), var15);
         }

         if (!var11.isEmpty()) {
            float var4;
            float var5;
            .kfl var17;
            if (var12.c == 1 || this.F.c == 1) {
               var17 = (.kfl)var11.get(0);
               .kfl var19 = var17;
               if (var12.c > 1) {
                  var19 = var17;
                  if (!var17.a().c().a()) {
                     Optional var21 = Collection$_EL.stream(var11).filter(.jnp.f).findFirst();
                     var19 = var17;
                     if (var21.isPresent()) {
                        var19 = (.kfl)var21.get();
                     }
                  }
               }

               RectF var22;
               if (var19.a().c().a()) {
                  var22 = this.e(this.d(var19), false);
                  var2 = Math.max(var22.width(), var22.height()) / 2.0F;
                  this.g(var1, var22.centerX(), var22.centerY(), var2, var19.b().a(), this.d.equals(.kfh.a));
                  return;
               }

               RectF var23 = this.d(var19);
               .kex var20 = var19.b();
               var23 = this.e(var23, true);
               if (var20.q) {
                  var2 = this.c.left + 3.0F;
               } else {
                  var2 = var23.left;
               }

               if (var20.r) {
                  var3 = this.c.top + 3.0F;
               } else {
                  var3 = var23.top;
               }

               if (var20.s) {
                  var4 = this.c.right - 3.0F;
               } else {
                  var4 = var23.right;
               }

               if (var20.t) {
                  var5 = this.c.bottom - 3.0F;
               } else {
                  var5 = var23.bottom;
               }

               var22 = new RectF(var2, var3, var4, var5);
               Paint var26;
               if (this.d.equals(.kfh.a)) {
                  var26 = this.w;
               } else if (var19.b().a()) {
                  var26 = this.v;
               } else {
                  var26 = this.t;
               }

               var1.drawRoundRect(var22, 20.0F, 20.0F, var26);
               return;
            }

            if (this.F.c >= 2) {
               .kex var16 = this.F.b;
               if (var16.q) {
                  var1.drawLine(this.x.getStrokeWidth() / 2.0F, 0.0F, this.x.getStrokeWidth() / 2.0F, this.c.height(), this.x);
               }

               if (var16.s) {
                  var1.drawLine(this.c.width() - this.x.getStrokeWidth() / 2.0F, 0.0F, this.c.width() - this.x.getStrokeWidth() / 2.0F, this.c.height(), this.x);
               }

               if (var16.r) {
                  if (var16.q) {
                     var2 = this.x.getStrokeWidth();
                  } else {
                     var2 = 0.0F;
                  }

                  var4 = this.x.getStrokeWidth() / 2.0F;
                  if (var16.s) {
                     var3 = this.c.width() - this.x.getStrokeWidth();
                  } else {
                     var3 = this.c.width();
                  }

                  var1.drawLine(var2, var4, var3, this.x.getStrokeWidth() / 2.0F, this.x);
               }

               if (var16.t) {
                  if (var16.q) {
                     var2 = this.x.getStrokeWidth();
                  } else {
                     var2 = 0.0F;
                  }

                  var4 = this.c.height();
                  var5 = this.x.getStrokeWidth() / 2.0F;
                  if (var16.s) {
                     var3 = this.c.width() - this.x.getStrokeWidth();
                  } else {
                     var3 = this.c.width();
                  }

                  var1.drawLine(var2, var4 - var5, var3, this.c.height() - this.x.getStrokeWidth() / 2.0F, this.x);
               }

               var7 = var12.c;

               for(var6 = 0; var6 < var7; ++var6) {
                  var17 = (.kfl)var11.get(var6);
                  if (var17.a().c().a()) {
                     var18 = this.e(this.d(var17), false);
                     var2 = Math.max(var18.width(), var18.height()) / 2.0F;
                     this.g(var1, var18.centerX(), var18.centerY(), var2, var17.b().a(), this.d.equals(.kfh.a));
                  }
               }
            }
         }

         return;
      default:
         if (this.i.isEmpty()) {
            this.h.a(new .kfm[0]);
         } else {
            .kfm[] var25 = new .kfm[this.i.size()];

            for(var6 = 0; var6 < this.i.size(); ++var6) {
               Face var24 = (Face)this.i.get(var6);
               var18 = this.e(m(var24.getBounds()), false);
               if (var6 == 0) {
                  this.A.b(var18);
                  var18 = this.A.a();
                  var6 = 0;
               }

               var2 = Math.max(var18.width(), var18.height()) / 2.0F;
               boolean var8 = this.i(this.e(m(var24.getBounds()), true), this.k(var24.getBounds()));
               var25[var6] = .kfm.a(.mvh.a(var24), var8);
               this.g(var1, var18.centerX(), var18.centerY(), var2, var8, this.d.equals(.kfh.a));
            }

            this.h.a(var25);
         }
      }
   }

   protected final void onFinishInflate() {
      super.onFinishInflate();
      Object var1 = .diy.c(this.getContext(), 2131951645).a;
      var1.getClass();
      .div var2 = (.div)var1;
      this.C = var2;
      this.y.q(var2);
      var1 = .diy.c(this.getContext(), 2131951642).a;
      var1.getClass();
      this.z.q((.div)var1);
      this.h(300.0F);
   }
}
