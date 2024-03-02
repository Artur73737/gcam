import java.util.concurrent.Callable;

@qus(
   b = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1",
   c = "CoroutinesRoom.kt",
   d = "invokeSuspend",
   e = {}
)
public final class cqu extends quw implements qvx {
   final Callable a;
   final qza b;

   public cqu(Callable var1, qza var2, que var3) {
      super(2, var3);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);

      try {
         var1 = this.a.call();
         this.b.gP(var1);
      } catch (Throwable var4) {
         this.b.gP(pwm.br(var4));
         return qsn.a;
      }

      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new cqu(this.a, this.b, var2);
   }
}
