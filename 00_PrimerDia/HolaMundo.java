/* "C:\Program Files\Java\jdk1.8.0_211\bin\javac.exe"
		"C:\Users\Admin\Desktop\CURSO_JAVA\HolaMundo.java"
		
	cd C:\Users\Admin\Desktop\CURSO_JAVA
	
	"C:\Program Files\Java\jdk1.8.0_211\bin\java.exe"  HolaMundo
	 
	*/ 
class HolaMundo {
	public static void main(String argumentos[]) {
		System.out.println("Hola mundo");
		for (int i = 0; i < argumentos.length; i++) {
			System.out.println("Arg " + i + " = " 
				+ argumentos[i]);
		}
		int entero;
		entero = 1234567890;
		float decimal = 1234567890123456789F;
		double doblePrecision = 1234567890123401234D;
		long enteroLargo = 1234567890123456789L;
		byte unByte = -127; // hasta 127
		
		System.out.println("entero = " + entero);
		System.out.println("decimal = " + decimal);
		System.out.println("doble = " + doblePrecision);
		System.out.println("enteroLargo = " + enteroLargo);
		System.out.println("unByte = " + unByte);
		char caracter = 'A';
		String texto;
		texto = "Cualquier texto";
		System.out.println("texto = " + texto);
		System.out.println("caracter = " + caracter);
		
		
	}
}




