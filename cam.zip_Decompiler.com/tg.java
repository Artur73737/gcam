import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.util.ArrayList;
import java.util.List;

public final class tg {
   private final qrz a;
   private final Object b;

   public tg(qrz var1, bwc var2) {
      var1.getClass();
      var2.getClass();
      super();
      this.a = var1;
      this.b = new Object();
   }

   public final List a() {
      Object var3 = this.b;
      synchronized(var3){}
      CameraManager var7 = (CameraManager)this.a.get();

      String[] var8;
      try {
         var8 = var7.getCameraIdList();
         var8.getClass();
         StringBuilder var4 = new StringBuilder();
         var4.append("Loaded CameraIdList ");
         var4.append(var8);
      } catch (CameraAccessException var6) {
         Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", var6);
         return null;
      }

      int var2 = var8.length;
      if (var2 == 0) {
         Log.w(zBdGS.pZlGPlGuApnCJT, "Failed to query CameraManager#getCameraIdList: No values returned.");
         return qtf.a;
      } else {
         ArrayList var9 = new ArrayList(var2);

         for(int var1 = 0; var1 < var2; ++var1) {
            String var5 = var8[var1];
            var5.getClass();
            qu.c(var5);
            var9.add(qu.a(var5));
         }

         return var9;
      }
   }
}
