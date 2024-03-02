import java.util.ArrayList;
import java.util.Iterator;

public final class aut implements Iterable, bao, qxc {
   public int[] a = new int[0];
   public int b;
   public Object[] c = new Object[0];
   public int d;
   public int e;
   public boolean f;
   public int g;
   public ArrayList h = new ArrayList();

   public final aus a() {
      if (!this.f) {
         ++this.e;
         return new aus(this);
      } else {
         throw new IllegalStateException("Cannot read while a writer is pending");
      }
   }

   public final auw b() {
      if (!this.f) {
         if (this.e <= 0) {
            this.f = true;
            ++this.g;
            return new auw(this);
         } else {
            asr.k("Cannot start a writer when a reader is pending");
            throw new qsc();
         }
      } else {
         asr.k("Cannot start a writer when another writer is pending");
         throw new qsc();
      }
   }

   public final void c(int[] var1, int var2, Object[] var3, int var4, ArrayList var5) {
      var1.getClass();
      var3.getClass();
      var5.getClass();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.h = var5;
   }

   public final int d(nxj var1) {
      var1.getClass();
      if (!this.f) {
         if (var1.f()) {
            return var1.a;
         } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed");
         }
      } else {
         asr.k("Use active SlotWriter to determine anchor location instead");
         throw new qsc();
      }
   }

   public final boolean e(nxj var1) {
      var1.getClass();
      if (var1.f()) {
         int var2 = pu.l(this.h, var1.a, this.b);
         if (var2 >= 0 && c.E(this.h.get(var2), var1)) {
            return true;
         }
      }

      return false;
   }

   public final Iterator iterator() {
      return new atk(this, 0, this.b);
   }
}
