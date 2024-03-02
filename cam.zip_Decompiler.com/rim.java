import java.util.concurrent.atomic.AtomicReferenceArray;

public final class rim {
   public volatile AtomicReferenceArray array;

   public rim(int var1) {
      this.array = new AtomicReferenceArray(var1);
   }

   public final Object a(int var1) {
      AtomicReferenceArray var2 = this.array;
      return var1 < var2.length() ? var2.get(var1) : null;
   }

   public final void b(int var1, Object var2) {
      AtomicReferenceArray var6 = this.array;
      int var4 = var6.length();
      if (var1 < var4) {
         var6.set(var1, var2);
      } else {
         AtomicReferenceArray var5 = new AtomicReferenceArray(qxb.k(var1 + 1, var4 + var4));

         for(int var3 = 0; var3 < var4; ++var3) {
            var5.set(var3, var6.get(var3));
         }

         var5.set(var1, var2);
         this.array = var5;
      }
   }
}
