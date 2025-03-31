package DataDrivenFramework;

public class FetchingDataFromExcelFile {
	static String excelpath ="./src/test/resources/LoginData.xlsx";
	
	public static void main(String[] args) throws Exception {
		
		String username = Flib.getDataFromExcelFile(excelpath,"LoginData",1, 0);
		String password = Flib.getDataFromExcelFile(excelpath, "LoginData", 1, 1);
		System.out.println(username);
		System.out.println(password);
		
		
		
	}

}
