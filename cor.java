import java.nio.ByteBuffer;
import java.util.Arrays;

final class cor {
   public static final int a = 0;

   static {
      oyz.s(-66, (byte)122, -49, -53, -105, -87, (byte)66, -24, -100, (byte)113, -103, -108, -111, -29, -81, -84);
   }

   public static ByteBuffer a(String var0, String var1) {
      ByteBuffer var2 = ByteBuffer.allocate(200);
      var2.putInt(0);
      var2.putInt(0);
      var2.put(com.b(var0));
      var2.putInt(0);
      var2.putInt(0);
      var2.putInt(0);
      var2.put(com.b(var1));
      var2.put((byte)0);
      var2.flip();
      return cbg.e("hdlr", var2);
   }

   public static ByteBuffer b(ByteBuffer... var0) {
      return cbg.d("stbl", Arrays.asList(var0));
   }

   public static ByteBuffer c(ByteBuffer var0) {
      ByteBuffer var1 = ByteBuffer.allocate(var0.limit() + 200);
      var1.putInt(0);
      var1.putInt(1);
      var1.put(var0);
      var1.flip();
      return cbg.e("stsd", var1);
   }
}
