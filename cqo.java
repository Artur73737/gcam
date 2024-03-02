import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cqo extends cpn {
   public static final Creator CREATOR = new atw(11);
   public boolean a;

   public cqo(Parcel var1) {
      super(var1);
      int var2 = var1.readInt();
      boolean var3 = true;
      if (var2 != 1) {
         var3 = false;
      }

      this.a = var3;
   }

   public cqo(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
   }
}
