import android.content.res.Configuration;
import android.graphics.BlendMode;
import android.os.LocaleList;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.Locale;

public class et {
   static ceg a(Configuration var0) {
      String var4 = var0.getLocales().toLanguageTags();
      ceg var3 = ceg.a;
      ceg var5;
      if (var4 != null && !var4.isEmpty()) {
         String[] var7 = var4.split(",", -1);
         int var2 = var7.length;
         Locale[] var6 = new Locale[var2];

         for(int var1 = 0; var1 < var2; ++var1) {
            var6[var1] = cee.a(var7[var1]);
         }

         var5 = ceg.a(var6);
      } else {
         var5 = ceg.a;
      }

      return var5;
   }

   static void b(Configuration var0, Configuration var1, Configuration var2) {
      LocaleList var3 = var0.getLocales();
      LocaleList var4 = var1.getLocales();
      if (!var3.equals(var4)) {
         var2.setLocales(var4);
         var2.locale = var1.locale;
      }

   }

   public static void c(ceg var0) {
      LocaleList.setDefault(LocaleList.forLanguageTags(var0.c()));
   }

   static void d(Configuration var0, ceg var1) {
      var0.setLocales(LocaleList.forLanguageTags(var1.c()));
   }

   public static Object g(afw var0, float var1, zb var2, que var3) {
      afg var9;
      label22: {
         if (var3 instanceof afg) {
            afg var5 = (afg)var3;
            int var4 = var5.b;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.b = var4 + Integer.MIN_VALUE;
               var9 = var5;
               break label22;
            }
         }

         var9 = new afg(var3);
      }

      Object var10 = var9.a;
      qul var6 = qul.a;
      qww var7;
      switch(var9.b) {
      case 0:
         pwm.bs(var10);
         qww var11 = new qww();
         afi var8 = new afi(var1, var2, var11, (que)null);
         var9.c = var11;
         var9.b = 1;
         if (eu.g(var0, var8, var9) == var6) {
            return var6;
         }

         var7 = var11;
         break;
      case 1:
         var7 = var9.c;
         pwm.bs(var10);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      return quy.d(var7.a);
   }

   public static Object h(bij var0, que var1) {
      int var2;
      aer var8;
      label86: {
         if (var1 instanceof aer) {
            aer var4 = (aer)var1;
            var2 = var4.b;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var4.b = var2 + Integer.MIN_VALUE;
               var8 = var4;
               break label86;
            }
         }

         var8 = new aer(var1);
      }

      Object var6 = var8.a;
      qul var7 = qul.a;
      int var3;
      bij var5;
      List var10;
      switch(var8.b) {
      case 0:
         pwm.bs(var6);
         var0.getClass();
         List var9 = var0.k().a;
         var3 = var9.size();
         var2 = 0;
         if (var2 >= var3) {
            return qsn.a;
         }

         while(!((bhw)var9.get(var2)).d) {
            ++var2;
            if (var2 >= var3) {
               return qsn.a;
            }
         }

         var8.c = var0;
         var8.b = 1;
         var6 = var0.p(3, var8);
         if (var6 == var7) {
            return var7;
         }

         var5 = var0;
         var8 = var8;
         var10 = ((bhl)var6).a;
         var3 = var10.size();
         var2 = 0;
         if (var2 >= var3) {
            return qsn.a;
         }
         break;
      case 1:
         var5 = var8.c;
         pwm.bs(var6);
         var10 = ((bhl)var6).a;
         var3 = var10.size();
         var2 = 0;
         if (var2 >= var3) {
            return qsn.a;
         }
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      do {
         while(((bhw)var10.get(var2)).d) {
            var8.c = var5;
            var8.b = 1;
            var6 = var5.p(3, var8);
            if (var6 == var7) {
               return var7;
            }

            var5 = var5;
            var8 = var8;
            var10 = ((bhl)var6).a;
            var3 = var10.size();
            var2 = 0;
            if (var2 >= var3) {
               return qsn.a;
            }
         }

         ++var2;
      } while(var2 < var3);

      return qsn.a;
   }

   public static Object i(bil var0, qvx var1, que var2) {
      Object var3 = var0.l(new aes(var2.n(), var1, (que)null), var2);
      return var3 == qul.a ? var3 : qsn.a;
   }

