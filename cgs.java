import android.view.View;
import android.view.ViewGroup;

@qus(
   b = "androidx.core.view.ViewKt$allViews$1",
   c = "View.kt",
   d = "invokeSuspend",
   e = {414, 416}
)
public final class cgs extends quv implements qvx {
   int a;
   final View b;
   private Object c;

   public cgs(View var1, que var2) {
      super(var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var3 = qul.a;
      qyf var4;
      View var5;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var4 = (qyf)this.c;
         var5 = this.b;
         this.c = var4;
         this.a = 1;
         if (var4.a(var5, this) == var3) {
            return var3;
         }
         break;
      case 1:
         qyf var2 = (qyf)this.c;
         pwm.bs(var1);
         var4 = var2;
         break;
      default:
         pwm.bs(var1);
         return qsn.a;
      }

      var5 = this.b;
      if (var5 instanceof ViewGroup) {
         qyd var6 = ccc.c((ViewGroup)var5);
         this.c = null;
         this.a = 2;
         if (var4.c(var6, this) == var3) {
            return var3;
         }
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cgs var3 = new cgs(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
