package exemplo1.applicaiton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exemplo1.model.Produto;
import exemplo1.model.Soma;

public class Program {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV",2900.0);
		Produto p2 = new Produto("Arroz",59.0);
		Produto p3 = new Produto("Notebook",3700.0);
		Produto p4 = new Produto("Playstation 5",5000.0);
		
		List<Produto> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
//		list.removeIf(batata -> batata.getValor() > 3000);
		
//		Function<Produto, Double> acres = x -> {
//			
//			return x.getValor()*1.2;
//		
//		};
		
//		list.forEach(x -> System.out.println(acres.apply(x)));
		
		Soma sum = Integer::sum;
		
		System.out.println(sum.apply(5, 9));
	}

}
