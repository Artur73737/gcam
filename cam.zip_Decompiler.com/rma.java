import java.util.RandomAccess;

public final class rma extends qsv implements RandomAccess {
   public static final qwp c = new qwp();
   public final rlx[] a;
   public final int[] b;

   public rma(rlx[] var1, int[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int a() {
      return this.a.length;
   }

   public final boolean contains(Object var1) {
      return !(var1 instanceof rlx) ? false : super.contains((rlx)var1);
   }

   public final int indexOf(Object var1) {
      return !(var1 instanceof rlx) ? -1 : super.indexOf((rlx)var1);
   }

   public final int lastIndexOf(Object var1) {
      return !(var1 instanceof rlx) ? -1 : super.lastIndexOf((rlx)var1);
   }
}
