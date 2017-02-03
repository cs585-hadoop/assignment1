package dataset;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.opencsv.CSVWriter;

import util.RandomName;


public class DatasetGen {
	
	Random rand=new Random();
	
	public static CSVWriter fileWrite(String path) throws IOException{
			return new CSVWriter(new FileWriter(path,true),',',CSVWriter.NO_QUOTE_CHARACTER);
	}
	
	
	public void custgen(int length,String path) throws IOException{
		int age;
		int countrycode;
		float salary;
		String name;
		CSVWriter csvwrite=fileWrite(path);
		
		for(int i=1;i<=length;i++){
			age=rand.nextInt(61)+10;
			countrycode=rand.nextInt(10)+1;
			salary=(float) ((rand.nextInt((9999-100))+100)+rand.nextInt(99)/100.0);
			name=RandomName.generateName(rand.nextInt((20-10)+1)+10); 
			
			csvwrite.writeNext(new String[]{String.valueOf(i),name,
					String.valueOf(age),
					String.valueOf(countrycode),
					String.valueOf(salary)
					});
		}
		csvwrite.close();
	}
	
	public void trangen(int length,String path)throws IOException{
		CSVWriter csvwrite=fileWrite(path);
		int custID;
		float transTotal;
		int transItems;
		String transdesc;
		
		for(int j=1;j<=length;j++){
			transTotal=(float) (rand.nextInt(990)+10+rand.nextInt(99)/100.0);
			transdesc=RandomName.generateName(rand.nextInt((50-20)+1)+20); 
			transItems=rand.nextInt(10)+1;
			custID=(j%50000==0)?50000:j%50000;
			csvwrite.writeNext(new String[]{String.valueOf(j),
					String.valueOf(custID),
					String.valueOf(transTotal),
					String.valueOf(transItems),
					transdesc});
			
		}
		csvwrite.close();
	}
	
	
	
	

}
