@qus(
   b = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1",
   c = "CallbackToFlowAdapter.kt",
   d = "invokeSuspend",
   e = {46}
)
public final class cyk extends quw implements qvx {
   int a;
   final ree b;
   final cew c;

   public cyk(ree var1, cew var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var4 = this.b;
         cln var3 = new cln(this.c, 2);
         this.a = 1;
         if (rgl.e((rgl)var4, var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new cyk(this.b, this.c, var2);
   }
}
