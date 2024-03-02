import android.os.Bundle;
import java.util.Iterator;
import java.util.Map.Entry;

public final class crx {
   public final qh a = new qh();
   public boolean b;
   public Bundle c;
   public boolean d;
   public boolean e = true;
   private crs f;

   public final Bundle a(String var1) {
      if (!this.d) {
         throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
      } else {
         Bundle var2 = this.c;
         if (var2 != null) {
            var2 = var2.getBundle(var1);
            Bundle var3 = this.c;
            if (var3 != null) {
               var3.remove(var1);
            }

            Bundle var4 = this.c;
            if (var4 == null || var4.isEmpty()) {
               this.c = null;
            }

            return var2;
         } else {
            return null;
         }
      }
   }

   public final void b(String var1, crw var2) {
      var2.getClass();
      if ((crw)this.a.f(var1, var2) != null) {
         throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
      }
   }

   public final void c(Class var1) {
      if (this.e) {
         crs var3 = this.f;
         crs var2 = var3;
         if (var3 == null) {
            var2 = new crs(this);
         }

         this.f = var2;

         try {
            var1.getDeclaredConstructor();
         } catch (NoSuchMethodException var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("Class ");
            var6.append(var1.getSimpleName());
            var6.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(var6.toString(), var4);
         }

         var2 = this.f;
         if (var2 != null) {
            String var5 = var1.getName();
            var5.getClass();
            var2.a.add(var5);
         }

      } else {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      }
   }

   public final crw d() {
      Iterator var2 = this.a.iterator();

      String var3;
      crw var5;
      do {
         if (!var2.hasNext()) {
            var5 = null;
            break;
         }

         Entry var1 = ((qf)var2).c();
         var1.getClass();
         qd var4 = (qd)var1;
         var3 = (String)var4.a;
         var5 = (crw)var4.b;
      } while(!c.E(var3, "androidx.lifecycle.internal.SavedStateHandlesProvider"));

      return var5;
   }
}
