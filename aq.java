import java.util.ArrayList;

public final class aq {
   public int a;
   public int b;
   public int c;
   public int d;
   public ArrayList e = new ArrayList();

   public aq(am var1) {
      this.a = var1.w;
      this.b = var1.x;
      this.c = var1.h();
      this.d = var1.d();
      ArrayList var5 = var1.q;
      int var3 = var5.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         al var4 = (al)var5.get(var2);
         this.e.add(new ap(var4));
      }

   }
}
