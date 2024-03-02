import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

final class cq implements Parcelable {
   public static final Creator CREATOR = new av(3);
   ArrayList a;
   ArrayList b;
   au[] c;
   int d;
   String e = null;
   ArrayList f = new ArrayList();
   ArrayList g = new ArrayList();
   ArrayList h;

   public cq() {
   }

   public cq(Parcel var1) {
      this.a = var1.createStringArrayList();
      this.b = var1.createStringArrayList();
      this.c = (au[])var1.createTypedArray(au.CREATOR);
      this.d = var1.readInt();
      this.e = var1.readString();
      this.f = var1.createStringArrayList();
      this.g = var1.createTypedArrayList(aw.CREATOR);
      this.h = var1.createTypedArrayList(cm.CREATOR);
   }

   public final int describeContents() {
      return 0;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeStringList(this.a);
      var1.writeStringList(this.b);
      var1.writeTypedArray(this.c, var2);
      var1.writeInt(this.d);
      var1.writeString(this.e);
      var1.writeStringList(this.f);
      var1.writeTypedList(this.g);
      var1.writeTypedList(this.h);
   }
}
