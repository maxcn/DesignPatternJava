package CallBack;

import java.util.List;
import java.util.ArrayList;

public class WebSiteTimeUpdater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemTimer systemTimer = new SystemTimer();
		TimeUpdaterCallBack webSiteCallBackUpdater = new WebSiteTimeUpdaterCallBack();
		systemTimer.registerCallBackForUpdatesEveryHour(webSiteCallBackUpdater);
	}
	

}


interface TimeUpdaterCallBack{
	void updateTime(long time);
}

class WebSiteTimeUpdaterCallBack implements TimeUpdaterCallBack{
	@Override
	public void updateTime(long time){
		System.out.println(time);
	}
}

class SystemTimer{
	List<TimeUpdaterCallBack> callbacks = new ArrayList<TimeUpdaterCallBack>();
	
	public void registerCallBackForUpdatesEveryHour(TimeUpdaterCallBack timerCallBack){
		callbacks.add(timerCallBack);
	}
	
	public void oneHourHasBeenExpired(){
		for(TimeUpdaterCallBack timerCallBack: callbacks){
			timerCallBack.updateTime(System.currentTimeMillis());
		}
	}
}