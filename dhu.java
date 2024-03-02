import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class dhu implements Comparable {
   public int a = 0;
   public int b = 0;
   public int c = 0;
   public int d = 0;
   public int e = 0;
   public int f = 0;
   public TimeZone g = DesugarTimeZone.getTimeZone("UTC");
   public int h;

   public dhu() {
   }

   public dhu(Calendar var1) {
      Date var2 = var1.getTime();
      TimeZone var4 = var1.getTimeZone();
      GregorianCalendar var3 = (GregorianCalendar)Calendar.getInstance(Locale.US);
      var3.setGregorianChange(new Date(Long.MIN_VALUE));
      var3.setTimeZone(var4);
      var3.setTime(var2);
      this.a = var3.get(1);
      this.b = var3.get(2) + 1;
      this.c = var3.get(5);
      this.d = var3.get(11);
      this.e = var3.get(12);
      this.f = var3.get(13);
      this.h = var3.get(14) * 1000000;
      this.g = var3.getTimeZone();
   }

   public dhu(Date var1, TimeZone var2) {
      GregorianCalendar var3 = new GregorianCalendar(var2);
      var3.setTime(var1);
      this.a = var3.get(1);
      this.b = var3.get(2) + 1;
      this.c = var3.get(5);
      this.d = var3.get(11);
      this.e = var3.get(12);
      this.f = var3.get(13);
      this.h = var3.get(14) * 1000000;
      this.g = var2;
   }

   public final Calendar a() {
      GregorianCalendar var1 = (GregorianCalendar)Calendar.getInstance(Locale.US);
      var1.setGregorianChange(new Date(Long.MIN_VALUE));
      var1.setTimeZone(this.g);
      var1.set(1, this.a);
      var1.set(2, this.b - 1);
      var1.set(5, this.c);
      var1.set(11, this.d);
      var1.set(12, this.e);
      var1.set(13, this.f);
      var1.set(14, this.h / 1000000);
      return var1;
   }

   public final void b(int var1) {
      if (var1 <= 0) {
         this.c = 1;
      } else if (var1 > 31) {
         this.c = 31;
      } else {
         this.c = var1;
      }
   }

   public final void c(int var1) {
      if (var1 <= 0) {
         this.b = 1;
      } else if (var1 > 12) {
         this.b = 12;
      } else {
         this.b = var1;
      }
   }

   public final int compareTo(Object var1) {
      long var2 = this.a().getTimeInMillis();
      dhu var4 = (dhu)var1;
      var2 -= var4.a().getTimeInMillis();
      if (var2 == 0L) {
         var2 = (long)(this.h - var4.h);
      }

      return (int)(var2 % 2L);
   }

   public final String toString() {
      return dgi.b(this);
   }
}
