import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public abstract class lro extends Service implements lrp {
   private final Object a = new Object();
   private lsi b;
   private final ltx c = new ltx(this, 1);

   private final lsi a() {
      // $FF: Couldn't be decompiled
   }

   public abstract void c(String var1, byte[] var2, byte[] var3, lrn var4, qcn var5);

   public final IBinder onBind(Intent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void onDestroy() {
      lsi var1 = this.a();
      if (var1 != null) {
         try {
            var1.z(2, var1.a());
         } catch (RemoteException var2) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
               Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", var2);
            }
         }
      }

      super.onDestroy();
   }

   public final void onRebind(Intent var1) {
      lsi var3 = this.a();
      if (var3 != null) {
         try {
            Parcel var2 = var3.a();
            edy.c(var2, var1);
            var3.z(6, var2);
            return;
         } catch (RemoteException var4) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
               Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", var4);
            }
         }
      }

      super.onRebind(var1);
   }

   public final void onTrimMemory(int var1) {
      lsi var2 = this.a();
      if (var2 != null) {
         try {
            Parcel var3 = var2.a();
            var3.writeInt(var1);
            var2.z(4, var3);
         } catch (RemoteException var4) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
               Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", var4);
            }
         }
      }

      super.onTrimMemory(var1);
   }

   public final boolean onUnbind(Intent var1) {
      lsi var3 = this.a();
      if (var3 != null) {
         try {
            Parcel var4 = var3.a();
            edy.c(var4, var1);
            Parcel var6 = var3.y(5, var4);
            boolean var2 = edy.e(var6);
            var6.recycle();
            return var2;
         } catch (RemoteException var5) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
               Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", var5);
            }
         }
      }

      return super.onUnbind(var1);
   }
}
