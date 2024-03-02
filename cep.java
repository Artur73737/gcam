import java.util.ArrayList;

public final class cep implements cew {
   final Object a;
   private final int b;

   public cep(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final void accept(Object var1) {
      switch(this.b) {
      case 0:
         nbu var4 = (nbu)var1;
         var1 = ceq.c;
         synchronized(var1){}

         Throwable var10000;
         boolean var10001;
         label256: {
            ArrayList var3;
            try {
               var3 = (ArrayList)ceq.d.get(this.a);
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label256;
            }

            if (var3 == null) {
               label249:
               try {
                  return;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label249;
               }
            } else {
               label261: {
                  try {
                     ceq.d.remove(this.a);
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label261;
                  }

                  for(int var2 = 0; var2 < var3.size(); ++var2) {
                     ((cew)var3.get(var2)).accept(var4);
                  }

                  return;
               }
            }
         }

         while(true) {
            Throwable var26 = var10000;

            try {
               throw var26;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               continue;
            }
         }
      default:
         nbu var27 = (nbu)var1;
         nbu var25 = var27;
         if (var27 == null) {
            var25 = new nbu(-3, (byte[])null);
         }

         ((ebt)this.a).x(var25);
      }
   }
}
