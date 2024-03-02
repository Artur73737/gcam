import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Executor;

public final class cnz extends coa {
   public volatile cny a;
   public volatile cny b;
   public List c;
   private Executor k;

   public cnz(Context var1) {
      super(var1.getApplicationContext());
   }

   public final void a() {
      if (this.b == null && this.a != null) {
         boolean var2 = this.a.a;
         if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
         }

         cny var3 = this.a;
         Executor var4 = this.k;
         if (var3.f != 1) {
            int var1 = var3.f;
            if (var1 != 0) {
               switch(var1 - 1) {
               case 1:
                  throw new IllegalStateException("Cannot execute task: the task is already running.");
               case 2:
                  throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
               default:
                  throw new IllegalStateException("We should never reach this state");
               }
            } else {
               throw null;
            }
         } else {
            var3.f = 2;
            var4.execute(var3.c);
         }
      }
   }

   public final void b(List var1) {
      this.c = var1;
      cnu var3 = super.j;
      if (var3 != null) {
         if (cnt.b(2)) {
            StringBuilder var2 = new StringBuilder();
            var2.append("onLoadComplete: ");
            var2.append(var3);
         }

         if (Looper.myLooper() == Looper.getMainLooper()) {
            var3.h(var1);
            return;
         }

         var3.i(var1);
      }

   }

   final void c(cny var1) {
      if (this.b == var1) {
         SystemClock.uptimeMillis();
         this.b = null;
         this.a();
      }

   }

   public final void d() {
      if (this.a != null) {
         if (!super.f) {
            super.i = true;
         }

         boolean var1;
         if (this.b != null) {
            var1 = this.a.a;
            this.a = null;
            return;
         }

         var1 = this.a.a;
         cny var2 = this.a;
         var2.d.set(true);
         if (var2.c.cancel(false)) {
            this.b = this.a;
         }

         this.a = null;
      }

   }
}
