package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;

public final class ConstraintTrackingWorker extends .dad implements .dcu {
   public final WorkerParameters a;
   public final Object b;
   public volatile boolean h;
   public .dad i;
   public final .dhf j;

   public ConstraintTrackingWorker(Context var1, WorkerParameters var2) {
      var1.getClass();
      var2.getClass();
      super(var1, var2);
      this.a = var2;
      this.b = new Object();
      this.j = .dhf.g();
   }

   public final .psd a() {
      this.f().execute(new .czc(this, 6));
      return this.j;
   }

   public final void c() {
      .dad var1 = this.i;
      if (var1 != null && !var1.e) {
         if (super.e) {
            var1.g(super.f);
         } else {
            throw new IllegalStateException("getStopReason() can be called only if the worker is stopped (isStopped() returns true)");
         }
      }
   }

   public final void e(.dfb var1, .dbt var2) {
      var2.getClass();
      .dae.a();
      String var3 = .dhi.a;
      StringBuilder var7 = new StringBuilder();
      var7.append("Constraints changed for ");
      var7.append(var1);
      var1.toString();
      if (var2 instanceof .dcs) {
         Object var6 = this.b;
         synchronized(var6){}

         try {
            this.h = true;
         } finally {
            ;
         }

      }
   }
}
