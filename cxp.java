import android.app.Activity;
import java.util.concurrent.Executor;

@qus(
   b = "androidx.window.area.WindowAreaControllerImpl$transferActivityToWindowArea$2",
   c = "WindowAreaControllerImpl.kt",
   d = "invokeSuspend",
   e = {222}
)
final class cxp extends quw implements qvx {
   int a;
   final cxt b;
   final Activity c;
   final Executor d;
   final cxx e;

   public cxp(cxt var1, Activity var2, Executor var3, cxx var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ree var3 = this.b.a();
         this.a = 1;
         if (qwl.i(var3, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      this.b.c(this.c, this.d, this.e);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new cxp(this.b, this.c, this.d, this.e, var2);
   }
}
