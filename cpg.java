import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cpg extends Preference {
   private long a;

   public cpg(Context var1, List var2, long var3) {
      super(var1);
      super.A = 2131624029;
      this.L(2131231203);
      this.S(2132017511);
      this.P(999);
      ArrayList var6 = new ArrayList();
      Iterator var7 = var2.iterator();
      Object var9 = null;

      while(var7.hasNext()) {
         Preference var8 = (Preference)var7.next();
         CharSequence var10 = var8.q;
         boolean var5 = var8 instanceof PreferenceGroup;
         if (var5 && !TextUtils.isEmpty(var10)) {
            var6.add((PreferenceGroup)var8);
         }

         if (var6.contains(var8.C)) {
            if (var5) {
               var6.add((PreferenceGroup)var8);
            }
         } else if (!TextUtils.isEmpty(var10)) {
            if (var9 == null) {
               var9 = var10;
            } else {
               var9 = super.j.getString(2132018516, new Object[]{var9, var10});
            }
         }
      }

      this.n((CharSequence)var9);
      this.a = var3 + 1000000L;
   }

   public final void a(cqj var1) {
      super.a(var1);
      var1.u = false;
   }

   public final long eP() {
      return this.a;
   }
}
