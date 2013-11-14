package wms;

import javax.swing.JFrame;

import wms.uimanagement.basicinfo.jFrameGoodsInfo;
import wms.uimanagement.basicinfo.jFrameProviderInfo;
import wms.uimanagement.basicinfo.jFrameStorehouseInfo;

/**
 * 这里一个创建窗体的类，为了防止每次打开3个以上的窗体，因此我将这里使用单态模式创建我
 * 需要的窗体，
 * @author song
 */
public class CreateFrame {
   
   private static JFrame frame;
   private static FrameType frameType = FrameType.GoodsIn;
   /**
    * 这是获取窗体的方法
    * @param frameType sign参数是为了根据不同是需求创建不同的窗体
    * @return 返回所需要显示的窗体
    */
   public static JFrame getFrame()  {
      if (frame == null)  {
         switch(frameType)  {
         case GoodsInfo: 
            frame = jFrameGoodsInfo.getJFrameGoodsInfo();
            return frame;
         case PrivderInfo:
            frame = jFrameProviderInfo.getJFrameProviderInfo();
            return frame;
         case StorehouseInfo:
            frame = jFrameStorehouseInfo.getJFrameStorehouseInfo();
            return frame;
      }
      }
      return null;
   }
}
