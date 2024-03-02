import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class crs implements crw {
   public final Set a = new LinkedHashSet();

   public crs(crx var1) {
      var1.b("androidx.savedstate.Restarter", this);
   }

   public final Bundle a() {
      Bundle var1 = new Bundle();
      var1.putStringArrayList("classes_to_restore", new ArrayList(this.a));
      return var1;
   }
}
