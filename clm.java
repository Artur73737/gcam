public final class clm implements cma {
   private final cll a;
   private final cma b;

   public clm(cll var1, cma var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void ej(cmc var1, clv var2) {
      switch(var2.ordinal()) {
      case 0:
         this.a.onCreate(var1);
         break;
      case 1:
         this.a.onStart(var1);
         break;
      case 2:
         this.a.onResume(var1);
         break;
      case 3:
         this.a.onPause(var1);
         break;
      case 4:
         this.a.onStop(var1);
         break;
      case 5:
         this.a.onDestroy(var1);
         break;
      case 6:
         throw new IllegalArgumentException("ON_ANY must not been send by anybody");
      }

      cma var3 = this.b;
      if (var3 != null) {
         var3.ej(var1, var2);
      }

   }
}
