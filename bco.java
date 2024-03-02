import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import java.util.Arrays;

public final class bco {
   public int a;
   public Object b;
   public Object c;
   public Object d;

   public bco() {
      this(new Paint(7));
   }

   public bco(Paint var1) {
      this.b = var1;
      this.a = 3;
   }

   public bco(byte[] var1) {
      int[] var3 = new int[50];

      for(int var2 = 0; var2 < 50; var3[var2] = var2++) {
      }

      this.b = var3;
      this.d = new Object[50];
      this.c = new axb[50];
   }

   public final float a() {
      Object var1 = this.b;
      var1.getClass();
      return (float)((Paint)var1).getAlpha() / 255.0F;
   }

   public final float b() {
      Object var1 = this.b;
      var1.getClass();
      return ((Paint)var1).getStrokeMiter();
   }

   public final float c() {
      Object var1 = this.b;
      var1.getClass();
      return ((Paint)var1).getStrokeWidth();
   }

   public final int d() {
      Object var1 = this.b;
      var1.getClass();
      return ((Paint)var1).isFilterBitmap();
   }

   public final int e() {
      // $FF: Couldn't be decompiled
   }

   public final int f() {
      // $FF: Couldn't be decompiled
   }

   public final long g() {
      Object var1 = this.b;
      var1.getClass();
      return bcq.i(((Paint)var1).getColor());
   }

   public final void h(float var1) {
      Object var2 = this.b;
      var2.getClass();
      var1 = (float)Math.rint((double)(var1 * 255.0F));
      ((Paint)var2).setAlpha((int)var1);
   }

   public final void i(int var1) {
      if (!c.n(this.a, var1)) {
         this.a = var1;
         Object var2 = this.b;
         var2.getClass();
         bdy.a.a((Paint)var2, var1);
      }

   }

   public final void j(long var1) {
      Object var4 = this.b;
      var4.getClass();
      int var3 = bcq.h(var1);
      ((Paint)var4).setColor(var3);
   }

   public final void k(int var1) {
      Object var2 = this.b;
      var2.getClass();
      ((Paint)var2).setFilterBitmap(c.n(var1, 0) ^ true);
   }

   public final void l(Shader var1) {
      this.c = var1;
      Object var2 = this.b;
      var2.getClass();
      Shader var3 = (Shader)var1;
      ((Paint)var2).setShader(var1);
   }

   public final void m(int var1) {
      Object var3 = this.b;
      var3.getClass();
      Cap var2;
      if (c.n(var1, 2)) {
         var2 = Cap.SQUARE;
      } else if (c.n(var1, 1)) {
         var2 = Cap.ROUND;
      } else {
         c.n(var1, 0);
         var2 = Cap.BUTT;
      }

      ((Paint)var3).setStrokeCap(var2);
   }

   public final void n(int var1) {
      Object var3 = this.b;
      var3.getClass();
      Join var2;
      if (c.n(var1, 0)) {
         var2 = Join.MITER;
      } else if (c.n(var1, 2)) {
         var2 = Join.BEVEL;
      } else if (c.n(var1, 1)) {
         var2 = Join.ROUND;
      } else {
         var2 = Join.MITER;
      }

      ((Paint)var3).setStrokeJoin(var2);
   }

   public final void o(float var1) {
      Object var2 = this.b;
      var2.getClass();
      ((Paint)var2).setStrokeMiter(var1);
   }

   public final void p(float var1) {
      Object var2 = this.b;
      var2.getClass();
      ((Paint)var2).setStrokeWidth(var1);
   }

   public final void q(int var1) {
      Object var3 = this.b;
      var3.getClass();
      Style var2;
      if (c.n(var1, 1)) {
         var2 = Style.STROKE;
      } else {
         var2 = Style.FILL;
      }

      ((Paint)var3).setStyle(var2);
   }

   public final void r() {
      Object var1 = this.b;
      var1.getClass();
      ((Paint)var1).setPathEffect((PathEffect)null);
   }

   public final int s(Object var1) {
      int var4 = System.identityHashCode(var1);
      int var3 = this.a - 1;
      Object var9 = this.d;
      Object var8 = this.b;
      int var2 = 0;

      while(var2 <= var3) {
         int var5 = var2 + var3 >>> 1;
         int var6 = ((int[])var8)[var5];
         Object var7 = ((Object[])var9)[var6];
         var6 = System.identityHashCode(var7);
         if (var6 < var4) {
            var2 = var5 + 1;
         } else {
            if (var6 <= var4) {
               if (var1 == var7) {
                  return var5;
               }

               var8 = this.d;
               var7 = this.b;
               var3 = var5 - 1;

               while(true) {
                  if (var3 >= 0) {
                     var2 = ((int[])var7)[var3];
                     var9 = ((Object[])var8)[var2];
                     var2 = var3;
                     if (var9 == var1) {
                        break;
                     }

                     if (System.identityHashCode(var9) == var4) {
                        --var3;
                        continue;
                     }
                  }

                  var2 = var5 + 1;
                  var5 = this.a;

                  do {
                     if (var2 >= var5) {
                        var2 = -(this.a + 1);
                        return var2;
                     }

                     var3 = ((int[])var7)[var2];
                     var9 = ((Object[])var8)[var3];
                     if (var9 == var1) {
                        return var2;
                     }

                     var6 = System.identityHashCode(var9);
                     var3 = var2 + 1;
                     var2 = var3;
                  } while(var6 == var4);

                  var2 = -var3;
                  break;
               }

               return var2;
            }

            var3 = var5 - 1;
         }
      }

      return -(var2 + 1);
   }

