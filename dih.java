import java.util.ArrayList;
import java.util.List;

public final class dih {
   private final List a = new ArrayList(5);

   public final int a() {
      return this.a.size();
   }

   public final dii b(int var1) {
      return (dii)this.a.get(var1);
   }

   public final void c(dii var1) {
      this.a.add(var1);
   }

   public final String toString() {
      StringBuffer var3 = new StringBuffer();

      for(int var1 = 1; var1 < this.a(); ++var1) {
         var3.append(this.b(var1));
         if (var1 < this.a() - 1) {
            int var2 = this.b(var1 + 1).b;
            if (var2 == 1 || var2 == 2) {
               var3.append('/');
            }
         }
      }

      return var3.toString();
   }
}
