import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public final class cyb implements InvocationHandler {
   private final qxs a;
   private final qvt b;

   public cyb(qxs var1, qvt var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object invoke(Object var1, Method var2, Object[] var3) {
      var1.getClass();
      var2.getClass();
      boolean var5 = c.E(var2.getName(), "accept");
      boolean var4 = false;
      if (var5 && var3 != null && var3.length == 1) {
         qxs var7 = this.a;
         Object var12 = var3[0];
         qwj var15 = (qwj)var7;
         Class var8 = var15.d;
         Map var9 = qwj.a;
         var9.getClass();
         Integer var11 = (Integer)var9.get(var8);
         Class var13;
         if (var11 != null) {
            var4 = qxb.b(var12, var11.intValue());
         } else {
            var13 = var8;
            if (var8.isPrimitive()) {
               var13 = qwl.c(qwl.d(var8));
            }

            var4 = var13.isInstance(var12);
         }

         if (!var4) {
            Class var16 = var15.d;
            var4 = var16.isAnonymousClass();
            var3 = null;
            String var10 = null;
            String var14 = var3;
            if (!var4) {
               var14 = var3;
               if (!var16.isLocalClass()) {
                  if (var16.isArray()) {
                     var13 = var16.getComponentType();
                     if (var13.isPrimitive()) {
                        var14 = (String)qwj.b.get(var13.getName());
                        if (var14 != null) {
                           var10 = var14.concat("Array");
                        }
                     }

                     var14 = var10;
                     if (var10 == null) {
                        var14 = "kotlin.Array";
                     }
                  } else {
                     var10 = (String)qwj.b.get(var16.getName());
                     var14 = var10;
                     if (var10 == null) {
                        var14 = var16.getCanonicalName();
                     }
                  }
               }
            }

            throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(var14)));
         }

         var12.getClass();
         this.b.eo(var12);
         var1 = qsn.a;
      } else if (c.E(var2.getName(), "equals") && var2.getReturnType().equals(Boolean.TYPE) && var3 != null && var3.length == 1) {
         if (var1 == var3[0]) {
            var4 = true;
         }

         var1 = var4;
      } else if (c.E(var2.getName(), "hashCode") && var2.getReturnType().equals(Integer.TYPE) && var3 == null) {
         var1 = this.b.hashCode();
      } else {
         if (!c.E(var2.getName(), "toString") || !var2.getReturnType().equals(String.class) || var3 != null) {
            StringBuilder var6 = new StringBuilder();
            var6.append("Unexpected method call object:");
            var6.append(var1);
            var6.append(", method: ");
            var6.append(var2);
            var6.append(", args: ");
            var6.append(var3);
            throw new UnsupportedOperationException(var6.toString());
         }

         var1 = this.b.toString();
      }

      return var1;
   }
}
