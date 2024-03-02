import com.google.android.material.appbar.XD.SSYOSt;

public final class bri {
   public final int a;

   // $FF: synthetic method
   private bri(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bri a(int var0) {
      return new bri(var0);
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bri;
      int var2 = this.a;
      return var3 && var2 == ((bri)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      String var2;
      if (c.n(var1, 0)) {
         var2 = SSYOSt.EPqF;
      } else if (c.n(var1, 1)) {
         var2 = "Checkbox";
      } else if (c.n(var1, 2)) {
         var2 = "Switch";
      } else if (c.n(var1, 3)) {
         var2 = "RadioButton";
      } else if (c.n(var1, 4)) {
         var2 = "Tab";
      } else if (c.n(var1, 5)) {
         var2 = "Image";
      } else if (c.n(var1, 6)) {
         var2 = "DropdownList";
      } else {
         var2 = "Unknown";
      }

      return var2;
   }
}
