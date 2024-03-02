import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;

public final class rhy {
   public static final rhv a;
   private static final int b = b(Throwable.class, -1);

   static {
      Object var0;
      try {
         if (rhz.a) {
            var0 = riy.a;
         } else {
            var0 = rhq.a;
         }
      } finally {
         ;
      }

      a = (rhv)var0;
   }

   public static final qvt a(Class var0) {
      qzq var3 = qzq.d;
      if (b != b(var0, 0)) {
         return var3;
      } else {
         Constructor[] var2 = var0.getConstructors();
         mnu var4 = new mnu(10);
         var2.getClass();
         int var1 = var2.length;
         Object var6 = var2;
         if (var1 != 0) {
            var6 = Arrays.copyOf(var2, var1);
            var6.getClass();
            pwm.aV((Object[])var6, var4);
         }

         Iterator var8 = pwm.aS((Object[])var6).iterator();

         qsp var7;
         do {
            if (!var8.hasNext()) {
               return var3;
            }

            Constructor var9 = (Constructor)var8.next();
            Class[] var5 = var9.getParameterTypes();
            var1 = var5.length;
            var7 = null;
            switch(var1) {
            case 0:
               var7 = new qsp(var9, 10);
               break;
            case 1:
               Class var10 = var5[0];
               if (c.E(var10, Throwable.class)) {
                  var7 = new qsp(var9, 8);
               } else if (c.E(var10, String.class)) {
                  var7 = new qsp(var9, 9);
               }
               break;
            case 2:
               if (c.E(var5[0], String.class) && c.E(var5[1], Throwable.class)) {
                  var7 = new qsp(var9, 7);
               }
            }
         } while(var7 == null);

         return var7;
      }
   }

   private static final int b(Class var0, int var1) {
      qwl.d(var0);
      int var2 = 0;

      Object var29;
      label286: {
         Throwable var10000;
         label285:
         while(true) {
            int var6;
            Field[] var7;
            boolean var10001;
            try {
               var7 = var0.getDeclaredFields();
               var6 = var7.length;
            } catch (Throwable var27) {
               var10000 = var27;
               var10001 = false;
               break;
            }

            int var4 = 0;

            int var3;
            int var5;
            for(var3 = 0; var4 < var6; var3 = var5) {
               var5 = var3;

               label276: {
                  try {
                     if (Modifier.isStatic(var7[var4].getModifiers())) {
                        break label276;
                     }
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label285;
                  }

                  var5 = var3 + 1;
               }

               ++var4;
            }

            var3 += var2;

            Class var30;
            try {
               var30 = var0.getSuperclass();
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break;
            }

            var2 = var3;
            var0 = var30;
            if (var30 == null) {
               try {
                  var29 = var3;
                  break label286;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var28 = var10000;
         var29 = pwm.br(var28);
      }

      Object var31 = var29;
      if (var29 instanceof qsh) {
         var31 = var1;
      }

      return ((Number)var31).intValue();
   }
}
