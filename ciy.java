import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ciy implements Parcelable {
   public static final Creator CREATOR = new mf(4);
   public static final ciy c = new cix();
   public final Parcelable d;

   public ciy() {
      this.d = null;
   }

   protected ciy(Parcel var1, ClassLoader var2) {
      Parcelable var4 = var1.readParcelable(var2);
      Object var3 = var4;
      if (var4 == null) {
         var3 = c;
      }

      this.d = (Parcelable)var3;
   }

   protected ciy(Parcelable var1) {
      if (var1 != null) {
         Parcelable var2 = var1;
         if (var1 == c) {
            var2 = null;
         }

         this.d = var2;
      } else {
         throw new IllegalArgumentException("superState must not be null");
      }
   }

   public final int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.d, var2);
   }
}
