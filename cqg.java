import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public final class cqg {
   public boolean a;
   public PreferenceScreen b;
   public cqa c;
   public cqa d;
   public cqa e;
   private final Context f;
   private long g = 0L;
   private SharedPreferences h;
   private Editor i;
   private final String j;

   public cqg(Context var1) {
      this.f = var1;
      this.j = g(var1);
      this.h = null;
   }

   public static SharedPreferences c(Context var0) {
      return var0.getSharedPreferences(g(var0), 0);
   }

   private static String g(Context var0) {
      return String.valueOf(var0.getPackageName()).concat("_preferences");
   }

   public final long a() {
      // $FF: Couldn't be decompiled
   }

   public final Editor b() {
      if (this.a) {
         if (this.i == null) {
            this.i = this.d().edit();
         }

         return this.i;
      } else {
         return this.d().edit();
      }
   }

   public final SharedPreferences d() {
      if (this.h == null) {
         this.h = this.f.getSharedPreferences(this.j, 0);
      }

      return this.h;
   }

   public final Preference e(CharSequence var1) {
      PreferenceScreen var2 = this.b;
      return var2 == null ? null : var2.l(var1);
   }

   public final void f(boolean var1) {
      if (!var1) {
         Editor var2 = this.i;
         if (var2 != null) {
            var2.apply();
         }
      }

      this.a = var1;
   }
}
