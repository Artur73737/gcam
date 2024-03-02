import java.util.Comparator;

public final class bli {
   public final bnm a;
   private final Comparator b;

   public bli() {
      pwm.bu(3, ara.s);
      bce var1 = new bce(2);
      this.b = var1;
      this.a = new bnm(var1);
   }

   public final bmd a() {
      bmd var1 = (bmd)this.a.first();
      var1.getClass();
      this.d(var1);
      return var1;
   }

   public final void b(bmd var1) {
      if (var1.ad()) {
         this.a.add(var1);
      } else {
         throw new IllegalStateException("DepthSortedSet.add called on an unattached node");
      }
   }

   public final boolean c() {
      return this.a.isEmpty();
   }

   public final boolean d(bmd var1) {
      if (var1.ad()) {
         return this.a.remove(var1);
      } else {
         throw new IllegalStateException("DepthSortedSet.remove called on an unattached node");
      }
   }

   public final String toString() {
      String var1 = this.a.toString();
      var1.getClass();
      return var1;
   }
}
