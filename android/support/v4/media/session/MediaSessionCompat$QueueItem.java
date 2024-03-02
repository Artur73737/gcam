package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
   public static final Creator CREATOR = new .av(9);
   private final MediaDescriptionCompat a;
   private final long b;

   public MediaSessionCompat$QueueItem(Parcel var1) {
      this.a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var1);
      this.b = var1.readLong();
   }

   public final int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MediaSession.QueueItem {Description=");
      var1.append(this.a);
      var1.append(", Id=");
      var1.append(this.b);
      var1.append(" }");
      return var1.toString();
   }

   public final void writeToParcel(Parcel var1, int var2) {
      this.a.writeToParcel(var1, var2);
      var1.writeLong(this.b);
   }
}
