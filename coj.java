import android.text.TextUtils;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class coj {
   private static final ArrayList a = new ArrayList();

   static {
      Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
   }

   public static int a(String var0) {
      boolean var4 = TextUtils.isEmpty(var0);
      byte var2 = -1;
      if (var4) {
         return -1;
      } else if (b(var0)) {
         return 1;
      } else if (c(var0)) {
         return 2;
      } else {
         String var5 = d(var0);
         if (!wAtBWCNpqMjxj.uHBfePi.equals(var5) && !"application/cea-608".equals(var0) && !"application/cea-708".equals(var0) && !"application/x-mp4-cea-608".equals(var0) && !"application/x-subrip".equals(var0) && !"application/ttml+xml".equals(var0) && !"application/x-quicktime-tx3g".equals(var0) && !"application/x-mp4-vtt".equals(var0) && !"application/x-rawcc".equals(var0) && !"application/vobsub".equals(var0) && !"application/pgs".equals(var0) && !"application/dvbsubs".equals(var0)) {
            if ("image".equals(d(var0))) {
               return 4;
            } else if (!"application/id3".equals(var0) && !"application/x-emsg".equals(var0) && !"application/x-scte35".equals(var0)) {
               if ("application/x-camera-motion".equals(var0)) {
                  return 6;
               } else {
                  int var3 = a.size();
                  int var1 = 0;

                  byte var7;
                  while(true) {
                     if (var1 >= var3) {
                        var7 = var2;
                        break;
                     }

                     nbu var6 = (nbu)a.get(var1);
                     Object var8 = var6.b;
                     if (var0.equals((Object)null)) {
                        var1 = var6.a;
                        var7 = 0;
                        break;
                     }

                     ++var1;
                  }

                  return var7;
               }
            } else {
               return 5;
            }
         } else {
            return 3;
         }
      }
   }

   public static boolean b(String var0) {
      return "audio".equals(d(var0));
   }

   public static boolean c(String var0) {
      return "video".equals(d(var0));
   }

   private static String d(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = var0.indexOf(47);
         return var1 == -1 ? null : var0.substring(0, var1);
      }
   }
}
