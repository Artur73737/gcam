import android.graphics.Canvas;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class brw {
   public final bwj a;
   public final btk b;
   public final CharSequence c;
   public final List d;
   private final int e;
   private final boolean f;
   private final long g;

   public brw(bwj var1, int var2, boolean var3, long var4) {
      this.a = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      if (bxq.c(var4) == 0 && bxq.d(var4) == 0) {
         if (var2 <= 0) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
         } else {
            bss var15 = var1.a;
            Object var18;
            if (var3 && !c.o(var15.c(), car.E(0)) && !c.o(var15.c(), bxz.a) && var15.n() != null && (var15.n() == null || !c.n(5, 5)) && (var15.n() == null || !c.n(5, 4))) {
               var18 = var1.c;
               if (((CharSequence)var18).length() != 0) {
                  if (var18 instanceof Spannable) {
                     var18 = (Spannable)var18;
                  } else {
                     var18 = new SpannableString((CharSequence)var18);
                  }

                  btf.n((Spannable)var18, new btp(), ((Spannable)var18).length() - 1, ((Spannable)var18).length() - 1);
               }
            } else {
               var18 = var1.c;
            }

            this.c = (CharSequence)var18;
            bxc var19 = var15.n();
            byte var6;
            if (var19 != null && c.n(5, 1)) {
               var6 = 3;
            } else if (var19 != null && c.n(5, 2)) {
               var6 = 4;
            } else if (var19 != null && c.n(5, 3)) {
               var6 = 2;
            } else {
               label325: {
                  if (var19 == null || !c.n(5, 5)) {
                     if (var19 == null) {
                        var6 = 0;
                        break label325;
                     }

                     if (c.n(5, 6)) {
                        var6 = 1;
                        break label325;
                     }
                  }

                  var6 = 0;
               }
            }

            byte var9;
            if (var15.n() == null) {
               var9 = 0;
            } else if (c.n(5, 4)) {
               var9 = 1;
            } else {
               var9 = 0;
            }

            bwv var20 = var15.c.h;
            byte var10;
            if (var20 != null && c.n(1, 2)) {
               var10 = 4;
            } else if (var20 == null) {
               var10 = 0;
            } else {
               c.n(1, 1);
               var10 = 0;
            }

            bww var21;
            if (var15.l() != null) {
               var21 = new bww();
            } else {
               var21 = null;
            }

            byte var8;
            label326: {
               if (var21 == null || !c.n(1, 1)) {
                  if (var21 != null && c.n(1, 2)) {
                     var8 = 1;
                     break label326;
                  }

                  if (var21 == null) {
                     var8 = 0;
                     break label326;
                  }

                  if (c.n(1, 3)) {
                     var8 = 2;
                     break label326;
                  }
               }

               var8 = 0;
            }

            bwx var23;
            if (var15.l() != null) {
               var23 = new bwx();
            } else {
               var23 = null;
            }

            byte var7;
            label327: {
               if (var23 == null || !c.n(3, 1)) {
                  if (var23 != null && c.n(3, 2)) {
                     var7 = 1;
                     break label327;
                  }

                  if (var23 != null && c.n(3, 3)) {
                     var7 = 2;
                     break label327;
                  }

                  if (var23 == null) {
                     var7 = 0;
                     break label327;
                  }

                  if (c.n(3, 4)) {
                     var7 = 3;
                     break label327;
                  }
               }

               var7 = 0;
            }

            bwy var24;
            if (var15.l() != null) {
               var24 = new bwy();
            } else {
               var24 = null;
            }

            byte var11;
            label328: {
               if (var24 == null || !c.n(1, 1)) {
                  if (var24 == null) {
                     var11 = 0;
                     break label328;
                  }

                  if (c.n(1, 2)) {
                     var11 = 1;
                     break label328;
                  }
               }

               var11 = 0;
            }

            TruncateAt var25;
            if (var3) {
               var25 = TruncateAt.END;
            } else {
               var25 = null;
            }

            btk var14 = this.k(var6, var9, var25, var2, var10, var8, var7, var11);
            btk var26;
            if (var3 && var14.e() > bxq.a(var4) && var2 > 1) {
               int var13 = bxq.a(var4);
               int var12 = var14.c;
               var2 = 0;

               while(true) {
                  if (var2 >= var12) {
                     var2 = var14.c;
                     break;
                  }

                  if (var14.a(var2) > (float)var13) {
                     break;
                  }

                  ++var2;
               }

               if (var2 >= 0 && var2 != this.e) {
                  var26 = this.k(var6, var9, var25, qxb.k(var2, 1), var10, var8, var7, var11);
               } else {
                  var26 = var14;
               }

               this.b = var26;
            } else {
               this.b = var14;
            }

            this.g().b((bcu)null, et.k(this.e(), this.b()), var15.a());
            var26 = this.b;
            bwr[] var29;
            if (!(var26.j() instanceof Spanned)) {
               var29 = new bwr[0];
            } else {
               bwr[] var35 = (bwr[])((Spanned)var26.j()).getSpans(0, var26.j().length(), bwr.class);
               var35.getClass();
               var29 = var35;
               if (var35.length == 0) {
                  var29 = new bwr[0];
               }
            }

            for(var2 = 0; var2 < var29.length; ++var2) {
               var29[var2].a = et.k(this.e(), this.b());
            }

            CharSequence var32 = this.c;
            if (!(var32 instanceof Spanned)) {
               var18 = qtf.a;
            } else {
               Spanned var36 = (Spanned)var32;
               Object[] var16 = var36.getSpans(0, var32.length(), btu.class);
               var16.getClass();
               var18 = new ArrayList(var16.length);

               for(var2 = 0; var2 < var16.length; ++var2) {
                  btu var37 = (btu)var16[var2];
                  int var28 = var36.getSpanStart(var37);
                  int var33 = var36.getSpanEnd(var37);
                  int var31 = this.b.g(var28);
                  int var30 = this.e;
                  boolean var27;
                  if (this.b.b.getEllipsisCount(var31) > 0 && var33 > this.b.b.getEllipsisStart(var31)) {
                     var27 = true;
                  } else {
                     var27 = false;
                  }

                  int var34 = this.b.f(var31);
                  if (!var27 && var33 <= var34 && var31 < var30) {
                     byte var22;
                     if (!this.b.b.isRtlCharAt(var28)) {
                        var22 = 1;
                     } else {
                        var22 = 2;
                     }

                     switch(var22 - 1) {
                     case 0:
                        this.i(var28);
                        throw null;
                     default:
                        this.i(var28);
                        throw null;
                     }
                  }

                  ((Collection)var18).add((Object)null);
               }
            }

            this.d = (List)var18;
            pwm.bu(3, new bmc(this, 6));
         }
      } else {
         IllegalArgumentException var17 = new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
         throw var17;
      }
   }

   private final btk k(int var1, int var2, TruncateAt var3, int var4, int var5, int var6, int var7, int var8) {
      CharSequence var12 = this.c;
      float var9 = this.e();
      bwk var11 = this.g();
      bwj var13 = this.a;
      int var10 = var13.e;
      bta var15 = var13.d;
      bwg var14 = bwh.a;
      return new btk(var12, var9, var11, var1, var3, var10, var4, var6, var7, var8, var5, var2, var15);
   }

   public final float a() {
      return this.d(0);
   }

   public final float b() {
      return (float)this.b.e();
   }

   public final float c() {
      return this.d(this.f() - 1);
   }

   public final float d(int var1) {
      btk var4 = this.b;
      float var3 = (float)var4.d;
      float var2;
      if (var1 == var4.c - 1 && var4.f != null) {
         var2 = var4.b(var1) - (float)var4.f.ascent;
      } else {
         var2 = (float)var4.b.getLineBaseline(var1);
      }

      return var3 + var2;
   }

   public final float e() {
      return (float)bxq.b(this.g);
   }

   public final int f() {
      return this.b.c;
   }

   public final bwk g() {
      return this.a.b;
   }

   public final boolean h() {
      return this.b.a;
   }

   public final void i(int var1) {
      this.b.c(var1, false);
   }

   public final void j(bcw var1, long var2, bdq var4, bxd var5, gf var6) {
      var1.getClass();
      int var7 = this.g().a.a;
      bwk var9 = this.g();
      var9.c(var2);
      var9.d(var4);
      var9.e(var5);
      var9.f(var6);
      var9.a(3);
      Canvas var12 = bcn.a(var1);
      if (this.h()) {
         var12.save();
         var12.clipRect(0.0F, 0.0F, this.e(), this.b());
      }

      btk var11 = this.b;
      var12.getClass();
      if (var12.getClipBounds(var11.g)) {
         int var8 = var11.d;
         if (var8 != 0) {
            var12.translate(0.0F, (float)var8);
         }

         btj var10 = btl.a;
         var10.a = var12;
         var11.b.draw(var10);
         var8 = var11.d;
         if (var8 != 0) {
            var12.translate(0.0F, -((float)var8));
         }
      }

      if (this.h()) {
         var12.restore();
      }

      this.g().a(var7);
   }
}
