import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// $FF: synthetic class
public final class cf implements crw {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public cf(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public cf(Object var1, int var2, byte[] var3) {
      this.b = var2;
      this.a = var1;
   }

   public final Bundle a() {
      Bundle var1;
      switch(this.b) {
      case 0:
         return ((cp)this.a).b();
      case 1:
         by var5 = (by)this.a;
         var5.e();
         var5.d.b(clv.ON_STOP);
         return new Bundle();
      case 2:
         var1 = new Bundle();
         ((eh)this.a).i();
         return var1;
      case 3:
         Object var2 = this.a;
         var1 = new Bundle();
         pn var7 = ((or)var2).h;
         var1.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(var7.b.values()));
         var1.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(var7.b.keySet()));
         var1.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(var7.d));
         var1.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)var7.g.clone());
         return var1;
      default:
         Map var6 = ((azc)this.a).c();
         Bundle var9 = new Bundle();

         String var4;
         ArrayList var11;
         for(Iterator var3 = var6.entrySet().iterator(); var3.hasNext(); var9.putParcelableArrayList(var4, var11)) {
            Entry var8 = (Entry)var3.next();
            var4 = (String)var8.getKey();
            List var10 = (List)var8.getValue();
            if (var10 instanceof ArrayList) {
               var11 = (ArrayList)var10;
            } else {
               var11 = new ArrayList(var10);
            }
         }

         return var9;
      }
   }
}
