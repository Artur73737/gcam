import androidx.window.extensions.WindowExtensionsProvider;

public final class cye {
   public static final int a = 0;

   static {
      qxa.a(cye.class).b();
   }

   private cye() {
   }

   public static final int a() {
      int var0 = 0;

      int var1;
      try {
         var1 = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
      } catch (NoClassDefFoundError var3) {
         return var0;
      } catch (UnsupportedOperationException var4) {
         return var0;
      }

      var0 = var1;
      return var0;
   }
}
