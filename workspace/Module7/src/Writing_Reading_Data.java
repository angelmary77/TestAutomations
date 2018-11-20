
public class Writing_Reading_Data {

	public static void main(String[] args) {
		Xls_Reader datatable = new Xls_Reader("D:\\Dev\\TestData1.xlsx");
		int r = datatable.getRowCount("Record");
		System.out.println(r);
		int c = datatable.getColumnCount("Record");
		System.out.println(c);
		String data = datatable.getCellData("Record","Username", 3);
		System.out.println(data);
	}

}
