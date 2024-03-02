import android.app.Activity;

@qus(
   b = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2",
   c = "WindowInfoTrackerImpl.kt",
   d = "invokeSuspend",
   e = {63}
)
public final class cyu extends quw implements qvx {
   int a;
   final cyv b;
   final Activity c;
   private Object d;

   public cyu(cyv var1, Activity var2, que var3) {
      super(2, var3);
      this.b = var1;
      this.c = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rdo var4 = (rdo)this.d;
         bw var3 = new bw(var4, 6);
         this.b.a.a(this.c, pw.a, var3);
         us var5 = new us(this.b, var3, 16);
         this.a = 1;
         if (quy.x(var4, var5, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cyu var3 = new cyu(this.b, this.c, var2);
      var3.d = var1;
      return var3;
   }
}
