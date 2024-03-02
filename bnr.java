public final class bnr extends bnp {
   public static bnr b;
   public bsq c;

   private final int e(int var1, int var2) {
      bsq var7 = this.c;
      Object var5 = null;
      Object var6 = null;
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
            var4 = (bsq)var6;
         }

         var1 = var4.e(var1);
      } else {
         var4 = this.c;
         if (var4 == null) {
            qwp.b("layoutResult");
            var4 = (bsq)var5;
         }

         var1 = bsq.i(var4, var1) - 1;
      }

      return var1;
   }

   public final int[] c(int var1) {
      if (this.a().length() <= 0) {
         return null;
      } else if (var1 >= this.a().length()) {
         return null;
      } else {
         bsq var3;
         bsq var4;
         if (var1 < 0) {
            var4 = this.c;
            var3 = var4;
            if (var4 == null) {
               qwp.b("layoutResult");
               var3 = null;
            }

            var1 = var3.c(0);
         } else {
            var4 = this.c;
            var3 = var4;
            if (var4 == null) {
               qwp.b("layoutResult");
               var3 = null;
            }

            int var2 = var3.c(var1);
            if (this.e(var2, 2) == var1) {
               var1 = var2;
            } else {
               var1 = var2 + 1;
            }
         }

         var4 = this.c;
         var3 = var4;
         if (var4 == null) {
            qwp.b("layoutResult");
            var3 = null;
         }

         return var1 >= var3.b() ? null : this.b(this.e(var1, 2), this.e(var1, 1) + 1);
      }
   }

   public final int[] d(int var1) {
      if (this.a().length() <= 0) {
         return null;
      } else if (var1 <= 0) {
         return null;
      } else {
         bsq var3;
         bsq var4;
         if (var1 > this.a().length()) {
            var4 = this.c;
            var3 = var4;
            if (var4 == null) {
               qwp.b("layoutResult");
               var3 = null;
            }

            var1 = var3.c(this.a().length());
         } else {
            var4 = this.c;
            var3 = var4;
            if (var4 == null) {
               qwp.b("layoutResult");
               var3 = null;
            }

            int var2 = var3.c(var1);
            if (this.e(var2, 1) + 1 == var1) {
               var1 = var2;
            } else {
               var1 = var2 - 1;
            }
         }

         return var1 < 0 ? null : this.b(this.e(var1, 2), this.e(var1, 1) + 1);
      }
   }
}
