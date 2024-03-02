import java.util.Iterator;
import java.util.List;

public final class akj implements ath {
   final Object a;
   private final int b;

   public akj(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void a() {
      int var2 = this.b;
      int var1 = 0;
      switch(var2) {
      case 0:
         ((akk)this.a).c = null;
         return;
      case 1:
         ((jed)this.a).h();
         return;
      case 2:
         aks var8 = (aks)this.a;

         for(var2 = var8.a(); var1 < var2; ++var1) {
            var8.b();
         }

         return;
      case 3:
         cyc var9 = (cyc)this.a;
         List var7 = (List)((azd)var9.b).a.remove(var9.a);
         if (var7 != null) {
            var7.remove(var9.c);
         }

         if (var7 != null && !var7.isEmpty()) {
            ((azd)var9.b).a.put(var9.a, var7);
         }

         return;
      case 4:
         ((ass)this.a).b();
         return;
      case 5:
         bjq var6 = ((myq)((avi)this.a).a()).i();
         bmd var3 = var6.a;
         var3.g = true;
         Iterator var4 = var6.f.values().iterator();

         while(var4.hasNext()) {
            ass var5 = ((bjk)var4.next()).c;
            if (var5 != null) {
               var5.b();
            }
         }

         var6.a.Q();
         var3.g = false;
         var6.f.clear();
         var6.g.clear();
         var6.n = 0;
         var6.m = 0;
         var6.j.clear();
         var6.d();
         return;
      default:
         ((bpj)this.a).a.a();
      }
   }
}
