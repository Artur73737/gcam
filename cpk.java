import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class cpk extends cpn {
   public static final Creator CREATOR = new atw(7);
   public Set a;

   public cpk(Parcel var1) {
      super(var1);
      int var2 = var1.readInt();
      this.a = new HashSet();
      String[] var3 = new String[var2];
      var1.readStringArray(var3);
      Collections.addAll(this.a, var3);
   }

   public cpk(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a.size());
      Set var3 = this.a;
      var1.writeStringArray((String[])var3.toArray(new String[var3.size()]));
   }
}
