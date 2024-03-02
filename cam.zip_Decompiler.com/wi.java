import java.util.List;

@qus(
   b = "androidx.camera.camera2.pipe.graph.GraphProcessorImpl$submit$1$1",
   c = "GraphProcessor.kt",
   d = "invokeSuspend",
   e = {}
)
public final class wi extends quw implements qvx {
   final wk a;
   final List b;

   public wi(wk var1, List var2, que var3) {
      super(2, var3);
      this.a = var1;
      this.b = var2;
   }

   public final Object b(Object var1) {
      qul var2 = qul.a;
      pwm.bs(var1);
      this.a.a(this.b);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      return new wi(this.a, this.b, var2);
   }
}
