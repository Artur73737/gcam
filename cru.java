// $FF: synthetic class
public final class cru implements cma {
   public final crx a;

   // $FF: synthetic method
   public cru(crx var1) {
      this.a = var1;
   }

   public final void ej(cmc var1, clv var2) {
      crx var4 = this.a;
      boolean var3;
      if (var2 == clv.ON_START) {
         var3 = true;
      } else {
         if (var2 != clv.ON_STOP) {
            return;
         }

         var3 = false;
      }

      var4.e = var3;
   }
}
