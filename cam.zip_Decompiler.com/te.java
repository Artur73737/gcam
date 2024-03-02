import android.os.Trace;
import java.util.Map;

public final class te {
   public final tk a;
   public final Map b;
   public final boolean c;
   public final Object d;
   public boolean e;
   public tc f;
   public final ws g;
   private final int h;

   public te(tk var1, Map var2, ws var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.g = var3;
      this.c = var4;
      this.h = tf.a.b();
      this.d = new Object();
   }

   public final void a() {
      Object var1 = this.d;
      synchronized(var1){}

      Throwable var10000;
      Throwable var48;
      label363: {
         String var46;
         boolean var10001;
         try {
            StringBuilder var2 = new StringBuilder();
            var2.append(this);
            var2.append("#close");
            var46 = var2.toString();
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label363;
         }

         label364: {
            label353: {
               label352: {
                  tc var47;
                  try {
                     Trace.beginSection(var46);
                     if (!this.c) {
                        break label352;
                     }

                     var47 = this.f;
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label353;
                  }

                  if (var47 != null) {
                     try {
                        StringBuilder var3 = new StringBuilder();
                        var3.append("Waiting for the last repeating request sequence ");
                        var3.append(var47);
                        td var49 = new td(var47, (que)null);
                        qwo.p(var49);
                     } catch (Throwable var43) {
                        var10000 = var43;
                        var10001 = false;
                        break label353;
                     }
                  }
               }

               label344:
               try {
                  this.e = true;
                  break label364;
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label344;
               }
            }

            var48 = var10000;

            try {
               Trace.endSection();
               throw var48;
            } catch (Throwable var40) {
               var10000 = var40;
               var10001 = false;
               break label363;
            }
         }

         label340:
         try {
            Trace.endSection();
            return;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            break label340;
         }
      }

      var48 = var10000;
      throw var48;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Camera2RequestProcessor-");
      var1.append(this.h);
      return var1.toString();
   }
}
