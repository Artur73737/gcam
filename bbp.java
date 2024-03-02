import com.google.android.libraries.social.licenses.an.fJos;
import com.google.lullaby.modules.audio.nwj.OtvMV;

public final class bbp {
   public final int a;

   // $FF: synthetic method
   private bbp(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final bbp a(int var0) {
      return new bbp(var0);
   }

   public static String b(int var0) {
      String var1;
      if (c.n(var0, 1)) {
         var1 = "Next";
      } else if (c.n(var0, 2)) {
         var1 = OtvMV.JaJmoGxDrxX;
      } else if (c.n(var0, 3)) {
         var1 = "Left";
      } else if (c.n(var0, 4)) {
         var1 = "Right";
      } else if (c.n(var0, 5)) {
         var1 = "Up";
      } else if (c.n(var0, 6)) {
         var1 = "Down";
      } else if (c.n(var0, 7)) {
         var1 = "Enter";
      } else if (c.n(var0, 8)) {
         var1 = fJos.Syw;
      } else {
         var1 = "Invalid FocusDirection";
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof bbp;
      int var2 = this.a;
      return var3 && var2 == ((bbp)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return b(this.a);
   }
}
