import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class akc implements Parcelable {
   public static final Creator CREATOR = new atw(1);
   private final int a;

   public akc(int var1) {
      this.a = var1;
   }

   public final int describeContents() {
      return 0;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof akc)) {
         return false;
      } else {
         akc var2 = (akc)var1;
         return this.a == var2.a;
      }
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("DefaultLazyKey(index=");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.getClass();
      var1.writeInt(this.a);
   }
}
