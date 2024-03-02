package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
   public static AudioAttributesImplApi21 read(.cve var0) {
      AudioAttributesImplApi21 var1 = new AudioAttributesImplApi21();
      var1.a = (AudioAttributes)var0.b(var1.a, 1);
      var1.b = var0.a(var1.b, 2);
      return var1;
   }

   public static void write(AudioAttributesImplApi21 var0, .cve var1) {
      var1.i(var0.a, 1);
      var1.h(var0.b, 2);
   }
}
