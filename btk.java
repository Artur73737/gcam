import android.graphics.Rect;
import android.graphics.Paint.FontMetricsInt;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.BoringLayout.Metrics;
import android.text.Layout.Alignment;
import android.text.TextUtils.TruncateAt;

public final class btk {
   public final boolean a;
   public final Layout b;
   public final int c;
   public final int d;
   public final boolean e;
   public final FontMetricsInt f;
   public final Rect g;
   private final bta h;
   private final int i;
   private final float j;
   private final float k;
   private final int l;
   private final btt[] m;
   private final qsd n;

   public btk(CharSequence var1, float var2, TextPaint var3, int var4, TruncateAt var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bta var13) {
      var1.getClass();
      var13.getClass();
      super();
      this.h = var13;
      this.g = new Rect();
      int var16 = var1.length();
      TextDirectionHeuristic var23 = btl.b(var6);
      Alignment var22 = bti.a;
      switch(var4) {
      case 0:
         var22 = Alignment.ALIGN_NORMAL;
         break;
      case 1:
         var22 = Alignment.ALIGN_OPPOSITE;
         break;
      case 2:
         var22 = Alignment.ALIGN_CENTER;
         break;
      case 3:
         var22 = bti.a;
         break;
      default:
         var22 = bti.b;
      }

      boolean var102;
      if (var1 instanceof Spanned && ((Spanned)var1).nextSpanTransition(-1, var16, btn.class) < var16) {
         var102 = true;
      } else {
         var102 = false;
      }

      Trace.beginSection("TextLayout:initLayout");

      Throwable var10000;
      label1641: {
         boolean var10001;
         Metrics var24;
         try {
            var24 = var13.b();
         } catch (Throwable var96) {
            var10000 = var96;
            var10001 = false;
            break label1641;
         }

         double var14 = (double)var2;

         try {
            var6 = (int)((float)Math.ceil(var14));
         } catch (Throwable var95) {
            var10000 = var95;
            var10001 = false;
            break label1641;
         }

         Object var105;
         label1623: {
            if (var24 != null) {
               label1621: {
                  try {
                     if (!(var13.a() <= var2)) {
                        break label1621;
                     }
                  } catch (Throwable var94) {
                     var10000 = var94;
                     var10001 = false;
                     break label1641;
                  }

                  if (!var102) {
                     try {
                        this.e = true;
                        var22.getClass();
                     } catch (Throwable var93) {
                        var10000 = var93;
                        var10001 = false;
                        break label1641;
                     }

                     if (var6 < 0) {
                        try {
                           IllegalArgumentException var97 = new IllegalArgumentException("negative width");
                           throw var97;
                        } catch (Throwable var89) {
                           var10000 = var89;
                           var10001 = false;
                           break label1641;
                        }
                     }

                     try {
                        var105 = bsv.b(var1, var3, var6, var22, 1.0F, 0.0F, var24, false, true, var5, var6);
                        break label1623;
                     } catch (Throwable var92) {
                        var10000 = var92;
                        var10001 = false;
                        break label1641;
                     }
                  }
               }
            }

            try {
               this.e = false;
               var105 = btg.a(var1, var1.length(), var3, var6, var23, var22, var7, var5, (int)((float)Math.ceil(var14)), var12, var8, var9, var10, var11);
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label1641;
            }
         }

         try {
            this.b = (Layout)var105;
         } catch (Throwable var90) {
            var10000 = var90;
            var10001 = false;
            break label1641;
         }

         Trace.endSection();
         var6 = Math.min(((Layout)var105).getLineCount(), var7);
         this.c = var6;
         var9 = var6 - 1;
         boolean var17;
         if (var6 < var7) {
            var17 = false;
         } else if (((Layout)var105).getEllipsisCount(var9) <= 0 && ((Layout)var105).getLineEnd(var9) == var1.length()) {
            var17 = false;
         } else {
            var17 = true;
         }

         this.a = var17;
         if (this.e) {
            var17 = ((BoringLayout)var105).isFallbackLineSpacingEnabled();
         } else {
            var17 = btf.b((StaticLayout)var105);
         }

         long var18;
         if (var17) {
            var18 = btl.b;
         } else {
            label1643: {
               TextPaint var111 = ((Layout)var105).getPaint();
               CharSequence var110 = ((Layout)var105).getText();
               var111.getClass();
               var110.getClass();
               Rect var99 = bsv.c(var111, var110, ((Layout)var105).getLineStart(0), ((Layout)var105).getLineEnd(0));
               var4 = ((Layout)var105).getLineAscent(0);
               if (var99.top < var4) {
                  var4 -= var99.top;
               } else {
                  var4 = ((Layout)var105).getTopPadding();
               }

               if (var6 != 1) {
                  var7 = var6 - 1;
                  var99 = bsv.c(var111, var110, ((Layout)var105).getLineStart(var7), ((Layout)var105).getLineEnd(var7));
               }

               var6 = ((Layout)var105).getLineDescent(var6 - 1);
               if (var99.bottom > var6) {
                  var6 = var99.bottom - var6;
               } else {
                  var6 = ((Layout)var105).getBottomPadding();
               }

               var7 = var4;
               if (var4 == 0) {
                  if (var6 == 0) {
                     var18 = btl.b;
                     break label1643;
                  }

                  var7 = 0;
               }

               var18 = btl.a(var7, var6);
            }
         }

         btt[] var100;
         btt[] var107;
         if (!(this.j() instanceof Spanned)) {
            var100 = new btt[0];
         } else {
            var107 = (btt[])((Spanned)this.j()).getSpans(0, this.j().length(), btt.class);
            var107.getClass();
            var100 = var107;
            if (var107.length == 0) {
               var100 = new btt[0];
            }
         }

         this.m = var100;
         var4 = 0;
         var6 = 0;

         btt var108;
         for(var7 = 0; var7 < var100.length; var4 = var8) {
            var108 = var100[var7];
            var10 = var108.d;
            var8 = var4;
            if (var10 < 0) {
               var8 = Math.max(var4, Math.abs(var10));
            }

            var4 = var108.e;
            if (var4 < 0) {
               var6 = Math.max(var8, Math.abs(var4));
            }

            ++var7;
         }

         long var20;
         label1576: {
            if (var4 == 0) {
               if (var6 == 0) {
                  var20 = btl.b;
                  break label1576;
               }

               var4 = 0;
            }

            var20 = btl.a(var4, var6);
         }

         this.d = Math.max(btm.b(var18), btm.b(var20));
         this.i = Math.max(btm.a(var18), btm.a(var20));
         var107 = this.m;
         var4 = this.c - 1;
         var7 = this.b.getLineStart(var4);
         var6 = this.b.getLineEnd(var4);
         FontMetricsInt var103 = null;
         if (var7 == var6 && var107.length != 0) {
            SpannableString var104 = new SpannableString("\u200b");
            var108 = (btt)pwm.aZ(var107);
            var6 = var104.length();
            if (var4 != 0 && var108.b) {
               var17 = false;
            } else {
               var17 = var108.b;
            }

            var104.setSpan(new btt(var108.a, var6, var17, var108.b, var108.c), 0, var104.length(), 33);
            var4 = var104.length();
            Alignment var109 = bsx.a;
            StaticLayout var101 = btg.a(var104, var4, var3, Integer.MAX_VALUE, var23, bsx.a, Integer.MAX_VALUE, (TruncateAt)null, Integer.MAX_VALUE, 0, 0, 0, 0, 0);
            var103 = new FontMetricsInt();
            var103.ascent = var101.getLineAscent(0);
            var103.descent = var101.getLineDescent(0);
            var103.top = var101.getLineTop(0);
            var103.bottom = var101.getLineBottom(0);
         }

         if (var103 != null) {
            var4 = var103.bottom - (int)(this.a(var9) - this.b(var9));
         } else {
            var4 = 0;
         }

         this.l = var4;
         this.f = var103;
         Layout var106 = this.b;
         var3 = var106.getPaint();
         var3.getClass();
         this.j = btd.b(var106, var9, var3);
         var106 = this.b;
         var3 = var106.getPaint();
         var3.getClass();
         this.k = btd.c(var106, var9, var3);
         this.n = pwm.bu(3, new bmc(this, 9));
         return;
      }

      Throwable var98 = var10000;
      Trace.endSection();
      throw var98;
   }

