import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;

public class gf {
   static ActionMode a(Callback var0, android.view.ActionMode.Callback var1, int var2) {
      return var0.onWindowStartingActionMode(var1, var2);
   }

   static boolean b(Callback var0, SearchEvent var1) {
      return var0.onSearchRequested(var1);
   }

   public static void c(View var0, pd var1) {
      var0.getClass();
      var0.setTag(2131428422, var1);
   }

   public static bbb d(bbb var0, float var1) {
      var0.getClass();
      return var0.g(new PaddingElement(var1, var1, var1, var1));
   }

   public static bbb e(bbb var0, float var1, float var2) {
      var0.getClass();
      return var0.g(new PaddingElement(var1, var2, var1, var2));
   }

   public static aip f(float var0, float var1, float var2, float var3) {
      return new aip(var0, var1, var2, var3);
   }

   public static bbb g(bbb var0, aip var1) {
      var0.getClass();
      return var0.g(new PaddingValuesElement(var1));
   }

   // $FF: synthetic method
   public static bbb h(bbb var0, float var1, float var2, int var3) {
      if ((var3 & 2) != 0) {
         var2 = 0.0F;
      }

      if (1 == (var3 & 1)) {
         var1 = 0.0F;
      }

      return e(var0, var1, var2);
   }

   // $FF: synthetic method
   public static bbb i(bbb var0, float var1, float var2) {
      var0.getClass();
      return new PaddingElement(var1, 0.0F, var2, 0.0F);
   }

   public static ail j(bas var0) {
      return new aij(var0);
   }

   public static ail k(bat var0) {
      return new aik(var0);
   }

   public static long l(bev var0) {
      return ((bet)var0).b.a();
   }

   public static long m(long var0, long var2) {
      return et.k(bcl.c(var0) - bci.b(var2), bcl.a(var0) - bci.c(var2));
   }

   // $FF: synthetic method
   public static void n(bev var0, long var1, long var3, int var5, int var6) {
      long var8;
      if ((var6 & 2) != 0) {
         var8 = bci.a;
      } else {
         var8 = 0L;
      }

      if ((var6 & 4) != 0) {
         var3 = m(var0.j(), var8);
      }

      float var7;
      if ((var6 & 8) != 0) {
         var7 = 1.0F;
      } else {
         var7 = 0.0F;
      }

      bex var10;
      if ((var6 & 16) != 0) {
         var10 = bex.a;
      } else {
         var10 = null;
      }

      if ((var6 & 64) != 0) {
         var5 = 3;
      }

      var0.q(var1, var8, var3, var7, var10, var5);
   }

   // $FF: synthetic method
   public static int o(double var0) {
      long var2 = Double.doubleToLongBits(var0);
      return (int)(var2 ^ var2 >>> 32);
   }

   public static float p(float[] var0) {
      float var2 = var0[0];
      float var1 = var0[1];
      float var3 = var0[2];
      float var6 = var0[3];
      float var5 = var0[4];
      float var4 = var0[5];
      var1 = (var2 * var6 + var1 * var5 + var3 * var4 - var6 * var5 - var1 * var3 - var2 * var4) * 0.5F;
      return var1 < 0.0F ? -var1 : var1;
   }

   public static boolean q(double var0, bei var2, bei var3) {
      return Math.abs(var2.a(var0) - var3.a(var0)) <= 0.001D;
   }

   // $FF: synthetic method
   public static void r(bev var0, long var1, float var3, long var4, gf var6, int var7, int var8) {
      if ((var8 & 2) != 0) {
         var3 = bcl.b(var0.j()) / 2.0F;
      }

      if ((var8 & 4) != 0) {
         var4 = var0.i();
      }

      float var9;
      if ((var8 & 8) != 0) {
         var9 = 1.0F;
      } else {
         var9 = 0.0F;
      }

      bex var11;
      if ((var8 & 16) != 0) {
         var11 = bex.a;
      } else {
         var11 = null;
      }

      if ((var8 & 64) != 0) {
         var7 = 3;
      }

      var11.getClass();
      bet var10 = ((bmf)var0).a;
      var10.a.c.h(var4, var3, bet.o(var10, var1, var11, var9, var7));
   }

   // $FF: synthetic method
   public static void s(bev var0, bbf var1, bcu var2, float var3, gf var4, int var5) {
      if ((var5 & 8) != 0) {
         var4 = bex.a;
      }

      if ((var5 & 4) != 0) {
         var3 = 1.0F;
      }

      var0.s(var1, var2, var3, (gf)var4);
   }

   // $FF: synthetic method
   public static void t(bev var0, dmx var1, long var2, long var4, long var6, float var8, dmw var9, int var10, int var11) {
      long var14;
      if ((var11 & 2) != 0) {
         var14 = bxw.a;
      } else {
         var14 = var2;
      }

      if ((var11 & 4) != 0) {
         var2 = car.I(var1.h(), var1.g());
      } else {
         var2 = var4;
      }

      if ((var11 & 8) != 0) {
         var4 = bxw.a;
      } else {
         var4 = 0L;
      }

      if ((var11 & 16) != 0) {
         var6 = var2;
      }

      if ((var11 & 32) != 0) {
         var8 = 1.0F;
      }

      bex var16;
      if ((var11 & 64) != 0) {
         var16 = bex.a;
      } else {
         var16 = null;
      }

      if ((var11 & 128) != 0) {
         var9 = null;
      }

      byte var13 = 0;
      byte var12;
      if ((var11 & 256) != 0) {
         var12 = 3;
      } else {
         var12 = 0;
      }

      byte var17;
      if ((var11 & 512) != 0) {
         var17 = var13;
      } else {
         var17 = 1;
      }

      var0.t(var1, var14, var2, var4, var6, var8, var16, var9, var12, var17 ^ 1 | var10);
   }
}
