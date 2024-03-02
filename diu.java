import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class diu extends BaseSavedState {
   public static final Creator CREATOR = new atw(12);
   public String a;
   public int b;
   public float c;
   public boolean d;
   public String e;
   public int f;
   public int g;

   public diu(Parcel var1) {
      super(var1);
      this.a = var1.readString();
      this.c = var1.readFloat();
      int var2 = var1.readInt();
      boolean var3 = true;
      if (var2 != 1) {
         var3 = false;
      }

      this.d = var3;
      this.e = var1.readString();
      this.f = var1.readInt();
      this.g = var1.readInt();
   }

   public diu(Parcelable var1) {
      super(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.a);
      var1.writeFloat(this.c);
      var1.writeInt(this.d);
      var1.writeString(this.e);
      var1.writeInt(this.f);
      var1.writeInt(this.g);
   }
}
