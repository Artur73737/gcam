import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class csv extends Property {
   public csv(Class var1) {
      super(var1, "bottomRight");
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      View var8 = (View)var1;
      PointF var9 = (PointF)var2;
      int var7 = var8.getLeft();
      int var4 = var8.getTop();
      int var5 = Math.round(var9.x);
      int var3 = Math.round(var9.y);
      int var6 = cug.b;
      var8.setLeftTopRightBottom(var7, var4, var5, var3);
   }
}
