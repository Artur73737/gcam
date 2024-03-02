import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

final class bq extends bt {
   final qi a;
   final AtomicReference b;
   final pr c;
   final pi d;
   final bv e;

   public bq(bv var1, qi var2, AtomicReference var3, pr var4, pi var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public final void a() {
      bv var2 = this.e;
      StringBuilder var1 = new StringBuilder();
      var1.append("fragment_");
      var1.append(var2.k);
      var1.append("_rq#");
      var1.append(var2.ab.getAndIncrement());
      String var10 = var1.toString();
      pn var4 = (pn)this.a.a((Object)null);
      AtomicReference var3 = this.b;
      bv var8 = this.e;
      pr var6 = this.c;
      pi var5 = this.d;
      clx var7 = var8.getLifecycle();
      if (!var7.b.a(clw.d)) {
         var4.c(var10);
         bpe var9 = (bpe)var4.c.get(var10);
         if (var9 == null) {
            var9 = new bpe(var7);
         }

         pk var12 = new pk(var4, var10, var5, var6);
         ((clx)var9.b).a(var12);
         ((ArrayList)var9.a).add(var12);
         var4.c.put(var10, var9);
         var3.set(new pl());
      } else {
         StringBuilder var11 = new StringBuilder();
         var11.append("LifecycleOwner ");
         var11.append(var8);
         var11.append(" is attempting to register while current state is ");
         var11.append(var7.b);
         var11.append(". LifecycleOwners must call register before they are STARTED.");
         throw new IllegalStateException(var11.toString());
      }
   }
}
