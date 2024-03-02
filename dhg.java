import java.util.concurrent.Executor;

enum dhg implements Executor {
   a;

   private static final dhg[] b;

   static {
      dhg var0 = new dhg();
      a = var0;
      b = new dhg[]{var0};
   }

   public final void execute(Runnable var1) {
      var1.run();
   }

   public final String toString() {
      return "DirectExecutor";
   }
}
