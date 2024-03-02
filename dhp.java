public final class dhp {
   public static byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
   private static byte[] b = new byte[255];

   static {
      byte var2 = 0;
      int var1 = 0;

      while(true) {
         int var0 = var2;
         if (var1 >= 255) {
            while(true) {
               byte[] var3 = a;
               var1 = var3.length;
               if (var0 >= 64) {
                  var3 = b;
                  var3[9] = -2;
                  var3[10] = -2;
                  var3[13] = -2;
                  var3[32] = -2;
                  var3[61] = -3;
                  return;
               }

               b[var3[var0]] = (byte)var0;
               ++var0;
            }
         }

         b[var1] = -1;
         ++var1;
      }
   }
}
