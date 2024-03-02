import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public final class czl {
   public final SidecarInterface a;
   public final czi b;
   public final Map c;
   public final Map d;
   public czj e;

   public czl(Context var1) {
      SidecarInterface var3 = SidecarProvider.getSidecarImpl(var1.getApplicationContext());
      czi var2 = new czi();
      super();
      this.a = var3;
      this.b = var2;
      this.c = new LinkedHashMap();
      this.d = new LinkedHashMap();
   }

   public final cyw a(Activity var1) {
      IBinder var2 = WearableControllerProvider.a(var1);
      if (var2 == null) {
         return new cyw(qtf.a);
      } else {
         SidecarInterface var4 = this.a;
         SidecarWindowLayoutInfo var5;
         if (var4 != null) {
            var5 = var4.getWindowLayoutInfo(var2);
         } else {
            var5 = null;
         }

         SidecarInterface var6 = this.a;
         SidecarDeviceState var7;
         if (var6 != null) {
            SidecarDeviceState var3 = var6.getDeviceState();
            var7 = var3;
            if (var3 != null) {
               return czi.a(var5, var7);
            }
         }

         var7 = new SidecarDeviceState();
         return czi.a(var5, var7);
      }
   }

   public final void b(IBinder var1, Activity var2) {
      this.c.put(var1, var2);
      SidecarInterface var3 = this.a;
      if (var3 != null) {
         var3.onWindowLayoutChangeListenerAdded(var1);
      }

      if (this.c.size() == 1) {
         SidecarInterface var4 = this.a;
         if (var4 != null) {
            var4.onDeviceStateListenersChanged(false);
         }
      }

      czj var5 = this.e;
      if (var5 != null) {
         var5.a(var2, this.a(var2));
      }

      if (this.d.get(var2) == null && var2 instanceof cco) {
         hjz var6 = new hjz(this, var2, 1);
         this.d.put(var2, var6);
         ((cco)var2).d(var6);
      }

   }
}
