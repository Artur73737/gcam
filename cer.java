import android.os.Process;

public final class cer extends Thread {
   private final int a = 10;

   public cer(Runnable var1) {
      super(var1, "fonts-androidx");
   }

   public final void run() {
      Process.setThreadPriority(this.a);
      super.run();
   }
}
