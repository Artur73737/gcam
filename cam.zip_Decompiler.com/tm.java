import java.util.Set;

public final class tm {
   public static final int a = 0;

   static {
      Set var1 = rl.a;
      synchronized(var1){}

      Throwable var10000;
      label72: {
         boolean var0;
         boolean var10001;
         try {
            var0 = rl.a.add("androidx.camera.camera2.pipe.ExtensionMode");
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label72;
         }

         if (var0) {
            return;
         }

         label63:
         try {
            StringBuilder var10 = new StringBuilder();
            var10.append("androidx.camera.camera2.pipe.ExtensionMode");
            var10.append(" is already defined!");
            String var3 = var10.toString();
            IllegalStateException var11 = new IllegalStateException(var3);
            throw var11;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label63;
         }
      }

      Throwable var2 = var10000;
      throw var2;
   }
}