   public static BlendMode j(int var0) {
      BlendMode var1;
      if (c.n(var0, 0)) {
         var1 = BlendMode.CLEAR;
      } else if (c.n(var0, 1)) {
         var1 = BlendMode.SRC;
      } else if (c.n(var0, 2)) {
         var1 = BlendMode.DST;
      } else if (c.n(var0, 3)) {
         var1 = BlendMode.SRC_OVER;
      } else if (c.n(var0, 4)) {
         var1 = BlendMode.DST_OVER;
      } else if (c.n(var0, 5)) {
         var1 = BlendMode.SRC_IN;
      } else if (c.n(var0, 6)) {
         var1 = BlendMode.DST_IN;
      } else if (c.n(var0, 7)) {
         var1 = BlendMode.SRC_OUT;
      } else if (c.n(var0, 8)) {
         var1 = BlendMode.DST_OUT;
      } else if (c.n(var0, 9)) {
         var1 = BlendMode.SRC_ATOP;
      } else if (c.n(var0, 10)) {
         var1 = BlendMode.DST_ATOP;
      } else if (c.n(var0, 11)) {
         var1 = BlendMode.XOR;
      } else if (c.n(var0, 12)) {
         var1 = BlendMode.PLUS;
      } else if (c.n(var0, 13)) {
         var1 = BlendMode.MODULATE;
      } else if (c.n(var0, 14)) {
         var1 = BlendMode.SCREEN;
      } else if (c.n(var0, 15)) {
         var1 = BlendMode.OVERLAY;
      } else if (c.n(var0, 16)) {
         var1 = BlendMode.DARKEN;
      } else if (c.n(var0, 17)) {
         var1 = BlendMode.LIGHTEN;
      } else if (c.n(var0, 18)) {
         var1 = BlendMode.COLOR_DODGE;
      } else if (c.n(var0, 19)) {
         var1 = BlendMode.COLOR_BURN;
      } else if (c.n(var0, 20)) {
         var1 = BlendMode.HARD_LIGHT;
      } else if (c.n(var0, 21)) {
         var1 = BlendMode.SOFT_LIGHT;
      } else if (c.n(var0, 22)) {
         var1 = BlendMode.DIFFERENCE;
      } else if (c.n(var0, 23)) {
         var1 = BlendMode.EXCLUSION;
      } else if (c.n(var0, 24)) {
         var1 = BlendMode.MULTIPLY;
      } else if (c.n(var0, 25)) {
         var1 = BlendMode.HUE;
      } else if (c.n(var0, 26)) {
         var1 = BlendMode.SATURATION;
      } else if (c.n(var0, 27)) {
         var1 = BlendMode.COLOR;
      } else if (c.n(var0, 28)) {
         var1 = BlendMode.LUMINOSITY;
      } else {
         var1 = BlendMode.SRC_OVER;
      }

      return var1;
   }

   public static long k(float var0, float var1) {
      long var4 = (long)Float.floatToIntBits(var0);
      long var2 = (long)Float.floatToIntBits(var1);
      long var6 = bcl.a;
      return var2 & 4294967295L | var4 << 32;
   }

   public static long l(long var0) {
      return es.i(bcl.c(var0) / 2.0F, bcl.a(var0) / 2.0F);
   }

   public static bcj m(long var0) {
      return es.h(bci.a, var0);
   }

   public static bck n(float var0, float var1, float var2, float var3, long var4) {
      var4 = es.k(bcg.a(var4), bcg.b(var4));
      return new bck(var0, var1, var2, var3, var4, var4, var4, var4);
   }

   public static boolean o(bck var0) {
      return bcg.a(var0.e) == bcg.b(var0.e) && bcg.a(var0.e) == bcg.a(var0.f) && bcg.a(var0.e) == bcg.b(var0.f) && bcg.a(var0.e) == bcg.a(var0.g) && bcg.a(var0.e) == bcg.b(var0.g) && bcg.a(var0.e) == bcg.a(var0.h) && bcg.a(var0.e) == bcg.b(var0.h);
   }

   public static dmw p(long var0, int var2) {
      return new dmw(bcs.a.a(var0, var2));
   }

   public void e(RecyclerView var1, int var2, int var3) {
   }

   public void f(int var1) {
   }
}
