import android.util.DisplayMetrics;

public final class cxy {
   public final String a = "google";
   public final String b = "pixel fold";
   public final DisplayMetrics c;

   public cxy(DisplayMetrics var1) {
      this.c = var1;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof cxy) {
         String var2 = this.a;
         cxy var3 = (cxy)var1;
         if (c.E(var2, var3.a) && c.E(this.b, var3.b) && this.c.equals(var3.c)) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DeviceMetrics{ Manufacturer: ");
      var1.append(this.a);
      var1.append(", model: ");
      var1.append(this.b);
      var1.append(", Rear display metrics: ");
      var1.append(this.c);
      var1.append(" }");
      return var1.toString();
   }
}
