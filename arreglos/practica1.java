package arreglos;
import java.util.Scanner;
public class practica1 {
	public static void main(String[] args) {
		int cinum =0;
		int sinum =0;
		int ccero =0;
		int nummer;
		int nummers[] = new int[15];
			Scanner nummer_scan= new Scanner(System.in);
		int arraySize = 15;
		for(int x=0; x<arraySize; x++) {
		
		System.out.println("Dame un numero: ");
		nummer=nummer_scan.nextInt();
		nummers[x]=nummer;
}
		for(int i=0; i<nummers.length; i++) {
			
		System.out.println("Numero es:"+nummers[i]);										
}		
		for (int z=0; z<nummers.length; z++) {
		if(nummers[z]%2==0 && nummers[z]>0) {
		double raiz = Math.sqrt(nummers[z]);
	    System.out.println("La raíz de " + nummers[z] + " es " + raiz);
}
}		
		for(int f=0; f<nummers.length; f++) {
		if(nummers[f]%2!=0) {			
		sinum +=nummers[f];
		cinum++;																														
}
}		
		for(int s=0; s<nummers.length; s++) {
		if(nummers[s]<0) {
		ccero++;
}
}				
		if(ccero>0) {
		System.out.println("los numeros negativos son:"+ccero);
}
		if (cinum > 0) {
			double promedio = (double) sinum/cinum;
		System.out.println("el promedio de los numeros negativos son: " + promedio);
		} else {
		System.out.println("No hay números impares.");
		}
	}
}
