import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;

public final class cxi {
   public final ClassLoader a;
   public final WindowExtensions b;

   public cxi(ClassLoader var1) {
      this.a = var1;
      Object var2 = null;
      gfv var3 = new gfv(var1, (byte[])null);
      WindowExtensions var6 = (WindowExtensions)var2;

      label26: {
         label30: {
            boolean var10001;
            try {
               if (!var3.u()) {
                  break label26;
               }
            } catch (Exception var5) {
               var10001 = false;
               break label30;
            }

            var6 = (WindowExtensions)var2;

            try {
               if (var3.v()) {
                  var6 = WindowExtensionsProvider.getWindowExtensions();
               }
               break label26;
            } catch (Exception var4) {
               var10001 = false;
            }
         }

         var6 = (WindowExtensions)var2;
      }

      this.b = var6;
   }

   public final Class a() {
      Class var1 = this.a.loadClass("androidx.window.extensions.area.WindowAreaComponent");
      var1.getClass();
      return var1;
   }
}
