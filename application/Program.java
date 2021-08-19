package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Student studant = new Student();
		
		System.out.println("Digite o nome do Aluno: ");
		studant.nome = sc.next();
		
		System.out.println("Digite a nota A1 do Aluno: ");
		studant.nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota A2 do Aluno: ");
		studant.nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota A3 do Aluno: ");
		studant.nota3 = sc.nextDouble();
		
		
		System.out.println(studant.somaNota());
		
		if(studant.somaNota() < 60) {
			
			System.out.println("FAILED");
			System.out.println(studant.passRep());
			
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}