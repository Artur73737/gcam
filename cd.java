import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class cd extends ca {
   public final Activity b;
   public final Context c;
   public final Handler d;
   public final cp e = new cp();

   public cd(Activity var1, Context var2, Handler var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public View a(int var1) {
      throw null;
   }

   public boolean b() {
      throw null;
   }

   public void e() {
      throw null;
   }

   public final void h(Intent var1, int var2, Bundle var3) {
      if (var2 == -1) {
         ccf.b(this.c, var1, var3);
      } else {
         throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
      }
   }
}
