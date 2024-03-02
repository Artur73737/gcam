import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cqm extends cpn {
   public static final Creator CREATOR = new atw(10);
   public int a;
   public int b;
   public int c;

   public cqm(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
   }

   public cqm(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
   }
}
