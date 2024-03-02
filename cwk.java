import android.util.Log;

// $FF: synthetic class
public final class cwk implements lvw {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public cwk(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void c(Exception var1) {
      int var2;
      Object var3;
      switch(this.b) {
      case 0:
         ((ddb)this.a).c(var1);
         return;
      case 1:
         ((ddb)this.a).c(var1);
         return;
      case 2:
         var3 = this.a;
         ((pdq)((pdq)eqr.a.b().h(var1)).I(377)).t("Scheduling training failed for population: %s", var3);
         return;
      case 3:
         var3 = this.a;
         nx.e("Failed to get app update info", 'ᇞ', kud.a.c(), var1);
         ((kud)var3).b.f();
         return;
      case 4:
         Object var4 = this.a;
         ((pdq)kyr.a.c().I(4643)).q("Wearable api is not available");
         kyr var5 = (kyr)var4;
         var5.v = false;
         var5.x = false;
         return;
      case 5:
         var3 = this.a;
         var2 = mzm.a;
         Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", var3, var1));
         return;
      default:
         var3 = this.a;
         var2 = mzm.a;
         Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", var3, var1));
      }
   }
}
