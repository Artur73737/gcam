import java.util.List;

public final class cnu extends cml {
   public final int j = 54321;
   public final coa k;
   public cnv l;
   private cmc m;

   public cnu(coa var1) {
      this.k = var1;
      if (var1.j == null) {
         var1.j = this;
         var1.d = 54321;
      } else {
         throw new IllegalStateException("There is already a listener registered");
      }
   }

   protected final void e() {
      if (cnt.b(2)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("  Starting: ");
         var1.append(this);
      }

      coa var2 = this.k;
      var2.f = true;
      var2.h = false;
      var2.g = false;
      cnz var4 = (cnz)var2;
      List var3 = var4.c;
      if (var3 != null) {
         var4.b(var3);
      } else {
         var2.d();
         var4.a = new cny(var4);
         var4.a();
      }
   }

   protected final void f() {
      if (cnt.b(2)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("  Stopping: ");
         var1.append(this);
      }

      coa var2 = this.k;
      var2.f = false;
      var2.d();
   }

   public final void g(cmm var1) {
      super.g(var1);
      this.m = null;
      this.l = null;
   }

   public final void j() {
      cmc var2 = this.m;
      cnv var1 = this.l;
      if (var2 != null && var1 != null) {
         super.g(var1);
         this.d(var2, var1);
      }

   }

   public final void k() {
      StringBuilder var1;
      if (cnt.b(3)) {
         var1 = new StringBuilder();
         var1.append("  Destroying: ");
         var1.append(this);
      }

      this.k.d();
      this.k.g = true;
      cnv var2 = this.l;
      if (var2 != null) {
         this.g(var2);
         if (var2.b) {
            if (cnt.b(2)) {
               var1 = new StringBuilder();
               var1.append("  Resetting: ");
               var1.append(var2.a);
            }

            nvf var3 = var2.c;
            var3.a.clear();
            var3.a.notifyDataSetChanged();
         }
      }

      coa var4 = this.k;
      cnu var5 = var4.j;
      if (var5 != null) {
         if (var5 == this) {
            var4.j = null;
            var4.h = true;
            var4.f = false;
            var4.g = false;
            var4.i = false;
         } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
         }
      } else {
         throw new IllegalStateException("No listener register");
      }
   }

   public final void l(cmc var1, nvf var2) {
      cnv var4 = new cnv(this.k, var2);
      this.d(var1, var4);
      cnv var3 = this.l;
      if (var3 != null) {
         this.g(var3);
      }

      this.m = var1;
      this.l = var4;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("LoaderInfo{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" #");
      var1.append(this.j);
      var1.append(" : ");
      var1.append(this.k.getClass().getSimpleName());
      var1.append("{");
      var1.append(Integer.toHexString(System.identityHashCode(this.k)));
      var1.append("}}");
      return var1.toString();
   }
}
