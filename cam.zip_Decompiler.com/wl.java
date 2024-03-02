import androidx.wear.ambient.AmbientMode.AmbientController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class wl {
   public final List a;
   public final te b;
   private final int c;
   private final qyn d;
   private final AmbientController e;

   public wl(te var1) {
      this.b = var1;
      this.c = wm.a.b();
      this.d = qwp.f(false);
      this.a = new ArrayList();
      this.e = new AmbientController(this);
   }

   public final void a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Closing ");
      var1.append(this);
      if (this.d.b()) {
         this.b.a();
      }

   }

   public final boolean b(boolean param1, List param2, Map param3, Map param4, List param5) {
      // $FF: Couldn't be decompiled
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("GraphRequestProcessor-");
      var1.append(this.c);
      return var1.toString();
   }
}
