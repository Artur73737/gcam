import java.util.ArrayList;

@qus(
   b = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1",
   c = "FloatingActionButton.kt",
   d = "invokeSuspend",
   e = {283}
)
public final class anr extends quw implements qvx {
   int a;
   final yt b;
   final kf c;
   final lmk d;
   private Object e;

   public anr(lmk var1, kf var2, yt var3, que var4) {
      super(2, var4);
      this.d = var1;
      this.c = var2;
      this.b = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         qzv var4 = (qzv)this.e;
         qwz var5 = new qwz();
         qwz var7 = new qwz();
         qwz var6 = new qwz();
         ArrayList var3 = new ArrayList();
         var1 = this.d.a;
         anq var8 = new anq(var3, var6, var5, this.b, var4, var7);
         this.a = 1;
         if (rfl.e((rfl)var1, var8, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      anr var3 = new anr(this.d, this.c, this.b, var2);
      var3.e = var1;
      return var3;
   }
}
