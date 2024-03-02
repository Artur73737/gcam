import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class atz extends avc implements Parcelable {
   public static final Creator CREATOR = new atw(3);

   public atz(long var1) {
      super(var1);
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.getClass();
      var1.writeLong(this.f());
   }
}
