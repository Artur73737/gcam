import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class du implements Parcelable {
   public static final Creator CREATOR = new av(15);
   dt a;

   public du(Parcel var1) {
      IBinder var4 = var1.readStrongBinder();
      int var2 = ds.b;
      Object var5;
      if (var4 == null) {
         var5 = null;
      } else {
         IInterface var3 = var4.queryLocalInterface(ds.c);
         if (var3 != null && var3 instanceof dt) {
            var5 = (dt)var3;
         } else {
            var5 = new dr(var4);
         }
      }

      this.a = (dt)var5;
   }

   protected void a() {
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (this.a == null) {
               ds var3 = new ds(this);
               this.a = var3;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            var1.writeStrongBinder(this.a.asBinder());
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }
}
