import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import java.text.BreakIterator;
import java.util.Locale;

public final class btc {
   public btc() {
   }

   public btc(Locale var1, CharSequence var2) {
      int var3 = var2.length();
      if (var2.length() >= 0) {
         if (var3 >= 0 && var3 <= var2.length()) {
            BreakIterator var4 = BreakIterator.getWordInstance(var1);
            var4.getClass();
            Math.max(0, -50);
            Math.min(var2.length(), var3 + 50);
            var4.setText(new bsw(var2, var3));
         } else {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
         }
      } else {
         throw new IllegalArgumentException("input start index is outside the CharSequence");
      }
   }

   public static final Typeface b(Typeface var0, bvb var1, Context var2) {
      ThreadLocal var3 = bvj.a;
      Typeface var5;
      if (var0 == null) {
         var5 = null;
      } else {
         var5 = var0;
         if (!var1.a.isEmpty()) {
            Paint var4 = (Paint)bvj.a.get();
            Paint var6 = var4;
            if (var4 == null) {
               var6 = new Paint();
               bvj.a.set(var6);
            }

            var6.setTypeface(var0);
            car.ad(var2);
            var6.setFontVariationSettings(lb.g(var1.a, (CharSequence)null, new bwb(1), 31));
            var5 = var6.getTypeface();
         }
      }

      return var5;
   }

   public static final Typeface c(String var0, bvc var1, int var2) {
      Typeface var3;
      if (!c.n(var2, 0) || !c.E(var1, bvc.l) || var0 != null && var0.length() != 0) {
         if (var0 == null) {
            var3 = Typeface.DEFAULT;
         } else {
            var3 = Typeface.create(var0, 0);
         }

         var3 = Typeface.create(var3, var1.p, c.n(var2, 1));
         var3.getClass();
         return var3;
      } else {
         var3 = Typeface.DEFAULT;
         var3.getClass();
         return var3;
      }
   }

   public StaticLayout a(bth var1) {
      var1.getClass();
      Builder var2 = Builder.obtain(var1.a, 0, var1.b, var1.c, var1.d);
      var2.setTextDirection(var1.e);
      var2.setAlignment(var1.f);
      var2.setMaxLines(var1.g);
      var2.setEllipsize(var1.h);
      var2.setEllipsizedWidth(var1.i);
      var2.setLineSpacing(0.0F, 1.0F);
      var2.setIncludePad(false);
      var2.setBreakStrategy(var1.k);
      var2.setHyphenationFrequency(var1.n);
      var2.setIndents((int[])null, (int[])null);
      var2.getClass();
      btd.a(var2, var1.j);
      var2.getClass();
      bte.a(var2, true);
      var2.getClass();
      btf.a(var2, var1.l, var1.m);
      StaticLayout var3 = var2.build();
      var3.getClass();
      return var3;
   }
}
