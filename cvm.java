import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cvm extends ciy {
   public static final Creator CREATOR = new mf(5);
   public int a;
   public Parcelable b;
   public ClassLoader e;

   public cvm(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      ClassLoader var3 = var2;
      if (var2 == null) {
         var3 = this.getClass().getClassLoader();
      }

      this.a = var1.readInt();
      this.b = var1.readParcelable(var3);
      this.e = var3;
   }

   public cvm(Parcelable var1) {
      super(var1);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FragmentPager.SavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" position=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
      var1.writeParcelable(this.b, var2);
   }
}
