public final class yq {
   public final yi a;
   public final xz b;
   private final yo c;
   private final yn d;

   public yq() {
      this((yi)null, 15);
   }

   // $FF: synthetic method
   public yq(yi var1, int var2) {
      if (1 == (var2 & 1)) {
         var1 = null;
      }

      this.a = var1;
      this.c = null;
      this.b = null;
      this.d = null;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof yq)) {
         return false;
      } else {
         yq var3 = (yq)var1;
         if (!c.E(this.a, var3.a)) {
            return false;
         } else {
            yo var2 = var3.c;
            if (!c.E((Object)null, (Object)null)) {
               return false;
            } else {
               xz var5 = var3.b;
               if (!c.E((Object)null, (Object)null)) {
                  return false;
               } else {
                  yn var4 = var3.d;
                  return c.E((Object)null, (Object)null);
               }
            }
         }
      }
   }

   public final int hashCode() {
      yi var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return var1 * 29791;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TransitionData(fade=");
      var1.append(this.a);
      var1.append(", slide=");
      var1.append((Object)null);
      var1.append(", changeSize=");
      var1.append((Object)null);
      var1.append(", scale=");
      var1.append((Object)null);
      var1.append(')');
      return var1.toString();
   }
}
