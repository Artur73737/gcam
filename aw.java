import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

final class aw implements Parcelable {
   public static final Creator CREATOR = new av(0);
   final List a;
   final List b;

   public aw(Parcel var1) {
      this.a = var1.createStringArrayList();
      this.b = var1.createTypedArrayList(au.CREATOR);
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeStringList(this.a);
      var1.writeTypedList(this.b);
   }
}
