import com.google.android.material.appbar.XD.SSYOSt;

public final class bvv {
   public final int a;

   // $FF: synthetic method
   public bvv(int var1) {
      this.a = var1;
   }

   public static String a(int var0) {
      String var1;
      if (c.n(var0, 0)) {
         var1 = "None";
      } else if (c.n(var0, 1)) {
         var1 = "Default";
      } else if (c.n(var0, 2)) {
         var1 = SSYOSt.AMPAsxLqmOBHT;
      } else if (c.n(var0, 3)) {
         var1 = "Search";
      } else if (c.n(var0, 4)) {
         var1 = "Send";
      } else if (c.n(var0, 5)) {
         var1 = "Previous";
      } else if (c.n(var0, 6)) {
         var1 = "Next";
      } else if (c.n(var0, 7)) {
         var1 = "Done";
      } else {
         var1 = "Invalid";
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bvv;
      int var2 = this.a;
      return var3 && var2 == ((bvv)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return a(this.a);
   }
}
