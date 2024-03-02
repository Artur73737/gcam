import java.util.concurrent.Callable;

@qus(
   b = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1",
   c = "CoroutinesRoom.kt",
   d = "invokeSuspend",
   e = {128, 130}
)
final class cqq extends quw implements qvx {
   Object a;
   int b;
   final crc c;
   final rdb d;
   final Callable e;
   final rdb f;
   final cqy g;

   public cqq(crc var1, cqy var2, rdb var3, Callable var4, rdb var5, que var6) {
      super(2, var6);
      this.c = var1;
      this.g = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
   }

   public final Object b(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final que c(Object var1, que var2) {
      return new cqq(this.c, this.g, this.d, this.e, this.f, var2);
   }
}
