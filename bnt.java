public final class bnt extends bnp {
   public static bnt b;

   private final boolean e(int var1) {
      boolean var2 = false;
      if (var1 > 0 && this.a().charAt(var1 - 1) != '\n') {
         if (var1 != this.a().length()) {
            if (this.a().charAt(var1) == '\n') {
               return true;
            }
         } else {
            var2 = true;
         }
      }

      return var2;
   }

   private final boolean f(int var1) {
      char var2 = this.a().charAt(var1);
      boolean var3 = false;
      if (var2 != '\n') {
         if (var1 != 0) {
            if (this.a().charAt(var1 - 1) == '\n') {
               return true;
            }
         } else {
            var3 = true;
         }
      }

      return var3;
   }

   public final int[] c(int var1) {
      int var3 = this.a().length();
      if (var3 <= 0) {
         return null;
      } else if (var1 >= var3) {
         return null;
      } else {
         int var2 = var1;
         if (var1 < 0) {
            var2 = 0;
         }

         while(var2 < var3 && this.a().charAt(var2) == '\n' && !this.f(var2)) {
            ++var2;
         }

         if (var2 >= var3) {
            return null;
         } else {
            for(var1 = var2 + 1; var1 < var3 && !this.e(var1); ++var1) {
            }

            return this.b(var2, var1);
         }
      }
   }

   public final int[] d(int var1) {
      int var3 = this.a().length();
      if (var3 <= 0) {
         return null;
      } else if (var1 <= 0) {
         return null;
      } else {
         int var2 = var1;
         if (var1 > var3) {
            var2 = var3;
         }

         while(var2 > 0) {
            String var4 = this.a();
            var1 = var2 - 1;
            if (var4.charAt(var1) != '\n' || this.e(var2)) {
               break;
            }

            var2 = var1;
         }

         if (var2 <= 0) {
            return null;
         } else {
            for(var1 = var2 - 1; var1 > 0 && !this.f(var1); --var1) {
            }

            return this.b(var1, var2);
         }
      }
   }
}
