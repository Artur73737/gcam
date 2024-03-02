import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.Iterator;

final class bnz implements ViewTranslationCallback {
   public bnz() {
   }

   public final boolean onClearTranslation(View var1) {
      var1.getClass();
      Iterator var3 = ((boa)var1).g.s().values().iterator();

      while(var3.hasNext()) {
         brl var2 = ((bro)((bpe)var3.next()).b).c;
         if (la.l(var2, brp.u) != null) {
            brc var4 = (brc)la.l(var2, brk.k);
            if (var4 != null) {
               Boolean var5 = (Boolean)((qvi)var4.a).a();
            }
         }
      }

      return true;
   }

   public final boolean onHideTranslation(View var1) {
      var1.getClass();
      Iterator var3 = ((boa)var1).g.s().values().iterator();

      while(var3.hasNext()) {
         brl var2 = ((bro)((bpe)var3.next()).b).c;
         if (c.E(la.l(var2, brp.u), true)) {
            brc var4 = (brc)la.l(var2, brk.j);
            if (var4 != null) {
               Boolean var5 = (Boolean)((qvt)var4.a).eo(false);
            }
         }
      }

      return true;
   }

   public final boolean onShowTranslation(View var1) {
      var1.getClass();
      Iterator var3 = ((boa)var1).g.s().values().iterator();

      while(var3.hasNext()) {
         brl var2 = ((bro)((bpe)var3.next()).b).c;
         if (c.E(la.l(var2, brp.u), false)) {
            brc var4 = (brc)la.l(var2, brk.j);
            if (var4 != null) {
               Boolean var5 = (Boolean)((qvt)var4.a).eo(true);
            }
         }
      }

      return true;
   }
}
