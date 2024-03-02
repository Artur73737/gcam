import j..util.Map._CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class xh extends xo implements Map, j..util.Map {
   xb a;
   xd b;
   xf c;

   public xh() {
   }

   public xh(int var1) {
      super(var1);
   }

   public xh(xo var1) {
      super((byte[])null);
      this.i(var1);
   }

   public final boolean a(Collection var1) {
      int var3 = super.d;

      for(int var2 = var3 - 1; var2 >= 0; --var2) {
         if (!var1.contains(this.d(var2))) {
            this.e(var2);
         }
      }

      if (var3 != super.d) {
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   public final Object compute(Object var1, BiFunction var2) {
      return _CC.$default$compute(this, var1, var2);
   }

   // $FF: synthetic method
   public final Object computeIfAbsent(Object var1, Function var2) {
      return _CC.$default$computeIfAbsent(this, var1, var2);
   }

   // $FF: synthetic method
   public final Object computeIfPresent(Object var1, BiFunction var2) {
      return _CC.$default$computeIfPresent(this, var1, var2);
   }

   public final Set entrySet() {
      xb var2 = this.a;
      xb var1 = var2;
      if (var2 == null) {
         var1 = new xb(this);
         this.a = var1;
      }

      return var1;
   }

   // $FF: synthetic method
   public final void forEach(BiConsumer var1) {
      _CC.$default$forEach(this, var1);
   }

   public final Set keySet() {
      xd var2 = this.b;
      xd var1 = var2;
      if (var2 == null) {
         var1 = new xd(this);
         this.b = var1;
      }

      return var1;
   }

   // $FF: synthetic method
   public final Object merge(Object var1, Object var2, BiFunction var3) {
      return _CC.$default$merge(this, var1, var2, var3);
   }

   public final void putAll(Map var1) {
      this.h(super.d + var1.size());
      Iterator var3 = var1.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var2 = (Entry)var3.next();
         this.put(var2.getKey(), var2.getValue());
      }

   }

   // $FF: synthetic method
   public final void replaceAll(BiFunction var1) {
      _CC.$default$replaceAll(this, var1);
   }

   public final Collection values() {
      xf var2 = this.c;
      xf var1 = var2;
      if (var2 == null) {
         var1 = new xf(this);
         this.c = var1;
      }

      return var1;
   }
}
