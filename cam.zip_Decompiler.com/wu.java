import androidx.wear.ambient.AmbientMode.AmbientController;
import java.util.LinkedHashMap;
import java.util.Map;

public final class wu {
   public final Object a;
   public final Object b;
   public final Object c;
   private final Object d;

   public wu(bwc var1, tg var2, fwf var3, nwu var4, bnc var5, lmk var6) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      var4.getClass();
      super();
      this.a = var2;
      this.d = var3;
      this.b = var5;
      this.c = var6;
   }

   public wu(Map var1) {
      this.b = var1;
      this.a = new Object();
      this.d = new LinkedHashMap();
      wu var2 = this.b();
      if (var2 != null) {
         this.c = var2;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Failed to load the default backend for ");
         var3.append("CameraBackendId(value=CXCP-Camera2)");
         var3.append("! Available backends are ");
         var3.append(var1.keySet());
         throw new IllegalStateException(var3.toString());
      }
   }

   public final sz a(String var1) {
      return ((fwf)this.d).h(var1);
   }

   public final wu b() {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      label302: {
         wu var1;
         boolean var10001;
         try {
            var1 = (wu)((Map)this.d).get(qj.a());
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label302;
         }

         if (var1 != null) {
            return var1;
         }

         AmbientController var34;
         try {
            var34 = (AmbientController)((Map)this.b).get(qj.a());
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label302;
         }

         Object var35;
         if (var34 != null) {
            try {
               var35 = var34.a;
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label302;
            }
         } else {
            var35 = null;
         }

         label295: {
            if (var35 != null) {
               try {
                  if (!c.E("CXCP-Camera2", "CXCP-Camera2")) {
                     break label295;
                  }

                  qj var3 = qj.a();
                  ((Map)this.d).put(var3, var35);
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label302;
               }
            }

            return (wu)var35;
         }

         label278:
         try {
            StringBuilder var37 = new StringBuilder();
            var37.append("Unexpected backend id! Expected ");
            var37.append("CameraBackendId(value=CXCP-Camera2)");
            var37.append(" but it was actually ");
            var37.append("CameraBackendId(value=CXCP-Camera2)");
            String var38 = var37.toString();
            IllegalStateException var39 = new IllegalStateException(var38);
            throw var39;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            break label278;
         }
      }

      Throwable var36 = var10000;
      throw var36;
   }
}
