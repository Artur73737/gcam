import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
final class clk {
   static final clk a = new clk();
   public final Map b = new HashMap();
   private final Map c = new HashMap();

   public clk() {
   }

   private static final void d(Map var0, clj var1, clv var2, Class var3) {
      clv var4 = (clv)var0.get(var1);
      if (var4 != null && var2 != var4) {
         Method var6 = var1.b;
         StringBuilder var5 = new StringBuilder();
         var5.append("Method ");
         var5.append(var6.getName());
         var5.append(" in ");
         var5.append(var3.getName());
         var5.append(" already declared with different @OnLifecycleEvent value: previous value ");
         var5.append(var4);
         var5.append(", new value ");
         var5.append(var2);
         throw new IllegalArgumentException(var5.toString());
      } else if (var4 == null) {
         var0.put(var1, var2);
      }
   }

   public final cli a(Class var1, Method[] var2) {
      Class var8 = var1.getSuperclass();
      HashMap var9 = new HashMap();
      if (var8 != null) {
         var9.putAll(this.b(var8).b);
      }

      Class[] var15 = var1.getInterfaces();
      int var4 = var15.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         Iterator var10 = this.b(var15[var3]).b.entrySet().iterator();

         while(var10.hasNext()) {
            Entry var11 = (Entry)var10.next();
            d(var9, (clj)var11.getKey(), (clv)var11.getValue(), var1);
         }
      }

      Method[] var16 = var2;
      if (var2 == null) {
         var16 = this.c(var1);
      }

      int var5 = var16.length;
      var4 = 0;

      boolean var7;
      for(var7 = false; var4 < var5; ++var4) {
         Method var12 = var16[var4];
         OnLifecycleEvent var18 = (OnLifecycleEvent)var12.getAnnotation(OnLifecycleEvent.class);
         if (var18 != null) {
            Class[] var17 = var12.getParameterTypes();
            int var6 = var17.length;
            byte var14;
            if (var6 > 0) {
               if (!cmc.class.isAssignableFrom(var17[0])) {
                  throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
               }

               var14 = 1;
            } else {
               var14 = 0;
            }

            clv var19 = var18.a();
            if (var6 > 1) {
               if (!clv.class.isAssignableFrom(var17[1])) {
                  throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
               }

               if (var19 != clv.ON_ANY) {
                  throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
               }

               var14 = 2;
            }

            if (var6 > 2) {
               throw new IllegalArgumentException("cannot have more than 2 params");
            }

            d(var9, new clj(var14, var12), var19, var1);
            var7 = true;
         }
      }

      cli var13 = new cli(var9);
      this.c.put(var1, var13);
      this.b.put(var1, var7);
      return var13;
   }

   final cli b(Class var1) {
      cli var2 = (cli)this.c.get(var1);
      return var2 != null ? var2 : this.a(var1, (Method[])null);
   }

   public final Method[] c(Class var1) {
      try {
         Method[] var3 = var1.getDeclaredMethods();
         return var3;
      } catch (NoClassDefFoundError var2) {
         throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", var2);
      }
   }
}
