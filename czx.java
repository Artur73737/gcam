import android.app.Notification;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

public final class czx {
   public final int a;
   public final int b;
   public final Notification c;

   public czx(int var1, Notification var2, int var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         czx var2 = (czx)var1;
         if (this.a != var2.a) {
            return false;
         } else {
            return this.b != var2.b ? false : this.c.equals(var2.c);
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.c.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(DzzpnVggahPIX.CQSWQt);
      var1.append("mNotificationId=");
      var1.append(this.a);
      var1.append(", mForegroundServiceType=");
      var1.append(this.b);
      var1.append(", mNotification=");
      var1.append(this.c);
      var1.append('}');
      return var1.toString();
   }
}
