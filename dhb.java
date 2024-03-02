import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class dhb extends dgw {
   final AtomicReferenceFieldUpdater a;
   final AtomicReferenceFieldUpdater b;
   final AtomicReferenceFieldUpdater c;
   final AtomicReferenceFieldUpdater d;
   final AtomicReferenceFieldUpdater e;

   public dhb(AtomicReferenceFieldUpdater var1, AtomicReferenceFieldUpdater var2, AtomicReferenceFieldUpdater var3, AtomicReferenceFieldUpdater var4, AtomicReferenceFieldUpdater var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public final void a(dhe var1, dhe var2) {
      this.b.lazySet(var1, var2);
   }

   public final void b(dhe var1, Thread var2) {
      this.a.lazySet(var1, var2);
   }

   public final boolean c(dhf var1, dha var2, dha var3) {
      return c.A(this.d, var1, var2, var3);
   }

   public final boolean d(dhf var1, Object var2, Object var3) {
      return c.A(this.e, var1, var2, var3);
   }

   public final boolean e(dhf var1, dhe var2, dhe var3) {
      return c.A(this.c, var1, var2, var3);
   }
}
