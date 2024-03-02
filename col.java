import android.text.TextUtils;
import android.util.Log;

public final class col {
   private static final Object a = new Object();

   public static void a(String var0, String var1) {
      Object var2 = a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (TextUtils.isEmpty((CharSequence)null)) {
               Log.w(var0, var1);
               return;
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label116:
         try {
            throw null;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label116;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }
}
