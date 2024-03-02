import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class cip extends BaseSavedState {
   public static final Creator CREATOR = new atw(4);
   public int a;

   public cip(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
   }

   public cip(Parcelable var1) {
      super(var1);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("HorizontalScrollView.SavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" scrollPosition=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
   }
}
