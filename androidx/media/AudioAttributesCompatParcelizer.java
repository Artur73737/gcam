package androidx.media;

public class AudioAttributesCompatParcelizer {
   public static AudioAttributesCompat read(.cve var0) {
      AudioAttributesCompat var1 = new AudioAttributesCompat();
      var1.a = (AudioAttributesImpl)var0.t(var1.a);
      return var1;
   }

   public static void write(AudioAttributesCompat var0, .cve var1) {
      var1.u(var0.a);
   }
}
