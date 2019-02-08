package ir.akarbasi.tolam.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[home/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="imgheader.HorizontalCenter=50%x"[home/General script]
views.get("imgheader").vw.setLeft((int)((50d / 100 * width) - (views.get("imgheader").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="imgheader.Top=5%x"[home/General script]
views.get("imgheader").vw.setTop((int)((5d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="lblheader.SetLeftAndRight(10%x,90%x)"[home/General script]
views.get("lblheader").vw.setLeft((int)((10d / 100 * width)));
views.get("lblheader").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="lblheader.Top=imgheader.Bottom+2dip"[home/General script]
views.get("lblheader").vw.setTop((int)((views.get("imgheader").vw.getTop() + views.get("imgheader").vw.getHeight())+(2d * scale)));
//BA.debugLineNum = 9;BA.debugLine="imgline.SetLeftAndRight(10%x,90%x)"[home/General script]
views.get("imgline").vw.setLeft((int)((10d / 100 * width)));
views.get("imgline").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="imgline.Top=lblheader.Bottom+2dip"[home/General script]
views.get("imgline").vw.setTop((int)((views.get("lblheader").vw.getTop() + views.get("lblheader").vw.getHeight())+(2d * scale)));
//BA.debugLineNum = 12;BA.debugLine="notifpanel.SetLeftAndRight(5%x,95%x)"[home/General script]
views.get("notifpanel").vw.setLeft((int)((5d / 100 * width)));
views.get("notifpanel").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="notifpanel.SetTopAndBottom(imgline.Bottom+2dip,100%y)"[home/General script]
views.get("notifpanel").vw.setTop((int)((views.get("imgline").vw.getTop() + views.get("imgline").vw.getHeight())+(2d * scale)));
views.get("notifpanel").vw.setHeight((int)((100d / 100 * height) - ((views.get("imgline").vw.getTop() + views.get("imgline").vw.getHeight())+(2d * scale))));

}
}