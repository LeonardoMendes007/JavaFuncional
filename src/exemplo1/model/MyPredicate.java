package exemplo1.model;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Produto>{

	@Override
	public boolean test(Produto t) {
		return t.getValor() > 3000;
	}

}
