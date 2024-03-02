import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public final class bwp {
   public static final bwp a = new bwp();

   private bwp() {
   }

   public final Object a(bwe var1) {
      var1.getClass();
      ArrayList var2 = new ArrayList(pwm.aL(var1));
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         var2.add(btf.o((bwd)var3.next()));
      }

      Locale[] var4 = (Locale[])var2.toArray(new Locale[0]);
      return new LocaleSpan(new LocaleList((Locale[])Arrays.copyOf(var4, var4.length)));
   }

   public final void b(bwk var1, bwe var2) {
      var1.getClass();
      var2.getClass();
      ArrayList var3 = new ArrayList(pwm.aL(var2));
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         var3.add(btf.o((bwd)var4.next()));
      }

      Locale[] var5 = (Locale[])var3.toArray(new Locale[0]);
      var1.setTextLocales(new LocaleList((Locale[])Arrays.copyOf(var5, var5.length)));
   }
}
