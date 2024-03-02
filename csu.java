import android.graphics.PointF;
import android.util.Property;

final class csu extends Property {
   public csu(Class var1) {
      super(var1, "bottomRight");
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      cta var4 = (cta)var1;
      PointF var5 = (PointF)var2;
      var4.c = Math.round(var5.x);
      var4.d = Math.round(var5.y);
      int var3 = var4.f + 1;
      var4.f = var3;
      if (var4.e == var3) {
         var4.a();
      }

   }
}
