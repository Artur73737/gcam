import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class ctv {
   static final ArrayList a;
   private static final ThreadLocal b;

   static {
      new cty((byte[])null);
      b = new ThreadLocal();
      a = new ArrayList();
   }

   static xh a() {
      ThreadLocal var0 = b;
      WeakReference var1 = (WeakReference)var0.get();
      xh var2;
      if (var1 != null) {
         var2 = (xh)var1.get();
         if (var2 != null) {
            return var2;
         }
      }

      var2 = new xh();
      var0.set(new WeakReference(var2));
      return var2;
   }
}
