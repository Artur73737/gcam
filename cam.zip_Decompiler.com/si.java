import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class si implements rz {
   public final TotalCaptureResult a;
   private final String b;

   public si(TotalCaptureResult var1, String var2) {
      var2.getClass();
      super();
      this.a = var1;
      this.b = var2;
      new sj(var1, var2);
      Map var6 = sr.e(var1);
      if (var6 != null && !var6.isEmpty()) {
         ArrayMap var5 = new ArrayMap(var6.size());
         Iterator var4 = var6.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var3 = (Entry)var4.next();
            var2 = (String)var3.getKey();
            qu.c(var2);
            var5.put(qu.a(var2), new sj((CaptureResult)var3.getValue(), var2));
         }
      }

   }

   public final Object a(qxs var1) {
      throw null;
   }
}
