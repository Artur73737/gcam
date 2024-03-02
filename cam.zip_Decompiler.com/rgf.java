import com.google.geo.lightfield.processing.vc.ejXS;
import java.util.concurrent.CancellationException;

public final class rgf extends CancellationException {
   public final transient ref a;

   public rgf(ref var1) {
      var1.getClass();
      super(ejXS.vJnsyOoT);
      this.a = var1;
   }

   public final Throwable fillInStackTrace() {
      if (qzx.a) {
         return super.fillInStackTrace();
      } else {
         this.setStackTrace(new StackTraceElement[0]);
         return this;
      }
   }
}
