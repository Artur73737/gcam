import android.view.View;

final class bo extends ca {
   final bv a;

   public bo(bv var1) {
      this.a = var1;
   }

   public final View a(int var1) {
      View var2 = this.a.O;
      if (var2 != null) {
         return var2.findViewById(var1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Fragment ");
         var3.append(this.a);
         var3.append(" does not have a view");
         throw new IllegalStateException(var3.toString());
      }
   }

   public final boolean b() {
      return this.a.O != null;
   }
}
