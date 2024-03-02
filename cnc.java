import android.os.Bundle;
import java.util.Iterator;
import java.util.Map.Entry;

public final class cnc implements crw {
   public Bundle a;
   private final crx b;
   private boolean c;
   private final qsd d;

   public cnc(crx var1, cnm var2) {
      this.b = var1;
      this.d = pwm.bt(new bmc(var2, 13));
   }

   private final cnd c() {
      return (cnd)this.d.a();
   }

   public final Bundle a() {
      Bundle var1 = new Bundle();
      Bundle var2 = this.a;
      if (var2 != null) {
         var1.putAll(var2);
      }

      Iterator var5 = this.c().a.entrySet().iterator();

      while(var5.hasNext()) {
         Entry var4 = (Entry)var5.next();
         String var3 = (String)var4.getKey();
         Bundle var6 = ((cmx)var4.getValue()).f.a();
         if (!c.E(var6, Bundle.EMPTY)) {
            var1.putBundle(var3, var6);
         }
      }

      this.c = false;
      return var1;
   }

   public final void b() {
      if (!this.c) {
         this.a = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
         this.c = true;
         this.c();
      }

   }
}
