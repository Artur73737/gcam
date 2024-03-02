public final class dht {
   public static final int a = 0;
   private static boolean[] b = new boolean[256];
   private static boolean[] c = new boolean[256];

   static {
      char var0 = 0;

      while(true) {
         boolean[] var4 = c;
         int var1 = var4.length;
         if (var0 >= 256) {
            return;
         }

         boolean[] var5 = b;
         boolean var3 = true;
         boolean var2;
         if ((var0 < 'a' || var0 > 'z') && (var0 < 'A' || var0 > 'Z') && var0 != ':' && var0 != '_' && (var0 < 192 || var0 > 214)) {
            if (var0 >= 216 && var0 <= 246) {
               var2 = true;
            } else {
               var2 = false;
            }
         } else {
            var2 = true;
         }

         var5[var0] = var2;
         if (var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z' || var0 >= '0' && var0 <= '9' || var0 == ':' || var0 == '_' || var0 == '-' || var0 == '.' || var0 == 183 || var0 >= 192 && var0 <= 214) {
            var2 = var3;
         } else if (var0 >= 216 && var0 <= 246) {
            var2 = var3;
         } else {
            var2 = false;
         }

         var4[var0] = var2;
         ++var0;
      }
   }

   public static String a(String var0) {
      if ("x-default".equals(var0)) {
         return var0;
      } else {
         StringBuffer var4 = new StringBuffer();
         int var3 = 1;

         int var2;
         for(int var1 = 0; var1 < var0.length(); var3 = var2) {
            var2 = var3;
            switch(var0.charAt(var1)) {
            case ' ':
               break;
            case '-':
            case '_':
               var4.append('-');
               var2 = var3 + 1;
               break;
            default:
               if (var3 != 2) {
                  var4.append(Character.toLowerCase(var0.charAt(var1)));
                  var2 = var3;
               } else {
                  var4.append(Character.toUpperCase(var0.charAt(var1)));
                  var2 = var3;
               }
            }

            ++var1;
         }

         return var4.toString();
      }
   }

   static boolean b(char var0) {
      char var1 = var0;
      if (var0 > 31) {
         if (var0 != 127) {
            return false;
         }

         var1 = 127;
      }

      if (var1 != '\t' && var1 != '\n' && var1 != '\r') {
         return true;
      } else {
         return false;
      }
   }

   public static boolean c(char var0) {
      return var0 > 255 || c[var0];
   }

   public static boolean d(char var0) {
      return var0 > 255 || b[var0];
   }

   public static boolean e(String var0) {
      int var1;
      if (var0.length() > 0) {
         if (!d(var0.charAt(0)) || var0.charAt(0) == ':') {
            return false;
         }

         var1 = 1;
      } else {
         var1 = 1;
      }

      while(var1 < var0.length()) {
         if (!c(var0.charAt(var1)) || var0.charAt(var1) == ':') {
            return false;
         }

         ++var1;
      }

      return true;
   }

   public static String[] f(String var0) {
      int var2 = var0.indexOf(61);
      byte var1;
      if (var0.charAt(1) == '?') {
         var1 = 2;
      } else {
         var1 = 1;
      }

      String var5 = var0.substring(var1, var2);
      int var7 = var2 + 1;
      char var3 = var0.charAt(var7);
      int var4 = var0.length() - 2;
      StringBuffer var6 = new StringBuffer(var4 - var2);
      ++var7;

      while(var7 < var4) {
         var6.append(var0.charAt(var7));
         var2 = var7 + 1;
         var7 = var2;
         if (var0.charAt(var2) == var3) {
            var7 = var2 + 1;
         }
      }

      return new String[]{var5, var6.toString()};
   }
}
