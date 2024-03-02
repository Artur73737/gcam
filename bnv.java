import java.text.BreakIterator;
import java.util.Locale;

public final class bnv extends bnp {
   public static bnv b;
   public final BreakIterator c;

   public bnv(Locale var1) {
      BreakIterator var2 = BreakIterator.getWordInstance(var1);
      var2.getClass();
      this.c = var2;
   }

   private final boolean e(int var1) {
      boolean var2 = false;
      if (var1 > 0 && this.f(var1 - 1)) {
         if (var1 != this.a().length()) {
            if (!this.f(var1)) {
               return true;
            }
         } else {
            var2 = true;
         }
      }

      return var2;
   }

   private final boolean f(int var1) {
      return var1 >= 0 && var1 < this.a().length() ? Character.isLetterOrDigit(this.a().codePointAt(var1)) : false;
   }

   private final boolean g(int var1) {
      boolean var3 = this.f(var1);
      boolean var2 = false;
      if (var3) {
         if (var1 != 0) {
            if (!this.f(var1 - 1)) {
               return true;
            }
         } else {
            var2 = true;
         }
      }

      return var2;
   }

   public final int[] c(int var1) {
      if (this.a().length() <= 0) {
         return null;
      } else if (var1 >= this.a().length()) {
         return null;
      } else {
         int var2 = var1;
         if (var1 < 0) {
            var2 = 0;
         }

         while(!this.f(var2) && !this.g(var2)) {
            var1 = this.c.following(var2);
            var2 = var1;
            if (var1 == -1) {
               return null;
            }
         }

         var1 = this.c.following(var2);
         return var1 != -1 && this.e(var1) ? this.b(var2, var1) : null;
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

         while(var2 > 0 && !this.f(var2 - 1) && !this.e(var2)) {
            var1 = this.c.preceding(var2);
            var2 = var1;
            if (var1 == -1) {
               return null;
            }
         }

         var1 = this.c.preceding(var2);
         return var1 != -1 && this.g(var1) ? this.b(var1, var2) : null;
      }
   }
}
