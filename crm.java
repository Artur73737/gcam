import com.google.android.material.snackbar.Lqt.HUJCIBIkzRDQ;
import java.util.Set;

public final class crm {
   public static final String[] a = new String[]{"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
   public final String b = "ResourceFts";
   public final Set c;
   public final Set d;

   public crm(Set var1, Set var2) {
      this.c = var1;
      this.d = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof crm)) {
         return false;
      } else {
         String var2 = this.b;
         crm var3 = (crm)var1;
         if (!c.E(var2, var3.b)) {
            return false;
         } else {
            return !c.E(this.c, var3.c) ? false : c.E(this.d, var3.d);
         }
      }
   }

   public final int hashCode() {
      return (this.b.hashCode() * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FtsTableInfo{name='");
      var1.append(this.b);
      var1.append("', columns=");
      var1.append(this.c);
      var1.append(", options=");
      var1.append(this.d);
      var1.append(HUJCIBIkzRDQ.Kkf);
      return var1.toString();
   }
}
