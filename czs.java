import android.net.Uri;

public final class czs {
   public final Uri a;
   public final boolean b;

   public czs(Uri var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         Class var3 = this.getClass();
         Class var2;
         if (var1 != null) {
            var2 = var1.getClass();
         } else {
            var2 = null;
         }

         if (!c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            czs var4 = (czs)var1;
            if (!c.E(this.a, var4.a)) {
               return false;
            } else {
               return this.b == var4.b;
            }
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode() * 31 + c.m(this.b);
   }
}
