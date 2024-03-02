import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
final class cli {
   final Map a;
   final Map b;

   public cli(Map var1) {
      this.b = var1;
      this.a = new HashMap();

      Entry var3;
      Object var5;
      for(Iterator var2 = var1.entrySet().iterator(); var2.hasNext(); ((List)var5).add((clj)var3.getKey())) {
         var3 = (Entry)var2.next();
         clv var4 = (clv)var3.getValue();
         var5 = (List)this.a.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            this.a.put(var4, var5);
         }
      }

   }

   public static void a(List var0, cmc var1, clv var2, Object var3) {
      if (var0 != null) {
         for(int var4 = var0.size() - 1; var4 >= 0; --var4) {
            clj var5 = (clj)var0.get(var4);

            InvocationTargetException var19;
            label74: {
               IllegalAccessException var10000;
               label73: {
                  boolean var10001;
                  label72: {
                     label83: {
                        try {
                           switch(var5.a) {
                           case 0:
                              break label83;
                           case 1:
                              break label72;
                           }
                        } catch (InvocationTargetException var14) {
                           var19 = var14;
                           var10001 = false;
                           break label74;
                        } catch (IllegalAccessException var15) {
                           var10000 = var15;
                           var10001 = false;
                           break label73;
                        }

                        Method var18;
                        try {
                           var18 = var5.b;
                        } catch (InvocationTargetException var12) {
                           var19 = var12;
                           var10001 = false;
                           break label74;
                        } catch (IllegalAccessException var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label73;
                        }

                        try {
                           var18.invoke(var3, var1, var2);
                           continue;
                        } catch (InvocationTargetException var10) {
                           var19 = var10;
                           var10001 = false;
                           break label74;
                        } catch (IllegalAccessException var11) {
                           var10000 = var11;
                           var10001 = false;
                           break label73;
                        }
                     }

                     try {
                        var5.b.invoke(var3);
                        continue;
                     } catch (InvocationTargetException var8) {
                        var19 = var8;
                        var10001 = false;
                        break label74;
                     } catch (IllegalAccessException var9) {
                        var10000 = var9;
                        var10001 = false;
                        break label73;
                     }
                  }

                  try {
                     var5.b.invoke(var3, var1);
                     continue;
                  } catch (InvocationTargetException var6) {
                     var19 = var6;
                     var10001 = false;
                     break label74;
                  } catch (IllegalAccessException var7) {
                     var10000 = var7;
                     var10001 = false;
                  }
               }

               IllegalAccessException var16 = var10000;
               throw new RuntimeException(var16);
            }

            InvocationTargetException var17 = var19;
            throw new RuntimeException("Failed to call observer method", var17.getCause());
         }
      }

   }
}
