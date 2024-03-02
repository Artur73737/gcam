import java.util.List;

final class cnv implements cmm {
   public final coa a;
   public boolean b = false;
   public final nvf c;

   public cnv(coa var1, nvf var2) {
      this.a = var1;
      this.c = var2;
   }

   public final void a(Object var1) {
      if (cnt.b(2)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("  onLoadFinished in ");
         var2.append(this.a);
         var2.append(": ");
         var2.append(coa.e(var1));
      }

      this.b = true;
      nvf var4 = this.c;
      List var3 = (List)var1;
      var4.a.clear();
      var4.a.addAll(var3);
      var4.a.notifyDataSetChanged();
   }

   public final String toString() {
      return this.c.toString();
   }
}
