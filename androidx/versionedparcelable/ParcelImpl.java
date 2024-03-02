package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
   public static final Creator CREATOR = new .cvd(0);
   private final .cvf a;

   public ParcelImpl(Parcel var1) {
      this.a = (new .cve(var1)).c();
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      (new .cve(var1)).k(this.a);
   }
}
