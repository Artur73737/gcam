import java.util.concurrent.atomic.AtomicReference;

public final class rme {
   private static final rmd a;
   private static final int b;
   private static final AtomicReference[] c;

   static {
      int var0 = 0;
      a = new rmd(new byte[0], 0, 0, false);
      int var1 = Runtime.getRuntime().availableProcessors();
      var1 = Integer.highestOneBit(var1 + var1 - 1);
      b = var1;

      AtomicReference[] var2;
      for(var2 = new AtomicReference[var1]; var0 < var1; ++var0) {
         var2[var0] = new AtomicReference();
      }

      c = var2;
   }

   public static final rmd a() {
      AtomicReference var2 = c();
      rmd var0 = a;
      rmd var1 = (rmd)var2.getAndSet(var0);
      if (var1 == var0) {
         return new rmd();
      } else if (var1 == null) {
         var2.set((Object)null);
         return new rmd();
      } else {
         var2.set(var1.f);
         var1.f = null;
         var1.c = 0;
         return var1;
      }
   }

   public static final void b(rmd var0) {
      if (var0.f == null && var0.g == null) {
         if (!var0.d) {
            AtomicReference var3 = c();
            rmd var4 = a;
            rmd var2 = (rmd)var3.getAndSet(var4);
            if (var2 != var4) {
               int var1;
               if (var2 != null) {
                  var1 = var2.c;
               } else {
                  var1 = 0;
               }

               if (var1 >= 65536) {
                  var3.set(var2);
               } else {
                  var0.f = var2;
                  var0.b = 0;
                  var0.c = var1 + 8192;
                  var3.set(var0);
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }

   private static final AtomicReference c() {
      long var2 = Thread.currentThread().getId();
      long var0 = (long)b;
      return c[(int)(var2 & var0 - 1L)];
   }
}
