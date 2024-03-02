import java.util.Locale;

public final class crn {
   public final String a;
   public final String b;
   public final boolean c;
   public final int d;
   public final String e;
   public final int f;
   public final int g;

   public crn(String var1, String var2, boolean var3, int var4, String var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      Locale var7 = Locale.US;
      var7.getClass();
      var1 = var2.toUpperCase(var7);
      var1.getClass();
      byte var8;
      if (qwp.p(var1, "INT")) {
         var8 = 3;
      } else if (!qwp.p(var1, "CHAR") && !qwp.p(var1, "CLOB")) {
         if (qwp.p(var1, "TEXT")) {
            var8 = 2;
         } else if (qwp.p(var1, "BLOB")) {
            var8 = 5;
         } else if (!qwp.p(var1, "REAL") && !qwp.p(var1, "FLOA") && !qwp.p(var1, "DOUB")) {
            var8 = 1;
         } else {
            var8 = 4;
         }
      } else {
         var8 = 2;
      }

      this.g = var8;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof crn)) {
         return false;
      } else {
         int var2 = this.d;
         crn var4 = (crn)var1;
         if (var2 != var4.d) {
            return false;
         } else if (!c.E(this.a, var4.a)) {
            return false;
         } else if (this.c != var4.c) {
            return false;
         } else {
            String var3;
            if (this.f == 1 && var4.f == 2) {
               var3 = this.e;
               if (var3 != null && !cbs.h(var3, var4.e)) {
                  return false;
               }
            }

            if (this.f == 2 && var4.f == 1) {
               var3 = var4.e;
               if (var3 != null && !cbs.h(var3, this.e)) {
                  return false;
               }
            }

            if (this.f == var4.f) {
               var3 = this.e;
               if (var3 != null) {
                  if (cbs.h(var3, var4.e)) {
                     return this.g == var4.g;
                  }
               } else if (var4.e == null) {
                  return this.g == var4.g;
               }

               return false;
            } else {
               return this.g == var4.g;
            }
         }
      }
   }

   public final int hashCode() {
      int var2 = this.a.hashCode();
      int var3 = this.g;
      short var1;
      if (!this.c) {
         var1 = 1237;
      } else {
         var1 = 1231;
      }

      return ((var2 * 31 + var3) * 31 + var1) * 31 + this.d;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Column{name='");
      var3.append(this.a);
      var3.append("', type='");
      var3.append(this.b);
      var3.append("', affinity='");
      var3.append(this.g);
      var3.append("', notNull=");
      var3.append(this.c);
      var3.append(", primaryKeyPosition=");
      var3.append(this.d);
      var3.append(", defaultValue='");
      String var2 = this.e;
      String var1 = var2;
      if (var2 == null) {
         var1 = "undefined";
      }

      var3.append(var1);
      var3.append("'}");
      return var3.toString();
   }
}
