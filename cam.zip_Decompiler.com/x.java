import com.google.lullaby.modules.audio.nwj.OtvMV;

public final class x {
   public final int a;
   public final char b;
   public short c;
   public int d;
   public final int e;

   public x(int var1, int var2, int var3, int var4) {
      this.e = var1;
      this.a = var2;
      this.b = (char)var3;
      this.c = (short)var4;
   }

   public final int a() {
      return this.a + this.b;
   }

   public final int b() {
      int var1 = this.e;
      return var1 != 6 && var1 != 7 ? 1 : y.e[this.c];
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 != null && this.getClass() == var1.getClass()) {
            x var2 = (x)var1;
            if (this.e == var2.e && this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      int var1 = this.e;
      c.ai(var1);
      return ((var1 * 37 + this.a) * 37 + this.b) * 37 + this.c;
   }

   public final String toString() {
      int var1 = this.e;
      String var3;
      if (var1 != 6 && var1 != 7) {
         var3 = Integer.toString(this.c);
      } else {
         var1 = this.b();
         var3 = c.as(var1);
         if (var1 == 0) {
            throw null;
         }
      }

      String var2;
      switch(this.e) {
      case 1:
         var2 = "MSG_START";
         break;
      case 2:
         var2 = "MSG_LIMIT";
         break;
      case 3:
         var2 = "SKIP_SYNTAX";
         break;
      case 4:
         var2 = "INSERT_CHAR";
         break;
      case 5:
         var2 = "REPLACE_NUMBER";
         break;
      case 6:
         var2 = "ARG_START";
         break;
      case 7:
         var2 = OtvMV.fGQJObYMcgbXvs;
         break;
      case 8:
         var2 = "ARG_NUMBER";
         break;
      case 9:
         var2 = "ARG_NAME";
         break;
      case 10:
         var2 = "ARG_TYPE";
         break;
      case 11:
         var2 = "ARG_STYLE";
         break;
      case 12:
         var2 = "ARG_SELECTOR";
         break;
      case 13:
         var2 = "ARG_INT";
         break;
      default:
         var2 = "ARG_DOUBLE";
      }

      var1 = this.a;
      StringBuilder var4 = new StringBuilder();
      var4.append(var2);
      var4.append("(");
      var4.append(var3);
      var4.append(")@");
      var4.append(var1);
      return var4.toString();
   }
}
