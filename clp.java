@qus(
   b = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1",
   c = "FlowExt.kt",
   d = "invokeSuspend",
   e = {91}
)
public final class clp extends quw implements qvx {
   int a;
   final clx b;
   final clw c;
   final ree d;
   private Object e;

   public clp(clx var1, clw var2, ree var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var4 = qul.a;
      rdo var2;
      rdo var7;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var2 = (rdo)this.e;
         clx var6 = this.b;
         clw var5 = this.c;
         clo var3 = new clo(this.d, var2, (que)null);
         this.e = var2;
         this.a = 1;
         if (var5 == clw.b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
         }

         if (var6.b == clw.a) {
            var1 = qsn.a;
         } else {
            Object var8 = qzy.g(new cms(var6, var5, var3, (que)null), this);
            var1 = var8;
            if (var8 != qul.a) {
               var1 = qsn.a;
            }
         }

         if (var1 == var4) {
            return var4;
         }

         var7 = var2;
         break;
      default:
         var2 = (rdo)this.e;
         pwm.bs(var1);
         var7 = var2;
      }

      quy.w(var7);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      clp var3 = new clp(this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
