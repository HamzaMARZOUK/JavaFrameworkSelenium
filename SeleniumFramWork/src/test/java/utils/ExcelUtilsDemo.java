package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath + "/Excel/Data.xlsx", "Feuil1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getcolCount();
		excel.getCellDataNumber(1, 1);
		
	

}
}
