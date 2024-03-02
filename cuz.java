import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path.FillType;

final class cuz {
   public static final Matrix a = new Matrix();
   Paint b;
   Paint c;
   final cux d;
   float e = 0.0F;
   float f = 0.0F;
   float g = 0.0F;
   float h = 0.0F;
   int i = 255;
   String j = null;
   Boolean k = null;
   final xh l;
   private final Path m;
   private final Path n;
   private final Matrix o = new Matrix();
   private PathMeasure p;
   private int q;

   public cuz() {
      this.l = new xh();
      this.d = new cux();
      this.m = new Path();
      this.n = new Path();
   }

   public cuz(cuz var1) {
      xh var4 = new xh();
      this.l = var4;
      this.d = new cux(var1.d, var4);
      this.m = new Path(var1.m);
      this.n = new Path(var1.n);
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      int var2 = var1.q;
      this.q = 0;
      this.i = var1.i;
      this.j = var1.j;
      String var3 = var1.j;
      if (var3 != null) {
         var4.put(var3, this);
      }

      this.k = var1.k;
   }

   public final void a(cux var1, Matrix var2, Canvas var3, int var4, int var5) {
      var1.a.set(var2);
      var1.a.preConcat(var1.j);
      var3.save();

      for(int var13 = 0; var13 < var1.b.size(); ++var13) {
         cub var17 = (cub)var1.b.get(var13);
         if (var17 instanceof cux) {
            this.a((cux)var17, var1.a, var3, var4, var5);
         } else if (var17 instanceof cuy) {
            cuy var18 = (cuy)var17;
            float var6 = (float)var4 / this.g;
            float var8 = (float)var5 / this.h;
            float var7 = Math.min(var6, var8);
            Matrix var14 = var1.a;
            this.o.set(var14);
            this.o.postScale(var6, var8);
            float[] var15 = new float[]{0.0F, 1.0F, 1.0F, 0.0F};
            var14.mapVectors(var15);
            float var11 = (float)Math.hypot((double)var15[0], (double)var15[1]);
            float var12 = (float)Math.hypot((double)var15[2], (double)var15[3]);
            var8 = var15[0];
            var6 = var15[1];
            float var9 = var15[2];
            float var10 = var15[3];
            var11 = Math.max(var11, var12);
            if (var11 > 0.0F) {
               var6 = Math.abs(var8 * var10 - var6 * var9) / var11;
            } else {
               var6 = 0.0F;
            }

            if (var6 != 0.0F) {
               Path var25 = this.m;
               var25.reset();
               cdj[] var22 = var18.m;
               if (var22 != null) {
                  cdj.a(var22, var25);
               }

               var25 = this.m;
               this.n.reset();
               FillType var20;
               if (var18.d()) {
                  Path var24 = this.n;
                  if (var18.o == 0) {
                     var20 = FillType.WINDING;
                  } else {
                     var20 = FillType.EVEN_ODD;
                  }

                  var24.setFillType(var20);
                  this.n.addPath(var25, this.o);
                  var3.clipPath(this.n);
               } else {
                  cuw var23 = (cuw)var18;
                  var9 = var23.e;
                  if (var9 != 0.0F || var23.f != 1.0F) {
                     var11 = var23.g;
                     var10 = var23.f;
                     if (this.p == null) {
                        this.p = new PathMeasure();
                     }

                     this.p.setPath(this.m, false);
                     var8 = this.p.getLength();
                     var9 = (var9 + var11) % 1.0F * var8;
                     var10 = (var10 + var11) % 1.0F * var8;
                     var25.reset();
                     if (var9 > var10) {
                        this.p.getSegment(var9, var8, var25, true);
                        this.p.getSegment(0.0F, var10, var25, true);
                     } else {
                        this.p.getSegment(var9, var10, var25, true);
                     }

                     var25.rLineTo(0.0F, 0.0F);
                  }

                  this.n.addPath(var25, this.o);
                  Object var16;
                  Shader var27;
                  if (var23.l.h()) {
                     ktf var19 = var23.l;
                     Paint var26;
                     if (this.c == null) {
                        var26 = new Paint(1);
                        this.c = var26;
                        var26.setStyle(Style.FILL);
                     }

                     var26 = this.c;
                     if (var19.e()) {
                        var16 = var19.b;
                        var2 = this.o;
                        var27 = (Shader)var16;
                        var27.setLocalMatrix(var2);
                        var26.setShader(var27);
                        var26.setAlpha(Math.round(var23.d * 255.0F));
                     } else {
                        var26.setShader((Shader)null);
                        var26.setAlpha(255);
                        var26.setColor(cvc.a(var19.a, var23.d));
                     }

                     var26.setColorFilter((ColorFilter)null);
                     Path var29 = this.n;
                     if (var23.o == 0) {
                        var20 = FillType.WINDING;
                     } else {
                        var20 = FillType.EVEN_ODD;
                     }

                     var29.setFillType(var20);
                     var3.drawPath(this.n, var26);
                  }

                  if (var23.k.h()) {
                     ktf var28 = var23.k;
                     Paint var21;
                     if (this.b == null) {
                        var21 = new Paint(1);
                        this.b = var21;
                        var21.setStyle(Style.STROKE);
                     }

                     var21 = this.b;
                     Join var30 = var23.i;
                     if (var30 != null) {
                        var21.setStrokeJoin(var30);
                     }

                     Cap var32 = var23.h;
                     if (var32 != null) {
                        var21.setStrokeCap(var32);
                     }

                     var21.setStrokeMiter(var23.j);
                     if (var28.e()) {
                        var16 = var28.b;
                        Matrix var31 = this.o;
                        var27 = (Shader)var16;
                        var27.setLocalMatrix(var31);
                        var21.setShader(var27);
                        var21.setAlpha(Math.round(var23.c * 255.0F));
                     } else {
                        var21.setShader((Shader)null);
                        var21.setAlpha(255);
                        var21.setColor(cvc.a(var28.a, var23.c));
                     }

                     var21.setColorFilter((ColorFilter)null);
                     var21.setStrokeWidth(var23.b * var6 * var7);
                     var3.drawPath(this.n, var21);
                  }
               }
            }
         }
      }

      var3.restore();
   }

   public float getAlpha() {
      return (float)this.getRootAlpha() / 255.0F;
   }

   public int getRootAlpha() {
      return this.i;
   }

   public void setAlpha(float var1) {
      this.setRootAlpha((int)(var1 * 255.0F));
   }

   public void setRootAlpha(int var1) {
      this.i = var1;
   }
}
