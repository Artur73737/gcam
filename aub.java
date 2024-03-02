import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class aub extends ave implements Parcelable {
   public static final Creator CREATOR = new aua();

   public aub(Object var1, avf var2) {
      super(var1, var2);
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.getClass();
      var1.writeValue(this.a());
      avf var3 = super.a;
      byte var4;
      if (c.E(var3, aup.b)) {
         var4 = 0;
      } else if (c.E(var3, aup.c)) {
         var4 = 1;
      } else {
         if (!c.E(var3, aup.a)) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
         }

         var4 = 2;
      }

      var1.writeInt(var4);
   }
}
