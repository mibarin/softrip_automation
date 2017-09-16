package com.backroads.softrip.webdriver.common.datalprovider;

import org.testng.annotations.DataProvider;

public class DataProviderSource {
	private DataProviderSource() {
	}

	@DataProvider(name = "SupplierInfo_TorreDelRemei")
	public static final Object [][] getUSActualData() {	
		return new Object[][]{ 
			new String [] {"Torre del Remei", "Tom Hale", "(+34) 972 14 01 82", "(+34) 972 14 04 49", "info@torredelremei.com"}
		};		
	}

}
