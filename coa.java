import android.content.Context;
import androidx.window.area.reflectionguard.TU.aGGlrXh;
import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;

public class coa {
   public int d;
   public final Context e;
   public boolean f = false;
   public boolean g = false;
   public boolean h = true;
   public boolean i = false;
   public cnu j;

   public coa(Context var1) {
      this.e = var1.getApplicationContext();
   }

   public static final String e(Object var0) {
      StringBuilder var1 = new StringBuilder(64);
      if (var0 == null) {
         var1.append(aGGlrXh.AVoJRxsMFh);
      } else {
         var1.append(var0.getClass().getSimpleName());
         var1.append("{");
         var1.append(Integer.toHexString(System.identityHashCode(var0)));
         var1.append("}");
      }

      return var1.toString();
   }

   public void d() {
      throw null;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append(this.getClass().getSimpleName());
      var1.append("{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(diyLl.NHcffQZVcbZxaXI);
      var1.append(this.d);
      var1.append(aGGlrXh.tuaiULuPuaGcSzG);
      return var1.toString();
   }
}
