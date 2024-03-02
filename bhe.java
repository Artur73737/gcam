import java.util.concurrent.CancellationException;

final class bhe extends CancellationException {
   public static final bhe a = new bhe();

   private bhe() {
   }

   public final Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
