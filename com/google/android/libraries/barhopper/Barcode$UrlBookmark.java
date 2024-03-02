package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.UrlBookmark-IA;

public class Barcode$UrlBookmark implements Parcelable {
   public static final Creator CREATOR = new .mbk(1);
   public String title;
   public String url;

   public Barcode$UrlBookmark() {
   }

   private Barcode$UrlBookmark(Parcel var1) {
      this.title = var1.readString();
      this.url = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$UrlBookmark(Parcel var1, UrlBookmark-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.title);
      var1.writeString(this.url);
   }
}
