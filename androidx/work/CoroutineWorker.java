package androidx.work;

import android.content.Context;
import java.util.concurrent.Executor;

public abstract class CoroutineWorker extends .dad {
   public final .rbg a;
   public final .dhf b;
   private final .qzr h;

   public CoroutineWorker(Context var1, WorkerParameters var2) {
      var1.getClass();
      var2.getClass();
      super(var1, var2);
      this.a = .qzy.w();
      .dhf var3 = .dhf.g();
      this.b = var3;
      var3.c(new .czc(this, 2), (Executor)super.d.f.d);
      this.h = .rah.a;
   }

   public final .psd a() {
      .qwo.o(.qzy.h(this.h.plus(this.a)), (.qui)null, 0, new .czu(this, (.que)null), 3);
      return this.b;
   }

   public abstract Object b(.que var1);

   public final void c() {
      this.b.cancel(false);
   }
}
