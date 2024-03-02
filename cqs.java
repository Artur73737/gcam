import java.util.concurrent.Callable;

@qus(
   b = "androidx.room.CoroutinesRoom$Companion$createFlow$1",
   c = "CoroutinesRoom.kt",
   d = "invokeSuspend",
   e = {111}
)
public final class cqs extends quw implements qvx {
   int a;
   final crc b;
   final String[] c;
   final Callable d;
   private Object e;

   public cqs(crc var1, String[] var2, Callable var3, que var4) {
      super(2, var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         ref var3 = (ref)this.e;
         cqr var4 = new cqr(this.b, var3, this.c, this.d, (que)null);
         this.a = 1;
         if (qzy.g(var4, this) == var2) {
            return var2;
         }
         break;
      default:
         pwm.bs(var1);
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      cqs var3 = new cqs(this.b, this.c, this.d, var2);
      var3.e = var1;
      return var3;
   }
}
