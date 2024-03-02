import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class cwe extends BaseSavedState {
   public static final Creator CREATOR = new mf(6);
   public int a;
   public int b;
   public Parcelable c;

   public cwe(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readParcelable(var2);
   }

   public cwe(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeParcelable(this.c, var2);
   }
}
