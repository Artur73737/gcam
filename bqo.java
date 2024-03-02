import android.view.View;

@qus(
   b = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1",
   c = "WindowRecomposer.android.kt",
   d = "invokeSuspend",
   e = {394}
)
final class bqo extends quw implements qvx {
   int a;
   final qwz b;
   final auo c;
   final cmc d;
   final bqp e;
   final View f;
   private Object g;

   public bqo(qwz var1, auo var2, cmc var3, bqp var4, View var5, que var6) {
      super(2, var6);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
   }

   public final Object b(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final que c(Object var1, que var2) {
      bqo var3 = new bqo(this.b, this.c, this.d, this.e, this.f, var2);
      var3.g = var1;
      return var3;
   }
}
