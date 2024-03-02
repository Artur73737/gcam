import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

public final class btl {
   public static final btj a = new btj();
   public static final long b = a(0, 0);

   public static final long a(int var0, int var1) {
      long var2 = (long)var0;
      return (long)var1 & 4294967295L | var2 << 32;
   }

   public static final TextDirectionHeuristic b(int var0) {
      TextDirectionHeuristic var1;
      switch(var0) {
      case 0:
         var1 = TextDirectionHeuristics.LTR;
         var1.getClass();
         break;
      case 1:
         var1 = TextDirectionHeuristics.RTL;
         var1.getClass();
         break;
      case 2:
         var1 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
         var1.getClass();
         break;
      default:
         var1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
         var1.getClass();
      }

      return var1;
   }

   public static final boolean c(Layout var0, int var1) {
      return var0.getEllipsisCount(var1) > 0;
   }
}
