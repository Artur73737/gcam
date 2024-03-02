import android.text.Layout.Alignment;

public final class bti {
   public static final Alignment a;
   public static final Alignment b;

   static {
      Alignment[] var6 = Alignment.values();
      Alignment var2 = Alignment.ALIGN_NORMAL;
      Alignment var3 = Alignment.ALIGN_NORMAL;
      int var1 = var6.length;

      Alignment var4;
      for(int var0 = 0; var0 < var1; var2 = var4) {
         Alignment var5 = var6[var0];
         if (c.E(var5.name(), "ALIGN_LEFT")) {
            var4 = var5;
         } else {
            var4 = var2;
            if (c.E(var5.name(), "ALIGN_RIGHT")) {
               var3 = var5;
               var4 = var2;
            }
         }

         ++var0;
      }

      a = var2;
      b = var3;
   }
}
