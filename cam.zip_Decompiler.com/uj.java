import com.google.android.apps.camera.gesturecapture.ui.UB.oBLUVToV;
import java.util.List;

public final class uj extends kf {
   public final vd a;
   public final List b;
   public final qvt c;
   private final wk d;

   public uj(vd var1, List var2, wk var3, qvt var4) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof uj)) {
         return false;
      } else {
         uj var2 = (uj)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else if (!c.E(this.b, var2.b)) {
            return false;
         } else if (!c.E(this.d, var2.d)) {
            return false;
         } else {
            return c.E(this.c, var2.c);
         }
      }
   }

   public final int hashCode() {
      return ((this.a.hashCode() * 31 + 1) * 31 + this.d.hashCode()) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("RequestOpen(virtualCamera=");
      var1.append(this.a);
      var1.append(", sharedCameraIds=");
      var1.append(this.b);
      var1.append(oBLUVToV.OrSVXlzSwyyDFUE);
      var1.append(this.d);
      var1.append(", isForegroundObserver=");
      var1.append(this.c);
      var1.append(')');
      return var1.toString();
   }
}
