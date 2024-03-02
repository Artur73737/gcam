import android.text.TextUtils;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;
import org.brotli.wrapper.dec.Hm.CLzmcq;

public final class com {
   public static HashMap a;
   public static final String[] b;
   private static final String[] c;

   static {
      Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
      Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
      Pattern.compile("%([A-Fa-f0-9]{2})");
      Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
      c = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", TRoaEYDrhZZT.FEPSZRlHat, "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", DzzpnVggahPIX.hKFkMKxJnzOgDbe, "hbs-bos", zBdGS.Gqs, "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
      b = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", CLzmcq.qruQXi, "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
   }

   public static HashMap a() {
      String[] var4 = Locale.getISOLanguages();
      int var2 = var4.length;
      int var0 = c.length;
      HashMap var3 = new HashMap(var2 + 88);
      byte var1 = 0;

      for(var0 = 0; var0 < var2; ++var0) {
         String var5 = var4[var0];

         try {
            Locale var6 = new Locale(var5);
            String var9 = var6.getISO3Language();
            if (!TextUtils.isEmpty(var9)) {
               var3.put(var9, var5);
            }
         } catch (MissingResourceException var7) {
         }
      }

      var0 = var1;

      while(true) {
         var4 = c;
         int var8 = var4.length;
         if (var0 >= 88) {
            return var3;
         }

         var3.put(var4[var0], var4[var0 + 1]);
         var0 += 2;
      }
   }

   public static byte[] b(String var0) {
      return var0.getBytes(otn.a);
   }

   public static byte[] c(int... var0) {
      byte[] var6 = new byte[36];
      int var2 = 0;

      for(int var3 = 0; var2 < 9; ++var2) {
         int var4 = var0[var2];
         byte[] var5 = new byte[4];
         byte var1 = (byte)(var4 >> 24);
         var5[0] = var1;
         var5[1] = (byte)(var4 >> 16);
         var5[2] = (byte)(var4 >> 8);
         var5[3] = (byte)var4;
         var4 = var3 + 1;
         var6[var3] = var1;
         var6[var4] = var5[1];
         var3 = var4 + 1;
         var6[var3] = var5[2];
         ++var3;
         var6[var3] = var5[3];
         ++var3;
      }

      return var6;
   }

   public static void d(int var0) {
      Integer.toString(var0, 36);
   }
}
