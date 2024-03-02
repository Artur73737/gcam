import android.graphics.Rect;
import android.util.Property;
import android.view.View;

final class cuf extends Property {
   public cuf(Class var1) {
      super(var1, "clipBounds");
   }

   // $FF: synthetic method
   public final Object get(Object var1) {
      return cfz.a((View)var1);
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      cfz.b((View)var1, (Rect)var2);
   }
}
