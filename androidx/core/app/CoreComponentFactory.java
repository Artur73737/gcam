package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.pairip.StartupLauncher;

public class CoreComponentFactory extends AppComponentFactory {
   static {
      StartupLauncher.launch();
   }

   static Object a(Object var0) {
      if (var0 instanceof .cbl) {
         Object var1 = ((.cbl)var0).a();
         if (var1 != null) {
            return var1;
         }
      }

      return var0;
   }

   public final Activity instantiateActivity(ClassLoader var1, String var2, Intent var3) {
      return (Activity)a(super.instantiateActivity(var1, var2, var3));
   }

   public final Application instantiateApplication(ClassLoader var1, String var2) {
      return (Application)a(super.instantiateApplication(var1, var2));
   }

   public final ContentProvider instantiateProvider(ClassLoader var1, String var2) {
      return (ContentProvider)a(super.instantiateProvider(var1, var2));
   }

   public final BroadcastReceiver instantiateReceiver(ClassLoader var1, String var2, Intent var3) {
      return (BroadcastReceiver)a(super.instantiateReceiver(var1, var2, var3));
   }

   public final Service instantiateService(ClassLoader var1, String var2, Intent var3) {
      return (Service)a(super.instantiateService(var1, var2, var3));
   }
}
