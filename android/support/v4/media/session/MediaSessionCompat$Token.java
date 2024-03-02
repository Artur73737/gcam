package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token implements Parcelable {
   public static final Creator CREATOR = new .av(11);
   private final Object a;

   public MediaSessionCompat$Token(Object var1) {
      this.a = var1;
   }

   public final int describeContents() {
      return 0;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof MediaSessionCompat$Token)) {
         return false;
      } else {
         MediaSessionCompat$Token var2 = (MediaSessionCompat$Token)var1;
         var1 = this.a;
         if (var1 == null) {
            return var2.a == null;
         } else {
            Object var3 = var2.a;
            return var3 == null ? false : var1.equals(var3);
         }
      }
   }

   public final int hashCode() {
      Object var1 = this.a;
      return var1 == null ? 0 : var1.hashCode();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable((Parcelable)this.a, var2);
   }
}
