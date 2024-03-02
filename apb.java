import java.util.List;

public final class apb implements bjt {
   public static final apb a = new apb(0);
   public static final apb b = new apb(1);
   private final int c;

   public apb(int var1) {
      this.c = var1;
   }

   public final bju a(bjw var1, List var2, long var3) {
      switch(this.c) {
      case 0:
         if (var2.size() == 1) {
            bke var8 = ((bjs)pwm.au(var2)).l(var3);
            int var6 = var8.m(biu.a);
            int var7 = var8.m(biu.b);
            if (var6 != Integer.MIN_VALUE) {
               if (var7 != Integer.MIN_VALUE) {
                  float var5;
                  if (var6 == var7) {
                     var5 = 48.0F;
                  } else {
                     var5 = 68.0F;
                  }

                  var6 = Math.max(var1.eJ(var5), var8.b);
                  return ja.g(var1, bxq.b(var3), var6, new abf(var6, var8, 2));
               }

               throw new IllegalArgumentException("No baselines for text");
            }

            throw new IllegalArgumentException("No baselines for text");
         }

         throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
      default:
         return ja.g(var1, bxq.d(var3), bxq.c(var3), aal.i);
      }
   }
}