   private final float k(int var1) {
      return var1 == this.c - 1 ? this.j + this.k : 0.0F;
   }

   public final float a(int var1) {
      if (var1 == this.c - 1 && this.f != null) {
         return (float)this.b.getLineBottom(var1 - 1) + (float)this.f.bottom;
      } else {
         float var3 = (float)this.d;
         float var2 = (float)this.b.getLineBottom(var1);
         if (var1 == this.c - 1) {
            var1 = this.i;
         } else {
            var1 = 0;
         }

         return var3 + var2 + (float)var1;
      }
   }

   public final float b(int var1) {
      float var2 = (float)this.b.getLineTop(var1);
      if (var1 == 0) {
         var1 = 0;
      } else {
         var1 = this.d;
      }

      return var2 + (float)var1;
   }

   public final float c(int var1, boolean var2) {
      return this.i().a(var1, true, var2) + this.k(this.g(var1));
   }

   public final float d(int var1, boolean var2) {
      return this.i().a(var1, false, var2) + this.k(this.g(var1));
   }

   public final int e() {
      int var1;
      if (this.a) {
         var1 = this.b.getLineBottom(this.c - 1);
      } else {
         var1 = this.b.getHeight();
      }

      return var1 + this.d + this.i + this.l;
   }

   public final int f(int var1) {
      if (this.b.getEllipsisStart(var1) == 0) {
         var1 = this.b.getLineEnd(var1);
      } else {
         var1 = this.b.getText().length();
      }

      return var1;
   }

   public final int g(int var1) {
      return this.b.getLineForOffset(var1);
   }

   public final int h(int var1) {
      return this.b.getParagraphDirection(var1);
   }

   public final bsz i() {
      return (bsz)this.n.a();
   }

   public final CharSequence j() {
      CharSequence var1 = this.b.getText();
      var1.getClass();
      return var1;
   }
}
