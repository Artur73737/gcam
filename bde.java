import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import java.util.List;

public final class bde extends bdp {
   private final List a;
   private final List b;
   private final long c;
   private final long d;
   private final int e;

   public bde(List var1, long var2, long var4) {
      this.a = var1;
      this.b = null;
      this.c = var2;
      this.d = var4;
      this.e = 0;
   }

   public final Shader b(long var1) {
      float var3;
      if (bci.b(this.c) == Float.POSITIVE_INFINITY) {
         var3 = bcl.c(var1);
      } else {
         var3 = bci.b(this.c);
      }

      float var4;
      if (bci.c(this.c) == Float.POSITIVE_INFINITY) {
         var4 = bcl.a(var1);
      } else {
         var4 = bci.c(this.c);
      }

      float var5;
      if (bci.b(this.d) == Float.POSITIVE_INFINITY) {
         var5 = bcl.c(var1);
      } else {
         var5 = bci.b(this.d);
      }

      float var6;
      if (bci.c(this.d) == Float.POSITIVE_INFINITY) {
         var6 = bcl.a(var1);
      } else {
         var6 = bci.c(this.d);
      }

      List var11 = this.a;
      long var9 = es.i(var3, var4);
      var1 = es.i(var5, var6);
      if (var11.size() < 2) {
         IllegalArgumentException var14 = new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
         throw var14;
      } else {
         var4 = bci.b(var9);
         var6 = bci.c(var9);
         var5 = bci.b(var1);
         var3 = bci.c(var1);
         int var8 = var11.size();
         int[] var12 = new int[var8];

         for(int var7 = 0; var7 < var8; ++var7) {
            var12[var7] = bcq.h(((bcy)var11.get(var7)).g);
         }

         TileMode var13;
         if (c.n(0, 0)) {
            var13 = TileMode.CLAMP;
         } else if (c.n(0, 1)) {
            var13 = TileMode.REPEAT;
         } else if (c.n(0, 2)) {
            var13 = TileMode.MIRROR;
         } else if (c.n(0, 3)) {
            var13 = bdw.a.b();
         } else {
            var13 = TileMode.CLAMP;
         }

         return new LinearGradient(var4, var6, var5, var3, var12, (float[])null, var13);
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bde)) {
         return false;
      } else {
         List var3 = this.a;
         bde var4 = (bde)var1;
         if (!c.E(var3, var4.a)) {
            return false;
         } else {
            var3 = var4.b;
            if (!c.E((Object)null, (Object)null)) {
               return false;
            } else if (!c.o(this.c, var4.c)) {
               return false;
            } else if (!c.o(this.d, var4.d)) {
               return false;
            } else {
               int var2 = var4.e;
               return c.n(0, 0);
            }
         }
      }
   }

   public final int hashCode() {
      return ((this.a.hashCode() * 961 + c.p(this.c)) * 31 + c.p(this.d)) * 31;
   }

   public final String toString() {
      boolean var1 = es.j(this.c);
      String var3 = "";
      String var5;
      if (var1) {
         StringBuilder var2 = new StringBuilder();
         var2.append("start=");
         var2.append(bci.j(this.c));
         var2.append(", ");
         var5 = var2.toString();
      } else {
         var5 = "";
      }

      if (es.j(this.d)) {
         StringBuilder var6 = new StringBuilder();
         var6.append("end=");
         var6.append(bci.j(this.d));
         var6.append(", ");
         var3 = var6.toString();
      }

      StringBuilder var4 = new StringBuilder();
      var4.append("LinearGradient(colors=");
      var4.append(this.a);
      var4.append(", stops=");
      var4.append((Object)null);
      var4.append(", ");
      var4.append(var5);
      var4.append(var3);
      var4.append("tileMode=");
      if (c.n(0, 0)) {
         var5 = "Clamp";
      } else if (c.n(0, 1)) {
         var5 = "Repeated";
      } else if (c.n(0, 2)) {
         var5 = "Mirror";
      } else if (c.n(0, 3)) {
         var5 = "Decal";
      } else {
         var5 = "Unknown";
      }

      var4.append(var5);
      var4.append(')');
      return var4.toString();
   }
}
