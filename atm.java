import com.google.android.apps.camera.imax.cyclops.audio.CmJv.ytQQGGmniJK;

public final class atm {
   private final Object a;
   private final Object b;

   public atm(Object var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   private static final int a(Object var0) {
      int var1;
      if (var0 instanceof Enum) {
         var1 = ((Enum)var0).ordinal();
      } else {
         if (var0 != null) {
            return var0.hashCode();
         }

         var1 = 0;
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof atm)) {
         return false;
      } else {
         atm var2 = (atm)var1;
         if (!c.E(this.a, var2.a)) {
            return false;
         } else {
            return c.E(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      return a(this.a) * 31 + a(this.b);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("JoinedKey(left=");
      var1.append(this.a);
      var1.append(ytQQGGmniJK.QNYALKZ);
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
