import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.window.area.reflectionguard.TU.aGGlrXh;

public abstract class cff {
   public AmbientMode$AmbientController b;

   public abstract View a();

   public void b(SubMenu var1) {
      throw null;
   }

   public boolean c() {
      throw null;
   }

   public boolean d() {
      throw null;
   }

   public View e(MenuItem var1) {
      return this.a();
   }

   public boolean f() {
      return true;
   }

   public boolean g() {
      return false;
   }

   public void h(AmbientMode$AmbientController var1) {
      if (this.b != null) {
         StringBuilder var2 = new StringBuilder();
         var2.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
         var2.append(this.getClass().getSimpleName());
         var2.append(aGGlrXh.UcSwSzASKimepY);
         Log.w("ActionProvider(support)", var2.toString());
      }

      this.b = var1;
   }
}
