import java.util.Comparator;

public final class bok implements Comparator {
   final Comparator a;
   final Comparator b;

   public bok(Comparator var1, Comparator var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int compare(Object var1, Object var2) {
      int var3 = this.a.compare(var1, var2);
      return var3 != 0 ? var3 : this.b.compare(((bro)var1).b, ((bro)var2).b);
   }
}
