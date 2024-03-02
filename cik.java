import android.content.Context;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.EdgeEffect;
import android.widget.TextView;

public final class cik {
   public static float a(EdgeEffect var0) {
      try {
         float var1 = var0.getDistance();
         return var1;
      } finally {
         ;
      }
   }

   public static float b(EdgeEffect var0, float var1, float var2) {
      try {
         float var3 = var0.onPullDistance(var1, var2);
         return var3;
      } finally {
         var0.onPull(var1, var2);
         return 0.0F;
      }
   }

   public static EdgeEffect c(Context var0, AttributeSet var1) {
      try {
         EdgeEffect var4 = new EdgeEffect(var0, var1);
         return var4;
      } finally {
         return new EdgeEffect(var0);
      }
   }

   public static void d(TextView var0, int var1) {
      cby.f(var1);
      int var2 = var0.getPaint().getFontMetricsInt((FontMetricsInt)null);
      if (var1 != var2) {
         var0.setLineSpacing((float)(var1 - var2), 1.0F);
      }

   }

   public static void e(TextView var0, Drawable var1, Drawable var2, Drawable var3) {
      cit.d(var0, var1, var2, var3, (Drawable)null);
   }

   public static void f(Callback var0) {
      if (var0 instanceof ciw) {
         ciw var1 = (ciw)var0;
         throw null;
      }
   }
}
