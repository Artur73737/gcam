import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public final class abh {
   public static final abh a = new abh();

   private abh() {
   }

   public final float a(EdgeEffect var1) {
      var1.getClass();

      float var2;
      try {
         var2 = var1.getDistance();
      } finally {
         ;
      }

      return var2;
   }

   public final float b(EdgeEffect var1, float var2, float var3) {
      var1.getClass();
      boolean var7 = false;

      try {
         var7 = true;
         var1.onPullDistance(var2, var3);
         var7 = false;
      } finally {
         if (var7) {
            var1.onPull(var2, var3);
            var2 = 0.0F;
            return var2;
         }
      }

      return var2;
   }

   public final EdgeEffect c(Context var1, AttributeSet var2) {
      var1.getClass();
      boolean var5 = false;

      EdgeEffect var7;
      try {
         var5 = true;
         EdgeEffect var3 = new EdgeEffect(var1, var2);
         var5 = false;
      } finally {
         if (var5) {
            var7 = new EdgeEffect(var1);
            return var7;
         }
      }

      return var7;
   }
}
