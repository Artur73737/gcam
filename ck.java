import android.util.Log;

final class ck implements pi {
   final cp a;
   private final int b;

   public ck(cp var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final void a(Object var1) {
      int var2;
      cm var4;
      StringBuilder var6;
      bv var9;
      switch(this.b) {
      case 0:
         ph var3 = (ph)var1;
         var4 = (cm)this.a.p.pollFirst();
         if (var4 == null) {
            var6 = new StringBuilder();
            var6.append("No IntentSenders were started for ");
            var6.append(this);
            Log.w("FragmentManager", "No IntentSenders were started for ".concat(this.toString()));
            return;
         } else {
            String var5 = var4.a;
            var2 = var4.b;
            var9 = this.a.a.c(var5);
            if (var9 == null) {
               Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(var5)));
               return;
            }

            var9.onActivityResult(var2, var3.a, var3.b);
            return;
         }
      default:
         ph var7 = (ph)var1;
         var4 = (cm)this.a.p.pollLast();
         if (var4 == null) {
            var6 = new StringBuilder();
            var6.append("No Activities were started for result for ");
            var6.append(this);
            Log.w("FragmentManager", "No Activities were started for result for ".concat(this.toString()));
         } else {
            String var8 = var4.a;
            var2 = var4.b;
            var9 = this.a.a.c(var8);
            if (var9 == null) {
               Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(var8)));
            } else {
               var9.onActivityResult(var2, var7.a, var7.b);
            }
         }
      }
   }
}
