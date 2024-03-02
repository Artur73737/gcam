import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;

public final class av implements Creator {
   private final int a;

   public av(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object createFromParcel(Parcel var1) {
      int var2 = this.a;
      Bundle var3 = null;
      switch(var2) {
      case 0:
         return new aw(var1);
      case 1:
         return new au(var1);
      case 2:
         return new cm(var1);
      case 3:
         return new cq(var1);
      case 4:
         return new ct(var1);
      case 5:
         return new MediaBrowserCompat$MediaItem(var1);
      case 6:
         Object var12 = MediaDescription.CREATOR.createFromParcel(var1);
         MediaDescriptionCompat var14;
         if (var12 != null) {
            MediaDescription var5 = (MediaDescription)var12;
            String var7 = do.i(var5);
            CharSequence var10 = do.h(var5);
            CharSequence var8 = do.g(var5);
            CharSequence var9 = do.f(var5);
            Bitmap var11 = do.a(var5);
            Uri var6 = do.d(var5);
            var3 = do.e(var5);
            Bundle var13 = var3;
            if (var3 != null) {
               var13 = dq.a(var3);
            }

            Uri var15;
            if (var13 != null) {
               var15 = (Uri)var13.getParcelable("android.support.v4.media.description.MEDIA_URI");
            } else {
               var15 = null;
            }

            Bundle var4 = var13;
            if (var15 != null) {
               if (var13.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && var13.size() == 2) {
                  var4 = null;
               } else {
                  var13.remove("android.support.v4.media.description.MEDIA_URI");
                  var13.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                  var4 = var13;
               }
            }

            if (var15 == null) {
               var15 = dp.a(var5);
            }

            var14 = new MediaDescriptionCompat(var7, var10, var8, var9, var11, var6, var4, var15);
            var14.a = var5;
         } else {
            var14 = var3;
         }

         return var14;
      case 7:
         return new MediaMetadataCompat(var1);
      case 8:
         return new RatingCompat(var1.readInt(), var1.readFloat());
      case 9:
         return new MediaSessionCompat$QueueItem(var1);
      case 10:
         return new MediaSessionCompat$ResultReceiverWrapper(var1);
      case 11:
         return new MediaSessionCompat$Token(var1.readParcelable((ClassLoader)null));
      case 12:
         return new ParcelableVolumeInfo(var1);
      case 13:
         return new PlaybackStateCompat(var1);
      case 14:
         return new PlaybackStateCompat$CustomAction(var1);
      case 15:
         return new du(var1);
      case 16:
         return new jf(var1);
      case 17:
         return new ky(var1);
      case 18:
         return new my(var1);
      case 19:
         return new na(var1);
      default:
         var1.getClass();
         Parcelable var16 = var1.readParcelable(IntentSender.class.getClassLoader());
         var16.getClass();
         return new pq((IntentSender)var16, (Intent)var1.readParcelable(Intent.class.getClassLoader()), var1.readInt(), var1.readInt());
      }
   }

   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      switch(this.a) {
      case 0:
         return new aw[var1];
      case 1:
         return new au[var1];
      case 2:
         return new cm[var1];
      case 3:
         return new cq[var1];
      case 4:
         return new ct[var1];
      case 5:
         return new MediaBrowserCompat$MediaItem[var1];
      case 6:
         return new MediaDescriptionCompat[var1];
      case 7:
         return new MediaMetadataCompat[var1];
      case 8:
         return new RatingCompat[var1];
      case 9:
         return new MediaSessionCompat$QueueItem[var1];
      case 10:
         return new MediaSessionCompat$ResultReceiverWrapper[var1];
      case 11:
         return new MediaSessionCompat$Token[var1];
      case 12:
         return new ParcelableVolumeInfo[var1];
      case 13:
         return new PlaybackStateCompat[var1];
      case 14:
         return new PlaybackStateCompat$CustomAction[var1];
      case 15:
         return new du[var1];
      case 16:
         return new jf[var1];
      case 17:
         return new ky[var1];
      case 18:
         return new my[var1];
      case 19:
         return new na[var1];
      default:
         return new pq[var1];
      }
   }
}
