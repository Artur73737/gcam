import androidx.window.area.reflectionguard.TU.aGGlrXh;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.DHwXNavBkqbhR;

public final class rku extends qfn implements qgv {
   public static final rku e;
   private static volatile qhb g;
   public int a;
   public String b;
   public long c;
   public String d;
   private byte f = 2;

   static {
      rku var0 = new rku();
      e = var0;
      qfn.ab(rku.class, var0);
   }

   private rku() {
      String var1 = DHwXNavBkqbhR.GLWhXHgFEkFc;
      this.b = var1;
      this.d = var1;
   }

   protected final Object a(int var1, Object var2) {
      byte var3 = 1;
      switch(var1 - 1) {
      case 0:
         return this.f;
      case 1:
      default:
         if (var2 == null) {
            var3 = 0;
         }

         this.f = var3;
         return null;
      case 2:
         String var26 = aGGlrXh.oZtVEPCRI;
         return Y(e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{var26, "b", "c", "d"});
      case 3:
         return new rku();
      case 4:
         return new qfi(e);
      case 5:
         return e;
      case 6:
         qhb var4 = g;
         var2 = var4;
         if (var4 == null) {
            synchronized(rku.class){}

            Throwable var10000;
            boolean var10001;
            label286: {
               try {
                  var4 = g;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label286;
               }

               var2 = var4;
               if (var4 == null) {
                  try {
                     var2 = new qfj(e);
                     g = (qhb)var2;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label286;
                  }
               }

               label271:
               try {
                  return var2;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label271;
               }
            }

            while(true) {
               Throwable var25 = var10000;

               try {
                  throw var25;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  continue;
               }
            }
         } else {
            return var2;
         }
      }
   }
}
