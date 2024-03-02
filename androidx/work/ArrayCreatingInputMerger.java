package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends .czy {
   public final .czv a(List var1) {
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      Iterator var8 = var1.iterator();

      while(var8.hasNext()) {
         Map var12 = ((.czv)var8.next()).b();
         var12.getClass();
         Iterator var9 = var12.entrySet().iterator();

         while(var9.hasNext()) {
            Object var4;
            String var10;
            Class var14;
            label35: {
               Entry var13 = (Entry)var9.next();
               var10 = (String)var13.getKey();
               var4 = var13.getValue();
               if (var4 != null) {
                  Class var5 = var4.getClass();
                  var14 = var5;
                  if (var5 != null) {
                     break label35;
                  }
               }

               var14 = String.class;
            }

            Object var16 = var7.get(var10);
            var10.getClass();
            Object var15;
            if (var16 == null) {
               if (var14.isArray()) {
                  var15 = var4;
               } else {
                  var15 = Array.newInstance(var14, 1);
                  Array.set(var15, 0, var4);
                  var15.getClass();
               }
            } else {
               Class var11 = var16.getClass();
               int var2;
               if (.c.E(var11, var14)) {
                  var4.getClass();
                  int var3 = Array.getLength(var16);
                  var14 = var16.getClass();
                  var2 = Array.getLength(var4);
                  var14 = var14.getComponentType();
                  var14.getClass();
                  var15 = Array.newInstance(var14, var3 + var2);
                  System.arraycopy(var16, 0, var15, 0, var3);
                  System.arraycopy(var4, 0, var15, var3, var2);
                  var15.getClass();
               } else {
                  if (!.c.E(var11.getComponentType(), var14)) {
                     throw new IllegalArgumentException();
                  }

                  var2 = Array.getLength(var16);
                  var15 = Array.newInstance(var14, var2 + 1);
                  System.arraycopy(var16, 0, var15, 0, var2);
                  Array.set(var15, var2, var4);
                  var15.getClass();
               }
            }

            var15.getClass();
            var7.put(var10, var15);
         }
      }

      .cby.j(var7, var6);
      return .cby.i(var6);
   }
}
