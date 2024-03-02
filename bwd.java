import java.util.Locale;

public final class bwd {
   public final dmw a;

   public bwd(dmw var1) {
      this.a = var1;
   }

   public final String a() {
      String var1 = ((Locale)this.a.a).toLanguageTag();
      var1.getClass();
      return var1;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof bwd)) {
         return false;
      } else {
         return this == var1 ? true : c.E(this.a(), ((bwd)var1).a());
      }
   }

   public final int hashCode() {
      return this.a().hashCode();
   }

   public final String toString() {
      return this.a();
   }
}
