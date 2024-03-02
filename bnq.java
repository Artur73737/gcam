import java.text.BreakIterator;
import java.util.Locale;

public final class bnq extends bnp {
   public static bnq b;
   public final BreakIterator c;

   public bnq(Locale var1) {
      BreakIterator var2 = BreakIterator.getCharacterInstance(var1);
      var2.getClass();
      this.c = var2;
   }

   public final int[] c(int var1) {
      int var2 = this.a().length();
      if (var2 <= 0) {
         return null;
      } else if (var1 >= var2) {
         return null;
      } else {
         var2 = var1;
         if (var1 < 0) {
            var2 = 0;
         }

         do {
            if (this.c.isBoundary(var2)) {
               var1 = this.c.following(var2);
               if (var1 == -1) {
                  return null;
               }

               return this.b(var2, var1);
            }

            var1 = this.c.following(var2);
            var2 = var1;
         } while(var1 != -1);

         return null;
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

         do {
            if (this.c.isBoundary(var2)) {
               var1 = this.c.preceding(var2);
               if (var1 == -1) {
                  return null;
               }

               return this.b(var1, var2);
            }

            var1 = this.c.preceding(var2);
            var2 = var1;
         } while(var1 != -1);

         return null;
      }
   }
}
