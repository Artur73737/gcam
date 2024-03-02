import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region.Op;
import com.google.android.apps.camera.bottombar.dagger.QiTx.DeBfHrQZSt;

public final class bcm implements bcw {
   public Canvas a;
   private final Rect b;
   private final Rect c;

   public bcm() {
      this.a = bcn.a;
      this.b = new Rect();
      this.c = new Rect();
   }

   public static final Op p() {
      Op var0;
      if (c.n(1, 0)) {
         var0 = Op.DIFFERENCE;
      } else {
         var0 = Op.INTERSECT;
      }

      return var0;
   }

   public final void a(float[] var1) {
      for(int var14 = 0; var14 < 4; ++var14) {
         for(int var15 = 0; var15 < 4; ++var15) {
            float var2;
            if (var14 == var15) {
               var2 = 1.0F;
            } else {
               var2 = 0.0F;
            }

            if (var1[var14 * 4 + var15] != var2) {
               Matrix var16 = new Matrix();
               float var8 = var1[2];
               if (var8 == 0.0F) {
                  float var10 = var1[6];
                  if (var10 == 0.0F && var1[10] == 1.0F && var1[14] == 0.0F) {
                     float var9 = var1[8];
                     if (var9 == 0.0F && var1[9] == 0.0F && var1[11] == 0.0F) {
                        float var5 = var1[0];
                        float var13 = var1[1];
                        float var6 = var1[3];
                        var2 = var1[4];
                        float var11 = var1[5];
                        float var3 = var1[7];
                        float var4 = var1[12];
                        float var7 = var1[13];
                        float var12 = var1[15];
                        var1[1] = var2;
                        var1[2] = var4;
                        var1[3] = var13;
                        var1[4] = var11;
                        var1[5] = var7;
                        var1[6] = var6;
                        var1[7] = var3;
                        var1[8] = var12;
                        var16.setValues(var1);
                        var1[0] = var5;
                        var1[1] = var13;
                        var1[2] = var8;
                        var1[3] = var6;
                        var1[4] = var2;
                        var1[5] = var11;
                        var1[6] = var10;
                        var1[7] = var3;
                        var1[8] = var9;
                        this.a.concat(var16);
                        return;
                     }
                  }
               }

               throw new IllegalArgumentException(DeBfHrQZSt.jQLz);
            }
         }
      }

   }

   public final void b() {
      bcq.n(this.a, false);
   }

   public final void c() {
      bcq.n(this.a, true);
   }

   public final void d() {
      this.a.restore();
   }

   public final void e() {
      this.a.save();
   }

   public final void f(Canvas var1) {
      var1.getClass();
      this.a = var1;
   }

   public final void g(float var1, float var2) {
      this.a.translate(var1, var2);
   }

   public final void h(long var1, float var3, bco var4) {
      this.a.drawCircle(bci.b(var1), bci.c(var1), var3, (Paint)var4.b);
   }

   public final void i(long var1, long var3, bco var5) {
      this.a.drawLine(bci.b(var1), bci.c(var1), bci.b(var3), bci.c(var3), (Paint)var5.b);
   }

   // $FF: synthetic method
   public final void j(bcj var1, bco var2) {
      bcq.c(this, var1, var2);
   }

   public final void k(float var1, float var2, float var3, float var4, bco var5) {
      this.a.drawRect(var1, var2, var3, var4, (Paint)var5.b);
   }

   public final void l(float var1, float var2, float var3, float var4, float var5, float var6, bco var7) {
      this.a.drawRoundRect(var1, var2, var3, var4, var5, var6, (Paint)var7.b);
   }

   public final void m(float var1, float var2, float var3, float var4) {
      this.a.clipRect(var1, var2, var3, var4, p());
   }

   // $FF: synthetic method
   public final void n(bcj var1) {
      bcq.e(this, var1);
   }

   public final void o() {
      this.a.scale(-1.0F, 1.0F);
   }

   public final void q(bbf var1, bco var2) {
      Canvas var3 = this.a;
      Object var4 = var1.a;
      Paint var5 = (Paint)var2.b;
      var3.drawPath((Path)var4, var5);
   }

   public final void r(bbf var1) {
      Canvas var2 = this.a;
      Object var4 = var1.a;
      Op var3 = p();
      var2.clipPath((Path)var4, var3);
   }

   public final void s(dmx var1, long var2, long var4, long var6, long var8, bco var10) {
      Canvas var11 = this.a;
      Bitmap var14 = eu.k(var1);
      Rect var12 = this.b;
      var12.left = bxw.a(var2);
      var12.top = bxw.b(var2);
      var12.right = bxw.a(var2) + bxx.b(var4);
      var12.bottom = bxw.b(var2) + bxx.a(var4);
      Rect var13 = this.c;
      var13.left = bxw.a(var6);
      var13.top = bxw.b(var6);
      var13.right = bxw.a(var6) + bxx.b(var8);
      var13.bottom = bxw.b(var6) + bxx.a(var8);
      var11.drawBitmap(var14, var12, var13, (Paint)var10.b);
   }
}
