import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import java.util.List;

public final class bry implements CharSequence {
   public final String a;
   public final List b;
   public final List c;
   public final List d;

   // $FF: synthetic method
   public bry(String var1) {
      var1.getClass();
      this(var1, (List)null, (List)null, (List)null);
   }

   public bry(String var1, List var2, List var3, List var4) {
      var1.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      if (var3 != null) {
         var2 = pwm.aC(var3, new wr(4));
         int var7 = var2.size();
         int var6 = 0;

         for(int var5 = -1; var6 < var7; ++var6) {
            brx var8 = (brx)var2.get(var6);
            if (var8.b < var5) {
               throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }

            var5 = var8.c;
            if (var5 > this.a.length()) {
               StringBuilder var9 = new StringBuilder();
               var9.append("ParagraphStyle range [");
               var9.append(var8.b);
               var9.append(TRoaEYDrhZZT.Thfbireyv);
               var9.append(var8.c);
               var9.append(") is out of boundary");
               throw new IllegalArgumentException(var9.toString());
            }
         }
      }

   }

   public final int a() {
      return this.a.length();
   }

   public final bry b(int var1, int var2) {
      if (var1 <= var2) {
         int var3 = var1;
         if (var1 == 0) {
            if (var2 == this.a.length()) {
               return this;
            }

            var3 = 0;
         }

         String var4 = this.a.substring(var3, var2);
         var4.getClass();
         return new bry(var4, brz.a(this.b, var3, var2), brz.a(this.c, var3, var2), brz.a(this.d, var3, var2));
      } else {
         throw new IllegalArgumentException(c.aJ((byte)41, var2, var1, "start (", ") should be less or equal to end ("));
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof bry)) {
         return false;
      } else {
         String var2 = this.a;
         bry var3 = (bry)var1;
         if (!c.E(var2, var3.a)) {
            return false;
         } else if (!c.E(this.b, var3.b)) {
            return false;
         } else if (!c.E(this.c, var3.c)) {
            return false;
         } else {
            return c.E(this.d, var3.d);
         }
      }
   }

   public final int hashCode() {
      int var4 = this.a.hashCode();
      List var5 = this.b;
      int var3 = 0;
      int var1;
      if (var5 != null) {
         var1 = var5.hashCode();
      } else {
         var1 = 0;
      }

      var5 = this.c;
      int var2;
      if (var5 != null) {
         var2 = var5.hashCode();
      } else {
         var2 = 0;
      }

      var5 = this.d;
      if (var5 != null) {
         var3 = var5.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public final String toString() {
      return this.a;
   }
}
