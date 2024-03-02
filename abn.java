import android.view.KeyEvent;
import android.view.ViewConfiguration;

public final class abn {
   public static final long a = (long)ViewConfiguration.getTapTimeout();

   public static final boolean a(KeyEvent var0) {
      switch((int)(hf.i(var0) >> 32)) {
      case 23:
      case 66:
      case 160:
         return true;
      default:
         return false;
      }
   }
}
