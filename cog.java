import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.Arrays;

public final class cog {
   public static final int e = 0;
   public final int a;
   public final int b;
   public final int c;
   public final byte[] d;
   private int f;

   static {
      cav.h(1, 1, 2, (byte[])null);
      com.d(0);
      com.d(1);
      com.d(2);
      com.d(3);
   }

   @Deprecated
   public cog(int var1, int var2, int var3, byte[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         cog var2 = (cog)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && Arrays.equals(this.d, var2.d);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var2 = this.f;
      int var1 = var2;
      if (var2 == 0) {
         var1 = (((this.a + 527) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d);
         this.f = var1;
      }

      return var1;
   }

   public final String toString() {
      String var3;
      switch(this.a) {
      case -1:
         var3 = "Unset color space";
         break;
      case 1:
         var3 = "BT709";
         break;
      case 2:
         var3 = "BT601";
         break;
      case 6:
         var3 = "BT2020";
         break;
      default:
         var3 = "Undefined color space";
      }

      String var4;
      switch(this.b) {
      case -1:
         var4 = "Unset color range";
         break;
      case 0:
      default:
         var4 = "Undefined color range";
         break;
      case 1:
         var4 = "Full range";
         break;
      case 2:
         var4 = RbaSbznIXS.wgqbZyAw;
      }

      String var2;
      switch(this.c) {
      case -1:
         var2 = "Unset color transfer";
         break;
      case 0:
      case 4:
      case 5:
      case 8:
      case 9:
      default:
         var2 = "Undefined color transfer";
         break;
      case 1:
         var2 = "Linear";
         break;
      case 2:
         var2 = "sRGB";
         break;
      case 3:
         var2 = "SDR SMPTE 170M";
         break;
      case 6:
         var2 = "ST2084 PQ";
         break;
      case 7:
         var2 = "HLG";
         break;
      case 10:
         var2 = "Gamma 2.2";
      }

      boolean var1;
      if (this.d != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      StringBuilder var5 = new StringBuilder();
      var5.append("ColorInfo(");
      var5.append(var3);
      var5.append(", ");
      var5.append(var4);
      var5.append(", ");
      var5.append(var2);
      var5.append(", ");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }
}
