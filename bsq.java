import android.text.Layout;
import java.util.List;

public final class bsq {
   public final bsp a;
   public final bsc b;
   public final long c;
   public final float d;
   public final float e;
   private final List f;

   public bsq(bsp var1, bsc var2, long var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      boolean var7 = var2.g.isEmpty();
      float var6 = 0.0F;
      float var5;
      if (var7) {
         var5 = 0.0F;
      } else {
         var5 = ((bse)var2.g.get(0)).g.a();
      }

      this.d = var5;
      if (var2.g.isEmpty()) {
         var5 = var6;
      } else {
         bse var8 = (bse)pwm.ax(var2.g);
         var5 = var8.a(var8.g.c());
      }

      this.e = var5;
      this.f = var2.f;
   }

   // $FF: synthetic method
   public static int i(bsq var0, int var1) {
      bsc var4 = var0.b;
      var4.b(var1);
      int var2 = la.i(var4.g, var1);
      bse var3 = (bse)var4.g.get(var2);
      brw var5 = var3.g;
      var1 = var3.e(var1);
      return var3.b(var5.b.f(var1));
   }

   public final float a(int var1) {
      bsc var3 = this.b;
      var3.b(var1);
      int var2 = la.i(var3.g, var1);
      bse var5 = (bse)var3.g.get(var2);
      brw var4 = var5.g;
      var1 = var5.e(var1);
      return var5.a(var4.b.b(var1));
   }

   public final int b() {
      return this.b.e;
   }

   public final int c(int var1) {
      bsc var3 = this.b;
      int var2;
      if (var1 >= var3.a().a()) {
         var2 = pwm.al(var3.g);
      } else if (var1 < 0) {
         var2 = 0;
      } else {
         var2 = la.h(var3.g, var1);
      }

      bse var4 = (bse)var3.g.get(var2);
      brw var5 = var4.g;
      var1 = var4.d(var1);
      return var4.c(var5.b.g(var1));
   }

   public final int d(float var1) {
      bsc var9 = this.b;
      int var3;
      int var4;
      if (var1 <= 0.0F) {
         var3 = 0;
      } else if (var1 >= var9.d) {
         var3 = pwm.al(var9.g);
      } else {
         List var7 = var9.g;
         int var5 = var7.size() - 1;
         var4 = 0;

         while(true) {
            byte var10 = 1;
            if (var4 > var5) {
               var3 = -(var4 + 1);
               break;
            }

            int var6 = var4 + var5 >>> 1;
            bse var8 = (bse)var7.get(var6);
            if (!(var8.e > var1)) {
               if (var8.f <= var1) {
                  var10 = -1;
               } else {
                  var10 = 0;
               }
            }

            if (var10 < 0) {
               var4 = var6 + 1;
            } else {
               if (var10 <= 0) {
                  var3 = var6;
                  break;
               }

               var5 = var6 - 1;
            }
         }
      }

      bse var11 = (bse)var9.g.get(var3);
      var4 = var11.b;
      var3 = var11.a;
      if (var4 - var3 == 0) {
         var3 = Math.max(0, var3 - 1);
      } else {
         brw var12 = var11.g;
         float var2 = var11.e;
         btk var14 = var12.b;
         Layout var13 = var14.b;
         var3 = var14.d;
         var3 = var11.c(var13.getLineForVertical((int)(var1 - var2) - var3));
      }

      return var3;
   }

   public final int e(int var1) {
      bsc var3 = this.b;
      var3.b(var1);
      int var2 = la.i(var3.g, var1);
      bse var4 = (bse)var3.g.get(var2);
      brw var5 = var4.g;
      var1 = var4.e(var1);
      return var4.b(var5.b.b.getLineStart(var1));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bsq)) {
         return false;
      } else {
         bsp var2 = this.a;
         bsq var3 = (bsq)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.o(this.c, var3.c)) {
            return false;
         } else if (this.d == var3.d && this.e == var3.e) {
            return c.E(this.f, var3.f);
         } else {
            return false;
         }
      }
   }

   public final bsq f(bsp var1, long var2) {
      return new bsq(var1, this.b, var2);
   }

   public final boolean g() {
      long var3 = this.c;
      int var2 = bxx.b(var3);
      bsc var5 = this.b;
      float var1 = var5.c;
      if (!((float)var2 < var1) && !var5.b) {
         var2 = bxx.a(var3);
         var1 = var5.d;
         if (!((float)var2 < var1)) {
            return false;
         }
      }

      return true;
   }

   public final int h(int var1) {
      bsc var4 = this.b;
      if (var1 >= 0 && var1 <= var4.a().a.length()) {
         int var2;
         if (var1 == var4.a().a()) {
            var2 = pwm.al(var4.g);
         } else {
            var2 = la.h(var4.g, var1);
         }

         bse var5 = (bse)var4.g.get(var2);
         brw var6 = var5.g;
         var1 = var5.d(var1);
         var1 = var6.b.g(var1);
         return var6.b.h(var1) == 1 ? 1 : 2;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("offset(");
         var3.append(var1);
         var3.append(") is out of bounds [0, ");
         var3.append(var4.a().a());
         var3.append(']');
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final int hashCode() {
      return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + c.p(this.c)) * 31 + Float.floatToIntBits(this.d)) * 31 + Float.floatToIntBits(this.e)) * 31 + this.f.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TextLayoutResult(layoutInput=");
      var1.append(this.a);
      var1.append(", multiParagraph=");
      var1.append(this.b);
      var1.append(", size=");
      var1.append(bxx.d(this.c));
      var1.append(", firstBaseline=");
      var1.append(this.d);
      var1.append(", lastBaseline=");
      var1.append(this.e);
      var1.append(", placeholderRects=");
      var1.append(this.f);
      var1.append(')');
      return var1.toString();
   }
}
