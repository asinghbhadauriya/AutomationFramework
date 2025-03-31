package DataDrivenFramework;

public class FetchDataFromExcelFile {
	static String excelPath="./src/test/resources/LoginData.xlsx";

	public static void main(String[] args) throws Exception {
	String Login = Flib.getDataFromExcelFile(excelPath,"LoginData", 1, 0);
	String Password=Flib.getDataFromExcelFile(excelPath,"LoginData",1,1);
	
	System.out.println(Login);
	System.out.println(Password);
		
		

	}

}
