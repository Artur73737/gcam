package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaBrowserCompat$MediaItem implements Parcelable {
   public static final Creator CREATOR = new .av(5);
   private final int a;
   private final MediaDescriptionCompat b;

   public MediaBrowserCompat$MediaItem(Parcel var1) {
      this.a = var1.readInt();
      this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var1);
   }

   public final int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("MediaItem{");
      var1.append("mFlags=");
      var1.append(this.a);
      var1.append(", mDescription=");
      var1.append(this.b);
      var1.append('}');
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      this.b.writeToParcel(var1, var2);
   }
}
