import android.icu.text.DecimalFormatSymbols;
import android.os.Bundle;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class civ {
   static Params a(TextView var0) {
      return var0.getTextMetricsParams();
   }

   static CharSequence b(PrecomputedText var0) {
      return var0;
   }

   public static void c(TextView var0, int var1) {
      var0.setFirstBaselineToTopHeight(var1);
   }

   static String[] d(DecimalFormatSymbols var0) {
      return var0.getDigitStrings();
   }

   public static final cmx e(Bundle var0, Bundle var1) {
      if (var0 == null) {
         cmx var8;
         if (var1 == null) {
            var8 = new cmx();
         } else {
            HashMap var11 = new HashMap();
            Iterator var12 = var1.keySet().iterator();

            while(var12.hasNext()) {
               String var10 = (String)var12.next();
               var10.getClass();
               var11.put(var10, var1.get(var10));
            }

            var8 = new cmx(var11);
         }

         return var8;
      } else {
         ArrayList var9 = var0.getParcelableArrayList("keys");
         ArrayList var5 = var0.getParcelableArrayList("values");
         if (var9 != null && var5 != null && var9.size() == var5.size()) {
            LinkedHashMap var4 = new LinkedHashMap();
            int var3 = var9.size();

            for(int var2 = 0; var2 < var3; ++var2) {
               Object var7 = var9.get(var2);
               var7.getClass();
               var4.put((String)var7, var5.get(var2));
            }

            return new cmx(var4);
         } else {
            IllegalStateException var6 = new IllegalStateException("Invalid bundle passed as restored state");
            throw var6;
         }
      }
   }
}
