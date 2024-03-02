import android.graphics.Rect;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class czi {
   private static final String a = czi.class.getSimpleName();

   public static final cyw a(SidecarWindowLayoutInfo var0, SidecarDeviceState var1) {
      var1.getClass();
      if (var0 == null) {
         return new cyw(qtf.a);
      } else {
         SidecarDeviceState var3 = new SidecarDeviceState();
         int var2 = SharedLibraryVersion.a(var1);

         try {
            var3.posture = var2;
         } catch (NoSuchFieldError var10) {
            try {
               SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(var3, var2);
            } catch (NoSuchMethodException var7) {
            } catch (IllegalAccessException var8) {
            } catch (InvocationTargetException var9) {
            }
         }

         List var11 = SharedLibraryVersion.b(var0);
         ArrayList var4 = new ArrayList();
         Iterator var5 = var11.iterator();

         while(var5.hasNext()) {
            SidecarDisplayFeature var6 = (SidecarDisplayFeature)var5.next();
            var6.getClass();
            a.getClass();
            Object var12 = (new cyh(var6)).a("Type must be either TYPE_FOLD or TYPE_HINGE", bwb.k).a("Feature bounds must not be 0", bwb.l).a("TYPE_FOLD must have 0 area", bwb.m).a("Feature be pinned to either left or top", bwb.n).b();
            var1 = null;
            cyp var15;
            if (var12 == null) {
               var15 = var1;
            } else {
               label60: {
                  cyo var13;
                  switch(((SidecarDisplayFeature)var12).getType()) {
                  case 1:
                     var13 = cyo.a;
                     break;
                  case 2:
                     var13 = cyo.b;
                     break;
                  default:
                     var15 = var1;
                     break label60;
                  }

                  cyn var14;
                  switch(SharedLibraryVersion.a(var3)) {
                  case 2:
                     var14 = cyn.b;
                     break;
                  case 3:
                     var14 = cyn.a;
                     break;
                  default:
                     var15 = var1;
                     break label60;
                  }

                  Rect var16 = var6.getRect();
                  var16.getClass();
                  var15 = new cyp(new cya(var16), var13, var14);
               }
            }

            if (var15 != null) {
               var4.add(var15);
            }
         }

         return new cyw(var4);
      }
   }
}
