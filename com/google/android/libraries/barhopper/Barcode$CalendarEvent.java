package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.libraries.barhopper.Barcode.CalendarEvent-IA;

public class Barcode$CalendarEvent implements Parcelable {
   public static final Creator CREATOR = new .mak(12);
   public String description;
   public Barcode$CalendarDateTime end;
   public String location;
   public String organizer;
   public Barcode$CalendarDateTime start;
   public String status;
   public String summary;

   public Barcode$CalendarEvent() {
   }

   private Barcode$CalendarEvent(Parcel var1) {
      this.summary = var1.readString();
      this.description = var1.readString();
      this.location = var1.readString();
      this.organizer = var1.readString();
      this.status = var1.readString();
      this.start = (Barcode$CalendarDateTime)var1.readParcelable(Barcode$CalendarDateTime.class.getClassLoader());
      this.end = (Barcode$CalendarDateTime)var1.readParcelable(Barcode$CalendarDateTime.class.getClassLoader());
   }

   // $FF: synthetic method
   public Barcode$CalendarEvent(Parcel var1, CalendarEvent-IA var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.summary);
      var1.writeString(this.description);
      var1.writeString(this.location);
      var1.writeString(this.organizer);
      var1.writeString(this.status);
      var1.writeParcelable(this.start, 0);
      var1.writeParcelable(this.end, 0);
   }
}
