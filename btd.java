import android.graphics.Paint;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import java.util.concurrent.atomic.AtomicReference;

public final class btd {
   public btd() {
      new AtomicReference((Object)null);
   }

   public btd(byte[] var1) {
   }

   public static final void a(Builder var0, int var1) {
      var0.getClass();
      var0.setJustificationMode(var1);
   }

   public static final float b(Layout var0, int var1, Paint var2) {
      float var4 = var0.getLineLeft(var1);
      if (btl.c(var0, var1) && var0.getParagraphDirection(var1) == 1 && var4 < 0.0F) {
         float var3 = var0.getPrimaryHorizontal(var0.getLineStart(var1) + var0.getEllipsisStart(var1)) - var4 + var2.measureText("…");
         Alignment var5 = var0.getParagraphAlignment(var1);
         if (var5 != null && btq.a[var5.ordinal()] == 1) {
            var3 = Math.abs(var4) + ((float)var0.getWidth() - var3) / 2.0F;
         } else {
            var3 = Math.abs(var4) + ((float)var0.getWidth() - var3);
         }

         return var3;
      } else {
         return 0.0F;
      }
   }

   public static final float c(Layout var0, int var1, Paint var2) {
      if (btl.c(var0, var1) && var0.getParagraphDirection(var1) == -1 && (float)var0.getWidth() < var0.getLineRight(var1)) {
         float var3 = var0.getPrimaryHorizontal(var0.getLineStart(var1) + var0.getEllipsisStart(var1));
         var3 = var0.getLineRight(var1) - var3 + var2.measureText("…");
         Alignment var4 = var0.getParagraphAlignment(var1);
         if (var4 != null && btq.a[var4.ordinal()] == 1) {
            var3 = (float)var0.getWidth() - var0.getLineRight(var1) - ((float)var0.getWidth() - var3) / 2.0F;
         } else {
            var3 = (float)var0.getWidth() - var0.getLineRight(var1) - ((float)var0.getWidth() - var3);
         }

         return var3;
      } else {
         return 0.0F;
      }
   }
}
