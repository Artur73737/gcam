package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.CalendarDateTime-IA;

public class Barcode$CalendarDateTime implements Parcelable {
   public static final Creator CREATOR = new .mak(11);
   public int day;
   public int hours;
   public boolean isUtc;
   public int minutes;
   public int month;
   public String rawValue;
   public int seconds;
   public int year;

   public Barcode$CalendarDateTime() {
   }

   private Barcode$CalendarDateTime(Parcel var1) {
      this.year = var1.readInt();
      this.month = var1.readInt();
      this.day = var1.readInt();
      this.hours = var1.readInt();
      this.minutes = var1.readInt();
      this.seconds = var1.readInt();
      boolean var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.isUtc = var2;
      this.rawValue = var1.readString();
   }

   // $FF: synthetic method
   public Barcode$CalendarDateTime(Parcel var1, CalendarDateTime-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.year);
      var1.writeInt(this.month);
      var1.writeInt(this.day);
      var1.writeInt(this.hours);
      var1.writeInt(this.minutes);
      var1.writeInt(this.seconds);
      var1.writeByte(this.isUtc);
      var1.writeString(this.rawValue);
   }
}
