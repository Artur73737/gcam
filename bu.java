import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bu implements Parcelable {
   public static final Creator CREATOR = new mf(1);
   final Bundle a;

   public bu(Parcel var1, ClassLoader var2) {
      Bundle var3 = var1.readBundle();
      this.a = var3;
      if (var2 != null && var3 != null) {
         var3.setClassLoader(var2);
      }

   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeBundle(this.a);
   }
}
