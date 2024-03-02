import android.util.Size;
import java.util.ArrayList;
import java.util.List;

public final class wp {
   public final Size a;
   public final int b;
   public final String c;
   public final Integer d;
   public final rr e;
   public final List f;
   public final boolean g;
   private final int h;

   public wp(int var1, Size var2, int var3, String var4, Integer var5, rr var6) {
      this.h = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      ArrayList var8 = new ArrayList();
      this.f = var8;
      var1 = var8.size();
      boolean var7 = true;
      if (var1 <= 1) {
         var7 = false;
      }

      this.g = var7;
   }

   public final boolean a() {
      return this.e != null;
   }

   public final String toString() {
      int var1 = this.h;
      StringBuilder var2 = new StringBuilder();
      var2.append("OutputConfig-");
      var2.append(var1);
      return var2.toString();
   }
}
