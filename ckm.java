import android.system.Os;
import java.io.FileDescriptor;

public final class ckm {
   static long a(FileDescriptor var0, long var1, int var3) {
      return Os.lseek(var0, var1, var3);
   }

   static FileDescriptor b(FileDescriptor var0) {
      return Os.dup(var0);
   }

   static void c(FileDescriptor var0) {
      Os.close(var0);
   }

   public static cnh d(cnj var0, Class var1) {
      return var0.a(var1);
   }
}