   public final axb t(int var1) {
      Object var2 = this.c;
      var1 = ((int[])this.b)[var1];
      axb var3 = ((axb[])var2)[var1];
      var3.getClass();
      return var3;
   }

   public final void u() {
      Object var5 = this.c;
      Object var4 = this.b;
      Object var3 = this.d;
      axb[] var6 = (axb[])var5;
      int var2 = var6.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         axb var7 = var6[var1];
         if (var7 != null) {
            var7.clear();
         }

         ((int[])var4)[var1] = var1;
         ((Object[])var3)[var1] = null;
      }

      this.a = 0;
   }

   public final void v(Object var1) {
      Object var9 = this.b;
      Object var8 = this.c;
      Object var7 = this.d;
      int var5 = this.a;
      int var3 = 0;

      int var2;
      int var4;
      for(var2 = 0; var3 < var5; var2 = var4) {
         int[] var10 = (int[])var9;
         int var6 = var10[var3];
         axb var11 = ((axb[])var8)[var6];
         var11.getClass();
         var11.remove(var1);
         var4 = var2;
         if (var11.a > 0) {
            if (var2 != var3) {
               var4 = var10[var2];
               var10[var2] = var6;
               var10[var3] = var4;
            }

            var4 = var2 + 1;
         }

         ++var3;
      }

      var4 = this.a;

      for(var3 = var2; var3 < var4; ++var3) {
         var5 = ((int[])var9)[var3];
         ((Object[])var7)[var5] = null;
      }

      this.a = var2;
   }

   public final boolean w(Object var1) {
      var1.getClass();
      return this.s(var1) >= 0;
   }

   public final boolean x(Object var1, Object var2) {
      var1.getClass();
      int var4 = this.s(var1);
      Object var9 = this.b;
      Object var8 = this.c;
      var1 = this.d;
      int var6 = this.a;
      if (var4 >= 0) {
         int[] var11 = (int[])var9;
         int var3 = var11[var4];
         axb var10 = ((axb[])var8)[var3];
         if (var10 == null) {
            return false;
         } else {
            boolean var7 = var10.remove(var2);
            if (var10.a == 0) {
               int var5 = var4 + 1;
               if (var5 < var6) {
                  pwm.bg(var11, var11, var4, var5, var6);
               }

               var4 = var6 - 1;
               var11[var4] = var3;
               ((Object[])var1)[var3] = null;
               this.a = var4;
            }

            return var7;
         }
      } else {
         return false;
      }
   }

   public final void y(Object var1, Object var2) {
      axb var11;
      label41: {
         int var5 = this.a;
         Object var8 = this.b;
         Object var9 = this.d;
         Object var7 = this.c;
         int var3;
         int var4;
         if (var5 > 0) {
            var4 = this.s(var1);
            var3 = var4;
            if (var4 >= 0) {
               var11 = this.t(var4);
               break label41;
            }
         } else {
            var3 = -1;
         }

         int[] var15 = (int[])var8;
         int var6 = var15.length;
         var4 = -(var3 + 1);
         axb var13;
         if (var5 < var6) {
            var3 = var15[var5];
            ((Object[])var9)[var3] = var1;
            axb[] var16 = (axb[])var7;
            var13 = var16[var3];
            var11 = var13;
            if (var13 == null) {
               var11 = new axb();
               var16[var3] = var11;
            }

            if (var4 < var5) {
               pwm.bg(var15, var15, var4 + 1, var4, var5);
            }

            var15[var4] = var3;
            ++this.a;
         } else {
            var6 += var6;
            Object[] var14 = Arrays.copyOf((Object[])var7, var6);
            var14.getClass();
            axb[] var10 = (axb[])var14;
            var13 = new axb();
            var10[var5] = var13;
            Object[] var17 = Arrays.copyOf((Object[])var9, var6);
            var17.getClass();
            var17[var5] = var1;
            var3 = var5 + 1;

            int[] var12;
            for(var12 = new int[var6]; var3 < var6; var12[var3] = var3++) {
            }

            if (var4 < var5) {
               pwm.bg(var15, var12, var4 + 1, var4, var5);
            }

            var12[var4] = var5;
            if (var4 > 0) {
               pwm.bj(var15, var12, var4, 6);
            }

            this.c = var10;
            this.d = var17;
            this.b = var12;
            ++this.a;
            var11 = var13;
         }
      }

      var11.add(var2);
   }

   public final void z(dmw var1) {
      this.d = var1;
      Object var2 = this.b;
      var2.getClass();
      Object var3;
      if (var1 != null) {
         var3 = var1.a;
      } else {
         var3 = null;
      }

      ColorFilter var4 = (ColorFilter)var3;
      ((Paint)var2).setColorFilter(var4);
   }
}
