package dataset;

import java.io.IOException;

public class DriverDataset {
	public static void main(String[] args) throws IOException{
		DatasetGen ins=new DatasetGen();
		ins.custgen(50000,"input/customer.csv");
		ins.trangen(5000000,"input/transaction.csv");
	}

}
