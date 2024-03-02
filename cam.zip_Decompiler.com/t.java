import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;
import java.io.Serializable;

final class t implements Serializable {
   private static final long serialVersionUID = 1L;
   public final String a;
   public final m b;
   public final q c;
   public final q d;

   public t(String var1, m var2, q var3, q var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @Deprecated
   public final int hashCode() {
      return this.a.hashCode() ^ this.b.hashCode();
   }

   public final String toString() {
      String var3 = this.a;
      String var4 = this.b.toString();
      q var1 = this.c;
      String var2 = "";
      String var5 = gThp.AOAqePHAYDv;
      String var8;
      if (var1 == null) {
         var8 = "";
      } else {
         var8 = var5.concat(var1.toString());
      }

      q var6 = this.d;
      if (var6 != null) {
         var2 = var5.concat(var6.toString());
      }

      StringBuilder var7 = new StringBuilder();
      var7.append(var3);
      var7.append(": ");
      var7.append(var4);
      var7.append(var8);
      var7.append(var2);
      return var7.toString();
   }
}
