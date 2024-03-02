import android.view.View;
import android.view.WindowId;

final class cul {
   private final WindowId a;

   public cul(View var1) {
      this.a = var1.getWindowId();
   }

   public final boolean equals(Object var1) {
      return var1 instanceof cul && ((cul)var1).a.equals(this.a);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }
}
