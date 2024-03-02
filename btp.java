import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

public final class btp implements LeadingMarginSpan {
   public final void drawLeadingMargin(Canvas var1, Paint var2, int var3, int var4, int var5, int var6, int var7, CharSequence var8, int var9, int var10, boolean var11, Layout var12) {
      if (var12 != null && var2 != null) {
         var3 = var12.getLineForOffset(var9);
         if (var3 == var12.getLineCount() - 1 && btl.c(var12, var3)) {
            float var13 = btd.b(var12, var3, var2) + btd.c(var12, var3, var2);
            if (var13 != 0.0F) {
               var1.getClass();
               var1.translate(var13, 0.0F);
               return;
            }
         }
      }

   }

   public final int getLeadingMargin(boolean var1) {
      return 0;
   }
}
