import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class cob extends FutureTask {
   final coc a;

   public cob(coc var1, Callable var2) {
      super(var2);
      this.a = var1;
   }

   protected final void done() {
      label48: {
         InterruptedException var10;
         try {
            try {
               Object var11 = this.get();
               this.a.e(var11);
               return;
            } catch (InterruptedException var6) {
               var10 = var6;
            } catch (ExecutionException var7) {
               ExecutionException var1 = var7;
               throw new RuntimeException("An error occurred while executing doInBackground()", var1.getCause());
            } catch (CancellationException var8) {
               break label48;
            }
         } catch (Throwable var9) {
            throw new RuntimeException("An error occurred while executing doInBackground()", var9);
         }

         Log.w("AsyncTask", var10);
         return;
      }

      this.a.e((Object)null);
   }
}
