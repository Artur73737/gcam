@qus(
   b = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1",
   c = "WindowAreaControllerImpl.kt",
   d = "invokeSuspend",
   e = {92}
)
final class cxs extends quw implements qvx {
   int a;
   final cxt b;
   private Object c;

   public cxs(cxt var1, que var2) {
      super(2, var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rdo var6 = (rdo)this.c;
         cxq var5 = new cxq(this.b, var6);
         cxr var3 = new cxr(this.b, var6);
         this.b.b.addRearDisplayStatusListener(var5);
         cxt var4 = this.b;
         if (var4.c > 2) {
            var4.b.addRearDisplayPresentationStatusListener(var3);
         }

         alq var7 = new alq(this.b, var5, var3, 4);
         this.a = 1;
         if (quy.x(var6, var7, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cxs var3 = new cxs(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
