package entities;

	public class Student {
		
		
		public String nome;
		public double nota1;
		public double nota2;
		public double nota3;
		
		
		public double somaNota() {
			return nota1 + nota2 + nota3;
		}
		
		public double passRep() {
			if (somaNota() < 60.0) {
				return 60.0 - somaNota();
				
			} else {
				return 0.0;
			}
			
			
		}
}
