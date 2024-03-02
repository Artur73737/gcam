import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class aty extends ava implements Parcelable {
   public static final Creator CREATOR = new atw(2);

   public aty(int var1) {
      super(var1);
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.getClass();
      var1.writeInt(this.f());
   }
}
