package unidad7;
//Ejercicio_3.36
import java.util.Scanner;

public class Lenguaje_maquina {
	
	public void loadProgram(int[] program) {
	    for (int i = 0; i < program.length; i++) {
	        memory[i] = program[i];
	    }
	}
	public void executeProgram() {
	    while (!halt) {
	        instructionRegister = memory[instructionCounter];
	        int opcode = instructionRegister / 100;
	        int operand = instructionRegister % 100;
	        
	        switch (opcode) {
	            case 10: 
	                Scanner input = new Scanner(System.in);
	                System.out.print("Ingrese un número: ");
	                memory[operand] = input.nextInt();
	                break;
	            case 11: 
	                System.out.println(memory[operand]);
	                break;
	            case 20: 
	                accumulator = memory[operand];
	                break;
	            case 21: 
	                memory[operand] = accumulator;
	                break;
	            case 30: 
	                accumulator += memory[operand];
	                break;
	            case 31: 
	                accumulator -= memory[operand];
	                break;
	            case 32: 
	                accumulator /= memory[operand];
	                break;
	            case 33: 
	                accumulator *= memory[operand];
	                break;
	            case 40: 
	                instructionCounter = operand;
	                break;
	            case 41:
	                if (accumulator < 0) {
	                    instructionCounter = operand;
	                }
	                break;
	            case 42: 
	                if (accumulator == 0) {
	                    instructionCounter = operand;
	                }
	                break;
	            case 43:
	                halt = true;
	                break;
	            default:
	                System.out.println("Error: código de operación no válido");
	                halt = true;
	                break;
	        }
	        
	        instructionCounter++;
	    }
	}

}
