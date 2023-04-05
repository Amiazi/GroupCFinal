package utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelDataProvider {
    private static ExcelDataProvider instance;
    private XSSFWorkbook workbook;
    private XSSFSheet worksheet;
    private final Logger logger = LoggerFactory.getLogger(ExcelDataProvider.class);

    private ExcelDataProvider() {}

    public static ExcelDataProvider getInstance() {
        if (instance == null) {
            instance = new ExcelDataProvider();
        }
        return instance;
    }

    public void loadFile(String filePath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
            worksheet = workbook.getSheet(sheetName);
            file.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public String getDataFromCell(int rowNum, int colNum) {
        try {
            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(worksheet.getRow(rowNum).getCell(colNum));
        } catch (Exception e) {
            logger.error(e.getMessage());
            return "";
        }
    }
}
