import androidx.window.area.reflectionguard.TU.aGGlrXh;

public final class bcr {
   private final int a;

   // $FF: synthetic method
   public bcr(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bcr;
      int var2 = this.a;
      return var3 && var2 == ((bcr)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      String var2;
      if (c.n(var1, 0)) {
         var2 = "Clear";
      } else if (c.n(var1, 1)) {
         var2 = "Src";
      } else if (c.n(var1, 2)) {
         var2 = "Dst";
      } else if (c.n(var1, 3)) {
         var2 = "SrcOver";
      } else if (c.n(var1, 4)) {
         var2 = "DstOver";
      } else if (c.n(var1, 5)) {
         var2 = "SrcIn";
      } else if (c.n(var1, 6)) {
         var2 = aGGlrXh.hTBZJ;
      } else if (c.n(var1, 7)) {
         var2 = "SrcOut";
      } else if (c.n(var1, 8)) {
         var2 = "DstOut";
      } else if (c.n(var1, 9)) {
         var2 = "SrcAtop";
      } else if (c.n(var1, 10)) {
         var2 = "DstAtop";
      } else if (c.n(var1, 11)) {
         var2 = "Xor";
      } else if (c.n(var1, 12)) {
         var2 = "Plus";
      } else if (c.n(var1, 13)) {
         var2 = "Modulate";
      } else if (c.n(var1, 14)) {
         var2 = "Screen";
      } else if (c.n(var1, 15)) {
         var2 = "Overlay";
      } else if (c.n(var1, 16)) {
         var2 = "Darken";
      } else if (c.n(var1, 17)) {
         var2 = "Lighten";
      } else if (c.n(var1, 18)) {
         var2 = "ColorDodge";
      } else if (c.n(var1, 19)) {
         var2 = "ColorBurn";
      } else if (c.n(var1, 20)) {
         var2 = "HardLight";
      } else if (c.n(var1, 21)) {
         var2 = "Softlight";
      } else if (c.n(var1, 22)) {
         var2 = "Difference";
      } else if (c.n(var1, 23)) {
         var2 = "Exclusion";
      } else if (c.n(var1, 24)) {
         var2 = "Multiply";
      } else if (c.n(var1, 25)) {
         var2 = "Hue";
      } else if (c.n(var1, 26)) {
         var2 = "Saturation";
      } else if (c.n(var1, 27)) {
         var2 = "Color";
      } else if (c.n(var1, 28)) {
         var2 = "Luminosity";
      } else {
         var2 = "Unknown";
      }

      return var2;
   }
}
