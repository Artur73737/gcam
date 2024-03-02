import android.util.DisplayMetrics;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.Collection;

// $FF: synthetic class
public final class cxr implements Consumer {
   public final cxt a;
   public final rdo b;

   // $FF: synthetic method
   public cxr(cxt var1, rdo var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void accept(Object var1) {
      cxt var3 = this.a;
      rdo var4 = this.b;
      ExtensionWindowAreaStatus var5 = (ExtensionWindowAreaStatus)var1;
      var5.getClass();
      int var2 = cxt.g;
      var3.e = AmbientModeSupport$AmbientCallback.a(var5.getWindowAreaStatus());
      DisplayMetrics var6 = var5.getWindowAreaDisplayMetrics();
      var6.getClass();
      cyx var7 = cyy.a(var6);
      var3.d(cxj.b, var3.e, var7);
      rdu var8 = var4.P();
      Collection var9 = var3.f.values();
      var9.getClass();
      var8.u(pwm.aD(var9));
   }
}
