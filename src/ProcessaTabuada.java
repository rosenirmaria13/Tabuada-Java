
public class ProcessaTabuada {

	public static void main(String[] args) {
		
		int tabuada;
		
		for(int contador=1;contador<=9; contador++) {
			System.out.println("Tabuada de " +contador);
			System.out.println("=======================================");
			for(int num=1;num<=10; num++) {
				tabuada= contador*num; 
		System.out.println(contador+" * "+num+" = "+tabuada);
		}
			System.out.println("=======================================");
	}

	}
}
