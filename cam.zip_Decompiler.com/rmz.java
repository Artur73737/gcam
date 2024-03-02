import android.util.Size;

public final class rmz {
   public final int a;
   public final int b;
   public final boolean c;
   public final Size d;

   public rmz() {
   }

   public rmz(int var1, int var2, boolean var3, Size var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         if (var1 instanceof rmz) {
            rmz var2 = (rmz)var1;
            if (this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d.equals(var2.d)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      int var2 = this.a;
      int var3 = this.b;
      short var1;
      if (!this.c) {
         var1 = 1237;
      } else {
         var1 = 1231;
      }

      return (((var2 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var1) * 1000003 ^ this.d.hashCode();
   }

   public final String toString() {
      int var1 = this.a;
      int var2 = this.b;
      boolean var3 = this.c;
      String var4 = String.valueOf(this.d);
      StringBuilder var5 = new StringBuilder();
      var5.append("{");
      var5.append(var1);
      var5.append(", ");
      var5.append(var2);
      var5.append(", ");
      var5.append(var3);
      var5.append(", ");
      var5.append(var4);
      var5.append("}");
      return var5.toString();
   }
}
