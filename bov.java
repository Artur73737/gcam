import android.view.Choreographer;

@qus(
   b = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1",
   c = "AndroidUiDispatcher.android.kt",
   d = "invokeSuspend",
   e = {}
)
final class bov extends quw implements qvx {
   public bov(que var1) {
      super(2, var1);
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      return Choreographer.getInstance();
   }

   public final que c(Object var1, que var2) {
      return new bov(var2);
   }
}
