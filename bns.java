import android.graphics.Rect;

public final class bns extends bnp {
   public static bns b;
   public bsq c;
   public bro d;

   public bns() {
      new Rect();
   }

   private final int e(int var1, int var2) {
      bsq var7 = this.c;
      Object var6 = null;
      Object var5 = null;
      bsq var4 = var7;
      if (var7 == null) {
         qwp.b("layoutResult");
         var4 = null;
      }

      int var3 = var4.e(var1);
      var7 = this.c;
      var4 = var7;
      if (var7 == null) {
         qwp.b("layoutResult");
         var4 = null;
      }

      if (var2 != var4.h(var3)) {
         var4 = this.c;
         if (var4 == null) {
            qwp.b("layoutResult");
            var4 = (bsq)var5;
         }

         var1 = var4.e(var1);
      } else {
         var4 = this.c;
         if (var4 == null) {
            qwp.b("layoutResult");
            var4 = (bsq)var6;
         }

         var1 = bsq.i(var4, var1) - 1;
      }

      return var1;
   }

   public final int[] c(int var1) {
      int var3 = this.a().length();
      Object var8 = null;
      Object var7 = null;
      if (var3 <= 0) {
         return null;
      } else if (var1 < this.a().length()) {
         bro var6;
         boolean var10001;
         try {
            var6 = this.d;
         } catch (IllegalStateException var12) {
            var10001 = false;
            return null;
         }

         bro var5 = var6;
         if (var6 == null) {
            try {
               qwp.b("node");
            } catch (IllegalStateException var11) {
               var10001 = false;
               return null;
            }

            var5 = null;
         }

         int var4;
         try {
            var4 = qxg.e(var5.b().a());
         } catch (IllegalStateException var10) {
            var10001 = false;
            return null;
         }

         var3 = qxb.k(0, var1);
         bsq var14 = this.c;
         bsq var13 = var14;
         if (var14 == null) {
            qwp.b("layoutResult");
            var13 = null;
         }

         var1 = var13.c(var3);
         var14 = this.c;
         var13 = var14;
         if (var14 == null) {
            qwp.b("layoutResult");
            var13 = null;
         }

         float var2 = var13.a(var1) + (float)var4;
         var14 = this.c;
         var13 = var14;
         if (var14 == null) {
            qwp.b("layoutResult");
            var13 = null;
         }

         bsq var9 = this.c;
         var14 = var9;
         if (var9 == null) {
            qwp.b("layoutResult");
            var14 = null;
         }

         if (var2 < var13.a(var14.b() - 1)) {
            var13 = this.c;
            if (var13 == null) {
               qwp.b("layoutResult");
               var13 = (bsq)var7;
            }

            var1 = var13.d(var2) - 1;
         } else {
            var13 = this.c;
            if (var13 == null) {
               qwp.b("layoutResult");
               var13 = (bsq)var8;
            }

            var1 = var13.b() - 1;
         }

         return this.b(var3, this.e(var1, 1) + 1);
      } else {
         return null;
      }
   }

   public final int[] d(int var1) {
      int var3 = this.a().length();
      Object var7 = null;
      if (var3 <= 0) {
         return null;
      } else if (var1 > 0) {
         boolean var10001;
         bro var8;
         try {
            var8 = this.d;
         } catch (IllegalStateException var11) {
            var10001 = false;
            return null;
         }

         bro var6 = var8;
         if (var8 == null) {
            try {
               qwp.b("node");
            } catch (IllegalStateException var10) {
               var10001 = false;
               return null;
            }

            var6 = null;
         }

         try {
            var3 = qxg.e(var6.b().a());
         } catch (IllegalStateException var9) {
            var10001 = false;
            return null;
         }

         int var4 = qxb.l(this.a().length(), var1);
         bsq var13 = this.c;
         bsq var12 = var13;
         if (var13 == null) {
            qwp.b("layoutResult");
            var12 = null;
         }

         int var5 = var12.c(var4);
         var13 = this.c;
         var12 = var13;
         if (var13 == null) {
            qwp.b("layoutResult");
            var12 = null;
         }

         float var2 = var12.a(var5) - (float)var3;
         if (var2 > 0.0F) {
            var12 = this.c;
            if (var12 == null) {
               qwp.b("layoutResult");
               var12 = (bsq)var7;
            }

            var1 = var12.d(var2);
         } else {
            var1 = 0;
         }

         var3 = var1;
         if (var4 == this.a().length()) {
            var3 = var1;
            if (var1 < var5) {
               var3 = var1 + 1;
            }
         }

         return this.b(this.e(var3, 2), var4);
      } else {
         return null;
      }
   }
}
