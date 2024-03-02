import android.content.Context;
import android.os.UserManager;

public final class cek {
   public static boolean a(Context var0) {
      return ((UserManager)var0.getSystemService(UserManager.class)).isUserUnlocked();
   }
}
