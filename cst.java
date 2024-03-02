import android.graphics.PointF;
import android.util.Property;

final class cst extends Property {
   public cst(Class var1) {
      super(var1, "topLeft");
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      cta var4 = (cta)var1;
      PointF var5 = (PointF)var2;
      var4.a = Math.round(var5.x);
      var4.b = Math.round(var5.y);
      int var3 = var4.e + 1;
      var4.e = var3;
      if (var3 == var4.f) {
         var4.a();
      }

   }
}
