import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.view.translation.ViewTranslationRequest.Builder;
import java.util.List;
import java.util.function.Consumer;

final class boi {
   public static final boi a = new boi();

   private boi() {
   }

   public final void a(bol var1, long[] var2, int[] var3, Consumer var4) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var4.getClass();

      for(int var5 = 0; var5 < var2.length; ++var5) {
         int var6 = (int)var2[var5];
         bpe var9 = (bpe)var1.s().get(var6);
         if (var9 != null) {
            Object var7 = var9.b;
            AutofillId var10 = var1.b.getAutofillId();
            bro var8 = (bro)var7;
            Builder var14 = new Builder(var10, (long)var8.e);
            bry var11 = (bry)la.l(var8.c, brp.t);
            if (var11 == null) {
               List var12 = (List)la.l(var8.c, brp.s);
               String var13;
               if (var12 != null) {
                  var13 = ei.f(var12, "\n");
               } else {
                  var13 = null;
               }

               if (var13 == null) {
                  continue;
               }

               var11 = new bry(var13);
            }

            var14.setValue("android:text", TranslationRequestValue.forText(var11));
            var4.accept(var14.build());
         }
      }

   }

   public final void b(bol var1, LongSparseArray var2) {
      var1.getClass();
      var2.getClass();
      qtk var6 = new qtk(var2);

      while(var6.hasNext()) {
         long var4 = var6.a();
         ViewTranslationResponse var7 = (ViewTranslationResponse)var2.get(var4);
         if (var7 != null) {
            TranslationResponseValue var9 = var7.getValue("android:text");
            if (var9 != null) {
               CharSequence var10 = var9.getText();
               if (var10 != null) {
                  int var3 = (int)var4;
                  bpe var8 = (bpe)var1.s().get(var3);
                  if (var8 != null) {
                     brc var12 = (brc)la.l(((bro)var8.b).c, brk.i);
                     if (var12 != null) {
                        Boolean var11 = (Boolean)((qvt)var12.a).eo(new bry(var10.toString()));
                     }
                  }
               }
            }
         }
      }

   }
}
