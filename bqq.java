import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

@qus(
   b = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1",
   c = "WindowRecomposer.android.kt",
   d = "invokeSuspend",
   e = {115, 121}
)
final class bqq extends quw implements qvx {
   Object a;
   int b;
   final ContentResolver c;
   final Uri d;
   final bqr e;
   final rdb f;
   final Context g;
   private Object h;

   public bqq(ContentResolver var1, Uri var2, bqr var3, rdb var4, Context var5, que var6) {
      super(2, var6);
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
   }

   public final Object b(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final que c(Object var1, que var2) {
      bqq var3 = new bqq(this.c, this.d, this.e, this.f, this.g, var2);
      var3.h = var1;
      return var3;
   }
}
