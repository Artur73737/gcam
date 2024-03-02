package androidx.wear.ambient;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class SharedLibraryVersion {
   private SharedLibraryVersion() {
   }

   public static final int a(SidecarDeviceState var0) {
      int var1;
      try {
         var1 = var0.posture;
      } catch (NoSuchFieldError var6) {
         try {
            Object var7 = SidecarDeviceState.class.getMethod("getPosture").invoke(var0);
            var7.getClass();
            var1 = (Integer)var7;
            return var1 >= 0 && var1 <= 4 ? var1 : 0;
         } catch (NoSuchMethodException var3) {
         } catch (IllegalAccessException var4) {
         } catch (InvocationTargetException var5) {
         }

         var1 = 0;
      }

      return var1 >= 0 && var1 <= 4 ? var1 : 0;
   }

   public static final List b(SidecarWindowLayoutInfo param0) {
      // $FF: Couldn't be decompiled
   }

   public static void verifySharedLibraryPresent() {
      if (!SharedLibraryVersion$PresenceHolder.a) {
         throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
      }
   }

   public static int version() {
      verifySharedLibraryPresent();
      return SharedLibraryVersion$VersionHolder.a;
   }
}
