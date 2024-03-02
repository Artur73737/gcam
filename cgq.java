import android.view.View;
import android.view.ViewGroup;

@qus(
   b = "androidx.core.view.ViewGroupKt$descendants$1",
   c = "ViewGroup.kt",
   d = "invokeSuspend",
   e = {119, 121}
)
public final class cgq extends quv implements qvx {
   Object a;
   Object b;
   int c;
   int d;
   int e;
   final ViewGroup f;
   private Object g;

   public cgq(ViewGroup var1, que var2) {
      super(var2);
      this.f = var1;
   }

   public final Object b(Object var1) {
      qul var7 = qul.a;
      int var2;
      int var3;
      qyf var4;
      Object var5;
      cgq var8;
      qyd var11;
      switch(this.e) {
      case 0:
         pwm.bs(var1);
         var4 = (qyf)this.g;
         var5 = this.f;
         var2 = ((ViewGroup)var5).getChildCount();
         var3 = 0;
         var8 = this;
         break;
      case 1:
         var2 = this.d;
         var3 = this.c;
         Object var6 = this.b;
         var5 = this.a;
         var4 = (qyf)this.g;
         pwm.bs(var1);
         var8 = this;
         if (var6 instanceof ViewGroup) {
            var11 = ccc.c((ViewGroup)var6);
            this.g = var4;
            this.a = var5;
            this.b = null;
            this.c = var3;
            this.d = var2;
            this.e = 2;
            if (var4.c(var11, this) == var7) {
               return var7;
            }
         }

         ++var3;
         var5 = var5;
         var4 = var4;
         break;
      default:
         var2 = this.d;
         var3 = this.c;
         Object var9 = this.a;
         qyf var10 = (qyf)this.g;
         pwm.bs(var1);
         var8 = this;
         ++var3;
         var5 = var9;
         var4 = var10;
      }

      while(var3 < var2) {
         View var13 = ((ViewGroup)var5).getChildAt(var3);
         var13.getClass();
         var8.g = var4;
         var8.a = var5;
         var8.b = var13;
         var8.c = var3;
         var8.d = var2;
         var8.e = 1;
         if (var4.a(var13, var8) == var7) {
            return var7;
         }

         if (var13 instanceof ViewGroup) {
            var11 = ccc.c((ViewGroup)var13);
            var8.g = var4;
            var8.a = var5;
            var8.b = null;
            var8.c = var3;
            var8.d = var2;
            var8.e = 2;
            if (var4.c(var11, var8) == var7) {
               return var7;
            }
         }

         ++var3;
         var5 = var5;
         var4 = var4;
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cgq var3 = new cgq(this.f, var2);
      var3.g = var1;
      return var3;
   }
}
