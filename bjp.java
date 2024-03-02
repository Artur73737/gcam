public final class bjp {
   public final Object a;
   public final Object b;

   public bjp(bjq var1, Object var2) {
      this.b = var1;
      this.a = var2;
   }

   public bjp(qvx var1, qvt var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      ((bjq)this.b).d();
      bmd var5 = (bmd)((bjq)this.b).j.remove(this.a);
      if (var5 != null) {
         bjq var4 = (bjq)this.b;
         if (var4.n > 0) {
            int var1 = var4.a.z().indexOf(var5);
            int var2 = ((bjq)this.b).a.z().size();
            var4 = (bjq)this.b;
            int var3 = var4.n;
            if (var1 >= var2 - var3) {
               ++var4.m;
               var4.n = var3 - 1;
               var2 = var4.a.z().size();
               var4 = (bjq)this.b;
               var2 = var2 - var4.n - var4.m;
               var4.g(var1, var2);
               ((bjq)this.b).c(var2);
            } else {
               throw new IllegalStateException("Item is not in pre-composed item range");
            }
         } else {
            throw new IllegalStateException("No pre-composed items to dispose");
         }
      }
   }
}
