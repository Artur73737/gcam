import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cpe extends cpn {
   public static final Creator CREATOR = new atw(5);
   public String a;

   public cpe(Parcel var1) {
      super(var1);
      this.a = var1.readString();
   }

   public cpe(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.a);
   }
}
