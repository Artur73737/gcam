import android.content.Context;
import android.graphics.Typeface;
import android.graphics.text.LineBreakConfig;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.TtsSpan.VerbatimBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class btf {
   public static final void a(Builder var0, int var1, int var2) {
      var0.getClass();
      LineBreakConfig var3 = (new android.graphics.text.LineBreakConfig.Builder()).setLineBreakStyle(var1).setLineBreakWordStyle(var2).build();
      var3.getClass();
      var0.setLineBreakConfig(var3);
   }

   public static final boolean b(StaticLayout var0) {
      var0.getClass();
      return var0.isFallbackLineSpacingEnabled();
   }

   public static final Typeface c(bvi var0, Context var1) {
      Typeface var2 = cde.a(var1, var0.a);
      var2.getClass();
      return var2;
   }

   public static final boolean d(bss var0) {
      bsb var1;
      if (var0.d != null) {
         var1 = new bsb();
      } else {
         var1 = null;
      }

      return var1 == null || !c.n(0, 1);
   }

   public static bxg e(bxg var0, bxg var1) {
      boolean var2 = var1 instanceof bwt;
      if (var2 && var0 instanceof bwt) {
         bwt var3 = (bwt)var1;
         throw null;
      } else {
         if (var2 && !(var0 instanceof bwt)) {
            var0 = var1;
         } else if (var2 || !(var0 instanceof bwt)) {
            return var1.d(new bmc(var0, 12));
         }

         return var0;
      }
   }

   public static bxg f(bxg var0, qvi var1) {
      return !c.E(var0, bxf.a) ? var0 : (bxg)var1.a();
   }

   public static final float g(float var0) {
      float var1 = var0;
      if (var0 == 0.0F) {
         var1 = Float.MIN_VALUE;
      }

      return var1;
   }

   public static final boolean h(bsn var0) {
      return var0.f != null || var0.d != null || var0.c != null;
   }

   public static final bsn i(bsn var0, bsn var1) {
      return var0 == null ? var1 : var0.c(var1);
   }

   public static final void j(Spannable var0, long var1, int var3, int var4) {
      if (var1 != bcy.f) {
         n(var0, new BackgroundColorSpan(bcq.h(var1)), var3, var4);
      }

   }

   public static final void k(Spannable var0, long var1, int var3, int var4) {
      if (var1 != bcy.f) {
         n(var0, new ForegroundColorSpan(bcq.h(var1)), var3, var4);
      }

   }

   public static final void l(Spannable var0, long var1, bxr var3, int var4, int var5) {
      long var6 = bxz.c(var1);
      if (!c.o(var6, 4294967296L)) {
         if (c.o(var6, 8589934592L)) {
            n(var0, new RelativeSizeSpan(bxz.a(var1)), var4, var5);
         }

      } else {
         n(var0, new AbsoluteSizeSpan(qxg.e(var3.eH(var1)), false), var4, var5);
      }
   }

   public static final void m(Spannable var0, bwe var1, int var2, int var3) {
      if (var1 != null) {
         n(var0, bwp.a.a(var1), var2, var3);
      }

   }

   public static final void n(Spannable var0, Object var1, int var2, int var3) {
      var0.getClass();
      var1.getClass();
      var0.setSpan(var1, var2, var3, 33);
   }

   public static final Locale o(bwd var0) {
      var0.getClass();
      return (Locale)var0.a.a;
   }

   public static final SpannableString p(bry var0, bxr var1, fwf var2, dmw var3) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      SpannableString var20 = new SpannableString(var0.a);
      List var21 = var0.b;
      SpannableString var22 = var20;
      int var5;
      int var6;
      int var7;
      Object var46;
      if (var21 != null) {
         var7 = var21.size();
         var6 = 0;

         while(true) {
            var22 = var20;
            if (var6 >= var7) {
               break;
            }

            brx var23 = (brx)var21.get(var6);
            bsn var49 = (bsn)var23.a;
            int var10 = var23.b;
            int var9 = var23.c;
            long var16 = var49.b();
            long var18 = var49.b;
            bvc var27 = var49.c;
            buy var31 = var49.d;
            buz var26 = var49.e;
            String var32 = var49.g;
            long var12 = var49.h;
            bws var24 = var49.i;
            bxh var51 = var49.j;
            bwe var29 = var49.k;
            long var14 = var49.l;
            bxd var25 = var49.m;
            bdq var30 = var49.n;
            gf var28 = var49.o;
            bxg var50;
            if (c.o(var16, var49.b())) {
               var50 = var49.a;
            } else {
               var50 = car.ae(var16);
            }

            bsn var55 = new bsn(var50, var18, var27, var31, var26, (buq)null, var32, var12, var24, var51, var29, var14, var25, var30, var28);
            var12 = var55.b();
            k(var20, var12, var10, var9);
            l(var20, var55.b, var1, var10, var9);
            bvc var53 = var55.c;
            if (var53 != null || var55.d != null) {
               bvc var44 = var53;
               if (var53 == null) {
                  var44 = bvc.l;
               }

               buy var54 = var55.d;
               if (var54 != null) {
                  var5 = var54.a;
               } else {
                  var5 = 0;
               }

               var44.getClass();
               boolean var8;
               if (var44.a(bvc.f) >= 0) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               byte var42;
               label121: {
                  boolean var11 = c.n(var5, 1);
                  if (var11) {
                     if (var8) {
                        var42 = 3;
                        break label121;
                     }
                  } else if (var8) {
                     var42 = 1;
                     break label121;
                  }

                  if (var11) {
                     var42 = 2;
                  } else {
                     var42 = 0;
                  }
               }

               var20.setSpan(new StyleSpan(var42), var10, var9, 33);
            }

            buq var45 = var55.f;
            if (var45 != null) {
               if (var45 instanceof bvd) {
                  var20.setSpan(new TypefaceSpan(((bvd)var55.f).f), var10, var9, 33);
               } else {
                  var46 = var2.f(var45, bvc.l, 0).a();
                  var46.getClass();
                  Typeface var47 = (Typeface)var46;
                  var20.setSpan(bwl.a.a(var47), var10, var9, 33);
               }
            }

            bxd var48 = var55.m;
            if (var48 != null) {
               if (var48.a(bxd.b)) {
                  var20.setSpan(new UnderlineSpan(), var10, var9, 33);
               }

               if (var55.m.a(bxd.c)) {
                  var20.setSpan(new StrikethroughSpan(), var10, var9, 33);
               }
            }

            if (var55.j != null) {
               float var4 = var55.j.b;
               var20.setSpan(new ScaleXSpan(1.0F), var10, var9, 33);
            }

            m(var20, var55.k, var10, var9);
            j(var20, var55.l, var10, var9);
            ++var6;
            var20 = var20;
         }
      }

      var7 = var0.a();
      var21 = var0.d;
      Object var34;
      brx var38;
      if (var21 != null) {
         var34 = new ArrayList(var21.size());
         var6 = var21.size();

         for(var5 = 0; var5 < var6; ++var5) {
            var46 = var21.get(var5);
            var38 = (brx)var46;
            if (var38.a instanceof bst && brz.c(0, var7, var38.b, var38.c)) {
               ((Collection)var34).add(var46);
            }
         }
      } else {
         var34 = qtf.a;
      }

      if (((List)var34).size() > 0) {
         brx var36 = (brx)((List)var34).get(0);
         bst var41 = (bst)var36.a;
         var5 = var36.b;
         var5 = var36.c;
         VerbatimBuilder var37 = new VerbatimBuilder;
         throw null;
      } else {
         var7 = var0.a();
         List var52 = var0.d;
         Object var33;
         if (var52 != null) {
            var33 = new ArrayList(var52.size());
            var6 = var52.size();

            for(var5 = 0; var5 < var6; ++var5) {
               var34 = var52.get(var5);
               var38 = (brx)var34;
               if (var38.a instanceof bsu && brz.c(0, var7, var38.b, var38.c)) {
                  ((Collection)var33).add(var34);
               }
            }
         } else {
            var33 = qtf.a;
         }

         var6 = ((List)var33).size();

         for(var5 = 0; var5 < var6; ++var5) {
            brx var39 = (brx)((List)var33).get(var5);
            bsu var40 = (bsu)var39.a;
            int var43 = var39.b;
            var7 = var39.c;
            var34 = ((Map)var3.a).get(var40);
            if (var34 == null) {
               URLSpan var35 = new URLSpan;
               throw null;
            }

            var22.setSpan((URLSpan)var34, var43, var7, 33);
         }

         return var22;
      }
   }
}
