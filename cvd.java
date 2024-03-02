import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.versionedparcelable.ParcelImpl;

public final class cvd implements Creator {
   private final int a;

   public cvd(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object createFromParcel(Parcel var1) {
      switch(this.a) {
      case 0:
         return new ParcelImpl(var1);
      default:
         return new ph(var1);
      }
   }

   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      switch(this.a) {
      case 0:
         return new ParcelImpl[var1];
      default:
         return new ph[var1];
      }
   }
}
