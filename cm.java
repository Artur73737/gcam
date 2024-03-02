import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class cm implements Parcelable {
   public static final Creator CREATOR = new av(2);
   final String a;
   final int b;

   public cm(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readInt();
   }

   public cm(String var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeInt(this.b);
   }
}
