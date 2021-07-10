package controllerF;

// ** ServiceFactory
// => FrontController 가 요청한 서비스 컨트롤러 클래스를 제공

public class Ex03_ServiceFactory {
	
	public Ex04_Controller getController(String mappingName) {
		// => 요청명(mappingName)에 해당되는 서비스를 바로 사용가능하도록 전달
		
		Ex04_Controller controller=null;
		if ("/blist.do".equals(mappingName)) {
			controller = new Ex05_BList() ;
    	}else if ("/bdetail.do".equals(mappingName)) {
    		controller = new Ex06_BDetail() ;
    	} 
		return controller;
	} //getController

} //class
