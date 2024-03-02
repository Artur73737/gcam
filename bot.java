import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class bot implements ComponentCallbacks2 {
   final Configuration a;
   final eze b;

   public bot(Configuration var1, eze var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onConfigurationChanged(Configuration var1) {
      var1.getClass();
      int var2 = this.a.updateFrom(var1);
      Iterator var3 = ((HashMap)this.b.a).entrySet().iterator();

      while(true) {
         bqz var5;
         do {
            if (!var3.hasNext()) {
               this.a.setTo(var1);
               return;
            }

            Object var4 = var3.next();
            var4.getClass();
            var5 = (bqz)((WeakReference)((Entry)var4).getValue()).get();
         } while(var5 != null && !Configuration.needNewResources(var2, var5.b));

         var3.remove();
      }
   }

   public final void onLowMemory() {
      this.b.M();
   }

   public final void onTrimMemory(int var1) {
      this.b.M();
   }
}
