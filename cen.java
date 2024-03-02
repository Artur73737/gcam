import android.util.Base64;
import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;
import java.util.List;
import org.brotli.wrapper.dec.Hm.CLzmcq;

public final class cen {
   public final String a;
   public final String b;
   public final String c;
   public final List d;
   public final String e;

   public cen(String var1, String var2, String var3, List var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      cby.g(var4);
      this.d = var4;
      StringBuilder var5 = new StringBuilder(var1);
      var5.append("-");
      var5.append(var2);
      var5.append("-");
      var5.append(var3);
      this.e = var5.toString();
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      var4.append(CLzmcq.sFaiFB);
      var4.append(this.a);
      var4.append(", mProviderPackage: ");
      var4.append(this.b);
      var4.append(NgAyRSYlmLoD.AuuwfiARzDIHrH);
      var4.append(this.c);
      var4.append(", mCertificates:");
      var3.append(var4.toString());

      for(int var1 = 0; var1 < this.d.size(); ++var1) {
         var3.append(" [");
         List var5 = (List)this.d.get(var1);

         for(int var2 = 0; var2 < var5.size(); ++var2) {
            var3.append(" \"");
            var3.append(Base64.encodeToString((byte[])var5.get(var2), 0));
            var3.append("\"");
         }

         var3.append(" ]");
      }

      var3.append("}mCertificatesArray: 0");
      return var3.toString();
   }
}
