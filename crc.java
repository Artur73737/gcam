import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.DHwXNavBkqbhR;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public abstract class crc {
   public volatile csa a;
   public Executor b;
   public Executor c;
   public cse d;
   public final cra e = this.a();
   public boolean f;
   public List g;
   public final Map h = new LinkedHashMap();
   public final ThreadLocal i = new ThreadLocal();
   public final Map j;
   public final Map k;
   private final ReentrantReadWriteLock l = new ReentrantReadWriteLock();

   public crc() {
      Map var1 = DesugarCollections.synchronizedMap(new LinkedHashMap());
      var1.getClass();
      this.j = var1;
      this.k = new LinkedHashMap();
   }

   public static final Object v(Class var0, cse var1) {
      return var0.isInstance(var1) ? var1 : null;
   }

   protected abstract cra a();

   protected abstract cse b(cqv var1);

   public final cse c() {
      cse var2 = this.d;
      cse var1 = var2;
      if (var2 == null) {
         qwp.b("internalOpenHelper");
         var1 = null;
      }

      return var1;
   }

   public final Object d(Callable var1) {
      this.m();

      Object var4;
      try {
         var4 = var1.call();
         this.q();
      } finally {
         this.o();
      }

      return var4;
   }

   public List e(Map var1) {
      var1.getClass();
      return qtf.a;
   }

   protected Map f() {
      return qtg.a;
   }

   public Set g() {
      return qth.a;
   }

   public final Executor h() {
      Executor var2 = this.b;
      Executor var1 = var2;
      if (var2 == null) {
         qwp.b(DHwXNavBkqbhR.opAINuMaYeGkND);
         var1 = null;
      }

      return var1;
   }

   public final Executor i() {
      Executor var2 = this.c;
      Executor var1 = var2;
      if (var2 == null) {
         qwp.b("internalTransactionExecutor");
         var1 = null;
      }

      return var1;
   }

   public final Lock j() {
      ReadLock var1 = this.l.readLock();
      var1.getClass();
      return var1;
   }

   public final void k() {
      if (!this.f) {
         if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
         }
      }
   }

   public final void l() {
      if (!this.r() && this.i.get() != null) {
         throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
      }
   }

   public final void m() {
      this.k();
      this.k();
      csa var1 = this.c().a();
      this.e.c(var1);
      if (var1.k()) {
         var1.e();
      } else {
         var1.d();
      }
   }

   public final void n() {
      csa var1 = this.a;
      Boolean var6;
      if (var1 != null) {
         var6 = var1.j();
      } else {
         var6 = null;
      }

      if (c.E(var6, true)) {
         WriteLock var7 = this.l.writeLock();
         var7.getClass();
         var7.lock();

         try {
            cra var3 = this.e;
            cbj var2 = var3.k;
            var3.k = null;
            this.c().close();
         } finally {
            var7.unlock();
         }

      }
   }

   public final void o() {
      this.c().a().f();
      if (!this.r()) {
         cra var1 = this.e;
         if (var1.d.compareAndSet(false, true)) {
            cps var2 = var1.j;
            var1.a.h().execute(var1.h);
         }
      }

   }

   public final void p(csa var1) {
      cra var3 = this.e;
      Object var2 = var3.g;
      synchronized(var2){}

      try {
         if (!var3.e) {
            var1.g("PRAGMA temp_store = MEMORY;");
            var1.g("PRAGMA recursive_triggers='ON';");
            var1.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            var3.c(var1);
            var3.i = var1.l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            var3.e = true;
            return;
         }

         Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
      } finally {
         ;
      }

   }

   public final void q() {
      this.c().a().h();
   }

   public final boolean r() {
      return this.c().a().i();
   }

   public final boolean s() {
      csa var1 = this.a;
      return var1 != null && var1.j();
   }

   public final csp t(String var1) {
      this.k();
      this.l();
      return this.c().a().l(var1);
   }

   public final Cursor u(csg var1) {
      this.k();
      this.l();
      return this.c().a().a(var1);
   }
}
