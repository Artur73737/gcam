import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class csx extends Property {
   public csx(Class var1) {
      super(var1, "position");
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      View var8 = (View)var1;
      PointF var9 = (PointF)var2;
      int var6 = Math.round(var9.x);
      int var3 = Math.round(var9.y);
      int var7 = var8.getWidth();
      int var4 = var8.getHeight();
      int var5 = cug.b;
      var8.setLeftTopRightBottom(var6, var3, var7 + var6, var4 + var3);
   }
}
