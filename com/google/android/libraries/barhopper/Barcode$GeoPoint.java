package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.GeoPoint-IA;

public class Barcode$GeoPoint implements Parcelable {
   public static final Creator CREATOR = new .mak(17);
   public double lat;
   public double lng;

   public Barcode$GeoPoint() {
   }

   private Barcode$GeoPoint(Parcel var1) {
      this.lat = var1.readDouble();
      this.lng = var1.readDouble();
   }

   // $FF: synthetic method
   public Barcode$GeoPoint(Parcel var1, GeoPoint-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeDouble(this.lat);
      var1.writeDouble(this.lng);
   }
}
