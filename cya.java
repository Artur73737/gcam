import android.graphics.Rect;

public final class cya {
   public final int a;
   public final int b;
   private final int c;
   private final int d;

   public cya(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      StringBuilder var5;
      if (var1 <= var3) {
         if (var2 > var4) {
            var5 = new StringBuilder();
            var5.append("top must be less than or equal to bottom, top: ");
            var5.append(var2);
            var5.append(", bottom: ");
            var5.append(var4);
            throw new IllegalArgumentException(var5.toString());
         }
      } else {
         var5 = new StringBuilder();
         var5.append("Left must be less than or equal to right, left: ");
         var5.append(var1);
         var5.append(", right: ");
         var5.append(var3);
         throw new IllegalArgumentException(var5.toString());
      }
   }

   public cya(Rect var1) {
      this(var1.left, var1.top, var1.right, var1.bottom);
   }

   public final int a() {
      return this.d - this.b;
   }

   public final int b() {
      return this.c - this.a;
   }

   public final Rect c() {
      return new Rect(this.a, this.b, this.c, this.d);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         Class var3 = this.getClass();
         Class var2;
         if (var1 != null) {
            var2 = var1.getClass();
         } else {
            var2 = null;
         }

         if (!c.E(var3, var2)) {
            return false;
         } else {
            var1.getClass();
            cya var4 = (cya)var1;
            if (this.a != var4.a) {
               return false;
            } else if (this.b != var4.b) {
               return false;
            } else if (this.c != var4.c) {
               return false;
            } else {
               return this.d == var4.d;
            }
         }
      }
   }

   public final int hashCode() {
      return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(cya.class.getSimpleName());
      var1.append(" { [");
      var1.append(this.a);
      var1.append(',');
      var1.append(this.b);
      var1.append(',');
      var1.append(this.c);
      var1.append(',');
      var1.append(this.d);
      var1.append("] }");
      return var1.toString();
   }
}
