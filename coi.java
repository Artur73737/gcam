import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class coi {
   public final String a;
   public final int b;
   public final int c;
   public final int d;
   public final String e;
   public final String f;
   public final int g;
   public final List h;
   public final int i;
   public final int j;
   public final float k;
   public final int l;
   public final float m;
   public final cog n;
   public final int o;
   public final int p;
   public final int q;
   private int r;

   static {
      (new coh()).a();
      com.d(0);
      com.d(1);
      com.d(2);
      com.d(3);
      com.d(4);
      com.d(5);
      com.d(6);
      com.d(7);
      com.d(8);
      com.d(9);
      com.d(10);
      com.d(11);
      com.d(12);
      com.d(13);
      com.d(14);
      com.d(15);
      com.d(16);
      com.d(17);
      com.d(18);
      com.d(19);
      com.d(20);
      com.d(21);
      com.d(22);
      com.d(23);
      com.d(24);
      com.d(25);
      com.d(26);
      com.d(27);
      com.d(28);
      com.d(29);
      com.d(30);
      com.d(31);
   }

   public coi(coh var1) {
      String var8 = var1.a;
      HashMap var7 = com.a;
      byte var5 = 0;
      int var4;
      int var6;
      if (var8 == null) {
         var8 = null;
      } else {
         label60: {
            String var9 = var8.replace('_', '-');
            String var12 = var8;
            if (!var9.isEmpty()) {
               var12 = var8;
               if (!var9.equals("und")) {
                  var12 = var9;
               }
            }

            String var10 = onk.T(var12);
            String var11 = var10.split("-", 2)[0];
            if (com.a == null) {
               com.a = com.a();
            }

            var8 = (String)com.a.get(var11);
            var12 = var10;
            var9 = var11;
            if (var8 != null) {
               var12 = var8.concat(String.valueOf(var10.substring(var11.length())));
               var9 = var8;
            }

            if (!"no".equals(var9) && !"i".equals(var9)) {
               var8 = var12;
               if (!"zh".equals(var9)) {
                  break label60;
               }
            }

            var4 = 0;

            while(true) {
               String[] var14 = com.b;
               var6 = var14.length;
               var8 = var12;
               if (var4 >= 18) {
                  break;
               }

               if (var12.startsWith(var14[var4])) {
                  var14 = com.b;
                  var8 = var14[var4 + 1];
                  var12 = var12.substring(var14[var4].length());
                  var8 = String.valueOf(var8).concat(String.valueOf(var12));
                  break;
               }

               var4 += 2;
            }
         }
      }

      this.a = var8;
      var4 = var1.b;
      this.b = var4;
      var6 = var1.c;
      this.c = var6;
      if (var6 != -1) {
         var4 = var6;
      }

      this.d = var4;
      this.e = var1.d;
      this.f = var1.e;
      this.g = var1.f;
      List var15 = var1.g;
      List var13 = var15;
      if (var15 == null) {
         var13 = Collections.emptyList();
      }

      this.h = var13;
      this.i = var1.h;
      this.j = var1.i;
      this.k = var1.j;
      var4 = var1.k;
      if (var4 == -1) {
         var4 = var5;
      }

      this.l = var4;
      float var3 = var1.l;
      float var2 = var3;
      if (var3 == -1.0F) {
         var2 = 1.0F;
      }

      this.m = var2;
      this.n = var1.m;
      this.o = var1.n;
      this.p = var1.o;
      this.q = var1.p;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         coi var4 = (coi)var1;
         int var2 = this.r;
         if (var2 != 0) {
            int var3 = var4.r;
            if (var3 != 0 && var2 != var3) {
               return false;
            }
         }

         if (this.b == var4.b && this.c == var4.c && this.g == var4.g && this.i == var4.i && this.j == var4.j && this.l == var4.l && this.o == var4.o && this.p == var4.p && this.q == var4.q && Float.compare(this.k, var4.k) == 0 && Float.compare(this.m, var4.m) == 0 && c.E((Object)null, (Object)null) && c.E((Object)null, (Object)null) && c.E(this.e, var4.e) && c.E((Object)null, (Object)null) && c.E(this.f, var4.f) && c.E(this.a, var4.a) && Arrays.equals((byte[])null, (byte[])null) && c.E((Object)null, (Object)null) && c.E(this.n, var4.n) && c.E((Object)null, (Object)null) && this.h.size() == var4.h.size()) {
            var2 = 0;

            while(true) {
               if (var2 >= this.h.size()) {
                  return true;
               }

               if (!Arrays.equals((byte[])this.h.get(var2), (byte[])var4.h.get(var2))) {
                  break;
               }

               ++var2;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var1 = this.r;
      if (var1 == 0) {
         String var6 = this.a;
         int var3 = 0;
         if (var6 == null) {
            var1 = 0;
         } else {
            var1 = var6.hashCode();
         }

         int var5 = this.b;
         int var4 = this.c;
         var6 = this.e;
         int var2;
         if (var6 == null) {
            var2 = 0;
         } else {
            var2 = var6.hashCode();
         }

         var6 = this.f;
         if (var6 != null) {
            var3 = var6.hashCode();
         }

         var1 = (((((((((((((((((((var1 + 506447) * 29791 + var5) * 31 + var4) * 31 + var2) * 29791 + var3) * 31 + this.g) * 31 + (int)Long.MAX_VALUE) * 31 + this.i) * 31 + this.j) * 31 + Float.floatToIntBits(this.k)) * 31 + this.l) * 31 + Float.floatToIntBits(this.m)) * 31 - 1) * 31 + this.o) * 31 + this.p) * 31 + this.q) * 29791 - 1) * 31 - 1) * 31 - 1) * 31;
         this.r = var1;
      }

      return var1;
   }

   public final String toString() {
      String var9 = this.f;
      String var8 = this.e;
      int var3 = this.d;
      String var11 = this.a;
      int var2 = this.i;
      int var5 = this.j;
      float var1 = this.k;
      String var7 = String.valueOf(this.n);
      int var6 = this.o;
      int var4 = this.p;
      StringBuilder var10 = new StringBuilder();
      var10.append("Format(null, null, null, ");
      var10.append(var9);
      var10.append(", ");
      var10.append(var8);
      var10.append(", ");
      var10.append(var3);
      var10.append(", ");
      var10.append(var11);
      var10.append(", [");
      var10.append(var2);
      var10.append(", ");
      var10.append(var5);
      var10.append(", ");
      var10.append(var1);
      var10.append(", ");
      var10.append(var7);
      var10.append("], [");
      var10.append(var6);
      var10.append(", ");
      var10.append(var4);
      var10.append("])");
      return var10.toString();
   }
}
