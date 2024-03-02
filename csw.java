import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class csw extends Property {
   public csw(Class var1) {
      super(var1, "topLeft");
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      View var8 = (View)var1;
      PointF var9 = (PointF)var2;
      int var7 = Math.round(var9.x);
      int var3 = Math.round(var9.y);
      int var4 = var8.getRight();
      int var5 = var8.getBottom();
      int var6 = cug.b;
      var8.setLeftTopRightBottom(var7, var3, var4, var5);
   }
}
