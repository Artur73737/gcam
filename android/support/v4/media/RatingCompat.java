package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
   public static final Creator CREATOR = new .av(8);
   private final int a;
   private final float b;

   public RatingCompat(int var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int describeContents() {
      return this.a;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Rating:style=");
      var3.append(this.a);
      var3.append(" rating=");
      float var1 = this.b;
      String var2;
      if (var1 < 0.0F) {
         var2 = "unrated";
      } else {
         var2 = String.valueOf(var1);
      }

      var3.append(var2);
      return var3.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeFloat(this.b);
   }
}
