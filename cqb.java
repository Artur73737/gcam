import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cqb extends cpn {
   public static final Creator CREATOR = new atw(9);
   public final int a;

   public cqb(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
   }

   public cqb(Parcelable var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
   }
}
