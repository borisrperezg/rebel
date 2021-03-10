package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ProcesarAgregados {

	public static void main(String[] args) throws Exception {
		ProcesarAgregados pa = new ProcesarAgregados();
		pa.procesarArchivo();
	}
	
	public void procesarArchivo() throws Exception {
		
		FileInputStream inputStream = new FileInputStream(new File("HAB-2016.xls"));
		 
	    // Open Excel file
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet firstSheet = workbook.getSheetAt(0);
		
		HashMap<String, ArrayList<Registro>> registros = new HashMap<String, ArrayList<Registro>>();
		HashMap<String, Registro> consolidado = new HashMap<String, Registro>();
		
		for(int t=1;t<firstSheet.getLastRowNum()+1;t++) {
	    	
	    	if(firstSheet.getRow(t)!=null) {
	    		
	    		Row row = firstSheet.getRow(t);
	    		
	    		/*
	    		 * 1. Consolidar en un HashMap los registros. Llave Empresa, Valor el cliente.
	    		 * 2. Sacar los acumulados
	    		 */
	    		
	    		// ====================================================
	    		// ====================================================
	    		
	    		Cell nombreClienteCell = row.getCell(0);
	    		Cell nombreEmpresaCell = row.getCell(2);
	    		
	    		Cell facturacionEstandarCell = row.getCell(4);
	    		Cell nochesEstandarCell = row.getCell(5);
	    		
	    		Cell facturacionJuniorSuiteCell = row.getCell(6);
	    		Cell nochesJuniorSuiteCell = row.getCell(7);
	    		
	    		Cell facturacionJuniorCell = row.getCell(8);
	    		Cell nochesJuniorCell = row.getCell(9);
	    		
	    		Cell facturacionSuiteCell = row.getCell(10);
	    		Cell nochesSuiteCell = row.getCell(11);
	    		
	    		Cell totalFacturacionCell = row.getCell(12);
	    		Cell totalNochesCell = row.getCell(13);
	    		
	    		// ====================================================
	    		// ====================================================
	    		
	    		Registro reg = new Registro();
    			
    			reg.setNombrePersona(nombreClienteCell.getStringCellValue());
    			reg.setNombreEmpresa(nombreEmpresaCell.getStringCellValue());
    			
    			reg.setFacturacionEstandar(facturacionEstandarCell.getNumericCellValue());
    			reg.setNochesEstandar((int)nochesEstandarCell.getNumericCellValue());
    			
    			reg.setFacturacionJuniorSuite(facturacionJuniorSuiteCell.getNumericCellValue());
    			reg.setNochesJuniorSuite((int)nochesJuniorSuiteCell.getNumericCellValue());
    			
    			reg.setFacturacionJunior(facturacionJuniorCell.getNumericCellValue());
    			reg.setNochesJunior((int)nochesJuniorCell.getNumericCellValue());
    			
    			reg.setFacturacionSuite(facturacionSuiteCell.getNumericCellValue());
    			reg.setNochesSuite((int)nochesSuiteCell.getNumericCellValue());
    			
    			reg.setTotalFacturacion(totalFacturacionCell.getNumericCellValue());
    			reg.setTotalNoches((int)totalNochesCell.getNumericCellValue());
	    		
    			// ====================================================
	    		// ====================================================
    			
	    		ArrayList<Registro> listaRegistros = registros.get(nombreEmpresaCell.getStringCellValue()); 
	    		if(listaRegistros==null) {
	    			listaRegistros = new ArrayList<Registro>();
	    			registros.put(nombreEmpresaCell.getStringCellValue(), listaRegistros);
	    		}
	    		
	    		// ====================================================
	    		// ====================================================
	    		
	    		listaRegistros.add(reg);
	    	}
		}
		
		
		registros.forEach((k,v)->{
			
			String nombreEmpresa = k;
			ArrayList<Registro> listaRegistros = v;
			
			Registro finalReg = new Registro();
			
			for(Registro r : listaRegistros) {
				finalReg.setFacturacionEstandar(finalReg.getFacturacionEstandar()+r.getFacturacionEstandar());
				finalReg.setFacturacionSuite(finalReg.getFacturacionSuite()+r.getFacturacionSuite());
				finalReg.setFacturacionJunior(finalReg.getFacturacionJunior()+r.getFacturacionJunior());
				finalReg.setFacturacionJuniorSuite(finalReg.getFacturacionJuniorSuite()+r.getFacturacionJuniorSuite());
				
				finalReg.setNochesEstandar(finalReg.getNochesEstandar()+r.getNochesEstandar());
				finalReg.setNochesSuite(finalReg.getNochesSuite()+r.getNochesSuite());
				finalReg.setNochesJunior(finalReg.getNochesJunior()+r.getNochesJunior());
				finalReg.setNochesJuniorSuite(finalReg.getNochesJuniorSuite()+r.getNochesJuniorSuite());
				
				finalReg.setTotalFacturacion(finalReg.getTotalFacturacion()+r.getTotalFacturacion());
				finalReg.setTotalNoches(finalReg.getTotalNoches()+r.getTotalNoches());
			}
			
			consolidado.put(nombreEmpresa, finalReg);
			
		});
		
		consolidado.forEach((k,v)->{
			Registro regis = v;
			System.out.println(k+"|"+regis.getFacturacionEstandar()+"|"+regis.getNochesEstandar() + "|" +
					regis.getFacturacionJuniorSuite() + "|" + regis.getNochesJuniorSuite() + "|" +
					regis.getFacturacionJunior() + "|" + regis.getNochesJunior() + "|" +
					regis.getFacturacionSuite() + "|" + regis.getNochesSuite() + "|" +
					regis.getTotalFacturacion()+"|"+regis.getTotalNoches());
		});
		
		workbook.close();
	}
	
	
}
