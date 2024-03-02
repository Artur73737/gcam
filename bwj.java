import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ScaleXSpan;
import android.text.style.LeadingMarginSpan.Standard;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public final class bwj implements bsg {
   public final bss a;
   public final bwk b;
   public final CharSequence c;
   public final bta d;
   public final int e;
   public bbf f;
   public final fwf g;
   private final String h;
   private final List i;
   private final List j;
   private final bxr k;
   private final boolean l;

   public bwj(String var1, bss var2, List var3, List var4, fwf var5, bxr var6) {
      this.h = var1;
      this.a = var2;
      this.i = var3;
      this.j = var4;
      this.g = var5;
      this.k = var6;
      bwk var24 = new bwk(var6.a());
      this.b = var24;
      int var10;
      if (btf.d(var2)) {
         var10 = bwm.a;
         (Boolean)bwm.a().a();
      }

      this.l = false;
      bxe var39 = var2.p();
      bwe var43 = var2.k();
      if (var39 != null) {
         var10 = var39.a;
      } else {
         var10 = 3;
      }

      byte var64;
      if (c.n(var10, 4)) {
         var64 = 2;
      } else if (c.n(var10, 5)) {
         var64 = 3;
      } else if (c.n(var10, 1)) {
         var64 = 0;
      } else if (c.n(var10, 2)) {
         var64 = 1;
      } else {
         if (!c.n(var10, 3)) {
            IllegalStateException var63 = new IllegalStateException("Invalid TextDirection.");
            throw var63;
         }

         Object var42;
         if (var43 != null) {
            var42 = ((bwd)var43.a.get(0)).a.a;
         } else {
            var42 = Locale.getDefault();
         }

         switch(ceu.a((Locale)var42)) {
         case 0:
         default:
            var64 = 2;
            break;
         case 1:
            var64 = 3;
         }
      }

      this.e = var64;
      bwi var26 = new bwi(this, 0);
      bxj var45 = var2.r();
      bxj var46 = var45;
      if (var45 == null) {
         var46 = bxj.a;
      }

      if (var46.c) {
         var10 = var24.getFlags() | 128;
      } else {
         var10 = var24.getFlags() & -129;
      }

      var24.setFlags(var10);
      var10 = var46.b;
      if (c.n(var10, 1)) {
         var24.setFlags(var24.getFlags() | 64);
         var24.setHinting(0);
      } else if (c.n(var10, 2)) {
         var24.getFlags();
         var24.setHinting(1);
      } else if (c.n(var10, 3)) {
         var24.getFlags();
         var24.setHinting(0);
      } else {
         var24.getFlags();
      }

      bsn var47 = var2.b;
      boolean var18 = var3.isEmpty();
      long var20 = bxz.c(var47.b);
      if (c.o(var20, 4294967296L)) {
         var24.setTextSize(var6.eH(var47.b));
      } else if (c.o(var20, 8589934592L)) {
         var24.setTextSize(var24.getTextSize() * bxz.a(var47.b));
      }

      if (btf.h(var47)) {
         buq var25 = var47.f;
         bvc var52 = var47.c;
         bvc var30 = var52;
         if (var52 == null) {
            var30 = bvc.l;
         }

         buy var54 = var47.d;
         if (var54 != null) {
            var10 = var54.a;
         } else {
            var10 = 0;
         }

         var24.setTypeface((Typeface)var26.d(var25, var30, buy.a(var10), buz.a()));
      }

      bwe var33 = var47.k;
      if (var33 != null && !c.E(var33, bte.c())) {
         bwp.a.b(var24, var47.k);
      }

      String var35 = var47.g;
      if (var35 != null && !c.E(var35, "")) {
         var24.setFontFeatureSettings(var47.g);
      }

      bxh var37 = var47.j;
      float var7;
      float var8;
      if (var37 != null && !c.E(var37, bxh.a)) {
         var7 = var24.getTextScaleX();
         var8 = var47.j.b;
         var24.setTextScaleX(var7);
         var7 = var24.getTextSkewX();
         var8 = var47.j.c;
         var24.setTextSkewX(var7 + 0.0F);
      }

      var24.c(var47.b());
      var24.b((bcu)null, bcl.b, var47.a());
      var24.d(var47.n);
      var24.e(var47.m);
      var24.f(var47.o);
      if (c.o(bxz.c(var47.h), 4294967296L) && bxz.a(var47.h) != 0.0F) {
         var8 = var24.getTextSize() * var24.getTextScaleX();
         var7 = var6.eH(var47.h);
         if (var8 != 0.0F) {
            var24.setLetterSpacing(var7 / var8);
         }
      } else if (c.o(bxz.c(var47.h), 8589934592L)) {
         var24.setLetterSpacing(bxz.a(var47.h));
      }

      var20 = var47.h;
      long var22 = var47.l;
      bws var40 = var47.i;
      boolean var11;
      if (var18 ^ true && c.o(bxz.c(var20), 4294967296L)) {
         if (bxz.a(var20) == 0.0F) {
            var11 = false;
         } else {
            var11 = true;
         }
      } else {
         var11 = false;
      }

      boolean var12;
      if (!c.o(var22, bcy.f) && !c.o(var22, bcy.e)) {
         var12 = true;
      } else {
         var12 = false;
      }

      boolean var68;
      if (var40 != null) {
         if (Float.compare(0.0F, 0.0F) == 0) {
            var68 = false;
         } else {
            var68 = true;
         }
      } else {
         var68 = false;
      }

      bsn var44;
      label467: {
         boolean var13 = var68;
         if (!var11) {
            var13 = var68;
            if (!var12) {
               if (!var68) {
                  var44 = null;
                  break label467;
               }

               var13 = true;
            }
         }

         if (!var11) {
            var20 = bxz.a;
         }

         if (!var12) {
            var22 = bcy.f;
         }

         if (!var13) {
            var40 = null;
         }

         var44 = new bsn((bvc)null, (buy)null, (buz)null, (buq)null, var20, var40, var22, 63103);
      }

      brx var29;
      Object var34;
      int var65;
      if (var44 != null) {
         var65 = var3.size() + 1;
         var34 = new ArrayList(var65);

         for(var10 = 0; var10 < var65; ++var10) {
            if (var10 == 0) {
               var29 = new brx(var44, 0, this.h.length());
            } else {
               var29 = (brx)this.i.get(var10 - 1);
            }

            ((ArrayList)var34).add(var29);
         }
      } else {
         var34 = var3;
      }

      Object var31 = this.h;
      var8 = this.b.getTextSize();
      bss var56 = this.a;
      Object var69 = this.j;
      bxr var72 = this.k;
      bwg var49 = bwh.a;
      if (!((List)var34).isEmpty() || !((List)var69).isEmpty() || !c.E(var56.q(), bxi.a) || !car.G(var56.d())) {
         SpannableString var50 = new SpannableString((CharSequence)var31);
         if (c.E(var56.o(), bxd.b)) {
            var10 = ((String)var31).length();
            btf.n(var50, bwh.a, 0, var10);
         }

         bxb var53 = var56.m();
         bxb var32 = var53;
         if (var53 == null) {
            var32 = bxb.a;
         }

         var22 = var56.d();
         var32.getClass();
         var20 = bxz.c(var22);
         if (c.o(var20, 4294967296L)) {
            var7 = var72.eH(var22);
         } else if (c.o(var20, 8589934592L)) {
            var7 = bxz.a(var22) * var8;
         } else {
            var7 = Float.NaN;
         }

         if (!Float.isNaN(var7)) {
            label407: {
               if (var50.length() != 0) {
                  if (var50.length() == 0) {
                     throw new NoSuchElementException("Char sequence is empty.");
                  }

                  if (var50.charAt(qwp.m(var50)) != '\n') {
                     var10 = var50.length();
                     break label407;
                  }
               }

               var10 = var50.length() + 1;
            }

            var65 = var32.c;
            if (1 != (var65 & 1)) {
               var18 = false;
            } else {
               var18 = true;
            }

            float var9 = var32.b;
            boolean var19;
            if ((var65 & 16) > 0) {
               var19 = true;
            } else {
               var19 = false;
            }

            btf.n(var50, new btt(var7, var10, var18, var19, var9), 0, var50.length());
         }

         bxi var36 = var56.q();
         if (var36 != null && (!c.o(var36.b, car.E(0)) || !c.o(var36.c, car.E(0))) && !car.G(var36.b) && !car.G(var36.c)) {
            var20 = bxz.c(var36.b);
            if (c.o(var20, 4294967296L)) {
               var7 = var72.eH(var36.b);
            } else if (c.o(var20, 8589934592L)) {
               var7 = bxz.a(var36.b) * var8;
            } else {
               var7 = 0.0F;
            }

            var20 = bxz.c(var36.c);
            if (c.o(var20, 4294967296L)) {
               var8 = var72.eH(var36.c);
            } else if (c.o(var20, 8589934592L)) {
               var8 = bxz.a(var36.c) * var8;
            } else {
               var8 = 0.0F;
            }

            var7 = (float)Math.ceil((double)var7);
            var8 = (float)Math.ceil((double)var8);
            btf.n(var50, new Standard((int)var7, (int)var8), 0, var50.length());
         }

         ArrayList var55 = new ArrayList(((List)var34).size());
         var65 = ((List)var34).size();

         bsn var38;
         for(var10 = 0; var10 < var65; ++var10) {
            Object var51 = ((List)var34).get(var10);
            var38 = (bsn)((brx)var51).a;
            if (btf.h(var38) || var38.e != null) {
               var55.add(var51);
            }
         }

         if (!btf.h(var56.b) && var56.i() == null) {
            var38 = null;
         } else {
            buq var41 = var56.g();
            var38 = new bsn(var56.j(), var56.h(), var56.i(), var41, 0L, (bws)null, 0L, 65475);
         }

         ack var27 = new ack(var50, var26, 2);
         int var14;
         brx var58;
         bsn var59;
         int var66;
         int var67;
         if (var55.size() <= 1) {
            if (!var55.isEmpty()) {
               var27.a(btf.i(var38, (bsn)((brx)var55.get(0)).a), ((brx)var55.get(0)).b, ((brx)var55.get(0)).c);
            }
         } else {
            var65 = var55.size();
            var66 = var65 + var65;
            Integer[] var73 = new Integer[var66];

            for(var10 = 0; var10 < var66; ++var10) {
               var73[var10] = 0;
            }

            var67 = var55.size();

            for(var10 = 0; var10 < var67; ++var10) {
               var58 = (brx)var55.get(var10);
               var73[var10] = var58.b;
               var73[var10 + var65] = var58.c;
            }

            pwm.aU(var73);
            var67 = ((Number)pwm.aZ(var73)).intValue();
            var65 = 0;
            var10 = var66;

            for(var66 = var67; var65 < var10; ++var65) {
               var14 = var73[var65];
               if (var14 != var66) {
                  int var15 = var55.size();
                  var59 = var38;

                  for(var67 = 0; var67 < var15; var59 = var47) {
                     brx var28 = (brx)var55.get(var67);
                     int var17 = var28.b;
                     int var16 = var28.c;
                     var47 = var59;
                     if (var17 != var16) {
                        var47 = var59;
                        if (brz.c(var66, var14, var17, var16)) {
                           var47 = btf.i(var59, (bsn)var28.a);
                        }
                     }

                     ++var67;
                  }

                  if (var59 != null) {
                     var27.a(var59, var66, var14);
                  }

                  var66 = var14;
               }
            }
         }

         var10 = ((List)var34).size();
         var65 = 0;
         var12 = false;

         bxr var48;
         for(var48 = var72; var65 < var10; ++var65) {
            var58 = (brx)((List)var34).get(var65);
            var67 = var58.b;
            var14 = var58.c;
            if (var67 >= 0 && var67 < var50.length() && var14 > var67 && var14 <= var50.length()) {
               var14 = var58.b;
               var67 = var58.c;
               var47 = (bsn)var58.a;
               if (var47.i != null) {
                  btf.n(var50, new btn(), var14, var67);
               }

               btf.k(var50, var47.b(), var14, var67);
               var47.a();
               bxd var70 = var47.m;
               if (var70 != null) {
                  btf.n(var50, new btx(var70.a(bxd.b), var70.a(bxd.c)), var14, var67);
               }

               btf.l(var50, var47.b, var48, var14, var67);
               String var71 = var47.g;
               if (var71 != null) {
                  btf.n(var50, new bto(var71), var14, var67);
               }

               if (var47.j != null) {
                  btf.n(var50, new ScaleXSpan(1.0F), var14, var67);
                  btf.n(var50, new btw(), var14, var67);
               }

               btf.m(var50, var47.k, var14, var67);
               btf.j(var50, var47.l, var14, var67);
               var69 = var47.n;
               if (var69 != null) {
                  btf.n(var50, new btv(bcq.h(((bdq)var69).b), bci.b(((bdq)var69).c), bci.c(((bdq)var69).c), btf.g(((bdq)var69).d)), var14, var67);
               }

               gf var60 = var47.o;
               if (var60 != null) {
                  btf.n(var50, new bwq(var60), var14, var67);
               }

               var59 = (bsn)var58.a;
               if (c.o(bxz.c(var59.h), 4294967296L) || c.o(bxz.c(var59.h), 8589934592L)) {
                  var12 = true;
               }
            }
         }

         if (var12) {
            var65 = ((List)var34).size();
            var10 = 0;

            for(bxr var61 = var48; var10 < var65; ++var10) {
               var29 = (brx)((List)var34).get(var10);
               var66 = var29.b;
               var67 = var29.c;
               var38 = (bsn)var29.a;
               if (var66 >= 0 && var66 < var50.length() && var67 > var66 && var67 <= var50.length()) {
                  var22 = var38.h;
                  var20 = bxz.c(var22);
                  if (c.o(var20, 4294967296L)) {
                     var31 = new bts(var61.eH(var22));
                  } else if (c.o(var20, 8589934592L)) {
                     var31 = new btr(bxz.a(var22));
                  } else {
                     var31 = null;
                  }

                  if (var31 != null) {
                     btf.n(var50, var31, var66, var67);
                  }
               }
            }
         }

         if (((List)var69).size() > 0) {
            var29 = (brx)((List)var69).get(0);
            bsj var57 = (bsj)var29.a;
            Object[] var62 = var50.getSpans(var29.b, var29.c, cjy.class);
            var62.getClass();

            for(var10 = 0; var10 < var62.length; ++var10) {
               var50.removeSpan((cjy)var62[var10]);
            }

            throw null;
         }

         var31 = var50;
      }

      this.c = (CharSequence)var31;
      this.d = new bta((CharSequence)var31, this.b, this.e);
   }

   public final float a() {
      return this.d.a();
   }

   public final float b() {
      bta var7 = this.d;
      float var1;
      if (!Float.isNaN(var7.c)) {
         var1 = var7.c;
      } else {
         CharSequence var5 = var7.a;
         TextPaint var6 = var7.b;
         BreakIterator var8 = BreakIterator.getLineInstance(var6.getTextLocale());
         var8.setText(new bsw(var5, var5.length()));
         PriorityQueue var10 = new PriorityQueue(10, wr.b);
         int var2 = var8.next();

         int var4;
         qsg var9;
         for(int var3 = 0; var2 != -1; var2 = var4) {
            if (var10.size() < 10) {
               var10.add(new qsg(var3, var2));
            } else {
               var9 = (qsg)var10.peek();
               if (var9 != null && ((Number)var9.b).intValue() - ((Number)var9.a).intValue() < var2 - var3) {
                  var10.poll();
                  var10.add(new qsg(var3, var2));
               }
            }

            var4 = var8.next();
            var3 = var2;
         }

         Iterator var11 = var10.iterator();

         for(var1 = 0.0F; var11.hasNext(); var1 = Math.max(var1, Layout.getDesiredWidth(var5, ((Number)var9.a).intValue(), ((Number)var9.b).intValue(), var6))) {
            var9 = (qsg)var11.next();
         }

         var7.c = var1;
      }

      return var1;
   }

   public final boolean c() {
      bbf var3 = this.f;
      boolean var2;
      if (var3 != null && var3.n()) {
         var2 = true;
      } else {
         if (btf.d(this.a)) {
            int var1 = bwm.a;
            (Boolean)bwm.a().a();
            return false;
         }

         var2 = false;
      }

      return var2;
   }
}
