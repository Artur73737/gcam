import java.util.concurrent.Callable;

@qus(
   b = "androidx.room.CoroutinesRoom$Companion$execute$2",
   c = "CoroutinesRoom.kt",
   d = "invokeSuspend",
   e = {}
)
public final class cqt extends quw implements qvx {
   final Callable a;

   public cqt(Callable var1, que var2) {
      super(2, var2);
      this.a = var1;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      return this.a.call();
   }

   public final que c(Object var1, que var2) {
      return new cqt(this.a, var2);
   }
}
