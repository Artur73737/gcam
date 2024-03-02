import java.lang.reflect.Constructor;
import java.util.List;

public final class cmd {
   public clw a;
   private cma b;

   public cmd(cmb var1, clw var2) {
      var2.getClass();
      super();
      cmg var7 = cmg.a;
      boolean var5 = var1 instanceof cma;
      boolean var6 = var1 instanceof cll;
      Object var9;
      if (var5 && var6) {
         var9 = new clm((cll)var1, (cma)var1);
      } else if (var6) {
         var9 = new clm((cll)var1, (cma)null);
      } else if (var5) {
         var9 = (cma)var1;
      } else {
         Class var10 = var1.getClass();
         if (cmg.a.a(var10) == 2) {
            Object var11 = cmg.b.get(var10);
            var11.getClass();
            List var8 = (List)var11;
            int var4 = var8.size();
            int var3 = 0;
            if (var4 == 1) {
               var9 = new cmy(cmg.b((Constructor)var8.get(0), var1), 2);
            } else {
               var4 = var8.size();

               clq[] var12;
               for(var12 = new clq[var4]; var3 < var4; ++var3) {
                  var12[var3] = cmg.b((Constructor)var8.get(var3), var1);
               }

               var9 = new cmy(var12, 1);
            }
         } else {
            var9 = new cmn(var1);
         }
      }

      this.b = (cma)var9;
      this.a = var2;
   }

   public final void a(cmc var1, clv var2) {
      clw var3 = var2.a();
      this.a = cit.i(this.a, var3);
      this.b.ej(var1, var2);
      this.a = var3;
   }
}
