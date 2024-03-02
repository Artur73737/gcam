import java.util.ArrayList;
import java.util.List;

public final class brz {
   public static final int a = 0;

   static {
      new bry("");
   }

   public static final List a(List var0, int var1, int var2) {
      if (var1 > var2) {
         IllegalArgumentException var11 = new IllegalArgumentException(c.aJ((byte)41, var2, var1, "start (", ") should be less than or equal to end ("));
         throw var11;
      } else if (var0 == null) {
         return null;
      } else {
         ArrayList var7 = new ArrayList(var0.size());
         int var5 = var0.size();
         byte var4 = 0;

         int var3;
         for(var3 = 0; var3 < var5; ++var3) {
            Object var9 = var0.get(var3);
            brx var8 = (brx)var9;
            if (c(var1, var2, var8.b, var8.c)) {
               var7.add(var9);
            }
         }

         ArrayList var13 = new ArrayList(var7.size());
         var5 = var7.size();

         for(var3 = var4; var3 < var5; ++var3) {
            brx var14 = (brx)var7.get(var3);
            Object var10 = var14.a;
            int var12 = Math.max(var1, var14.b);
            int var6 = Math.min(var2, var14.c);
            String var15 = var14.d;
            var13.add(new brx(var10, var12 - var1, var6 - var1, (byte[])null));
         }

         return !var13.isEmpty() ? var13 : null;
      }
   }

   public static final boolean b(int var0, int var1, int var2, int var3) {
      boolean var5 = false;
      boolean var4 = var5;
      if (var0 <= var2) {
         var4 = var5;
         if (var3 <= var1) {
            if (var1 == var3) {
               boolean var7;
               if (var2 != var3) {
                  var7 = false;
               } else {
                  var7 = true;
               }

               boolean var6;
               if (var0 != var1) {
                  var6 = false;
               } else {
                  var6 = true;
               }

               if (var7 == var6) {
                  return true;
               }

               var4 = var5;
            } else {
               var4 = true;
            }
         }
      }

      return var4;
   }

   public static final boolean c(int var0, int var1, int var2, int var3) {
      return Math.max(var0, var2) < Math.min(var1, var3) || b(var0, var1, var2, var3) || b(var2, var3, var0, var1);
   }
}
